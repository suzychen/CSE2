////////////////////////////////////////////////////////////////////////////////////////////////
//Zijia Chen
//zic217
//Arithmetic Java Program
//This program calculates and prints out the cost and the tax of each items bought at Walmart, the total cost, the total tax and the cost after tax.
//
//  first compile the program
//      javac Arithmetic.java
//  run the program
//      java Arithmetic//

//  define a class
public class Arithmetic{
    
    //add main method
    public static void main (String[] args) {
        //numbers of pair of socks
        int nSocks=3;
        //cost per pair of socks
        //('$' is part of the variable name)
        double sockCost$=2.58;
        //Number of drinking glasses
        int nGlasses=6;
        //Cost per glass
        double glassCost$=2.29;
        //Number of boxes of envelopes
        int nEnvelopes=1;
        //cost per box of envelopes
        double envelopeCost$=3.25;
        double taxPercent=0.06; //declare the value of tax rate in Pennsylvania
        double totalSockCost$; //declare the value of total cost of socks before tax
        double sockTax$; //declare the value of tax of socks purchased
        double totalGlassCost$; //declare the value of total cost of glass before tax
        double glassTax$; //declare the value of tax of glass purchased
        double totalEnvelopCost$; //declare the value of total cost of envelop before tax
        double envelopTax$; //declare the value of tax of envelop purchased
        double totalCostBeforeTax, totalTax, totalCostAfterTax; //declare total cost before tax, total taxand total cost after tax
        
        
        totalSockCost$=nSocks*sockCost$; //calculate the total cost of socks
        sockTax$=((int)(nSocks*sockCost$*taxPercent*100))/100.0; //calculate the tax of socks purchased
        
        totalGlassCost$=nGlasses*glassCost$; //calculate the total cost of sunglasses
        glassTax$=((int)(nGlasses*glassCost$*taxPercent*100))/100.0; //calculate the tax of sunglasses purchased
        
        totalEnvelopCost$=nEnvelopes*envelopeCost$; //calculate the total cost of envelops 
        envelopTax$=((int)(nEnvelopes*envelopeCost$*taxPercent*100))/100.0; //calculate the tax of envelops purchased
        
        totalCostBeforeTax=totalSockCost$+totalGlassCost$+totalEnvelopCost$;
        totalTax=sockTax$+glassTax$+envelopTax$;
        totalCostAfterTax=totalCostBeforeTax+totalTax;
        //above gives the total cost before tax, the total tax and the total cost after tax
        
        
        System.out.println ("Total cost of socks is "+
            totalSockCost$+" dollars and"+" the tax of socks is "+
            sockTax$+" dollars.");
        System.out.println ("Total cost of sunglasses is "+
            nGlasses*glassCost$+" dollars and"+" the tax of sunglasses is "+
            glassTax$+" dollars.");
        System.out.println ("Total cost of envelop is "+
            nEnvelopes*envelopeCost$+" dollars and"+" the tax of the box of envelops is "+
            envelopTax$+" dollars.");
        
        System.out.println ("The total cost before tax is "+
            totalCostBeforeTax+" dollars.");
        System.out.println ("The total tax is "+
            totalTax+" dollars.");
        System.out.println ("The total cost after tax is "+
            totalCostAfterTax+" dollars.");
        
        //test/testtest
    }
}