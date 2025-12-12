package com.main.views.dashboard;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

import com.main.components.*;
import com.main.components.panelApps.contentPanel;
import com.main.routes.dashboardAdminView;

public class homeDashboardView extends contentPanel {

    private dashboardAdminView parentView;

    private panelRounded panelProduct;
    private panelRounded panelStaff;
    private panelRounded panelSupplier;
    private panelRounded panelTransaction;
    private panelRounded panelDiagramTransaction;

    private textLabel labelProduct;
    private textLabel labelSupplier;
    private textLabel labelStaff;
    private textLabel labelTransaction;

    private textLabel valueProduct;
    private textLabel valueSupplier;
    private textLabel valueStaff;
    private textLabel valueTransaction;

    public homeDashboardView(dashboardAdminView parentView) {
        super();
        this.parentView = parentView;
        initContent();
    }

    @Override
    public void initContent() {
        setLayout();
        setColor();
        setFont();

        panelProduct.add(labelProduct);
        panelProduct.add(valueProduct);

        panelSupplier.add(labelSupplier);
        panelSupplier.add(valueSupplier);

        panelStaff.add(labelStaff);
        panelStaff.add(valueStaff);

        panelTransaction.add(labelTransaction);
        panelTransaction.add(valueTransaction);

        add(panelProduct);
        add(panelStaff);
        add(panelSupplier);
        add(panelTransaction);
        add(panelDiagramTransaction);

        setVisible(true);
    }

    private void setLayout() {
        panelProduct = new panelRounded(40, 40, 230, 150, 10, 10);
        panelSupplier = new panelRounded(310, 40, 230, 150, 10, 10);
        panelStaff = new panelRounded(580, 40, 230, 150, 10, 10);
        panelTransaction = new panelRounded(850, 40, 230, 150, 10, 10);
        panelDiagramTransaction = new panelRounded(40, 230, 1040, 400, 10, 10);

        labelProduct = new textLabel("Data Product", 0, 10, 230, 40);
        labelSupplier = new textLabel("Data Supplier", 0, 10, 230, 40);
        labelStaff = new textLabel("Data Staff", 0, 10, 230, 40);
        labelTransaction = new textLabel("Data Transaction", 0, 10, 230, 40);

        valueProduct = new textLabel("0", 0, 60, 230, 40);
        valueSupplier = new textLabel("0", 0, 60, 230, 40);
        valueStaff = new textLabel("0", 0, 60, 230, 40);
        valueTransaction = new textLabel("0", 0, 60, 230, 40);

    }

    private void setColor() {
        panelProduct.setBackground(color.WHITE);
        panelStaff.setBackground(color.WHITE);
        panelSupplier.setBackground(color.WHITE);
        panelTransaction.setBackground(color.WHITE);
        panelDiagramTransaction.setBackground(color.WHITE);

        labelProduct.setForeground(color.DARKGREEN);
        labelSupplier.setForeground(color.DARKGREEN);
        labelStaff.setForeground(color.DARKGREEN);
        labelTransaction.setForeground(color.DARKGREEN);

        valueProduct.setForeground(color.DARKGREEN);
        valueSupplier.setForeground(color.DARKGREEN);
        valueStaff.setForeground(color.DARKGREEN);
        valueTransaction.setForeground(color.DARKGREEN);

    }

    private void setFont() {
        labelProduct.setFont(fontStyle.getFont(fontStyle.FontStyle.BOLD, 20f));
        labelSupplier.setFont(fontStyle.getFont(fontStyle.FontStyle.BOLD, 20f));
        labelStaff.setFont(fontStyle.getFont(fontStyle.FontStyle.BOLD, 20f));
        labelTransaction.setFont(fontStyle.getFont(fontStyle.FontStyle.BOLD, 20f));

        valueProduct.setFont(fontStyle.getFont(fontStyle.FontStyle.SEMIBOLD, 22f));
        valueSupplier.setFont(fontStyle.getFont(fontStyle.FontStyle.SEMIBOLD, 22f));
        valueStaff.setFont(fontStyle.getFont(fontStyle.FontStyle.SEMIBOLD, 22f));
        valueTransaction.setFont(fontStyle.getFont(fontStyle.FontStyle.SEMIBOLD, 22f));

        labelProduct.setHorizontalAlignment(JLabel.CENTER);
        labelSupplier.setHorizontalAlignment(JLabel.CENTER);
        labelStaff.setHorizontalAlignment(JLabel.CENTER);
        labelTransaction.setHorizontalAlignment(JLabel.CENTER);

        valueProduct.setHorizontalAlignment(JLabel.CENTER);
        valueSupplier.setHorizontalAlignment(JLabel.CENTER);
        valueStaff.setHorizontalAlignment(JLabel.CENTER);
        valueTransaction.setHorizontalAlignment(JLabel.CENTER);
    }
}
