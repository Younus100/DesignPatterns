package X_O_GAME;

public class MoveCommand extends Command{

    MoveCommand(Board board){
        super.board = board;
    }

    @Override
    void move(Move move) {
        moves.add(move);
        board.moves[move.x][move.y] = move;
    }

    @Override
    void undo() {
        if(moves.size()==0){ return; }
        Move m = moves.getLast();
        moves.removeLast();
        board.moves[m.x][m.y] = null;
    }
}
