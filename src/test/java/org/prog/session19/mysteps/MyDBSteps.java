package org.prog.session19.mysteps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.prog.session16.dto.PersonDto;
import org.prog.session16.dto.PhoneDto;
import org.prog.session16.dto.PhoneResultsDto;
import org.prog.session16.dto.ResultsDto;
import org.prog.session18.steps.ApiSteps;
import org.prog.session19.DataHolder;
import tools.jackson.databind.ser.std.DelegatingSerializer;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyDBSteps {


    public static Connection connection;
    public static Map<String, Boolean> phoneExistsMap = new HashMap<>();
    public static Map<String, String> phonePriceFromDB = new HashMap<>();

    @Then("I going to DB to check if phone data exists in DB")
    public void checkDataInDB() throws SQLException {
        List<String> models = MyAPISteps.phoneModels;

        if (models == null || models.isEmpty()) {
            System.out.println("Немає моделей для перевірки");
            return;
        }
        PreparedStatement stmt = connection.prepareStatement("SELECT price FROM phones WHERE model = ?");

        for (String model : models) {
            stmt.setString(1, model);
            ResultSet result = stmt.executeQuery();
            if (result.next()) {
                phoneExistsMap.put(model, true);
                String priceFromDB = result.getString("price");
                phonePriceFromDB.put(model, priceFromDB);
                System.out.println("Модель знайдено в БД: " + model + ", ціна в БД: " + priceFromDB);
            } else {
                phoneExistsMap.put(model, false);
                System.out.println("Моделі немає в БД: " + model);
            }
            result.close();
        }
        stmt.close();
    }

    @Then("if dont, I insert phone's model and price in DB")
    public void insertModelsInDB() throws SQLException {
        List<String> models = MyAPISteps.phoneModels;
        List<String> prices = MyAPISteps.phonePrices;
        PreparedStatement prepStmt = connection.prepareStatement(
                "INSERT INTO phones (model, price) " +
                        "VALUES (?, ?)");
        if (models == null || models.isEmpty() || prices == null || prices.isEmpty()) {
            System.out.println("Немає даних");
            return;
        }
        for (int i = 0; i < models.size(); i++) {
            String model = models.get(i);
            String price = prices.get(i);

            if (phoneExistsMap.containsKey(model) && !phoneExistsMap.get(model)) {
                prepStmt.setString(1, model);
                prepStmt.setString(2, price);
                prepStmt.execute();
                System.out.println("Додано в БД: " + model + ", ціна: " + price);
            } else {
                System.out.println("Модель вже існує в БД: " + model);
            }
        }
        prepStmt.close();
    }

    @Then("phone data in DB matches UI price")
    public void comparePricesWithDB() throws SQLException {
        List<String> models = MyAPISteps.phoneModels;
        List<String> prices = MyAPISteps.phonePrices;


        for (int i = 0; i < models.size(); i++) {
            String model = models.get(i);
            String price = prices.get(i);
            if (phoneExistsMap.containsKey(model) && phoneExistsMap.get(model)) {
                String dbPrice = phonePriceFromDB.get(model);

                double uiPriceNum =Double.parseDouble(price);
                double dbPriceNum =Double.parseDouble(dbPrice);
                //заміст equals, того що формат запису чисел різний
                if (uiPriceNum == dbPriceNum) {
                    System.out.println("Ціна збігається для " + model + ": " + price);
                } else {
                    throw new AssertionError("Ціна не збігається! Модель: " + model +
                            ", UI: " + price + ", DB: " + dbPrice);
                }
            } else {
                System.out.println("Моделі немає в БД: " + model);
            }
        }
    }
    @Then("Phone's model and price have been added to the DB")
    public void phoneInDB(){
        List<String> models = MyAPISteps.phoneModels;
        List<String> prices = MyAPISteps.phonePrices;
        for (int i = 0; i < models.size(); i++) {
            String model = models.get(i);
            String price = prices.get(i);
            if (phoneExistsMap.getOrDefault(model, false)) {
                String dbPrice = phonePriceFromDB.get(model);
                System.out.println("Модель " + model + " у БД ціна " + dbPrice);
            } else
                System.out.println("Моодель " + model + " не була додана в БД.");
        }
    }
}

