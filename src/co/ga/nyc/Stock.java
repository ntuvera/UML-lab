package co.ga.nyc;

public class Stock extends Asset{
    private int id;
    private double shares;
    private double purchasePrice;

    public Stock(int id, double shares, double purchasePrice) {
        super(id, shares, purchasePrice);
        this.id = id;
        this.shares = shares;
        this.purchasePrice = purchasePrice;
    }

}
