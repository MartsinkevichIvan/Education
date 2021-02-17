package Collections.MainTask.Flowers;

import Collections.MainTask.Enums.Freshness;
import Collections.MainTask.Enums.StemsLength;

public class Rose extends Flower {
    public double basePrice = 5.0;

    public Rose(StemsLength stemsLength, Freshness freshness) {
        super(stemsLength, freshness);
        totalPrice = basePrice+stemsLength.getStemsLengthMarkup()+freshness.getFreshnessMarkup();
    }

    @Override
    public String toString() {
        return "Rose{" +
                "basePrice=" + basePrice +
                ", stemsLength=" + stemsLength +
                ", freshness=" + freshness +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
