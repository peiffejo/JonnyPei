import java.util.Scanner;

public class GettingStartet{

    public static void main(String[] args) {
        //Initalisierung der Übersetzer Klasse
        Sonderzeichen worker = new Sonderzeichen();
        //Eingabe Bib initialisiern 
        Scanner in = new Scanner(System.in);
        //Druck den Titel
        System.out.println("The Game Intuitiva");
        //listener ist der Ausgeber hier initalisiert mit dem tutorial
        String listener [] = tutorial();
        //Alle Sonderzeichen werden ausgetauscht
        listener = worker.translate(listener);
        //Gibt Tutorial Einleitung aus
        System.out.println(listener[0]);
       
        String answer = check(in.nextLine());

       //Abfrage ob Tutorial nötig oder nicht
        if(answer.equals("yes")){
            System.out.println(listener[2]);
        }else{
            System.out.println(listener[1]);
        }
        
        answer = check(in.nextLine());
        

        //Todo: make charakter und zeige stats
        if(answer.equals("XX")){ 

        }else{
            //starte Spiel
        }
    }

    public static String[] tutorial(){
        String sentence [] = {"Hallo und Herzlich Willkommen zu Fantasy dungon CMD. Benötigst du ein Tutorial? YES/NO", 
        "Viel Spaß mit dem Spiel!",
        "Das Spiel funktioniert sehr einfach, du musst dich durch das Dungon Darwin kämpfen und wichtige Entscheidungen treffen. \n Deine Entscheidung verändern das komplette Spiel, also überlege gut wie du entscheidest.\n Außerdem hast du verschiedene Werte: Leben, Ausdauer, Verrücktheit + Gold (damit kannst du Objekte im Spiel kaufen). Diese Stats kannst du jederzeit mit dem Befehl: XX aufrufen. \n Probiers doch mal aus oder starte das Spiel mit: Start" ,
        "hallo noch da",};
        return sentence;
    }

    public static String check(String controllAnswer){
        //Fragt nach Ausgabe und intialisiert den Kontrolör für Yes/No
        Eingabecontroler controler = new Eingabecontroler();
        
        //Kontroliert ob Yes oder No 
        //  else zwingt zur nochmal Eingabe
      return  controllAnswer = controler.IsYesNO(controllAnswer);

    }
    
}