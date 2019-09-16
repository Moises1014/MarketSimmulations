/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package simulationrunner;

import java.util.Scanner;

/**
 *
 * @author moises
 */
public class SimulationRunner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         StockSimulator sim = new StockSimulator();

      Scanner in = new Scanner(System.in);
      boolean done = false;
      System.out.println("Stock Simulator Menu");
      System.out.println("-----------------------------------------------");
      System.out.println(" > buy stock-symbol quantity price");
      System.out.println(" > sell stock-symbol quantity price");
      System.out.println(" > quit to quit simulation.");
      System.out.println();
      while (!done)
      {
         System.out.print(" > ");
         String action = in.next();
         if (action.equals("buy"))
         {
            String symbol = in.next();
            int quantity = in.nextInt();
            int price = in.nextInt();
            sim.buy(symbol, quantity, price);
         }
         else if (action.equals("sell"))
         {
            String symbol = in.next();
            int quantity = in.nextInt();
            int price = in.nextInt();
            sim.sell(symbol, quantity, price);
         }
         else if (action.equals("quit"))
         {
            
            done = true;
         }
      }
    }
    
}
