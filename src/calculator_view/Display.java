package calculator_view;

import calculator_controller.Service;
import calculator_repository.Repository;

import java.util.Scanner;

public class Display {
    public static void mainDisplay() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your choice");
        System.out.println("1 : +\n2 : -\nDefault : Exit");
        String answer = scanner.nextLine();
        Service.choiceLogic(answer);
    }

    public static void plusDisplay() {
        int[] numberArray = inputDisplay();
        showDisplay(Service.plusLogic(numberArray[0],numberArray[1]));
    }

    public static void minusDisplay() {
        int[] numberArray = inputDisplay();
        showDisplay(Service.minusLogic(numberArray[0],numberArray[1]));
    }

    public static void showDisplay(int answer) {
        Repository.saveRepository();
        System.out.println("Your answer is : " + answer);
    }

    public static int[] inputDisplay(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number : ");
        int numberOne = scanner.nextInt();
        System.out.println("Second number : ");
        int numberTwo = scanner.nextInt();
        int[] numberArray = {numberOne,numberTwo};
        return numberArray;
    }
}

