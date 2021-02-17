package JavaClasses;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Autopark {

    private String nameOfAutopark;
    private List<Car> carList = new ArrayList<Car>();


    public static void main(String[] args) {

        Autopark autopark = new Autopark("First park");

        autopark.addCar(new Car("Tesla", "X", 2017, "Red", 60000, "9554-AA0"));
        autopark.addCar(new Car("Tesla", "S", 2015, "Black", 40000, "1424-AB0"));
        autopark.addCar(new Car("Tesla", "3", 2016, "White", 26000, "6124-AC0"));
        autopark.addCar(new Car("Tesla", "S", 2019, "White", 78000, "1254-AC0"));
        autopark.addCar(new Car("Tesla", "S", 2014, "Brown", 78000, "5154-AC0"));
        autopark.addCar(new Car("Tesla", "S", 2013, "Yellow", 78000, "8524-AC0"));
        autopark.addCar(new Car("Tesla", "S", 2012, "White", 78000, "5854-AC0"));
        autopark.addCar(new Car("BMW", "3 Series", 2004, "Blue", 5000, "9134-AB6"));
        autopark.addCar(new Car("BMW", "5 Series", 2012, "Red", 12000, "1754-AT4"));
        autopark.addCar(new Car("BMW", "3 Series", 2004, "Red", 5200, "9151-AB6"));
        autopark.addCar(new Car("Opel", "Astra", 2004, "Silver", 3500, "7836-BP7"));
        autopark.addCar(new Car("Opel", "Askona", 1984, "Rusty", 500, "7516-BP1"));
        autopark.addCar(new Car("Opel", "Astra", 2012, "Black", 11000, "1516-HB7"));
        autopark.addCar(new Car("Mercedes", "S class", 2020, "Black", 120000, "5555-AA5"));
        autopark.addCar(new Car("Opel", "Vectra", 2007, "Green", 6000, "5698-CC2"));
        autopark.addCar(new Car("Shkoda", "Octavia", 2015, "Silver", 12000, "9915-AB7"));
        autopark.addCar(new Car("Shkoda", "Rapid", 2020, "Silver", 16000, "5962-AH7"));

        System.out.println("Print cars with brand 'Opel'.");
        printCarList(autopark.getCarListByBrand("Opel"));
        System.out.println("Print cars with model 'S' and time in service = 2");
        printCarList(autopark.getCarListByModelAndTimeInService("S", 2));
        System.out.println("Print cars with 'year of model'= '2015' and price higher than '10000'");
        printCarList(autopark.getCarsListByYearOfModelAndOverPrice(2015, 10000));

    }

    public Autopark(String nameOfAutopark) {
        this.nameOfAutopark = nameOfAutopark;
    }

    public String getNameOfAutopark() {
        return nameOfAutopark;
    }

    public void setNameOfAutopark(String nameOfAutopark) {
        this.nameOfAutopark = nameOfAutopark;
    }

    public void addCar(Car car) {
        carList.add(car);
    }

    public List<Car> getCarListByBrand(String brand) {
        List<Car> carListByBrand = new ArrayList<Car>();
        for (int i = 0; i < carList.size(); i++) {
            if (carList.get(i).getBrand().equals(brand)) {
                carListByBrand.add(carList.get(i));
            }
        }
        return carListByBrand;
    }

    public List<Car> getCarListByModelAndTimeInService(String model, int timeInService) {
        List<Car> carListByModelAndTimeInService = new ArrayList<Car>();
        for (int i = 0; i < carList.size(); i++) {
            if (carList.get(i).getModel().equalsIgnoreCase(model) && Calendar.getInstance().get(Calendar.YEAR) - carList.get(i).getYearOfModel() > timeInService) {
                carListByModelAndTimeInService.add(carList.get(i));
            }
        }
        return carListByModelAndTimeInService;
    }

    public List<Car> getCarsListByYearOfModelAndOverPrice(int yearOfModel, int carPrice) {
        List<Car> carListByYearOfModelAndOverPrice = new ArrayList<Car>();
        for (int i = 0; i < carList.size(); i++) {
            if (carList.get(i).getYearOfModel() == yearOfModel && carList.get(i).getPrice() > carPrice) {
                carListByYearOfModelAndOverPrice.add(carList.get(i));
            }
        }
        return carListByYearOfModelAndOverPrice;
    }

    public static void printCarList(List<Car> carList) {
        for (Car car : carList) {
            System.out.println(car.toString());
        }
    }
}

class Car {

    private static int idGenerator = 0;
    private final int id = idGenerator++;
    private String brand;
    private String model;
    private int yearOfModel;
    private String color;
    private int price;
    private String registrationNumber;

    public Car(String brand, String model, int yearOfModel, String color, int price, String registrationNumber) {
        this.brand = brand;
        this.model = model;
        this.yearOfModel = yearOfModel;
        this.color = color;
        this.price = price;
        this.registrationNumber = registrationNumber;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYearOfModel(int yearOfModel) {
        this.yearOfModel = yearOfModel;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfModel() {
        return yearOfModel;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "Id=" + id +
                ", Brand='" + brand + '\'' +
                ", Model='" + model + '\'' +
                ", YOM=" + yearOfModel +
                ", Color='" + color + '\'' +
                ", Price=" + price +
                ", RegistrationNumber='" + registrationNumber + '\'' +
                '}';
    }
}



