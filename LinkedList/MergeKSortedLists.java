package LinkedList;
import java.util.ArrayList;
public class MergeKSortedLists {
    Node mergeKLists(Node[] arr) {
        ArrayList<Node> list1 = new ArrayList<>();
        ArrayList<Node> list2 = new ArrayList<>();
        for(Node n : arr){
            list1.add(n);
        }
        while(list1.size()+list2.size() > 1){
            while(list1.size() > 1){
                Node a = list1.remove(list1.size()-1);
                Node b = list1.remove(list1.size()-1);
                Node c = merge(a,b);
                list2.add(c);
            }
            while(list2.size() > 1){
                Node a = list2.remove(list2.size()-1);
                Node b = list2.remove(list2.size()-1);
                Node c = merge(a,b);
                list1.add(c);
            }
        }
        return (list1.size()>0) ? list1.get(0) : list2.get(0);
    }
    Node merge(Node head1, Node head2) {
        Node dummy = new Node(-1);
        Node i = head1;
        Node j = head2;
        Node k = dummy;
        while(i!=null && j!=null){
            if(i.data < j.data){
                k.next = i;
                i = i.next;
            }
            else{
                k.next = j;
                j = j.next;
            }
            k = k.next;
        }
        if(i==null) k.next = j;
        else k.next = i;
        return dummy.next;
    }
}
