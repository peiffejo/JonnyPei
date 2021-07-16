import java.util.Scanner;

public class GettingStartet{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Hello World");
        String listener [] = run();
        System.out.println(listener[0]);
        String answer = in.nextLine();
        if(answer.equals("yes")){
            System.out.println(listener[2]);
        }else{
            System.out.println(listener[1]);
        }
        
    }

    public static String[] run(){
        String sentence [] = {"Kennst du dich mit meinen Programm schon aus", 
        "Nein noch nicht, dass sollten wir ändern",
        "okay champ",
        "hallo noch da",};
        return sentence;
    }
    
}