import java.util.ArrayList;
public class PlayerPiece {
    private String name;
    private int balance;
    private boolean isJailed;
    private int railroadsOwned;
    private ArrayList<BoardPiece> properties;
    private String piece;
    private String status;
    private int location;
    private int GOOJF;
    private int utilitiesOwned;
    private int jailCount;
    private int debt;
    private String color;

    public PlayerPiece(String name, int balance, boolean isJailed, int railroadsOwned, ArrayList<BoardPiece> properties, String piece, String status, int location, int GOOJF, int utilitiesOwned, int jailCount, int debt, String color){
        this.name = name;
        this.balance = balance;
        this.isJailed = isJailed;
        this.railroadsOwned = railroadsOwned;
        this.properties = properties;
        this.piece = piece;
        this.status = status;
        this.location = location;
        this.GOOJF = GOOJF;
        this.utilitiesOwned = utilitiesOwned;
        this.jailCount = jailCount;
        this.debt = debt;
        this.color = color;
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

    public String getPiece() {
        return piece;
    }

    public void setPiece(String piece) {
        this.piece = piece;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    public int getGOOJF() {
        return GOOJF;
    }

    public void setGOOJF(int GOOJF) {
        this.GOOJF = GOOJF;
    }

    public int getUtilitiesOwned() {
        return utilitiesOwned;
    }

    public void setUtilitiesOwned(int utilitiesOwned) {
        this.utilitiesOwned = utilitiesOwned;
    }

    public int getJailCount() {
        return jailCount;
    }

    public void setJailCount(int jailCount) {
        this.jailCount = jailCount;
    }

    public int getDebt() {
        return debt;
    }

    public void setDebt(int debt) {
        this.debt = debt;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

