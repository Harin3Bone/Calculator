package calculator_controller;

import calculator_view.Display;

public class Service {
    public static void choiceLogic(String choice) {
        int answer = 0;
        switch (choice) {
            case "1":
                Display.plusDisplay();
                break;
            case "2":
                Display.minusDisplay();
                break;
            default:
                System.exit(0);
        }
    }

    public static int plusLogic(int x, int y) {
        int answer = x + y;
        return answer;
    }
    public static int minusLogic(int x,int y) {
        int answer= x - y;
        return answer;
    }
}
