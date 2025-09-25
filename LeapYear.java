
import java.util.Scanner;

public class LeapYear {
  public static void main(String[] args) {
      
      Scanner in = new Scanner(System.in);

      System.out.println("Check every leap year for record sake..with our customized calculator: ");

      int user_input = in.nextInt();

      if(user_input%100==0 &&user_input%400==0){
          System.out.println(" Year "+user_input+" is a leap year!");
      }

      else if(user_input%100==0 && !(user_input%400==0)){
        System.out.println("Year "+user_input+" is Not a leap");
      }
      
      else if(user_input%4==0){
          System.out.println(" Year "+user_input+" is a leap year");
        }

        else{
          System.out.println("Year "+user_input+"is Not a leap year");
        }
  }
}
  
  
  
  

  /*
  private String make;
  private String model;
  private int year;

    public Car(String make,String model,int year) {
      this.setMake(make);
      this.setModel(model);
      this.setYear(year);
    }

    public String getMake(){
      return  make;
    }

    public String getModel(){
      return model;
    }

    public int getYear(){
      return year;
    }

    public void setMake(String make){
      this.make = make;
    }
    public void  setModel(String model){
      this.model = model;
    }
    public void  setYear(int year){
      this.year = year;
    }
  
  }
  */
  //int Wheels =2;
  //int peddals = 2;

  //void park(Car car){
    //System.out.println("The "+car.name+" is parked in the garage");
    
//  }
