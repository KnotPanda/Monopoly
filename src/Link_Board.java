public class Link_Board {
    public String name;
    public int price;
    public boolean purchased;
    public String owner;
    public int rent;
    public boolean isPurchasable;
    public String special;
    public int sellvalue;
    public String occupiedBy;

    public Link_Board(String name, int price, boolean purchased, String owner, int rent, boolean isPurchasable, String special, int sellvalue, String occupiedBy){
            this.name = name;
            this.price = price;
            this.purchased = purchased;
            this.owner = owner;
            this.rent = rent;
            this.isPurchasable = isPurchasable;
            this.special = special;
            this.sellvalue = sellvalue;
            this.occupiedBy = occupiedBy;
    }
}
