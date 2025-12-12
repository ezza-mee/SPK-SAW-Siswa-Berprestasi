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
            "Home", 70);

    private navigation navSiswa = new navigation(
            appIcons.getDataSiswaIconDefault(25, 25),
            appIcons.getDataSiswaIconHover(25, 25),
            "Data Siswa", 70 + 50);

    private navigation navNilai = new navigation(
            appIcons.getDataNilaiIconDefault(25, 25),
            appIcons.getDataNilaiIconHover(25, 25),
            "Data Nilai", 70 + 50 + 50);

    private navigation navKriteria = new navigation(
            appIcons.getDataKriteriaIconDefault(25, 25),
            appIcons.getDataKriteriaIconHover(25, 25),
            "Data Kriteria", 70 + 50 + 50 + 50);

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

        navSiswa.setForeground(color.WHITE);
        navSiswa.setBackground(color.DARKGREEN);
        navSiswa.setNavigationInAktif();

        navNilai.setForeground(color.WHITE);
        navNilai.setBackground(color.DARKGREEN);
        navNilai.setNavigationInAktif();

        navKriteria.setForeground(color.WHITE);
        navKriteria.setBackground(color.DARKGREEN);
        navKriteria.setNavigationInAktif();

        navLogout.setForeground(color.WHITE);
        navLogout.setBackground(color.DARKGREEN);
        navLogout.setNavigationInAktif();

    }

    public navigationDashboardView(dashboardAdminView contentView) {
        super();
        this.contentView = contentView;

        handelNavigation();

        add(navHome);
        add(navSiswa);
        add(navNilai);
        add(navKriteria);
        add(navLogout);
    }

    private void handelNavigation() {

        navHome.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent me) {
                showHomeView();
            }
        });

        navSiswa.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent me) {
                showSiswaView();
            }
        });

        navNilai.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent me) {
                showNilaiView();
            }
        });

        navKriteria.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent me) {
                showKriteriaView();
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

    public void showSiswaView() {
        resetNavigation();

        navSiswa.setForeground(color.DARKGREEN);
        navSiswa.setBackground(color.WHITE);
        navSiswa.setNavigationAktif();

        contentView.showDashboardSiswa();

        setVisible(true);
    }

    public void showNilaiView() {
        resetNavigation();

        navNilai.setForeground(color.DARKGREEN);
        navNilai.setBackground(color.WHITE);
        navNilai.setNavigationAktif();

        contentView.showDashboardNilai();

        setVisible(true);
    }

    public void showKriteriaView() {
        resetNavigation();

        navKriteria.setForeground(color.DARKGREEN);
        navKriteria.setBackground(color.WHITE);
        navKriteria.setNavigationAktif();

        contentView.showDashboardKriteria();

        setVisible(true);
    }

}
