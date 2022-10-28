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
            last.next = link.next;
            last.next = link;
            last = link;
        }
    }
    public void delete(T data){
        Link current = first;
        if(last==null){
            return;
        }
        while(current.data != data){
            if(current.next == first){
                System.out.println("Link does not exist");
                break;
            }
            current = current.next;
        }
        if(current == first && current.next == first){
            first = null;
        }
        if(current == first){
            while(last.next != first){
                last = last.next;
                first = current.next;
                last.next = first;
            }
        }
        else if(current.next == first){
            last.next = first;
        }
        else{
            last.next = current.next;
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

    //length runs through the whole CLL incrimenting a counter for event link it passes by, returns that counter once it reaches the end of the CLL
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


