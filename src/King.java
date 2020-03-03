/**
 * Created by ifarfan
 */
public class King extends Piece {

    public King(int value, boolean isWhite) {
        setValue(value);
        setWhite(isWhite);
    }

    @Override
    public void move() {
        System.out.println("One square");
    }

    @Override
    public String toString() {
        return "King {value = " + getValue() + ", isWhite = " + isWhite() + "}";
    }
}
