package Collections.MainTask.Accessories;

public enum Accessories {
    RIBBON(5.0),
    PAPER(5.0),
    TOY(15.0);

    private double accessoriesPrice;

    Accessories(double accessoriesPrice) {
        this.accessoriesPrice = accessoriesPrice;
    }

    public double getAccessoriesPrice() {
        return accessoriesPrice;
    }
}
