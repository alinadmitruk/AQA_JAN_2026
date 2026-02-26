package org.prog.collections.session12;

public class Owner {
    public String name;
    public Owner (String name) {
        this.name = name;
    }
        @Override
        public boolean equals(Object obj) {
            if (obj instanceof Owner) {
                Owner other = (Owner) obj;
                return this.name.equals(other.name);
            }

            return false;
        }
            public int hashCode(){
                return (this.name).hashCode();
            }}

