/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class CarOrderTest {
    public static void main(String [] args){
         System.out.println("TESTING CarOrder Class\n");
         
         System.out.println("Adding car1, Model 1, Year 2015, Price 56000, Returning Customer, 5 Months \n");
         CarOrder car=new CarOrder("Model 1", 2015, 56000, true, 700, 5);
         System.out.println("PAYMENT SCHEDULE");
         car.printPaymentSchedule();
         
         System.out.println("\n\n");
         
         System.out.println("Adding car2, Model 2, Year 2019, Price 56000,Not Returning Customer, 12 Months \n");
          car=new CarOrder("Model 2", 2019, 60000, false, 450, 12);
         System.out.println("PAYMENT SCHEDULE");
         car.printPaymentSchedule();
         
         System.out.println("\n\n");
         
          System.out.println("Adding car3, Model 3, Year 2009, Price 25000,Not Returning Customer, 2 Months \n");
          car=new CarOrder("Model 3", 2009, 25000, false, 600, 2);
         System.out.println("PAYMENT SCHEDULE");
         car.printPaymentSchedule();
         
         
          System.out.println("Adding car4, Model 4, Year 2017, Price 63000, Returning Customer, 13 Months \n");
          car=new CarOrder("Model 4", 2017, 63000, true, 900, 13);
         System.out.println("PAYMENT SCHEDULE");
         car.printPaymentSchedule();
         
         System.out.println("\n\n");
         
         
    }
}
