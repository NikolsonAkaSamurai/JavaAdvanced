package com.company.laboratorka;

public class Product {
    private String name;
    private int price;
    private int pieces;

    public Product() {
    }

    public Product(String name, int price, int pieces) {
        this.name = name;
        this.price = price;
        this.pieces = pieces;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPieces() {
        return pieces;
    }

    public void setPieces(int pieces) {
        this.pieces = pieces;
    }

    @Override
    public String toString() {
        return "name: " + this.name+
                " price: " + this.price+
                " pieces: " + this.pieces;
    }
}
