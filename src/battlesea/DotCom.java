package battlesea;

import java.util.*;

public class DotCom {
    private ArrayList<String> locationCells;
    private String name;

    public void setLocationCells(ArrayList<String> loc) { // Ячейки  ***
        locationCells = loc;
    }

    public void setName(String n) {  // ***
        name = n;
    }

    public String checkYourself(String userInput) { // ***
        String result = "MIMO";
        int index = locationCells.indexOf(userInput);
        if (index >= 0) {
            locationCells.remove(index);

            if (locationCells.isEmpty()) {
                result = "Potopil";
                System.out.println("Oy! Vu potopili" + name + " : ( ");
            } else {
                result = "Popal";
            }
        }
        return result;
    }
}

