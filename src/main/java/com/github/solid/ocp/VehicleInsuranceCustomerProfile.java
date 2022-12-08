package main.java.com.github.solid.ocp;

public class VehicleInsuranceCustomerProfile implements CustomerProfile {

    @Override
    public boolean isLoyalCustomer() {
        return false;
    }

}