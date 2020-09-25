import java.util.Scanner;

public class ConstructionTester
{
    public static void main(String[] args)
    {
      int numBoard, numWindows;
      double salesTaxRate, total, totalCost;

      Scanner in = new Scanner(System.in);

      System.out.println("Enter the sales tax rate: ");
      salesTaxRate = in.nextDouble();

      System.out.println("How many boards do you need?");
      numBoard = in.nextInt();

      System.out.println("How many windows do you need?");
      numWindows = in.nextInt();

      Construction myConstruction = new Construction(8.0, 11.0, salesTaxRate);

      total = myConstruction.lumberCost(numBoard) + myConstruction.windowCost(numWindows);

      totalCost = myConstruction.grandTotal(total);

      System.out.println("Total: " + total);
      System.out.println("Grand Total: " + totalCost);
    }
}
