/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class BusOrder {

    /*
    o	quantity
    o	model
    o	model year
    o	buyerName
    o	governmentBody (boolean)
    o	loanLengthYears
    o	discountPercent
    o	pricePerBus
     */

    private int modelYear;
    private int quantity;
    private String  model;
    private String buyerName;
    private boolean governmentBody;
    private int loanLengthYears;
    private double discountPercent=0.0;
    private double pricePerBus;
    //(quantity, model, year, buyerName, governmentBody, loanLengthYears);
    public BusOrder(int quantity, String model,int modelYear, String buyerName,boolean governmentBody, int loanLengthYears) {
        this.quantity = quantity;
        this.model = model;
        this.governmentBody=governmentBody;
        this.modelYear=modelYear;
        this.buyerName = buyerName;
        this.loanLengthYears = loanLengthYears;
        calculateDiscountPercent() ;
        calculatePricePerBus() ;
    }
    //calculateDiscountPercent
    public void calculateDiscountPercent(){
        if(this.isGovernmentBody()){
            this.discountPercent+=5.0;
        }
       if(this.modelYear<2016){
           this.discountPercent+=3.0;
       }
       if(this.quantity>=10 && this.quantity<=50){
           this.discountPercent+=5.0;
       }else if (this.quantity>50){
           this.discountPercent+=10.0;
       }
    }
    //calculatePricePerBus
    public void calculatePricePerBus(){
        if(this.model.equals("Mad Max")){
            if(this.modelYear>=2016 && this.modelYear<=2019){
                this.pricePerBus=80000;
            }else if(this.modelYear>=2013 && this.modelYear<=2015){
                this.pricePerBus=60000;
            }else if(this.modelYear>=2010 && this.modelYear<=2012){
                this.pricePerBus=45000;
            }
        }else if(this.model.equals("Low Emission")){
                        if(this.modelYear>=2016 && this.modelYear<=2019){
                this.pricePerBus=95000;
            }else if(this.modelYear>=2013 && this.modelYear<=2015){
                this.pricePerBus=80000;
            }else if(this.modelYear>=2010 && this.modelYear<=2012){
                this.pricePerBus=65000;
            }
        }else if(this.model.equals("No Oil")){
                      if(this.modelYear>=2016 && this.modelYear<=2019){
                this.pricePerBus=110000;
            }else if(this.modelYear>=2013 && this.modelYear<=2015){
                this.pricePerBus=95000;
            }else if(this.modelYear>=2010 && this.modelYear<=2012){
                this.pricePerBus=80000;
            }  
        }
        
    }
    //printBuildingSchedule
    
    public void printBuildingSchedule(){
        int num=this.quantity;
        int i=1;
        if(num<10){
            //4
            while(num>0){
                if(num>=4){
                    System.out.println("Month "+i+" - "+4+" buses");
                }else{
                    System.out.println("Month "+i+" - "+num+" buses"); 
                }
                num-=4;
                i++;
            }
        }else if (num>=10 && num <=50){
            //6
                        while(num>0){
                if(num>=6){
                    System.out.println("Month "+i+" - "+6+" buses");
                }else{
                    System.out.println("Month "+i+" - "+num+" buses"); 
                }
                num-=6;
                i++;
            }
        }else if(num>50){
            //8
                while(num>0){
                if(num>=8){
                    System.out.println("Month "+i+" - "+8+" buses");
                }else{
                    System.out.println("Month "+i+" - "+num+" buses"); 
                }
                num-=8;
                i++;
            }
        }
    }
    //printPaymentSchedule
    
    public void printPaymentSchedule(){
        double totalPrice=this.quantity*this.pricePerBus;
        totalPrice-=totalPrice*(this.discountPercent/100);
        if(!this.isGovernmentBody()){
            totalPrice+=totalPrice+(0.01*this.pricePerBus*this.quantity*this.loanLengthYears*12);
            
        }
        double topay=totalPrice/(this.loanLengthYears*12);
        for (int i=1; i<=(this.loanLengthYears*12); i++){
            System.out.println("Month "+i+" : "+(int)topay);
        }
    }
    //Getters
    
    public int getQuantity() {
        return quantity;
    }

    public String getModel() {
        return model;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public boolean isGovernmentBody() {
        return governmentBody;
    }

    public int getLoanLengthYears() {
        return loanLengthYears;
    }

    public double getDiscountPercent() {
        return discountPercent;
    }

    public double getPricePerBus() {
        return pricePerBus;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public void setGovernmentBody(boolean governmentBody) {
        this.governmentBody = governmentBody;
    }

    public void setLoanLengthYears(int loanLengthYears) {
        this.loanLengthYears = loanLengthYears;
    }

    public void setDiscountPercent(double discountPercent) {
        this.discountPercent = discountPercent;
    }

    public void setPricePerBus(double pricePerBus) {
        this.pricePerBus = pricePerBus;
    }
    
    
    
}
