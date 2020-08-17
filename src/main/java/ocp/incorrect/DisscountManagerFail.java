package ocp.incorrect;

public class DisscountManagerFail {

    double apply(double price, DisscountFail disscount){
        return disscount.apply(price);
    }

    double apply(double price, GoldDisscountFail disscount){
        return disscount.apply(price);
    }

    double apply(double price, DayWithoutIVADisscountFail disscount){
        return disscount.apply(price);
    }

    double apply(double price, ChristmasDisscountFail disscount){
        return disscount.apply(price);
    }
}
