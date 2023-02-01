package pl.javastart.loan;

public class SalesRepresentative {

    private Config config;

    public SalesRepresentative() {
        this.config = new Config();
    }

    public Offer createLoanOffer(int requestedAmount, int earnings) {
        Offer offer = new Offer();
        if (earnings >= config.getMinRequiredEarnings()) {
            offer.percentage = config.getPercentage();
            offer.valid = true;
            offer.value = requestedAmount;
        }
        return offer;
    }
}
