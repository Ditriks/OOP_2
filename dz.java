class Transport {
    protected String brand;
    protected String model;
    protected int number;

    public Transport(String brand, String model, int number) {
        this.brand = brand;
        this.model = model;
        this.number = number;
    }
    
    class Car extends Transport {
        private int age;
        private int mileage;

        public Car(String brand, String model, int number, int age, int mileage) {
            super(brand, model, number);
            this.age = age;
            this.mileage = mileage;
        }

    }

    class Bus extends Transport {
        private int route;

        public Bus(String brand, String model, int number, int route) {
            super(brand, model, number);
            this.route = route;
        }

    }
}