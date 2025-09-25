
import java.util.Scanner;

public class TipCalculator{
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Please,enter the bill amount:");
      double Bill_Amount = input.nextDouble();

      System.out.println("Enter custom tip:");
      double percentage = 100;
      double Tip_Amount = input.nextDouble()/percentage;//tip amount of the bill amount
      double Tip_AmountBalance = (Bill_Amount*Tip_Amount);//calculating the tip of the actual Amount
      System.out.println("Hello you have "+Tip_AmountBalance+" tip balance");

      double After_tip = (Bill_Amount+Tip_AmountBalance);
      System.out.println("Hello this is your amount after tip: "+After_tip);
  }
}