package srp.correct;

import java.util.concurrent.TimeUnit;

public class PlayerRepository {

    void savePlayer(Player player) throws InterruptedException {
        System.out.println("Saving Player: " + player.getName());
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Player saved successfully");
    }

    void deletePlayer(Player player) throws InterruptedException {
        System.out.println("Deleting Player: " + player.getName());
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Player deleted successfully");
    }

    Player getPlayer(int id) throws InterruptedException {
        System.out.println("Getting Player: " + id);
        TimeUnit.SECONDS.sleep(2);

        Player py = new Player();
        py.setId(id);
        py.setName("Pepito prueba");
        py.setTotalLose(10);
        py.setTotalWin(18);

        System.out.println("Player found successfully");

        return py;
    }
}
