
import static jdk.nashorn.internal.objects.NativeMath.round;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class CarOrder {
    
    //Variables
    private  String model;
    private int year;
    private double price;
    private boolean returningCustomer;
    private int creditScore;
    private double discountPercent=0.0;
    private double interestRate=0.0;
    private int loanLength;
//Pubic Constructor
    public CarOrder(String model, int year, double price, boolean returningCustomer, int creditScore, int loanLength) {
        this.model = model;
        this.year = year;
        this.price = price;
        this.returningCustomer = returningCustomer;
        this.creditScore = creditScore;
        this.loanLength = loanLength;
        calculateInterestRate() ;
        discountPercent() ;
    }
    //calculateInterestRate
    public void  calculateInterestRate(){
        //Bassed on Loan Length
        if(this.loanLength < 5){
            this.interestRate+=1.0;
        }else if(this.loanLength >= 5){
            this.interestRate+=5.0;
        }
        //Based on credit score
        
        if(this.creditScore >700){
            this.interestRate+=0.5;
        }else if(this.creditScore>=500 && this.creditScore>=700){
            this.interestRate+=1.5;
        }else if(this.creditScore<500){
            this.interestRate+=3.0;
        }
         
    }
    
    //discountPercent
    
    public void discountPercent(){
      if(this.isReturningCustomer()){
          this.discountPercent+=5.0;
          
      }
      if(this.year<2010){
          this.discountPercent+=5.0;
          
      }else if(this.year>=2010 && this.year<=2016){
          this.discountPercent+=10;
      }else if(this.year>2016){
          this.discountPercent+=0.0;
      }
    }
    //public setters
    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setReturningCustomer(boolean returningCustomer) {
        this.returningCustomer = returningCustomer;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }

    public void setDiscountPercent(double discountPercent) {
        this.discountPercent = discountPercent;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void setLoanLength(int loanLength) {
        this.loanLength = loanLength;
    }

    
    
     
  
    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public boolean isReturningCustomer() {
        return returningCustomer;
    }

    public double getCreditScore() {
        return creditScore;
    }

    public double getDiscountPercent() {
        return discountPercent;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public int getLoanLength() {
        return loanLength;
    }
    
    //printPaymentSchedule
    
    public void printPaymentSchedule(){
        double totalPrice=this.price-this.price*(this.discountPercent/100);
        double interestAmount = (this.interestRate/100)*this.price*this.loanLength;
        totalPrice+=interestAmount;
        totalPrice=totalPrice;
        int payPerMonth= (int)totalPrice/this.loanLength;
        for(int i=1; i <=this.loanLength; i++){
            System.out.printf("Month  %d: $%d\n",i,payPerMonth);
        }
    }
  /*  public static void main(String [] args){
        CarOrder car = new CarOrder("Model", 2008, 256.36, true, 500, 4);
        car.printPaymentSchedule();
    }*/
}
