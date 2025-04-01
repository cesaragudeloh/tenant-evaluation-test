package com.tenant.evaluation.test.userinterface;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("http://uitestingplayground.com/sampleapp")
public class LoginPage extends PageObject {

    public static Target USERNAME_FIELD = Target.the("username field").located(By.name("UserName"));
    public static Target PASSWORD_FIELD = Target.the("password field").located(By.name("Password"));
    public static Target LOGIN_BUTTON = Target.the("login button").located(By.id("login"));

}
