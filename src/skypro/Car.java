package skypro;

import java.time.LocalDate;

public class Car {
    public static class Key {
        private final boolean remoteEngineStart;
        private final boolean noKeyAccess;

        public Key(boolean remoteEngineStart, boolean noKeyAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.noKeyAccess = noKeyAccess;
        }

        public Key() {
            this(false, false);
        }
    }

    public class Insurance {
        private LocalDate validatePeriod;
        private final double costInsurance;
        private final String numberOfInsurance;

        public Insurance(LocalDate validatePeriod, double costInsurance, String numberOfInsurance) {
            if (validatePeriod == null) {
                validatePeriod = LocalDate.now().plusDays(365);
            } else {
                this.validatePeriod = validatePeriod;
            }

            this.costInsurance = costInsurance;
            if (numberOfInsurance == null) {
                this.numberOfInsurance = "123456789";
            } else {
                this.numberOfInsurance = numberOfInsurance;
            }
        }

        public Insurance() {
            this(null, 10_000, null);
        }

        public LocalDate getValidatePeriod() {
            return validatePeriod;
        }

        public double getCostInsurance() {
            return costInsurance;
        }

        public String getNumberOfInsurance() {
            return numberOfInsurance;
        }

        public void  checkPeriodInsurance() {
            if (validatePeriod.isBefore(LocalDate.now()) || validatePeriod.isEqual(LocalDate.now())) {
                System.out.println("Срок действия Вашей страховки, срочно продлите страховку!");
            }

        }

        public String checkNumberOfInsurance(String numberOfInsurance) {
            if (numberOfInsurance.matches("[1-9][1-9][1-9][1-9][1-9][1-9][1-9][1-9][1-9]")) {
            } else {
                System.out.println("Номер страховки некорректный!");
            }
            return null;
        }

    }


    private final String brand;
    private String model;
    public double engineVolume;
    public String color;
    private int year;
    private String country;
    public String transmission;
    private String bodyType = "default";
    public String regNumber;
    private int seatsNumber = 5;
    public String tiresSeason;
    private Key key;
    private Insurance insurance;

    public Car(String brand, String model, double engineVolume, String color, int year, String country) {
        if (brand == null || brand == "") {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null || model == "") {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (color == null || color == "") {
            this.color = "белый";
        } else {
            this.color = color;
        }
        if (country == null || country == "") {
            this.country = "default";
        } else {
            this.country = country;
        }
        if (Double.compare(engineVolume, 0) == 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
    }

    public Car(String brand, String model, double engineVolume, String color, int year, String country, String transmission, String bodyType, String regNumber, int seatsNumber, String tiresSeason, Key key, Insurance insurance) {
        if (brand == null || brand == "") {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null || model == "") {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (color == null || color == "") {
            this.color = "белый";
        } else {
            this.color = color;
        }
        if (country == null || country == "") {
            this.country = "default";
        } else {
            this.country = country;
        }
        if (Double.compare(engineVolume, 0) == 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
        if (transmission == null || transmission.isEmpty() || transmission.isEmpty()) {
            this.transmission = "default";
        } else {
            this.transmission = transmission;
        }
        if (bodyType == null || bodyType.isEmpty() || bodyType.isEmpty()) {
            this.bodyType = "default";
        } else {
            this.bodyType = bodyType;
        }
        this.regNumber = regNumber;

        if (seatsNumber <= 0) {
            this.seatsNumber = 22222;
        } else {
            this.seatsNumber = seatsNumber;
        }

        if (tiresSeason == null || tiresSeason.isEmpty() || tiresSeason.isEmpty()) {
            this.tiresSeason = "default";
        } else {
            this.tiresSeason = tiresSeason;
        }
        if (key == null) {
            this.key = new Key();
        } else {
            this.key = key;
        }
        if (insurance == null) {
            this.insurance = new Insurance();
        } else {
            this.insurance = insurance;

        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getSeatsNumber() {
        return seatsNumber;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (Double.compare(engineVolume, 0) == 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color == "") {
            this.color = "белый";
        } else {
            this.color = color;
        }
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission == null || transmission.isEmpty() || transmission.isEmpty()) {
            this.transmission = "default";
        } else {
            this.transmission = transmission;
        }
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }


    public String getTiresSeason() {
        return tiresSeason;
    }

    public void setTiresSeason(String tiresSeason) {
        if (tiresSeason == null || tiresSeason.isEmpty() || tiresSeason.isEmpty()) {
            this.tiresSeason = "default";
        } else {
            this.tiresSeason = tiresSeason;
        }
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    @Override
    public String toString() {
        return "Марка - " + brand + ", модель - " + model + ", объем двигателя в литрах - " + engineVolume + ", цвет кузова - " + color + ", год производства - " + year + ", страна производства - " + country + ".";
    }


    public String toString1() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", transmission='" + transmission + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", regNumber=" + regNumber +
                ", seatsNumber=" + seatsNumber +
                ", tiresSeason='" + tiresSeason + '\'' +
                '}';
    }

    public String changeTires() {
        if (tiresSeason.equalsIgnoreCase("летняя")) {
            tiresSeason = "Зимняя";
        } else if (tiresSeason.equalsIgnoreCase("зимняя")) {
            tiresSeason = "Летняя";
        } else {
            System.out.println("Ошибка, не указан тип шин");
        }
        return null;
    }

    public String checkNumber(String regNumber) {
        String n = "";
        if (regNumber.matches("\\w\\d\\d\\d\\w\\w\\d\\d\\d")) {
            System.out.println("Номер введен верно");
        } else {
            System.out.println("Номер введен неверно");
        }
        return null;
    }
}
