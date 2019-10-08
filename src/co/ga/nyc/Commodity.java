package co.ga.nyc;

public class Commodity extends Asset{
    private int id;
    private double shares;
    private double purchasePrice;

    public Commodity(int id, double shares, double purchasePrice) {
        super(id, shares, purchasePrice);
    }
}
