package co.ga.nyc;

public class Asset {
    private int id;
    private double shares;
    private double purchasePrice;

    public Asset() { }

    public Asset(int id, double shares, double purchasePrice) {
        this.id = id;
        this.shares = shares;
        this.purchasePrice = purchasePrice;
    }

    public int getId() {
        return id;
    }

    public double getShares() {
        return shares;
    }

    public void setShares(double shares) {
        this.shares = shares;
    }

    protected double calculateValue(){
        // write some code here
        return 0.0;
    }

}
