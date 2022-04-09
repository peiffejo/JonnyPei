import java.util.ArrayList;
import java.util.Scanner;

public class MegaPIN {
    public ArrayList<Integer> pinList = new ArrayList<Integer>(); 
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Please enter 7 of the digits 1-4 in your own order as PIN. One per line.");

    MegaPIN pin = new MegaPIN();        
    while (!pin.isComplete()) {
      pin.addNext(in.nextInt());      
    }
    in.close();
    System.out.println(pin);    
  }
  String text = "";
  for(int i = 0; i < pin.size(); i++){
    text = String.valueOf(PIN.get(i)) + "-";
  }
}