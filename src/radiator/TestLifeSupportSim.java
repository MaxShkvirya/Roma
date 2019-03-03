package radiator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestLifeSupportSim {
    public static void main(String[] args) {
        ArrayList aList = new ArrayList();
        V2Rariator v2 = new V2Rariator(aList);
        V3Radiator v3 = new V3Radiator(aList);
        for (int z = 0; z < 20; z++) {
            RetentionBot ret = new RetentionBot(aList); // удержание
            SimUnit simUnit = new SimUnit("Тепловая машина");
            simUnit.powerUse();

        }

    }

}
