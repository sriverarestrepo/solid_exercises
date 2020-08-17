package srp.incorrect;

import java.util.concurrent.TimeUnit;

public class PlayerFail {

    int id;

    String name;

    int totalWin;

    int totalLose;

    String date;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalWin() {
        return totalWin;
    }

    public void setTotalWin(int totalWin) {
        this.totalWin = totalWin;
    }

    public int getTotalLose() {
        return totalLose;
    }

    public void setTotalLose(int totalLose) {
        this.totalLose = totalLose;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    // Capa de logica de negocio
    public double totalWinPercentage(PlayerFail player) {
        return (double) (player.getTotalWin() / (player.getTotalWin() + player.getTotalLose()));
    }

    public double totalLosePercentage(PlayerFail player) {
        return (double) (player.getTotalLose() / (player.getTotalWin() + player.getTotalLose()));
    }


    // Capa de acceso a datos
    public void savePlayer(PlayerFail player) throws InterruptedException {
        System.out.println("Saving Player: " + player.getName());
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Player saved successfully");
    }

    public void deletePlayer(PlayerFail player) throws InterruptedException {
        System.out.println("Deleting Player: " + player.getName());
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Player deleted successfully");
    }

    public PlayerFail getPlayer(int id) throws InterruptedException {
        System.out.println("Getting Player: " + id);
        TimeUnit.SECONDS.sleep(2);

        PlayerFail py = new PlayerFail();
        py.setId(id);
        py.setName("Pepito prueba");
        py.setTotalLose(10);
        py.setTotalWin(18);

        System.out.println("Player found successfully");

        return py;
    }

    // Capa de presentacion

    public void showPlayerHD(PlayerFail player){
        System.out.println("Show Player in HD " +player.getName());
    }

    public void showPlayerStandard(PlayerFail player){
        System.out.println("Show Player in Standard " +player.getName());
    }

}
