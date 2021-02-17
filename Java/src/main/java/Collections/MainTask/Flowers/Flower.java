package Collections.MainTask.Flowers;

import Collections.MainTask.Enums.Freshness;
import Collections.MainTask.Enums.StemsLength;

import java.util.Objects;

public abstract class Flower implements Comparable <Flower> {
    StemsLength stemsLength;
    Freshness freshness;
    protected double totalPrice;

    public Flower(StemsLength stemsLength, Freshness freshness) {
        this.stemsLength = stemsLength;
        this.freshness = freshness;
        this.totalPrice = stemsLength.getStemsLengthMarkup()+ freshness.getFreshnessMarkup();
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public StemsLength getStemsLength() {
        return stemsLength;
    }

    public Freshness getFreshness() {
        return freshness;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "stemsLength=" + stemsLength +
                ", freshness=" + freshness +
                ", totalPrice=" + totalPrice +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flower flower = (Flower) o;
        return Double.compare(flower.totalPrice, totalPrice) == 0 &&
                stemsLength == flower.stemsLength &&
                freshness == flower.freshness;
    }

    @Override
    public int hashCode() {
        return Objects.hash(stemsLength, freshness, totalPrice);
    }

    @Override
    public int compareTo(Flower o) {
        return this.freshness.getFreshnessLevel()-o.freshness.getFreshnessLevel();
    }


}
