public class BoardPiece {
    private String name;
    private int price;
    private boolean purchased;
    private PlayerPiece owner;
    private int rent;
    private boolean isPurchasable;
    private String special;
    private int sellValue;
    private String occupiedBy;
    private int location;
    private boolean isMortgaged;

    public BoardPiece(String name, int price, boolean purchased, PlayerPiece owner, int rent, boolean isPurchasable, String special, int sellValue, String occupiedBy, int location, boolean isMortgaged) {
        this.name = name;
        this.price = price;
        this.purchased = purchased;
        this.owner = owner;
        this.rent = rent;
        this.isPurchasable = isPurchasable;
        this.special = special;
        this.sellValue = sellValue;
        this.occupiedBy = occupiedBy;
        this.location = location;
        this.isMortgaged = isMortgaged;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isPurchased() {
        return purchased;
    }

    public void setPurchased(boolean purchased) {
        this.purchased = purchased;
    }

    public PlayerPiece getOwner() {
        return owner;
    }

    public void setOwner(PlayerPiece owner) {
        this.owner = owner;
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    public boolean isPurchasable() {
        return isPurchasable;
    }

    public void setPurchasable(boolean purchasable) {
        isPurchasable = purchasable;
    }

    public String getSpecial() {
        return special;
    }

    public void setSpecial(String special) {
        this.special = special;
    }

    public int getSellValue() {
        return sellValue;
    }

    public void setSellValue(int sellValue) {
        this.sellValue = sellValue;
    }

    public String getOccupiedBy() {
        return occupiedBy;
    }

    public void setOccupiedBy(String occupiedBy) {
        this.occupiedBy = occupiedBy;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    public boolean isMortgaged() {
        return isMortgaged;
    }

    public void setMortgaged(boolean mortgaged) {
        isMortgaged = mortgaged;
    }
}
