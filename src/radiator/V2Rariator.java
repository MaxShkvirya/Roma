package radiator;

import java.util.*;

class V2Rariator {
    V2Rariator(ArrayList list) {
        for (int x = 0; x < 5; x++) {
            list.add(new SimUnit("V2радиатор"));
            System.out.println("создали V2радиатор");
        }
    }
}
