/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class BusOrderTest {
    public static void main(String [] args){
        System.out.println("TESTING BussOrder Class");
        BusOrder order1=new BusOrder(9,"Mad Max",2015,"Joakim Adeny",false,2);
        System.out.println("Adding Bus1 Model(Mad Max Year, 2015, Non-government , Period 2 years, Quantity 9)");
        System.out.println("Building schedule");
        order1.printBuildingSchedule();
        System.out.println("Payment schedule");
        order1.printPaymentSchedule();
        System.out.println("\n\n");
        
        order1=new BusOrder(89,"Low Emission",2016,"County Government",true,1);
        System.out.println("Adding Bus2 Model(Low Emission) Year, 2016, government , Period 1 year, Quantity 89)");
        System.out.println("Building schedule");
        order1.printBuildingSchedule();
        System.out.println("Payment schedule");
        
        order1.printPaymentSchedule();
        System.out.println("\n\n");
        
        order1=new BusOrder(18,"No Oil",2019,"Ken Com Ltd",false,3);
        System.out.println("Adding Bus3 Model(No Oil) Year, 2019, Non government , Period 3 years,Quantity 18)");
        System.out.println("Building schedule");
        order1.printBuildingSchedule();
        System.out.println("Payment schedule");
        order1.printPaymentSchedule();
    }
}
