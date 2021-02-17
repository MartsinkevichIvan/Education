package Collections.MainTask.Enums;

public enum StemsLength {
    FIFTY(0.0,50),
    SIXTY(0.5,60),
    SEVENTY(1.,70),
    EIGTHTY(1.5,80),
    NINETY(2.0,90),
    HUNDRED(2.5,100);

    private double stemsLengthMarkup;
    private int stemsLengthValue;

    StemsLength(double stemsLengthMarkup, int stemsLengthValue) {
        this.stemsLengthMarkup = stemsLengthMarkup;
        this.stemsLengthValue = stemsLengthValue;
    }
    public double getStemsLengthMarkup() {
        return stemsLengthMarkup;
    }

    public int getStemsLengthValue() {
        return stemsLengthValue;
    }
}
