package gr.cf.exercises;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class ExceptionExercise {

    public static void main(String[] args) {
        Scanner in = new Scanner((System.in));
        int inputNum = 0;

        do {
            printMenu();
            inputNum = getChoice(in);
            try{
                printChoice(inputNum);
            } catch (IllegalArgumentException e){
                System.out.println("Please try again.");
            }
        } while (inputNum != 5);
    }

    public static void printMenu(){
        System.out.println("Choose between:");
        System.out.println("1: Option 1");
        System.out.println("2: Option 2");
        System.out.println("3: Option 3");
        System.out.println("4: Option 4");
        System.out.println("5: to exit");
    }

    public static int getChoice(Scanner in){
        int inputNum;
        while (true){
            if (in.hasNextInt()){
                inputNum = in.nextInt();
                break;
            } else {
                System.out.println("Please insert an integer number.");
                in.next();
            }
        }
        return inputNum;
    }

    public static void printChoice(int choice){
        if (choice >= 1 && choice <= 4){
            System.out.println("Your choice is: " + choice);
        } else if (choice == 5){
            System.out.println("Exit.");
        } else {
            throw new IllegalArgumentException("Please insert a number between 1 and 5.");
        }
    }

}
