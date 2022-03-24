import java.util.ArrayList;
import java.util.Scanner;

import Fruit.Fruit;
import Fruit.FruitTag;

/**
 * a simple WaWi App to save Fruitsnames and amounts at a List
 * 
 * @throws out of Bounce Exceptions
 * 
 */

public class WaWi {
    public static ArrayList<Fruit> WaWi = new ArrayList<Fruit>();
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            run();
        } catch (IndexOutOfBoundsException e) {
            System.err.println("This fruit dont exsist: ArrayList Index Failer");
        } catch (Exception e) {
            System.err.println("dunno");
        } finally {
            in.close();
        }
    }

    public static void run() {
        do {
            inputFruit();
        } while (!finished(input()));

        System.out.println("\n");

        for (int i = 0; i < WaWi.size(); i++) {
            System.out.println(WaWi.get(i));
        }

    }

    public static String input() {
        String answer = "";
        System.out.println("Another Fruit? Yes/No" + "\n");
        answer = in.next();

        while (!(answer.equals("Yes") || answer.equals("No"))) {
            System.out.println("It has to be exact Yes or No. Try again:");
            answer = in.next();
        }

        return answer;
    }

    public static boolean finished(String answer) {
        if (answer.equals("Yes")) {
            return false;
        } else {
            return true;
        }
    }

    public static void inputFruit() {
        System.out.println("Which Fruit:");
        String sortOfFruit = in.next();
        sortOfFruit.trim();
        System.out.println("Amount of the Fruit: ");

        Integer amountOfTheFruit = -1;

        while (amountOfTheFruit == -1) {
            String amountOfTheFruitString = in.next();
            amountOfTheFruitString.trim();
            amountOfTheFruit = convertString(amountOfTheFruitString);
            if (amountOfTheFruit == -999) {
                amountOfTheFruit = -1;
            } else if (amountOfTheFruit < 0) {
                System.out.println("You cant have negativ amounts, try again:");
                amountOfTheFruit = -1;
            }
        }

        Fruit newObjektFruit = new Fruit(sortOfFruit, amountOfTheFruit);
        FruitTag newObjektFruitWithTag = new FruitTag(sortOfFruit, amountOfTheFruit);
        WaWi.add(newObjektFruit);
        WaWi.add(newObjektFruitWithTag);
    }

    public static Integer convertString(String amount) {
        try {
            Integer sucAmount = Integer.parseInt(amount);
            return sucAmount;
        } catch (Exception e) {
            System.out.println("It has to be a number (2, 5)");
            return -999;
        }

    }
}