package model;

public class Car {
    private String model;
    private String brand;
    private int horsepower;
    public Car(){}
    public Car (String model,String brand,int horsepower){
        this.model = model;
        this.brand = brand;
        this.horsepower = horsepower;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", horsepower=" + horsepower +
                '}';
    }
}

