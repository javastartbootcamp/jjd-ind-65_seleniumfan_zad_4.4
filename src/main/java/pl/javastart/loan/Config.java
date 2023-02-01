package pl.javastart.loan;

class Config {
    private int minRequiredEarnings = 2000;
    private double percentage = 0.03;

    public int getMinRequiredEarnings() {
        return minRequiredEarnings;
    }

    public double getPercentage() {
        return percentage;
    }
}
