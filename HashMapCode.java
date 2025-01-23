import java.util.*;
public class HashMapCode {
    static class HashMap<K,V>{   //generic...here type of key and value is not define
        private class Node{
            K key;
            V value;

            public Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        } 
        
        private int size;
        private Linkedlist1<Node> [] buckets;

        @SuppressWarnings("unchecked")
        public HashMap(){
            this.size = 0;
            this.buckets = new LinkedList[4];
            for (int i = 0; i < 4; i++) {
                this.buckets = new LinkedList<>();
            }
        }
    }
}
