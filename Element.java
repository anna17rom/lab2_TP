package org.example;

public class Element {
    String type;
    int amount;
    double price;

    public Element(String type,int amount,double price) {
        this.type = type;
        this.amount = amount;
        this.price = price;
    }

    public double TotalPrice(){
        return amount*price;
    }

}
