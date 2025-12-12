package com.main.views.dashboard.dataSiswa;

import com.main.components.*;
import com.main.components.panelApps.contentPanel;
import com.main.routes.dashboardAdminView;

public class formDataSiswa extends contentPanel {

    private dashboardAdminView parentView;

    private panelRounded contentPanel;

    private textLabel headerLabel;

    private textLabel nameLabel, nisnLabel, classLabel, genderLabel, addressLabel;
    private textLabel nameEmptyLabel, nisnEmptyLabel, classEmptyLabel, genderEmptyLabel,
            addressEmptyLabel;

    private textField nameField, nisnField, classField;

    private textArea addresField;

    private buttonCustom buttonBack, buttonReset, buttonSave;

    private scrollPane scrollAddres;

    private comboBox<String> genderField;

    private int siswaIdToEdit = -1;

    public formDataSiswa(dashboardAdminView parentView) {
        super();
        this.parentView = parentView;

        initContent();
    }

    @Override
    public void initContent() {
        setComponent();
        setColor();
        setFont();
        handleButton();

        contentPanel.add(nameLabel);
        contentPanel.add(nisnLabel);
        contentPanel.add(classLabel);
        contentPanel.add(addressLabel);
        contentPanel.add(genderLabel);

        contentPanel.add(nameField);
        contentPanel.add(nisnField);
        contentPanel.add(classField);
        contentPanel.add(scrollAddres);

        contentPanel.add(genderField);
        contentPanel.add(classField);

        contentPanel.add(buttonBack);
        contentPanel.add(buttonSave);
        contentPanel.add(buttonReset);

        add(contentPanel);
        add(headerLabel);

        setVisible(true);
    }

    private void setComponent() {
        headerLabel = new textLabel("Input Data Siswa", 40, 0, 400, 80);
        contentPanel = new panelRounded(40, 80, 1050, 550, 10, 10);

        nameLabel = new textLabel("Nama", 180, 30, 200, 80);
        nisnLabel = new textLabel("NISN", 180, 130, 200, 80);
        classLabel = new textLabel("Kelas", 180, 230, 200, 80);
        genderLabel = new textLabel("Jenis Kelamin", 180, 330, 200, 80);
        addressLabel = new textLabel("Address", 580, 30, 200, 80);

        nameEmptyLabel = new textLabel("Nama Tidak Boleh Kosong!", 180, 90, 200, 80);
        nisnEmptyLabel = new textLabel("NSIN Tidak Boleh Kosong Kosong!", 180, 190, 200, 80);
        classEmptyLabel = new textLabel("Kelas Tidak Boleh Kosong!", 180, 290, 200, 80);
        genderEmptyLabel = new textLabel("Jenis Kelamin Tidak Boleh Kosong!", 180, 390, 200, 80);
        addressEmptyLabel = new textLabel("Alamat Tidak Boleh Kosong!", 580, 375, 200, 80);

        nameField = new textField(180, 85, 300, 10);
        nisnField = new textField(180, 185, 300, 10);
        classField = new textField(180, 285, 300, 10);
        addresField = new textArea(580, 85, 320, 220, 10);

        String[] genderItems = { null, "Pria", "Perempuan" };
        genderField = new comboBox<>(genderItems, 180, 385, 300, 30, 10);
        genderField.setPlaceholder("Pilih Jenis Kelamin");

        nameField.setPlaceholder("Masukan Nama");
        nisnField.setPlaceholder("Masukan NSIN");
        classField.setPlaceholder("Masukan Kelas");
        addresField.setPlaceholder("Masukan Alamat");

        scrollAddres = new scrollPane(addresField, 580, 85, 320, 220);

        buttonBack = new buttonCustom("Kembali", 180, 480, 120, 40, 10);
        buttonReset = new buttonCustom("Hapus", 640, 480, 100, 40, 10);
        buttonSave = new buttonCustom("Simpan", 780, 480, 100, 40, 10);

    }

    private void setColor() {
        contentPanel.setBackground(color.WHITE);

        nameLabel.setForeground(color.DARKGREEN);
        nisnLabel.setForeground(color.DARKGREEN);
        classLabel.setForeground(color.DARKGREEN);
        genderLabel.setForeground(color.DARKGREEN);
        addressLabel.setForeground(color.DARKGREEN);

        nameEmptyLabel.setForeground(color.RED);
        nisnEmptyLabel.setForeground(color.RED);
        classEmptyLabel.setForeground(color.RED);
        genderEmptyLabel.setForeground(color.RED);
        addressEmptyLabel.setForeground(color.RED);

        scrollAddres.setBackground(color.WHITE);
        scrollAddres.getViewport().setOpaque(false);

        genderField.setBackground(color.LIGHTGREY);

    }

    private void setFont() {
        headerLabel.setFont(fontStyle.getFont(fontStyle.FontStyle.BOLD, 30f));

        nameLabel.setFont(fontStyle.getFont(fontStyle.FontStyle.SEMIBOLD, 18f));
        nisnLabel.setFont(fontStyle.getFont(fontStyle.FontStyle.SEMIBOLD, 18f));
        classLabel.setFont(fontStyle.getFont(fontStyle.FontStyle.SEMIBOLD, 18f));
        genderLabel.setFont(fontStyle.getFont(fontStyle.FontStyle.SEMIBOLD, 18f));
        addressLabel.setFont(fontStyle.getFont(fontStyle.FontStyle.SEMIBOLD, 18f));

        nameEmptyLabel.setFont(fontStyle.getFont(fontStyle.FontStyle.SEMIBOLD, 10f));
        nisnEmptyLabel.setFont(fontStyle.getFont(fontStyle.FontStyle.SEMIBOLD, 10f));
        classEmptyLabel.setFont(fontStyle.getFont(fontStyle.FontStyle.SEMIBOLD, 10f));
        genderEmptyLabel.setFont(fontStyle.getFont(fontStyle.FontStyle.SEMIBOLD, 10f));
        addressEmptyLabel.setFont(fontStyle.getFont(fontStyle.FontStyle.SEMIBOLD, 10f));
    }

    private void handleButton() {
        buttonBack.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent ae) {
                parentView.showDashboardSiswa();
            }
        });

        buttonReset.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent ae) {

            }
        });

        buttonSave.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent ae) {
                try {

                    contentPanel.revalidate();
                    contentPanel.repaint();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

}
