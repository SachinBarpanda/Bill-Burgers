package com.sachin;

public class Hamburger {
    private String name;
    private String breadroll;
    private String meat;
    private double price;

    private String lettuce;
    private double lettucePrice;

    private String tomato;
    private double tomatoPrice;

    private String carrot;
    private double carrotPrice;

    private String raddis;
    private double raddisPrice;

    public Hamburger(String name,String breadroll,String meat,double price){
        this.breadroll=breadroll;
        this.meat=meat;
        this.name=name;
        this.price=price;
    }

    public void addLettuce(String name, double price){
        lettuce=name;
        lettucePrice=price;
    }

    public void addTomato(String name,double price){

    }


}
