package com.main.views.dashboard.dataKriteria;

import java.util.ArrayList;
import java.util.EnumSet;

import javax.swing.table.DefaultTableModel;

import com.main.components.*;
import com.main.components.panelApps.contentPanel;
import com.main.controller.actionButtonTable;
import com.main.routes.dashboardAdminView;
import com.main.routes.mainFrame;
import com.main.views.popUp.popUpConfrim;

public class dashboardDataKriteria extends contentPanel {

    private mainFrame parentApp;

    private dashboardAdminView parentView;

    private panelRounded headerPanel, contentPanel;

    private buttonCustom buttonAdd;

    private textLabel headerLabel;

    private void setColor() {
        headerLabel.setForeground(color.BLACK);
        headerPanel.setBackground(color.WHITE);
        contentPanel.setBackground(color.WHITE);

    }

    private void setFont() {
        headerLabel.setFont(fontStyle.getFont(fontStyle.FontStyle.BOLD, 30f));
    }

    public dashboardDataKriteria(mainFrame parentApp, dashboardAdminView parentView) {
        super();
        this.parentView = parentView;
        this.parentApp = parentApp;

        initContent();
    }

    @Override
    public void initContent() {
        setLayout();
        setColor();
        setFont();
        setAction();

        headerPanel.add(buttonAdd);

        add(headerLabel);
        add(headerPanel);
        add(contentPanel);

        setVisible(true);
    }

    private void setLayout() {
        headerLabel = new textLabel("Data Convertion", 40, 0, 300, 80);
        headerPanel = new panelRounded(40, 80, 1050, 110, 10, 10);
        contentPanel = new panelRounded(40, 220, 1050, 410, 10, 10);

        buttonAdd = new buttonCustom("Add", 900, 35, 100, 40, 10);

    }

    private void setAction() {
        buttonAdd.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent ae) {
                // parentView.showFormConvertion();
            }
        });
    }

}
