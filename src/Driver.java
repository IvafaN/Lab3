import java.util.ArrayList;

/**
 * Created by ifarfan
 */
public class Driver {

    /*
    Create an ArrayList<Piece> to include all types of pieces.                  // DONE!!!
    Using for-each loop, call move() method on each Piece to print the moves.   // DONE!!!

    Create the following Pawns:
        p1={value=1, isWhite=true, promoted=true, newPiece=Queen}
        p2={value=1, isWhite=true, promoted=false, newPiece=null}
        p3={value=1, isWhite=false, promoted=false, newPiece=null}
        p4={value=1, isWhite=false, promoted=true, newPiece=Queen}
        p5={value=1, isWhite=true, promoted=true, newPiece=Knight}

    Use equals() method to compare the following:
        p1.equals(p2) should return false
        p1.equals(p4) should return false
        p1.equals(p5) should return false
        p2.equals(p3) should return false
        p4.equals(p5) should return false

     */

    public static void main(String[] args) {

        ArrayList<Piece> piecesList = new ArrayList<>();
        piecesList.add(new King(1_000,true));
        piecesList.add(new Rook(5, true));
        piecesList.add(new Queen(9, true));
        piecesList.add(new Knight(2, true));
        piecesList.add(new Bishop(3, true));
        piecesList.add(new Pawn(1,true));

        for (Piece piece : piecesList ) {
            piece.move();
        }

        System.out.println("===========================================================");

        Pawn p1 = new Pawn(1, true, true, new Queen(9, true));
        Pawn p2 = new Pawn(1, true, false, null);
        Pawn p3 = new Pawn(1, false, false, null);
        Pawn p4 = new Pawn(1, false, true, new Queen(9, true));
        Pawn p5 = new Pawn(1, true, true, new Knight(2, true));

        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p4));
        System.out.println(p1.equals(p5));
        System.out.println(p2.equals(p3));
        System.out.println(p4.equals(p5));
    }
}
