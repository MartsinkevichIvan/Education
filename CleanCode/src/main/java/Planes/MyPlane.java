package Planes;

import java.util.Objects;

public class MyPlane  extends Plane {

    private int price;
    public MyPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, int price) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.price=price;
    }
    public int getPrice(){
        return  price;
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", price=" + price +
                        '}');
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyPlane)) return false;
        if (!super.equals(o)) return false;
        MyPlane myPlane = (MyPlane) o;
        return price == myPlane.price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), price);
    }
}
