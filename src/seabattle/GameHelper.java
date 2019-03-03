package seabattle;

import java.io.*;
import java.sql.SQLOutput;

public class GameHelper {
    public String getUserInput(String prompt) {
        String inputLine = null;
        System.out.print(prompt + " ");
        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputLine = is.readLine();
        } catch (IOException e) {
            System.out.println("IOException:" + e);
        }
        return inputLine;
    }

    public static void main(String[] args) {
        int numOfHelper = 0;
        GameHelper helper = new GameHelper();
        SimpleDotCom theDotCom = new SimpleDotCom();
        int randomNum = (int) (Math.random() * 5);
        int[] locations = {randomNum, randomNum + 1, randomNum + 2};
        theDotCom.setLocationCells(locations);
        boolean isAlive = true;

        while (isAlive == true) {
            String guess = helper.getUserInput("Insert the number");
            String result = theDotCom.checkYourself(guess);
            numOfHelper++;
            if (result.equals("sunk(потопил)")) {
                isAlive = false;
                System.out.println("it took you " + numOfHelper + " tries "); // took - взял
            }

        }

    }
}
