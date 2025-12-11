package com.main.components;

public class appIcons {

    private imageIcon loadIcon(String path, int width, int height) {
        return new imageIcon(path, width, height);
    }

    public imageIcon getEmailIcon(int width, int height) {
        return loadIcon("/com/main/assets/images/email-green.png", width, height);
    }

    public imageIcon getUsernameIcon(int width, int height) {
        return loadIcon("/com/main/assets/images/username-green.png", width, height);
    }

    public imageIcon getPasswordIcon(int width, int height) {
        return loadIcon("/com/main/assets/images/password-green.png", width, height);
    }

    public imageIcon getShowPasswordIcon(int width, int height) {
        return loadIcon("/com/main/assets/images/showPassword-green.png", width, height);
    }

    public imageIcon getHidePasswordIcon(int width, int height) {
        return loadIcon("/com/main/assets/images/hidePassword-green.png", width, height);
    }

    public imageIcon getExitIconRed(int width, int height) {
        return loadIcon("/com/main/assets/images/iconExit-red.png", width, height);
    }

    public imageIcon getExitIconWhite(int width, int height) {
        return loadIcon("/com/main/assets/images/logout-white.png", width, height);
    }

    public imageIcon getHomeIconHover(int width, int height) {
        return loadIcon("/com/main/assets/images/home-green.png", width, height);
    }

    public imageIcon getHomeIconDefault(int width, int height) {
        return loadIcon("/com/main/assets/images/home-white.png", width, height);
    }

    public imageIcon getLogoutIconHover(int width, int height) {
        return loadIcon("/com/main/assets/images/logout-green.png", width, height);
    }

    public imageIcon getLogoutIconDefault(int width, int height) {
        return loadIcon("/com/main/assets/images/logout-white.png", width, height);
    }

    public imageIcon getLogoutIconRed(int width, int height) {
        return loadIcon("/com/main/assets/images/logout-red.png", width, height);
    }

    public imageIcon getSuccessIconGreen(int width, int height) {
        return loadIcon("/com/main/assets/images/success-green.png", width, height);
    }

    public imageIcon getFailedIconRed(int width, int height) {
        return loadIcon("/com/main/assets/images/failed-red.png", width, height);
    }

    public imageIcon getDeleteIconWhite(int width, int height) {
        return loadIcon("/com/main/assets/images/delete-white.png", width, height);
    }

    public imageIcon getEditIconWhite(int width, int height) {
        return loadIcon("/com/main/assets/images/edit-white.png", width, height);
    }

    public imageIcon getDetailIconWhite(int width, int height) {
        return loadIcon("/com/main/assets/images/detail-white.png", width, height);
    }

    public imageIcon getUserIconGreen(int width, int height) {
        return loadIcon("/com/main/assets/images/user-green.png", width, height);
    }

    public imageIcon getApproveIconWhite(int width, int height) {
        return loadIcon("/com/main/assets/images/approve-white.png", width, height);
    }

    public imageIcon getAddIconWhite(int width, int height) {
        return loadIcon("/com/main/assets/images/add-white.png", width, height);
    }

    public imageIcon getMinusIconWhite(int width, int height) {
        return loadIcon("/com/main/assets/images/minus-white.png", width, height);
    }

    public imageIcon getBackIconWhite(int width, int height) {
        return loadIcon("/com/main/assets/images/back-white.png", width, height);
    }

    public imageIcon getCalenderWhite(int width, int height) {
        return loadIcon("/com/main/assets/images/calender-white.png", width, height);
    }

    public imageIcon getAlertRed(int width, int height) {
        return loadIcon("src/com/main/assets/images/alert.png", width, height);
    }
}
