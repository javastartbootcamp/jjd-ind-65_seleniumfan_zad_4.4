package pl.javastart.task;

import pl.javastart.loan.CustomerService;
import pl.javastart.loan.Offer;
import pl.javastart.loan.SalesRepresentative;

public class Main {
    public static void main(String[] args) {
        SalesRepresentative salesRepresentative = new SalesRepresentative();
        Offer offer = salesRepresentative.createLoanOffer(1_000_000, 2000);
        CustomerService customerService = new CustomerService();
        customerService.payoutOffer(offer);
    }
}