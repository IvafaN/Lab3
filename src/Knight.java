/**
 * Created by ifarfan
 */
public class Knight extends Piece {

    public Knight(int value, boolean isWhite) {
        setValue(value);
        setWhite(isWhite);
    }

    @Override
    public void move() {
        System.out.println("Like an L");
    }

    @Override
    public String toString() {
        return "King {value = " + getValue() + ", isWhite = " + isWhite() + "}";
    }

}
