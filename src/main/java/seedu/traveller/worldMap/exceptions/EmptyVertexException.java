package seedu.traveller.worldMap.exceptions;


public class EmptyVertexException extends WorldMapException {
    public EmptyVertexException() {
        message = "\tEither of these nodes doesn't exist!";
    }
}