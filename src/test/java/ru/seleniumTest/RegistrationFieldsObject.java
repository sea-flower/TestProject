package ru.seleniumTest;

public class RegistrationFieldsObject {
    private final String login;
    private final String password;

    public RegistrationFieldsObject(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}