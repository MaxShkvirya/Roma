package seabattle;

public class SimpleDotCom {  // simple - просто
    int[] locationCells;   //Cells - ячейки
    int numOfHits = 0;  // Hits -попадания

    public void setLocationCells(int[] locs) {  // Cells - ячейки
        locationCells = locs;
    }

    public String checkYourself(String stringGuess) { // проверить себя
        int guess = Integer.parseInt(stringGuess);  // guess - угадать
        String result = "Мимо";
        for (int cell : locationCells) {
            if (guess == cell) {
                result = "Попал";
                numOfHits++;
                break;
            }
        }
        if (numOfHits == locationCells.length){
            result = "sunk(потопил)";
        }
        System.out.println(result);
        return result;
    }


}
