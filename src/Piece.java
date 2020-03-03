/**
 * Created by ifarfan
 */
public abstract class Piece {
    /*
    Create a parent abstract class called Piece.                                                                                                    // DONE!!!
    Then create child classes called Pawn, Knight, Bishop, Rook, Queen, and King.                                                                   // DONE!!!
    Here, we are creating an abstract class for Piece since we are not going to instantiate Piece object and
    child classes have their own unique moves (which can be overridden later).                                                                      // DONE!!!
    The Piece class has an instance variable(field) for value which is a type of int, indicating how ‘important’ it is.                             // DONE!!!
    It also has an accessor(getter) and mutator(setter) method for it.                                                                              // DONE!!!
    The value for each object is:                                                                                                                   // DONE!!!

* Pawn 1
* Knight 2
* Bishop 3
* Rook 5
* Queen 9
* King 1000

    The Piece class also has an instance variable for isWhite which is a type of boolean, indicating whether the piece is White or Black.           // DONE!!!
    Piece class has an abstract method called move(), it also overrides the toString() method which returns the string representation of each Piece.//
    Each of the six Piece subclasses (such as Pawn, Knight, Bishop, Rook, Queen, and King) further overrides toString() method.
     */

    private int value = 0;
    private boolean isWhite = false;

    public boolean isWhite() {
        return isWhite;
    }

    public void setWhite(boolean white) {
        isWhite = white;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public abstract void move();

    public boolean equals(Piece piece) {
        if (this.value == piece.value && this.isWhite == piece.isWhite) {
            return true;
        }
        return false;
    }

    public abstract String toString();
}
