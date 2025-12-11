package com.main.controller;

import com.main.routes.mainFrame;

public class appsController {

    private static final mainFrame parentApp = new mainFrame();

    public static void showLogin() {
        parentApp.showLoginApp();
        // setVisible sudah dipanggil di showLoginApp
    }

    public static void showDashboardAdmin() {
        parentApp.showDashboard();
        // setVisible sudah dipanggil di showDashboard
    }
}
