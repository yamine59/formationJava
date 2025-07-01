import io.cucumber.java.en.Given;
import org.example.Service.ProductService;

public class ProductSteps {
    private ProductService productService;

    @Given("a customer want to search a product")
    public void a_customer_want_to_search_a_product() {
        productService = new ProductService();
    }
}
