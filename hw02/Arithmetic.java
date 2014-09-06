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
        double taxPercent=0.06;
        double totalSockCost$; //total cost of socks
        double sockTax$; //tax of socks purchased
        double totalGlassCost$; //total cost of glass
        double glassTax$; //tax of glass purchased
        double totalEnvelopCost$; //total cost of envelop
        double envelopTax$; //tax of envelop purchased
        double totalCostBeforeTax, totalTax, totalCostAfterTax; //declare total cost before tax, total taxand total cost after tax
        
        System.out.println ("Total cost of socks is "+
            nSocks*sockCost$+"dollars and"+" the tax of socks is "+
            nSocks*sockCost$*taxPercent+" dollars.");
        System.out.println ("Total cost of sunglasses is "+
            nGlasses*glassCost$+"dollars and"+" the tax of sunglasses is "+
            nGlasses*glassCost$*taxPercent+" dollars.");
        System.out.println ("Total cost of envelop is "+
            nEnvelopes*envelopeCost$+"dollars and"+" the tax of the box of envelops is "+
            nEnvelopes*envelopeCost$*taxPercent+" dollars.");
        
        //above gives the seperate cost and tax of each item purchased
        
        totalSockCost$=nSocks*sockCost$;
        sockTax$=nSocks*sockCost$*taxPercent;
        totalGlassCost$=nGlasses*glassCost$;
        glassTax$=nGlasses*glassCost$*taxPercent;
        totalEnvelopCost$=nEnvelopes*envelopeCost$;
        envelopTax$=nEnvelopes*envelopeCost$*taxPercent;
        
        totalCostBeforeTax=totalSockCost$+totalGlassCost$+totalEnvelopCost$;
        totalTax=sockTax$+glassTax$+envelopTax$;
        totalCostAfterTax=totalCostBeforeTax+totalTax;
        
        System.out.println ("The total cost before tax is "+
        totalCostBeforeTax+" dollars.");
        System.out.println ("The total tax is "+
        totalTax+" dollars.");
        System.out.println ("The total cost after tax is "+
        totalCostAfterTax+" dollars.");
    }
}