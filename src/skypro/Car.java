package skypro;

public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;

    public Car(String brand, String model, double engineVolume, String color, int year, String country) {
        if (brand == null || brand == "") {
            this.brand = "default";
        }else {
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
        if (Double.compare(engineVolume,0)==0) {
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

    @Override
    public String toString() {
        return "Марка - " + brand + ", модель - " + model + ", объем двигателя в литрах - " + engineVolume + ", цвет кузова - " + color + ", год производства - " + year + ", страна производства - " + country + ".";
    }
}
