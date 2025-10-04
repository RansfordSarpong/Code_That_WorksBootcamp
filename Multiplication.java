
import java.util.Scanner;

class Multiplication{
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
      System.out.println("Enter a number to check it's multiplication up to ten times the number:\n");
      int number = input.nextInt();
      for(int index = 1;index<=10;index++){
        int results =number*index;
        System.out.println(number+"x"+index+" = "+results);
      }
  }
}