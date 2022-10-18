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
    public void insert(Link_Board link) {
        if (first == null) {
            first = link;
        } else {
            last = link;
            last.next = first;
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
