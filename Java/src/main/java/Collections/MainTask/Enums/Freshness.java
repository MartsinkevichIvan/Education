package Collections.MainTask.Enums;

public enum Freshness {
    ZERODAYS(3.0,0),
    ONEDAY(2.5,1),
    TWODAYS(2.0,2),
    THREEDAYS(1.5,3),
    FOURDAYS(1.0,4),
    FIVEDAYS(0.5,5),
    OVERFIVEDAYS(0.0,6);

    private double freshnessMarkup;
    private int freshnessLevel;

    Freshness(double freshnessMarkup, int freshnessLevel) {
        this.freshnessMarkup = freshnessMarkup;
        this.freshnessLevel = freshnessLevel;
    }

    public double getFreshnessMarkup() {
        return freshnessMarkup;
    }

    public int getFreshnessLevel() {
        return freshnessLevel;
    }
}
