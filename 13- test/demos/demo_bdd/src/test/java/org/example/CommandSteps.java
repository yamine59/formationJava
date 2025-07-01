package org.example;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CommandSteps {

    private Command command;

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

    @And("customer add {int} product in the command")
    public void customerAddProductInTheCommand (int number) {
        for (int i = 0; i < number; i++) {

            command.getProducts().add("product"+ i);
        }
    }
    @Then("there are {int} product in the command")
    public void thereAreAdd2ProductAndThereIs2ProductInTheCommand (int number) {

        Assert.assertEquals(number,command.getProducts().size());
    }

    @And("customer remove {int} product in the command")
    public void customerRemoveProductInTheCommand (int number) {
        for (int i = 0; i < number; i++) {
            command.getProducts().remove(0);
        }
    }
}
