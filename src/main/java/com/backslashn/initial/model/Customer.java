package com.backslashn.initial.model;

/**
 * Created by andrei on 7/15/2018.
 */
public class Customer {
    private String firstName;
    private String lastNanme;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastNanme() {
        return lastNanme;
    }

    public void setLastNanme(String lastNanme) {
        this.lastNanme = lastNanme;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastNanme='" + lastNanme + '\'' +
                '}';
    }
}
