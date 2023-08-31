package Entities;

import java.util.ArrayList;
import java.util.Set;

public class Game {
    private ArrayList<Player> players;
    private Revolver revolver;

    public Game() {
    }

    public void fillGame(ArrayList<Player> players, Revolver revolver) {
        this.players = players;
        this.revolver = revolver;
    }

    public void round() {
        boolean wet = false;
        int position = 0;
        Player currentPlayer = null;

        do {
            currentPlayer = players.get(position);
            System.out.println(revolver.getCurrentPosition() + "   " + revolver.getWaterPostion() + " \n" + currentPlayer.toString());

            wet = currentPlayer.shot(revolver);
            position = getNextPlayer(position);
        }while (!wet);

        System.out.println("Game over: " + currentPlayer + " lost.");
    }

    public int getNextPlayer(int position) {
        if (position == 6) {
            position = 0;
        }else {
            position++;
        }

        return position;
    }
}
