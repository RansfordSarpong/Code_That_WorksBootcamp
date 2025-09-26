
import java.util.Scanner;

public class SimpleCalculator{
  public static void main(String[] args) {
      
      Scanner in = new Scanner(System.in);
      System.out.println("Enter the number to perfom some Arithmetic operation(1->+(Addition),2->-(Subtraction),3->(Multiplication)*,4->(Division)/):");
      System.out.println("Enter first num: ");
      int num_A = in.nextInt();

      System.out.println("Choose an Arithmeettic operation..");
      int operation = in.nextInt();

      System.out.println("Enter second num: ");
      int num_B = in.nextInt();
    
      switch (operation) {
          case 1:
            int Results =num_A+num_B;
            System.out.println("Results: "+ Results);
          break;
          case 2:
            int outcome = num_A-num_B;
              System.out.println("Resulst: "+outcome);
          break;
          case 3:
            int Answer = num_A*num_B;
            System.out.println("Results: "+Answer);
            break;
            case 4:
            int output=num_A/num_B;
            System.out.println("Results: "+ output);
            break;
          default:
            System.out.println("Invalid...");
      }
  }
}