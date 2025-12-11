package com.main.routes;

import com.main.components.panelApps.*;
import com.main.controller.appsController;
import com.main.views.login.formLogin;

public class loginView extends containerPanel {

    private formLogin componentLogin;

    public loginView(mainContent mainContent) {
        super();
        componentLogin = new formLogin(this, mainContent.getMainFrame());
        add(componentLogin);
    }

    public void loginSuccess() {
        appsController.showDashboardAdmin();
    }
}
