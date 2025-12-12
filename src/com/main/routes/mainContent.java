package com.main.routes;

import com.main.components.panelApps.wrapperPanel;
import com.main.views.dashboard.parentDashboardAdmin;

public class mainContent extends wrapperPanel {

    private mainFrame mainFrame;
    private loginView loginView;

    private dashboardAdminView dashboardAdminView;
    private parentDashboardAdmin parentDashboardAdmin;

    public mainContent(mainFrame mainFrame) {
        super();
        this.mainFrame = mainFrame;
        loginView = new loginView(this);
        showLoginView();
    }

    private void refreshContent() {
        try {
            removeAll();
            revalidate();
            repaint();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void showLoginView() {
        refreshContent();
        setSize(1080, 720);
        add(loginView);
    }

    public void showDashboard() {
        refreshContent();
        setSize(1366, 768);

        dashboardAdminView = new dashboardAdminView(mainFrame);
        parentDashboardAdmin = new parentDashboardAdmin(dashboardAdminView);
        dashboardAdminView.showDashboardHome();
        dashboardAdminView.resetLastContent();
        parentDashboardAdmin.getNavbar().showHomeView();
        add(dashboardAdminView);

        revalidate();
        repaint();

        setVisible(true);
    }

    public mainFrame getMainFrame() {
        return mainFrame;
    }
}
