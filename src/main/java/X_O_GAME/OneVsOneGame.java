package X_O_GAME;

import X_O_GAME.Board;
import X_O_GAME.Game;
import X_O_GAME.Player;
import X_O_GAME.ThreeXThreeBoard;

import java.util.List;

public class OneVsOneGame extends Game {

    @Override
    void setBoard(Board board) {
        super.board = board;
        moveCommand = new MoveCommand(board);
    }

    @Override
    void setPlayers(List<Player> players) {
        for(Player player:players){
            super.players.add(player);
        }
    }
}
