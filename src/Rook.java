/**
 * Created by ifarfan
 */
public class Rook extends Piece {

    public Rook(int value, boolean isWhite) {
        setValue(value);
        setWhite(isWhite);
    }

    @Override
    public void move() {
        System.out.println("Horizontally or vertically");
    }

    @Override
    public String toString() {
        return "King {value = " + getValue() + ", isWhite = " + isWhite() + "}";
    }
}
