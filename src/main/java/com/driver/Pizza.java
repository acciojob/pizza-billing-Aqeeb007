package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int cheesePrice;
    private int toppingPrice;
    private int takeAwayPrice;


    boolean isCheeseAdded;
    boolean isToppingAdded;
    boolean isTaeAwayAdded;
    boolean isBillGenreted;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        this.cheesePrice = 80;
        this.takeAwayPrice = 20;

        if(isVeg){
            this.price = 300;
            this.toppingPrice = 70;
        }else{
            this.price = 400;
            this.toppingPrice = 120;
        }
        this.isCheeseAdded = false;
        this.isToppingAdded = false;
        this.isTaeAwayAdded = false;

        this.bill = "Base Price Of The Pizza: " + this.price + "\n";

    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // cheese added
        if(this.isCheeseAdded == false){
            this.price +=  this.cheesePrice;
            this.isCheeseAdded = true;
        }
        // your code goes here
    }

    public void addExtraToppings(){
        // your code goes here
        if(this.isToppingAdded == false){
            this.price += this.toppingPrice;
            this.isToppingAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(this.isTaeAwayAdded == false){
            this.price += this.takeAwayPrice;
            this.isTaeAwayAdded = true;
        }
    }

    public String getBill(){
        // your code goes here
        if(isBillGenreted == false){
            if(isCheeseAdded == true){
                this.bill = "Extra Cheese Added: " + this.cheesePrice + "\n";

            }
            if (isToppingAdded ==true){
                this.bill = "Extra Toppings Added: " + this.toppingPrice + "\n";
            }
            if (isTaeAwayAdded == true){
                this.bill = "Paperbag Added: " + this.takeAwayPrice + "\n";

            }
            this.bill = this.bill + "Total Price" + this.price + "\n";
            isBillGenreted = true;
        }
        return this.bill;
    }
}
