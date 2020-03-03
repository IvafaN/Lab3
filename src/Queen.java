/**
 * Created by ifarfan
 */
public class Queen extends Piece {

    public Queen(int value, boolean isWhite) {
        setValue(value);
        setWhite(isWhite);
    }

    @Override
    public void move() {
        System.out.println("Like bishop and rook");
    }

    @Override
    public String toString() {
        return "King {value = " + getValue() + ", isWhite = " + isWhite() + "}";
    }
}
