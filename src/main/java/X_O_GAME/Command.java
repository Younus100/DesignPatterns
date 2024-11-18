package X_O_GAME;

import java.util.ArrayList;
import java.util.List;

public abstract class Command {
    List<Move> moves = new ArrayList<>();

    Board board;

    abstract void move(Move move);

    abstract void undo();


}
