package ocp.correct;

public class ChristmasDisscount implements Disscount {

    public double apply(double price){
        return price * 0.15;
    }

}
