import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Exception.AlreadyExisteException;
import org.example.Model.User;
import org.example.Service.UserService;
import org.junit.Assert;

public class UserSteps {

    private User user;
    private UserService userService;
    @Given("customer want to create or connect a compte")
    public void customer_want_to_create_a_compte() {
        user = new User();
    }

    @When("a compte is created for Customer {string}")
    public void a_compte_is_created_for_customer(String username) {
        User user = new User(username,username,username);
        userService.register(user);
    }

    @Then("the compte is created for Customer {string}")
    public void the_compte_is_created(String username) {
        User user = new User(username,username,username);
        userService.register(user);
        Assert.assertThrows(AlreadyExisteException.class,()->userService.register(user));
    }



    @When("a compte is connected for Customer {string}")
    public void a_compte_is_connected_for_customer(String username) {
        User userr = new User(username,username,username);
        userService.register(userr);
        User user = new User(username,username,username);
        userService.connection(user);
    }

    @Then("the compte is connected for Customer {string}")
    public void the_compte_is_connected(String username) {
        User userr = new User(username,username,username);
        userService.register(userr);
        User user = new User(username,username,username);
        userService.connection(user);
        Assert.assertEquals("user is Log:"+username,userService.connection(user));
    }

}
