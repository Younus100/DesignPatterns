package X_O_GAME;

import java.util.List;

public  abstract class Game{
    Board  board;
    List<Player> players;

    MoveCommand moveCommand;

    abstract void setBoard(Board board);
    abstract void setPlayers(List<Player> players);
}
