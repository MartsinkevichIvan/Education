package Collections.MainTask;

import Collections.MainTask.Accessories.Accessories;
import Collections.MainTask.Flowers.Flower;

import java.util.List;
import java.util.Objects;

public class Bouquet {
    private List<Flower> flowersList;
    private List<Accessories> accessoriesList;

    public Bouquet(List<Flower> flowersList) {
        this.flowersList = flowersList;
    }

    public Bouquet(List<Flower> flowersList, List<Accessories> accessoriesList) {
        this.flowersList = flowersList;
        this.accessoriesList = accessoriesList;
    }

    public void findFlowerByStemsLengthRange(int startRange, int endRange) {
        for (Flower flower : flowersList) {
            if (flower.getStemsLength().getStemsLengthValue() >= startRange && flower.getStemsLength().getStemsLengthValue() <= endRange) {
                System.out.println(flower);
                return;
            }
        }
        System.out.println("There are no flowers in range from: " + startRange + " to: " + endRange + ".");
    }

    public List<Flower> getFlowersList() {
        return flowersList;
    }

    public List<Accessories> getAccessoriesList() {
        return accessoriesList;
    }

    public void setFlowersList(List<Flower> flowersList) {
        this.flowersList = flowersList;
    }

    public void setAccessoriesList(List<Accessories> accessoriesList) {
        this.accessoriesList = accessoriesList;
    }

    public double countTotalPrice() {
        double totalPrice = 0;
        for (Flower flower : flowersList) {
            totalPrice += flower.getTotalPrice();
        }
        for (Accessories accessories : accessoriesList) {
            totalPrice += accessories.getAccessoriesPrice();
        }
        return totalPrice;
    }

    @Override
    public String toString() {
        return "Bouquet{" +
                "flowersList=" + flowersList +
                ", accessoriesList=" + accessoriesList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bouquet bouquet = (Bouquet) o;
        return Objects.equals(flowersList, bouquet.flowersList) &&
                Objects.equals(accessoriesList, bouquet.accessoriesList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flowersList, accessoriesList);
    }
}
