public class Piece{
    Position position;
    boolean isValidMove(Position newPosition){
        if(position.row>0 && position.column>0
                && position.row<8 && position.column<8){
            return true;
        }
        else{
            return false;
        }
    }
}
