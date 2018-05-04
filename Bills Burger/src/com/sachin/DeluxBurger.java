package com.sachin;

import com.sachin.Hamburger;
public class DeluxBurger extends Hamburger {

        private String chips;
        private double costofChips;

        private String Drinks;
        private double costofDrinks;

        public DeluxBurger(){
            super("Bacon","trolling","ham",5.12) ;
                super.addCarrot("Chips",4.0);
                super.addLettuce("Drinks",2.0);
    }

    @Override
    public void addCarrot(String name, double price) {
        System.out.println("Cannot add anything to Delux Burger");
    }
    public void addReddish(String name, double price) {
        System.out.println("Cannot add anything to Delux Burger");
    }
    public void addTomato(String name, double price) {
        System.out.println("Cannot add anything to Delux Burger");
    }
    public void addLettuce(String name, double price) {
        System.out.println("Cannot add anything to Delux Burger");
    }
}