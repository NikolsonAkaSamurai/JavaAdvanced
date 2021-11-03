package com.company.laboratorka1;

public class User {
    private int priority;
    private String login;

    public User(int priority, String login) {
        this.priority = priority;
        this.login = login;
    }

    public int getPriority() {
        return priority;
    }

    public String getLogin() {
        return login;
    }
}
