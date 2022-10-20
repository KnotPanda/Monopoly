import java.util.ArrayList;
public class PlayerPiece {
    private String name;
    private int balance;
    private boolean isJailed;
    private int railroadsOwned;
    private ArrayList<BoardPiece> properties;
    private char piece;

    public PlayerPiece(String name, int balance, boolean isJailed, int railroadsOwned, ArrayList<BoardPiece> properties, char piece){
        this.name = name;
        this.balance = balance;
        this.isJailed = isJailed;
        this.railroadsOwned = railroadsOwned;
        this.properties = properties;
        this.piece = piece;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public boolean isJailed() {
        return isJailed;
    }

    public void setJailed(boolean jailed) {
        isJailed = jailed;
    }

    public int getRailroadsOwned() {
        return railroadsOwned;
    }

    public void setRailroadsOwned(int railroadsOwned) {
        this.railroadsOwned = railroadsOwned;
    }

    public ArrayList<BoardPiece> getProperties() {
        return properties;
    }

    public void setProperties(ArrayList<BoardPiece> properties) {
        this.properties = properties;
    }

    public char getPiece() {
        return piece;
    }

    public void setPiece(char piece) {
        this.piece = piece;
    }
}

