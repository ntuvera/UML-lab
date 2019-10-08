package co.ga.nyc;

public class Bond extends Asset{
    private int id;
    private double shares;
    private double purchasePrice;

    public Bond(int id, double shares, double purchasePrice) {
        super(id, shares, purchasePrice);
        this.id = id;
        this.shares = shares;
        this.purchasePrice = purchasePrice;
    }
}
