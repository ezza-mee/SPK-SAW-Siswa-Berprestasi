package com.main.routes;

import com.main.components.color;
import com.main.components.panelApps.containerPanel;
import com.main.components.panelApps.contentPanel;
import com.main.views.dashboard.homeDashboardView;
import com.main.views.dashboard.parentDashboardAdmin;

public class dashboardAdminView extends containerPanel {

    private mainFrame parentApp;
    private contentPanel lastContent;

    private parentDashboardAdmin parentDashboard;

    public dashboardAdminView(mainFrame parentApp) {
        super();
        this.parentApp = parentApp;
        setSize(1366, 768);
        setBackground(color.GREEN);
        parentDashboard = new parentDashboardAdmin(this);
        add(parentDashboard);

    }

    public void showDashboardHome() {

    }

    public contentPanel restoreLastContent() {
        return lastContent != null ? lastContent : new homeDashboardView(this);
    }

    public void resetLastContent() {
        parentDashboard.getNavbar().showHomeView();
        lastContent = null;
    }
}
