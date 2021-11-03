package com.company.task4;

public class Node {
    private String family;
    private String city;

    Node(){}

    public Node(String family, String city) {
        this.family = family;
        this.city = city;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
