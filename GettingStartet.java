import java.util.Scanner;

import Game.Charakter;
import tool.Eingabecontroler;
import tool.Sonderzeichen;
import Game.GUI;


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
        listener = worker.translateArray(listener);
        //Gibt Tutorial Einleitung aus
        System.out.println(listener[0]);
       
        String answer = check(in.nextLine(), "YN");
        

       //Abfrage ob Tutorial nötig oder nicht
        if(answer.equals("yes")){
            System.out.println(listener[2]);
        }else{
            System.out.println(listener[1]);
            GUI game = new GUI();
        }
        
        answer = check(in.nextLine(), "StarterQ");
        answer = answer.toLowerCase();

        //Todo: make charakter und zeige stats
        if(answer.equals("xx")){ 
            Charakter player = new Charakter();
            System.out.println(worker.translateString("\nDer Name deines Helden ist " + player.giveName() + ". Du enstammst aus einer adligen Familie aus Longkros. \nDu erfreust dich bester Gesundheit, somit steht dein Leben bei " + player.giveHealth() + " Lebenspunkten. \n\nDein Vergiftungsgrad steht jedoch leicht bei " + player.giveToxic() + " Vergiftungspunkten. Der Grund hierfür ist ein zu starker Alkohlkonsum im Pub Namens Tröte. Der Name verspricht was er sagt. Die besten Musikanten aus ganz Shigma kehren in diesem Ort ein. \n\nDeine Goldtaler anzahl im Geldbeutel, liegt durch deinen netten Nachbar, exakt bei 0 Goldthaler. Er war ein verflixt guter Kartenspieler. \n\n Schreibe 'Start' um mit dem Spiel zu starten"));
        }else{
            //starte Spiel
            GUI game = new GUI();
        }
    }

    public static String[] tutorial(){
        String sentence [] = {"Hallo und Herzlich Willkommen zu Fantasy dungon CMD.\n Benötigst du ein Tutorial? YES/NO", 
        "Viel Spaß mit dem Spiel!",
        "\n\nDas Spiel funktioniert sehr einfach, du musst dich durch das Dungon Darwin kämpfen und wichtige Entscheidungen treffen. \n Deine Entscheidung verändern das komplette Spiel, also überlege gut wie du entscheidest.\n Außerdem hast du verschiedene Werte: Leben, Ausdauer, Verrücktheit + Gold (damit kannst du Objekte im Spiel kaufen). Diese Stats kannst du jederzeit während du Spielst mit dem Befehl: 'S' aufrufen. \n Gebe XX ein um eine Einleitung zu bekommen und deine momentanen Stats zu sehen. Wenn du diesen Part überspringen willst und direkt mit dem Spiel anfangen willst gebe 'V' ein" ,
        "Hallo noch da",};
        return sentence;
    }

    public static String check(String controllAnswer, String WhatIsIt){
        //Fragt nach Ausgabe und intialisiert den Kontrolör für Yes/No
        Eingabecontroler controler = new Eingabecontroler();
        
        //Kontroliert ob Yes oder No 
        //  else zwingt zur nochmal Eingabe
        
      return  controllAnswer = controler.IsYesNO(controllAnswer, WhatIsIt);

    }
    
}