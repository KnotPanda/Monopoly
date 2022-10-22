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

    public Link<T> findLink(T data) {
        Link<T> current = first;
        while (current != last) {
            if (current.data == data) {
                return current;
            } else {
                current = current.next;
            }
        }
        return last;
    }

    public Link<T> find(int index){
        Link<T> current = first;
            for (int i = 0; i<index; i++){
                current = current.next;
            }
            return current;
    }

    public int length(){
        Link<T> current = first;
        int counter = 1;
        while (current != last){
            counter++;
            current = current.next;
        }
        return counter;
    }
    }


