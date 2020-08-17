package ocp.correct;

import ocp.incorrect.DisscountFail;

public class DisscountManager {

    double apply(double price, Disscount disscount){
        return disscount.apply(price);
    }

}
