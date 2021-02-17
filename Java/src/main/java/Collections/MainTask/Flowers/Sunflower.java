package Collections.MainTask.Flowers;

import Collections.MainTask.Enums.Freshness;
import Collections.MainTask.Enums.StemsLength;

import java.util.Objects;

public class Sunflower extends Flower {

    private final double basePrice = 15.0;

    public Sunflower(StemsLength stemsLength, Freshness freshness) {
        super(stemsLength, freshness);
        totalPrice = basePrice+stemsLength.getStemsLengthMarkup()+freshness.getFreshnessMarkup();
    }

    @Override
    public String toString() {
        return "Sunflower{" +
                "basePrice=" + basePrice +
                ", stemsLength=" + stemsLength +
                ", freshness=" + freshness +
                ", totalPrice=" + totalPrice +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Sunflower sunflower = (Sunflower) o;
        return Double.compare(sunflower.basePrice, basePrice) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), basePrice);
    }
}
