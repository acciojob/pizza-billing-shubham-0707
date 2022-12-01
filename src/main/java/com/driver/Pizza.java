package com.driver;


import java.util.HashSet;
//pizza class
public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    HashSet<String> hs=new HashSet<>();
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(this.isVeg){
            this.price=300;

        }
        else {
            this.price =400;
        }
        this.bill="Base Price Of The Pizza: "+this.price+"\n";
    }

    public int getPrice(){

        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!hs.contains("cheese")){
            this.price+=80;
            bill+= ("Extra Cheese Added: 80"+"\n");


        }
        hs.add("cheese");
    }

    public void addExtraToppings(){
        // your code goes here
        if(!hs.contains("toppings")){
            if(isVeg){
                this.price+=70;
                bill+= ("Extra Toppings Added: 70"+"\n");
            }
            else{
                this.price+=120;
                bill+= ("Extra Toppings Added: 120"+"\n");}
        }
        hs.add("toppings");
    }

    public void addTakeaway(){
        // your code goes here
        if(!hs.contains("takeaway")){
            this.price+=20;
            bill+= ("Paperbag Added: 20"+ "\n");


        }
        hs.add("takeaway");
    }

    public String getBill(){
        // your code goes here
        if(!hs.contains("GetBill")){
            bill += ("Total Price: " + this.price +"\n");

        }
        hs.add("GetBill");
        return this.bill;
    }}
