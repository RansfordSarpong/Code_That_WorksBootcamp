import java.util.Scanner;

public class Traffic_Indicator {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Hello,choose a traffic light colour(red->stop ...yellow->slow down...green->go)\n with a matching responds:");
    String userResponds = input.nextLine();

    if(userResponds.equals("red")){
      System.out.println("Stop..!");
    }else if(userResponds.equals("yellow")){
      System.out.println("Slow down...");
    }else if(userResponds.equals("green")){
      System.out.println("Go...");
    }else{
      System.out.println("Oops invalid input...choose between red/yellow/green!!!");
    }
  }
}