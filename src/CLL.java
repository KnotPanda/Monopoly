public class CLL<T> {
    public Link<T> first;
    public Link<T> last;

    public void Board_CLL() {
        first = null;
        last = null;
    }

    /*
    insert inserts a link at the end of the linked list, I chose to do this instead of inserting it as the
    first link because when adding links in a particular order, this would be easier to visualize.
     */
    public void insert(T data) {
        Link link = new Link(data);
        if (last == null) {
            first = link;
            last = link;
            link.next = last;
        } else {
            link.next = first;
            last.next = link;
            last = link;
        }
    }
    public void delete (T key){
        Link<T> current = first;
        Boolean done = true;
        if(first.data.equals(key)) {
            first = first.next;
            last.next = first;
        }
        else{
                while(done){
                    if(current.next.data.equals(key)){
                        current.next=current.next.next;
                        done = false;}
                    if (current.next.equals(first)){
                        last = current;
                    }
                    current = current.next;
                }
        }
    }

    //find runs through the CLL incrementing an int i until i gets to the int index's link, it then returns that link
    public Link<T> find(int index){
        Link<T> current = first;
            for (int i = 0; i<index; i++){
                current = current.next;
            }
            return current;
    }

    //length runs through the whole CLL incrementing a counter for event link it passes by, returns that counter once it reaches the end of the CLL
    public int length(){
        Link<T> current = first;
        int counter = 1;
        while (current.data != last.data){
            counter++;
            current = current.next;
        }
        return counter;
    }
    public int count() {
        Link<T> current = first;
        int counter = 0;
        if (first != null) {
            while(current != first){
                current = current.next;
                counter++;
            }
        }
        return counter;
    }
    public void delete2(T data){
        Link current = first;
        if(last==null){
            return;
        }
        while(current != first){
            Link next = current.next;
            if (next.data == data) {
                if (next.data == first) {
                    first = null;
                    last = null;
                } else {
                    current.next = next.next;
                    if (first == next) {
                        first = first.next;
                    }
                    if (last == next) {
                        last = current;
                    }
                }
                break;
            }
            current = next;
        }
    }
}


