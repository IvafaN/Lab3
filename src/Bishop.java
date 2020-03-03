/**
 * Created by ifarfan
 */
public class Bishop extends Piece {

    public Bishop(int value, boolean isWhite) {
        setValue(value);
        setWhite(isWhite);
    }

    @Override
    public void move() {
        System.out.println("Diagonally");
    }

    @Override
    public String toString() {
        return "King {value = " + getValue() + ", isWhite = " + isWhite() + "}";
    }
}
