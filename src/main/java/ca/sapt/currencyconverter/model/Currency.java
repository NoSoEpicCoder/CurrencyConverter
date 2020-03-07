package ca.sapt.currencyconverter.model;

public class Currency {

    private String name;
    private double rate;
    private double conversion;

    public Currency() {
    }

    public Currency(String name, double rate, double conversion) {
        this.name = name;
        this.rate = rate;
        this.conversion = conversion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getConversion() {
        return conversion;
    }

    public void setConversion(double conversion) {
        this.conversion = conversion;
    }
}
