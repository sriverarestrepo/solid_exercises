package lsp.incorrect;

import java.util.ArrayList;
import java.util.List;

public class MainFail {

    public static void main(String[] args) {
        testCourts();
    }

    public static void testCourts(){
        List<CourtFail> courtFailList = new ArrayList<CourtFail>();

        courtFailList.add(new BelloCourtFail());
        courtFailList.add(new EAGCourtFail());
        courtFailList.add(new JuanesParkCourtFail());

        for (CourtFail courtFail : courtFailList) {

            courtFail.cutGrass();

        }
    }
}
