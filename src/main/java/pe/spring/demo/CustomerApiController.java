package pe.spring.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import jdk.internal.joptsimple.internal.Strings;
import pe.spring.demo.api.CustomerApi;
import pe.spring.demo.model.Customer;

@RestController
public class CustomerApiController implements CustomerApi {

    @Override
    public ResponseEntity<List<Customer>> getCustomer() {
        // here code
        List<Customer> customerList = new ArrayList<>();

        return ResponseEntity.ok(customerList);
    }

    @Override
    public  ResponseEntity<String> addCustomer(Customer customer) {
        // here code
         return ResponseEntity.ok(Strings.EMPTY);
    }

}
