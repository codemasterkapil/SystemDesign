package Hashmap_Inner_Implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class OurHashMap<K,V> {

    private List<MapNode<K,V>> bucket;
    private int capacity; //length of the bucket
    private int size; // number of elements in the map
    private final int Initial_Capacity=5;

    public OurHashMap()
    {
        bucket=new ArrayList<>();
        capacity=Initial_Capacity;
        size=0;
        for(int i=0;i<Initial_Capacity;i++)
        {
            bucket.add(null);
        }
    }

    private int getBucketIndex(K key)
    {
       int hashCode=key.hashCode();
       return hashCode%capacity;
    }

    public V get(K key)
    {
        int bucketIndex=getBucketIndex(key);
        MapNode<K,V> head=bucket.get(bucketIndex);
        while(head!=null)
        {
            if(head.key==key)
            {
                return head.value;
            }
            head=head.next;
        }
        return null;
    }

    public void remove(K key)
    {
        int bucketIndex=getBucketIndex(key);
        MapNode<K,V> head=bucket.get(bucketIndex);
        MapNode<K,V> prev=null;

        while(head!=null)
        {
            if(head.key==key)
            {
                if(prev==null){
                    bucket.set(bucketIndex,head.next);
                }else{
                    prev.next=head.next;
                }
                head.next=null;
                size--;

            }
            prev=head;
            head=head.next;
        }

    }

    public void put(K key, V value)
    {
        int bucketIndex=getBucketIndex(key);
        MapNode<K,V> head=bucket.get(bucketIndex);

        // if I find the same key then just update its value
        while(head!=null)
        {
            if(head.key==key)
            {
                head.value=value;
                return ;
            }
            head=head.next;
        }
        size++;
        head=bucket.get(bucketIndex);
        MapNode<K,V> newNode=new MapNode<K,V>(key,value);
        newNode.next=head;
        bucket.set(bucketIndex,newNode);

        double loadFactor=(1.0*size)/capacity;
        System.out.println("inserting key " + key);
        System.out.println("Load Factor : " + loadFactor);

        if(loadFactor>0.7)
        {
            rehash();
        }

    }

    private void rehash()
    {
        System.out.println("Rehashing buckets");
        List<MapNode<K,V>>temp=bucket;
        bucket=new ArrayList<>();
        capacity*=2;

        for(int i=0;i<capacity;i++){
            bucket.add(null);
        }
        size=0;

        for(int i=0;i<temp.size();i++)
        {
            MapNode<K,V>node=temp.get(i);
            while(node!=null)
            {
                put(node.key,node.value);
                node=node.next;
            }
        }
    }


    private class MapNode<K,V> {
        public K key;
        public V value;
        public MapNode<K, V> next;

        MapNode(K key, V value) {
            this.key = key;
            this.value = value;
            next = null;
        }
    }

}
