package com.main.views.dashboard;

import com.main.components.*;
import com.main.components.panelApps.navigationPanel;
import com.main.routes.dashboardAdminView;

public class navigationDashboardView extends navigationPanel {

    private dashboardAdminView contentView;

    private appIcons appIcons = new appIcons();

    private navigation navHome = new navigation(
            appIcons.getHomeIconDefault(25, 25),
            appIcons.getHomeIconHover(25, 25),
            "Home",
            70

    );

    private navigation navLogout = new navigation(
            appIcons.getLogoutIconDefault(25, 25),
            appIcons.getLogoutIconHover(25, 25),
            "Logout",
            70 + 50 + 50 + 50 + 50 + 50 + 50 + 50 + 50 + 50

    );

    private void resetNavigation() {
        navHome.setForeground(color.WHITE);
        navHome.setBackground(color.DARKGREEN);
        navHome.setNavigationInAktif();

        navLogout.setForeground(color.WHITE);
        navLogout.setBackground(color.DARKGREEN);
        navLogout.setNavigationInAktif();

    }

    public navigationDashboardView(dashboardAdminView contentView) {
        super();
        this.contentView = contentView;

        handelNavigation();

        add(navHome);
        add(navLogout);
    }

    private void handelNavigation() {

        navHome.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent me) {
                showHomeView();
            }
        });

    }

    public void showHomeView() {
        resetNavigation();

        navHome.setForeground(color.DARKGREEN);
        navHome.setBackground(color.WHITE);
        navHome.setNavigationAktif();

        contentView.showDashboardHome();

        setVisible(true);
    }

   
}
