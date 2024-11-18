package X_O_GAME;

import java.util.ArrayList;
import java.util.List;

public class Client {


    public static void main(String arg[]){
       Game game = new OneVsOneGame();
       game.setBoard(new ThreeXThreeBoard());
       game.setPlayers(List.of(new Player(),new Player()));
    }
}
