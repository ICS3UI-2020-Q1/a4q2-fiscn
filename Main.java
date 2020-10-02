import java.util.Scanner; 

/**
 * Write a program that will prompt the user to enter in a positive integer. It will keep doing this until the user enters in a negative integer.

 * @author Neil Fischer
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Import Scanner for user imput 
    Scanner input = new Scanner(System.in);   

    int userNum;

    do{
      System.out.println("Please enter a positive integer. Enter a negative integer to quit."); 

      userNum = input.nextInt(); 


    }while(userNum >= 0); 

    System.out.println("All done!");
    
    
    
  }
}
