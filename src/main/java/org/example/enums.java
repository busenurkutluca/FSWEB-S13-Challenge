package org.example;

public enum enums {
    ;

    public enum Plan {
        BASIC("Basic Plan", 50.0),
        PREMIUM("Premium Plan", 100.0),
        GOLD("Gold Plan", 150.0);

        private String name;
        private double price;

        Plan(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        @Override
        public String toString() {
            return name + " (Price: $" + price + ")";
        }
    }
}
