package com.fedex.streamapi;

import java.util.List;

public class CustomerDatabase {
    public static List<Customer> getAllCustomers(){
        return List.of(new Customer("1","Saurav","Cuttack",List.of("9008657767","8637297079")),
        new Customer("2","Gauree","Pune",List.of("9338652367","8632197080")),
                new Customer("3","Mahendra","Vizag",List.of("8835921013","9337321345")));
    }
}
