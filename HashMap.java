import java.util.*;
import java.util.HashMap;
public class Maps{
    static class HashMap<K,V>{
        private class Node{
            K key;
            V value;
            public Node(K key,V value){
                this.key=key;
                this.value=value;
            }
        }
        private int n; //no.of nodes in ll
        private int N; //no.of buckets in array
        private LinkedList<Node> buckets[];
        @SuppressWarnings("unchecked")
        public HashMap(){
            this.N=4;
            this.buckets=new LinkedList[4];
            for(int i=0;i<4;i++){
                this.buckets[i]=new LinkedList<>();
            }
        }
    }
    private int HashFunction(K key){
        int hc=key.hashCode();
        return Math.abs(hc) % N;
    }
      public static void main(String args[]){
        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("India",120);
        hm.put("China",150);
        hm.put("Us",100);
        hm.put("Nepal",90);
        System.out.println(hm);
        System.out.println(hm.size());
        System.out.println(hm.isEmpty());
        hm.clear();
        System.out.println(hm);
        System.out.println(hm.get("India"));
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.remove("China"));

        Iterate over hashmap
        Set<String> keys=hm.keySet();
        System.out.println(keys);
        for(String k:keys){
           System.out.println("key=" +k +"," +"value=" + hm.get(k));
        }
        for(int i=0;i<arr.length;i++){
           map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        

    }
}
