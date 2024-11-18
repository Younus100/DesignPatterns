import java.util.List;

public class SnakeLadder {

}

class Player{
    String name;
    int position;

    void setPosition(int i){
        if(i<1 || i>100) {  throw new IllegalArgumentException("Position must be between 1 and 100."); }
        this.position = i;
    }
}

abstract  class Cell{
    abstract void applyMove(Player player);
}

class NormalCell extends Cell{
    int position;
    NormalCell(int position){
        this.position = position;
    }
    @Override
    void applyMove(Player player) {
        player.setPosition(position);
    }
}

class SnakeCell extends Cell{
    int downposition;
    SnakeCell(int position){
        this.downposition = position;
    }
    @Override
    void applyMove(Player player) {
        player.setPosition(downposition);
    }
}

class LadderCell extends Cell{
    int uppodition;
    LadderCell(int position){
        this.uppodition = position;
    }
    @Override
    void applyMove(Player player) {
        player.setPosition(uppodition);
    }
}

class Cube{
    public int rollDice() {
        return (int)(Math.random() * 6) + 1;
    }
}

class Move{
    public Player player;
    public int position;
}

abstract class Command{
    List<Move> moves;
    abstract void takeMove(Player player,Cell cell);
    abstract void undoMove();

}

class MoveCommand extends Command{
    @Override
    void takeMove(Player player, Cell cell) {
        cell.applyMove(player);
        Move move = new Move();
        move.player  = player;
        move.position = player.position;
        moves.add(move);
    }

    @Override
    void undoMove() {
        if(moves.size()==0){ return; }
        Move move = moves.removeLast();
        move.player.position = move.position;
    }
}

abstract class MoveManager{
    List<Player> players;

    void setPlayers(List<Player> players){
        for(Player player:players){
            players.add(player);
        }
    }

    void startGame(){}

}

