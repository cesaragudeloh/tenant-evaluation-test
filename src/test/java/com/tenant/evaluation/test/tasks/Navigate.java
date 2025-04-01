package com.tenant.evaluation.test.tasks;

import com.tenant.evaluation.test.userinterface.LoginPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class Navigate {

    private Navigate() {
    }

    public static Performable toHomePage() {
        return Task.where("{0} opens the Login page",
                Open.browserOn().the(LoginPage.class)
        );
    }

}
