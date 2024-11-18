package X_O_GAME;

import java.util.ArrayList;
import java.util.List;

public class ThreeXThreeBoard extends Board {
    public ThreeXThreeBoard(){
        super.setM(3);
        super.setN(3);
        super.moves = new Move[3][3];

    }

}
