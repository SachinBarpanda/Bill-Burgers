package com.sachin;

public class Hamburger {
    public String name;
    private String breadroll;
    private String meat;
    public double price;

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
        tomato=name;
        tomatoPrice=price;
    }
    public void addCarrot(String name , double price){
        carrot=name;
        carrotPrice=price;
    }
    public void addReddish(String name, double price){
        raddis=name;
        raddisPrice=price;
    }
    public double callmeanytime(){
        double HamburgerCost=this.price;
        System.out.println("The "+this.name+"burger cost "+HamburgerCost);

        if(lettuce != null) {
            lettucePrice+=HamburgerCost;
            System.out.println("Total cost of hamburger after adding "+lettuce+lettucePrice);
        }

        if (tomato!= null){
            tomatoPrice+=HamburgerCost;
            System.out.println("Total cost of hamburger after adding Tomato"+tomatoPrice);
        }

        if(carrot != null) {
            carrotPrice+=HamburgerCost;
            System.out.println("Total cost of hamburger after adding "+carrot+carrotPrice);
        }

        if(raddis != null){
            raddisPrice+=HamburgerCost;
            System.out.println("Total cost of hamburger after adding Raddis"+raddisPrice);
        }
        return HamburgerCost;
    }


}
