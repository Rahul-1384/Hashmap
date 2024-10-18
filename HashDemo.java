import java.util.*;
public class HashDemo<k,v> {
    int element = 0;
    class Node{
        k key;
        v value;
        Node next;

        Node(k key, v value){
            this.key = key;
            this.value = value;
        }
    }
    ArrayList<Node> map = new ArrayList<>();
    public HashDemo(int size){
        for(int i=0;i<size;i++){
            map.add(null);
        }
    }
    public HashDemo(){
        // for(int i=0;i<4;i++){
        //     map.add(null);
        // }
        this(4);
    }

    private int findIndex(k key){
        int idx = key.hashCode()%map.size();
        return idx;
    }

    // map.put()
    public void put(k key, v val){
        int idx = findIndex(key);
        Node head = map.get(idx);
        Node temp = head;
        while(temp != null){
            if(temp.key.equals(key)){
                temp.value = val;
                return;
            }
            temp = temp.next;
        }
        Node nn = new Node(key, val);
        map.set(idx, nn);
        nn.next = head;
        element++;

        // thf --> threshold frequency
        // lf --> load factor
        int thf = 2;
        int lf = element/map.size();
        if(lf > thf){
            rehashing();
        }
    }

    private void rehashing(){
        ArrayList<Node> newmap = new ArrayList<>();
        for(int i=0;i<2*map.size();i++){
            newmap.add(null);
        }
        ArrayList<Node> oldmap = map;
        map = newmap;
        for(Node nn : oldmap){
            while(nn != null){
                int idx = findIndex(nn.key);
                put(nn.key, nn.value);
                nn = nn.next;
            }
        }
    }

    // map.containsKey()
    public boolean containsKey(k key){
        int idx = findIndex(key);
        Node temp = map.get(idx);
        while(temp != null){
            if(temp.key.equals(key)){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public void remove(k key){
        int idx = findIndex(key);
        Node head = map.get(idx);
        // Node temp = head;
        Node prev = null;
        while(head != null){
            if(head.key.equals(key)){
                prev.next = head.next;
                prev = head;
                head = head.next;
                prev.next = null;
                return;
            }
            prev = head;
            head = head.next;
        }
        return;
    }
}
