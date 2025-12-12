package com.main.routes;

import com.main.components.color;
import com.main.components.panelApps.containerPanel;
import com.main.components.panelApps.contentPanel;
import com.main.views.dashboard.homeDashboardView;
import com.main.views.dashboard.parentDashboardAdmin;
import com.main.views.dashboard.dataKriteria.dashboardDataKriteria;
import com.main.views.dashboard.dataNilai.dashboardDataNilai;
import com.main.views.dashboard.dataSiswa.dashboardDataSiswa;
import com.main.views.dashboard.dataSiswa.formDataSiswa;

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

        parentDashboard.getNavbar().showHomeView();

    }

    public void showDashboardHome() {
        homeDashboardView dashboardHome = new homeDashboardView(this);
        lastContent = dashboardHome;
        parentDashboard.setContent(dashboardHome);
    }

    public void showDashboardSiswa() {
        dashboardDataSiswa dashboardDataSiswa = new dashboardDataSiswa(parentApp, this);
        lastContent = dashboardDataSiswa;
        parentDashboard.setContent(dashboardDataSiswa);
    }

    public void showDashboardNilai() {
        dashboardDataNilai dashboardDataNilai = new dashboardDataNilai(parentApp, this);
        lastContent = dashboardDataNilai;
        parentDashboard.setContent(dashboardDataNilai);
    }

    public void showDashboardKriteria() {
        dashboardDataKriteria dashboardDataKriteria = new dashboardDataKriteria(parentApp, this);
        lastContent = dashboardDataKriteria;
        parentDashboard.setContent(dashboardDataKriteria);
    }

    public void showFormDataSiswa() {
        formDataSiswa formDataSiswa = new formDataSiswa(this);
        lastContent = formDataSiswa;
        parentDashboard.setContent(formDataSiswa);
    }

    public contentPanel restoreLastContent() {
        return lastContent != null ? lastContent : new homeDashboardView(this);
    }

    public void resetLastContent() {
        parentDashboard.getNavbar().showHomeView();
        lastContent = null;
    }
}
