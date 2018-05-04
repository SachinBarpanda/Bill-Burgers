package com.sachin;

public class Main {

    public static void main(String[] args) {

    Hamburger hamburger=new Hamburger("Basic ","sausage","red",5.13);
    hamburger.addCarrot("Carrot",3.12);
    hamburger.addLettuce("lettuce",1.23);
    hamburger.callmeanytime();
    hamburger.addReddish("Reddish",2.12);
    hamburger.callmeanytime();

    HealthyBurger healthythings=new HealthyBurger("red",3.10);
    healthythings.addCheese("Cheese",2.20);
    healthythings.addMaonese("Maonese",1.20);
    healthythings.callmeanytime();

    DeluxBurger delux=new DeluxBurger();
    delux.addCarrot("Garnishing",3.15);
    delux.callmeanytime();

    }
}
