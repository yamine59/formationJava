package org.example;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CommandSteps {

    private Command command;
    private Product product;

    @Given("Customer {string} who want to command for someone")
    public void customerWhoWantToCommandForSomeone (String name) {
        command = new Command();
        command.setFrom(name);
    }

    @When("a command is make for someone")
    public void aCommandIsMakeForSomeone() {
        command.setTo("Tata");
    }

    @Then("there is no product in the command")
    public void thereIsNoProductInTheCommand () {
        Assert.assertTrue(command.getProducts().isEmpty());
    }

    @And("the command come from Customer {string}")
    public void theCommandComeFromCustomer (String name) {
        Assert.assertEquals(name,command.getFrom());
    }

    @Then("there is add 2 product and there is 2 product in the command")
    public void thereIsAdd2ProductAndThereIs2ProductInTheCommand () {
        Product product1 = new Product("name");
        Product product2 = new Product("name2");
        command.addProduct(product1);
        command.addProduct(product2);

        Assert.assertEquals(2,command.getProducts().size());
    }
}
