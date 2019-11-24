package com.stackoverflow.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SingUpPage extends AbstractPage {


    @FindBy(id = "login-form")
    private WebElement submitForm;

    @FindBy(id = "display-name")
    private WebElement displayNameInput;

    @FindBy(id = "email")
    private WebElement emailInput;

    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(id = "opt-in")
    private WebElement optInCheckbox;

    @FindBy(id = "submit-button")
    private WebElement submitButton;

    public SingUpPage(WebDriver driverValue) {
        super(driverValue);
    }

    /**
     * Uses WebElement interface method isDisplayed to determinate, if submit form is displayed.
     *
     * @return true, if element is displayed
     */
    public boolean isSubmitFormDisplayed() {

        return submitForm.isDisplayed();
    }

    /**
     * Uses WebElement interface method isDisplayed to determinate, if display name input is displayed.
     *
     * @return true, if element is displayed
     */
    public boolean isDisplayNameInputDisplayed() {

        return displayNameInput.isDisplayed();
    }

    /**
     * Uses WebElement interface method isDisplayed to determinate, if email input is displayed.
     *
     * @return true, if element is displayed
     */
    public boolean isEmailInputDisplayed() {

        return emailInput.isDisplayed();
    }

    /**
     * Uses WebElement interface method isDisplayed to determinate, if password input is displayed.
     *
     * @return true, if element is displayed
     */
    public boolean isPasswordInputDisplayed() {

        return passwordInput.isDisplayed();
    }

    /**
     * Uses WebElement interface method isDisplayed to determinate, if opt in checkbox is displayed.
     *
     * @return true, if element is displayed
     */
    public boolean isOptInCheckboxDisplayed() {

        return optInCheckbox.isDisplayed();
    }

    /**
     * Uses WebElement interface method isDisplayed to determinate, if submit button is displayed.
     *
     * @return true, if element is displayed
     */
    public boolean isSubmitButtonDisplayed() {

        return submitButton.isDisplayed();
    }
}
