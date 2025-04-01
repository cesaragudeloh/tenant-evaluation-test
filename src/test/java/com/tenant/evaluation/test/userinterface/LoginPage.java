package com.tenant.evaluation.test.userinterface;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("http://uitestingplayground.com/sampleapp")
public class LoginPage extends PageObject {

    public static final Target USERNAME_FIELD = Target.the("Username field").located(By.name("UserName"));
    public static final Target PASSWORD_FIELD = Target.the("Password field").located(By.name("Password"));
    public static final Target LOGIN_BUTTON = Target.the("Login button").located(By.id("login"));
    public static final Target LOGOUT_BUTTON = Target.the("Log out button").locatedBy("//button[text()='Log Out']");
    public static final Target LOGIN_STATUS_MESSAGE = Target.the("Login status message").located(By.id("loginstatus"));

}
