package srp;

import srp.correct.Player;
import srp.incorrect.PlayerFail;

public class MainPlayer {

    public static void main(String[] args) throws InterruptedException {

        Player py       = new Player();
        PlayerFail pyf  = new PlayerFail();

        pyf.savePlayer(createPlayerFail());
    }


    private static PlayerFail createPlayerFail(){
        PlayerFail pyf = new PlayerFail();
        pyf.setId(1);
        pyf.setName("Pepito de prueba");
        pyf.setTotalLose(10);
        pyf.setTotalWin(18);

        return pyf;
    }

}
