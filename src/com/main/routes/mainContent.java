package com.main.routes;

import com.main.components.panelApps.wrapperPanel;

public class mainContent extends wrapperPanel {

    private mainFrame mainFrame;
    private loginView loginView;

    private dashboardAdminView dashboardAdminView;

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
        dashboardAdminView.resetLastContent();

        revalidate();
        repaint();

        setVisible(true);
    }

    public mainFrame getMainFrame() {
        return mainFrame;
    }
}
