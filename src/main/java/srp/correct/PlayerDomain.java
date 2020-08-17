package srp.correct;

public class PlayerDomain {

    double totalWinPercentage(Player player) {
        return (double) (player.getTotalWin() / (player.getTotalWin() + player.getTotalLose()));
    }

    double totalLosePercentage(Player player) {
        return (double) (player.getTotalLose() / (player.getTotalWin() + player.getTotalLose()));
    }
}
