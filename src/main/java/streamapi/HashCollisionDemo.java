package streamapi;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashCollisionDemo {
    public static void main(String args[]){
      Map<Customer,String> custDetails=  new HashMap<>();
       custDetails.put(new Customer("1","Saurav","Cuttack",List.of("9008657767","8637297079")),
              "Saurav");
        custDetails.put(  new Customer("2","Gauree","Pune",List.of("9338652367","8632197080")),
                "Gauree");
        custDetails.put(       new Customer("3","Mahendra","Vizag",List.of("8835921013","9337321345")),
                "Mahendra");
        custDetails.put(      new Customer("1","Saurav","Cuttack",List.of("9008657767","8637297079")),
              "SKS");
      custDetails.forEach((k,v)->System.out.println(k+"         "+v));
    }
}
