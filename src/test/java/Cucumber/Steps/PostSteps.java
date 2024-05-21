package Cucumber.Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class PostSteps {
    @Given("User should be logged and should be present at its own wall")
    public void userShouldBeLoggedAndShouldBePresentAtItsOwnWall() {
        System.out.println("userShouldBeLoggedInAndShouldBePresentAtItsOwnWall");
        System.out.println("User is right here");
        System.out.println("This is my commit from feature into master");
    }

    @When("I type the message in the box")
    public void iTypeTheMessageInTheBox() {
        System.out.println("iTypeTheMessageInTheBox");
    }

    @And("I click on the post button")
    public void iClickOnThePostButton() {
        System.out.println("clickOnPostButton");
    }

    @Then("The message should get posted")
    public void theMessageShouldGetPosted() {
        System.out.println("theMessageShouldGetPosted");
    }

    @Given("User should be logged and at its own wall")
    public void userShouldBeLoggedAndAtItsOwnWall() {
        System.out.println("userShouldBeLoggedAndAtHisWall");
    }

    @When("the user selects a video")
    public void theUserSelectsAVideo() {
        System.out.println("theUserSelectsAVideo");
    }

    @And("click on send")
    public void clickOnSend() {
        System.out.println("clickOnSend");
    }

    @Then("the video should be displayed on the wall")
    public void theVideoShouldBeDisplayedOnTheWall() {
        System.out.println("theVideoShouldBeDisplayedOnTheWall");
    }
}
