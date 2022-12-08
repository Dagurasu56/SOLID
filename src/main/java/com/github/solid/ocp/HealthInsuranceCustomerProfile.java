package main.java.com.github.solid.ocp;

public class HealthInsuranceCustomerProfile implements CustomerProfile {

    @Override
    public boolean isLoyalCustomer() {
        return false;
    }
}
