package projectguisdl;

import java.util.NoSuchElementException;

public class LinkedListObject {

    private ListNodeObject head;
    private int size;

    public LinkedListObject() {
        head = new ListNodeObject();
        size = 0;
        head.next = head;
        head.prev = head;
    }

    public boolean isEmpty() {
        if (head.next == head) {
            return true;
        } else {
            return false;
        }
    }

    public ListNodeObject addBefore(Lagu x, ListNodeObject bantu) {
        ListNodeObject baru = new ListNodeObject(x);
        baru.next = bantu;
        baru.prev = bantu.prev;
        bantu.prev.next = baru;
        bantu.prev = baru;
        size++;
        return baru;
    }

    public Object remove(ListNodeObject bantu) {
        if (isEmpty()) {
            throw new NoSuchElementException();
        } else {
            bantu.prev.next = bantu.next;
            bantu.next.prev = bantu.prev;
            bantu.next = null;
            bantu.prev = null;
            size--;
            return bantu.elemen;

        }
    }

    public ListNodeObject getHead() {
        return head;
    }

    public void setHead(ListNodeObject head) {
        this.head = head;
    }

    public Object removeFirst() {
        return remove(head.next);

    }

    public Object removeLast() {
        return remove(head.prev);
    }

    public void addFirst(Lagu x) {
        addBefore(x, head.next);
    }

    public void addLast(Lagu x) {
        addBefore(x, head);
    }

    public String print() {
        ListNodeObject bantu = head.next;
        while (bantu != head) {
            System.out.println(" " + bantu.getElemen());
            bantu = bantu.getNext();
        }
        return null;
    }

    public ListNodeObject search(Lagu x) {
        ListNodeObject baru = head.next;
        while (baru != head) {
            if (((Comparable) baru.getElemen()).compareTo(x) == 0) {
                System.out.println("Data " + x + " Ditemukan");
                return baru;
            }
            baru = baru.getNext();
        }
        return null;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
