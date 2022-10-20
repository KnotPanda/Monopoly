public class CLL<T> {
    public Link<T> first;
    public Link<T> last;

    public void Board_CLL() {
        first = null;
        last = null;
    }

    /*
    insertFirst inserts a link at the end of the linked list, I chose to do this instead of inserting it as the
    first link because when adding links in a particular order, this would be easier to visualize.
     */
    public void insert(T data) {
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

    public Link find(T data) {
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

