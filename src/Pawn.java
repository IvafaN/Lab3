/**
 * Created by ifarfan
 */
public class Pawn extends Piece {

    private boolean promoted;
    private Piece newPiece;

    public Pawn(int value, boolean isWhite) {
        setValue(value);
        setWhite(isWhite);
    }
    public Pawn(int value, boolean isWhite, boolean promoted, Piece newPiece) {
        setValue(value);
        setWhite(isWhite);
        setNewPiece(newPiece);
        setPromoted(promoted);
    }

    public void setPromoted(boolean promoted) {
        this.promoted = promoted;
    }

    public void setNewPiece(Piece newPiece) {
        this.newPiece = newPiece;
    }

    @Override
    public void move() {
        System.out.println("Forward 1");
    }

    @Override
    public String toString() {
        return "Pawn {value = " + getValue() + ", isWhite = " + isWhite() + "}";
    }
}
