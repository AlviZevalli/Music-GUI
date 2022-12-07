package projectguisdl;


public class ListNodeObject {
    
    Lagu elemen;
    ListNodeObject next;
    ListNodeObject prev;

    public ListNodeObject getNext() {
        return next;
    }

    public void setNext(ListNodeObject next) {
        this.next = next;
    }

    public ListNodeObject getPrev() {
        return prev;
    }

    public void setPrev(ListNodeObject prev) {
        this.prev = prev;
    }
    
    public ListNodeObject(){
        this(null);
    }
    public ListNodeObject(Lagu x){
        next = null;
        prev = null;
        elemen = x;
    }
    public ListNodeObject(Lagu elemen, ListNodeObject next,ListNodeObject prev){
        this.elemen = elemen;
        this.next = next;
        this.prev = prev;
    }

    public Lagu getElemen() {
        return elemen;
    }

    public void setElemen(Lagu elemen) {
        this.elemen = elemen;
    }
}
