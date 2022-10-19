public class Board_CLL {
    public Link_Board first;
    public Link_Board last;

    public void Board_CLL() {
        first = null;
        last = null;
    }

    /*
    insertFirst inserts a link at the end of the linked list, I chose to do this instead of inserting it as the
    first link because when adding links in a particular order, this would be easier to visualize.
     */
    public void insert(String name, int price, boolean purchased, String owner, int rent, boolean isPurchasable, String special, int sellvalue, String occupiedBy, int location) {
        Link_Board link = new Link_Board(name, price, purchased, owner, rent, isPurchasable, special, sellvalue, occupiedBy, location);
        if (last == null) {
            first = link;
            last = link;
            link.next = last;
        } else {
            last.next = link.next;
            last.next = link;
            last = link;
        }
    }

    public Link_Board find(int location) {
        Link_Board current = first;
        while (current != last) {
            if (current.location == location) {
                return current;
            } else {
                current = current.next;
            }
        }
        return last;
    }
}
