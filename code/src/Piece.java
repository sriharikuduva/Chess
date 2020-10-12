public abstract class Piece {
    private boolean isWhite = false, killed= false;

    public Piece(boolean isWhite) {
        this.isWhite = isWhite;
    }

    public boolean isWhite() {
        return isWhite;
    }
    public void setWhite(boolean white) {
        isWhite = white;
    }

    public boolean isKilled() {
        return killed;
    }
    public void setKilled(boolean killed) {
        this.killed = killed;
    }

    public abstract boolean canMove(Board board, Box start, Box end);

}
