package Collections.MainTask.Flowers;

import Collections.MainTask.Enums.Freshness;
import Collections.MainTask.Enums.StemsLength;

import java.util.Objects;

public class Peony extends Flower {

    private final double basePrice = 12.0;

    public Peony(StemsLength stemsLength, Freshness freshness) {
        super(stemsLength, freshness);
        totalPrice = basePrice+stemsLength.getStemsLengthMarkup()+freshness.getFreshnessMarkup();
    }

    @Override
    public String toString() {
        return "Peony{" +
                "basePrice=" + basePrice +
                ", stemsLength=" + stemsLength +
                ", freshness=" + freshness +
                ", totalPrice=" + totalPrice +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), basePrice);
    }
}
