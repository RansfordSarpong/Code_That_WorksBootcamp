
import java.util.Scanner;
public class Average{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
      int average;
      int sum =0;
      int average_num =10;

      for(int index =1;index<=10;index++){
        System.out.println("Enter number "+index);
        int number = input.nextInt(); 
        sum+=number;
      }
      average =sum/average_num;
      System.out.println("Total sum = "+sum);
      System.out.println("Average = "+ average);
  }
  }



