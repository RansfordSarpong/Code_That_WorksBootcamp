import java.util.Scanner;

public class SimpleMenu{
  public static void main(String[] args) {
      System.out.println("Welcome to your Bank Account");
      Scanner input = new Scanner(System.in);
      System.out.println("Select an Option....");
      System.out.println("1->Viewing Balance\n2->Proceeding Balance\n3->Initiating Withdraw\n4->Exiting...");
      int select = input.nextInt();

      switch(select){
        case 1:
        System.out.println("1->Viewing Balance...");
        break;
        case 2:
        System.out.println("2->Proceeding to deposit...");
        break;
        case 3:
        System.out.println("3->Initiating withdrawal...");
        break;
        case 4:
        System.out.println("4->Exiting...Thank you!");
        break;
        default:
        System.out.println("Invalid choice...Please try again...");
      }
  }
}
