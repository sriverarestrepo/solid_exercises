package lsp.correct;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        testGrassCourts();

        testClayCourts();

        testHardCourts();
    }


    public static void testGrassCourts(){
        List<GrassCourt> courtList = new ArrayList<GrassCourt>();

        courtList.add(new BelloCourt());

        for (GrassCourt courtFail : courtList) {
            courtFail.cutGrass();
        }
    }

    public static void testClayCourts(){
        List<ClayCourt> courtList = new ArrayList<ClayCourt>();

        courtList.add(new JuanesParkCourt());

        for (ClayCourt courtFail : courtList) {
            courtFail.changeClay();
        }
    }

    public static void testHardCourts(){
        List<HardCourt> courtList = new ArrayList<HardCourt>();

        courtList.add(new EAGCourt());

        for (HardCourt courtFail : courtList) {
            courtFail.cleanCourt();
        }
    }
}
