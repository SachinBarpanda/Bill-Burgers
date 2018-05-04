package com.sachin;

public class HealthyBurger extends  Hamburger {
    private String cheese;
    private double cheesePrice;

    private  String maonese;
    private double maonesePrice;


    public HealthyBurger(String meat,double price) {
        super("Heathy", "Brown rye", meat, price);
    }
        public void addCheese (String name, double price){
        cheese = this.name;
        cheesePrice = price;
        }

        void addMaonese (String name,double price){
        maonese = this.name;
        maonesePrice = price;
        }

    @Override
    public double callmeanytime() {
         double HamburgerCost=super.callmeanytime();

          if(this.cheese !=null){
              this.cheesePrice +=HamburgerCost;
             System.out.println("Total cost of hamburger after adding cheese"+ this.cheesePrice);
          }
          if(this.maonese !=null){
              this.maonesePrice +=HamburgerCost;
             System.out.println("Total cost of hamburger after adding maonese"+ this.maonesePrice);
          }
            return HamburgerCost;
         }

}
