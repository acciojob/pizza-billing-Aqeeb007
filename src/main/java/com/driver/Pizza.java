package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int cheesePrice;
    private int toppingsPrice;
    private int takeAwayPrice;


    boolean isCheeseAdded;
    boolean isToppingsAdded;
    boolean isTakeAwayAdded;
    boolean isBillGenerated;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        this.cheesePrice = 80;
        this.takeAwayPrice = 20;

        if(isVeg){
            this.price = 300;
            this.toppingsPrice = 70;
        }else{
            this.price = 400;
            this.toppingsPrice = 120;
        }
        this.isCheeseAdded = false;
        this.isToppingsAdded = false;
        this.isTakeAwayAdded = false;
        this.isBillGenerated = false;

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
        if(this.isToppingsAdded == false){
            this.price += this.toppingsPrice;
            this.isToppingsAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(this.isTakeAwayAdded == false){
            this.price += this.takeAwayPrice;
            this.isTakeAwayAdded = true;
        }
    }

    public String getBill(){
        // your code goes here
        if(isBillGenerated == false){
            if(isCheeseAdded == true){
                this.bill += "Extra Cheese Added: " + this.cheesePrice + "\n";
            }
            if (isToppingsAdded ==true){
                this.bill += "Extra Toppings Added: " + this.toppingsPrice + "\n";
            }
            if (isTakeAwayAdded == true){
                this.bill += "Paperbag Added: " + this.takeAwayPrice + "\n";
            }
            this.bill = this.bill + "Total Price: " + this.price + "\n";
            isBillGenerated = true;
        }
        return this.bill;
    }
}