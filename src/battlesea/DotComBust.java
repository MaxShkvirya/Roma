package battlesea;

import java.util.ArrayList;

public class DotComBust {
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;

    private void setUpGame() { //***
        DotCom one = new DotCom();
        one.setName(" Pets.com");
        DotCom two = new DotCom();
        two.setName(" eToys.com");
        DotCom three = new DotCom();
        three.setName(" Go2.com");
        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);

        System.out.println("Vasha cel,- potopit, three 'saita' .");
        System.out.println("Pets.com, eToy.com, Go2.com");
        System.out.println("Poputaytes, potopit, ix za minimal,noe koli4estvo xodov");

        for (DotCom dotComToTest : dotComsList) {
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToTest.setLocationCells(newLocation);
        }

    }

    private void startPlaying() {  // ***
        while (!dotComsList.isEmpty()) {
            String userGuess = helper.getUserInput(" Sdelayte xod ");
            checkUserGuess(userGuess);
        }
        finishGame();
    }

    private void checkUserGuess(String userGuess) { // ***
        numOfGuesses++;
        String result = "MIMO";
        for (DotCom dotComToTset : dotComsList) {
            result = dotComToTset.checkYourself(userGuess);
            if (result.equals("Popal")) {
                break;
            }
            if (result.equals("Potopil")) {
                dotComsList.remove(dotComToTset);
                break;
            }
        }
        System.out.println(result);
    }

    private void finishGame() { // ***
        System.out.println(" Vse 'saytu' uwli ko dnu!  Vawu akcii teper, ni4ego ne sloyat. ");
        if (numOfGuesses <= 18) {
            System.out.println(" Eto zanyalo u vas vsego " + numOfGuesses + "poputok. ");
        } else {
            System.out.println(" Eto zanyalo u vas dovol,no mnogo vremeni. " + numOfGuesses + " poputok ");
        }
    }

    public static void main(String[] args) {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
        
    }
}
