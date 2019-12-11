package rpb;

import java.util.Arrays;

public class RPSEquilibrium {
    public static void main(String[] args) {
        RPSPlayer rpsPlayer_a = new RPSPlayer();
        RPSPlayer rpsPlayer_b = new RPSPlayer();
        int iteration = 100000;
        RPSPlayer[] rpsPlayers = new RPSPlayer[2];
        rpsPlayers[0] = rpsPlayer_a;
        rpsPlayers[1] = rpsPlayer_b;
        for(int i = 0; i < iteration; i++){
            int currentPlayerID = i % 2;
            RPSPlayer currentPlayer = rpsPlayers[currentPlayerID];
            RPSPlayer otherPlayer = rpsPlayers[1-currentPlayerID];
            int currentPlayerAction = currentPlayer.getCurrentAction();
            otherPlayer.move(currentPlayerAction);
        }
        System.out.println(Arrays.toString(rpsPlayers[0].getAverageStrategy()));
        System.out.println(Arrays.toString(rpsPlayers[1].getAverageStrategy()));
    }
}
