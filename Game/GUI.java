package Game;
import java.util.Scanner;
import tool.Eingabecontroler;
import java.awt.*;  
import javax.swing.*;  
import tool.Sonderzeichen;

public class GUI{
    //initialisiert Übersetzer
    Sonderzeichen worker = new Sonderzeichen();
    //Willkommenstext mit Sonderzeichenregler
    String textbody = worker.translateString("<font size = 5> Du wachst auf, dein Kopf fühlt sich wie ein zerkauter Gaugummi ausgelutsch und nicht mehr zu gebrauchen.</font> <br> Du hörst Klopfen");
    public GUI(){  
        //neuer Frame + panel
        JFrame f= new JFrame("Panel Example");    
        JPanel panel=new JPanel();  

        //ToDo: Fix Layout J.. reagiern nicht auf Layout
        panel.setBounds(40,80,300,300);    
        panel.setBackground(Color.blue);  

        JLabel text = new JLabel("<html><body>" + textbody + "</body></html>");
        text.setBounds(0, 0, 150, 150);

        JButton b1=new JButton("Yes");     
        b1.setBounds(50,50,80,30);    
        b1.setBackground(Color.yellow);   

        JButton b2=new JButton("no");   
        b2.setBounds(100,50,80,30);    
        b2.setBackground(Color.green);   

        panel.add(text); panel.add(b1); panel.add(b2); 
        f.add(b1,BorderLayout.SOUTH);

        f.add(panel);  
                f.setSize(400,400);    
                f.setLayout(null);    
                f.setVisible(true);    
        }  
    public static void main(String[] args) {
    Eingabecontroler controler = new Eingabecontroler();
    Scanner in = new Scanner(System.in);
    String answer = controler.IsYesNO(in.nextLine(), "YN");
    new GUI();
    

}
}
