public class Board_CLL {
    public Link first;
    public Link last;

    public void Board_CLL() {
        first = null;
        last = null;
    }

    /*
    insertFirst inserts a link at the end of the linked list, I chose to do this instead of inserting it as the
    first link because when adding links in a particular order, this would be easier to visualize.
     */
    public void insert(String name, int price, boolean purchased, String owner, int rent, boolean isPurchasable, String special, int sellvalue, String occupiedBy, int location) {
        BoardPiece data = new BoardPiece(name, price, purchased, owner, rent, isPurchasable, special, sellvalue, occupiedBy, location);
        Link link = new Link(data);
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

    public Link find(BoardPiece data) {
        Link current = first;
        while (current != last) {
            if (current.data == data) {
                return current;
            } else {
                current = current.next;
            }
        }
        return last;
    }
}
