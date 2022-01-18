package com.mycompany.app;

import com.google.common.*;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
/**
 * Hello world!
 *
 */
public class App 
{   
    public static void sampleInits(){
        Queue<Integer> pq = new PriorityQueue<Integer>();
        Queue<Integer> ll = new LinkedList<Integer>();
        BlockingQueue<Integer> bq = new ArrayBlockingQueue(10);
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        hm.put(1,10);
        hm.put(2,20);
        hm.put(3,30);
        System.out.println(hm.toString());
        hm.compute(3, (key,val)->{return val+10;});
        System.out.println(hm.toString());
        hm.remove(3);
    }
    public static void main( String[] args )
    {
        CustHashMap<Integer,Integer> hashMap = new CustHashMap<>();
        hashMap.put(1,1000);
        hashMap.put(2,2000);
        hashMap.put(3,3000);
        hashMap.put(4,4000);
        hashMap.put(5,5000);
        hashMap.put(6,6000);
        hashMap.put(7,7000);
        hashMap.put(8,8000);
        hashMap.put(9,9000);
        hashMap.put(10,10000);
        System.out.println(hashMap.toString());
        
        hashMap.put(11,11000);
        hashMap.put(12,12000);
        hashMap.put(13,13000);
        System.out.println(hashMap.toString());
        /*hashMap.put(14,14000);
        hashMap.put(15,15000);
        hashMap.put(16,16000);
        
        hashMap.put(17,17000);
        hashMap.put(18,18000);
        hashMap.put(19,19000);
        hashMap.put(20,20000);
        hashMap.put(21,21000);
        hashMap.put(22,22000);
        hashMap.put(23,23000);
        hashMap.put(24,24000);
        hashMap.put(25,25000);

        System.out.println(hashMap.get(22));*/
        return;
        


    }
}
