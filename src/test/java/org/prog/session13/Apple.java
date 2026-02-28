package org.prog.session13;

import java.util.Random;

public class Apple {

    private int modelNumber;

    public int getModelNumber() {
        return modelNumber;
    }

    public Apple() {
        Random random = new Random();
        this.modelNumber = random.nextInt(5) + 1;
    }
}

