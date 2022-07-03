package customer;

import com.murilo.domain.Customer;
import org.junit.Assert;
import org.junit.Test;

public class CustomerTest {

    @Test
    public void TestCustomerClass() {
        Customer customer = new Customer("Murilo");

        Assert.assertEquals("Murilo", customer.getName());

        customer.setName("Henzo");
        Assert.assertNotEquals("Murilo", customer.getName());
    }
}
