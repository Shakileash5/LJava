package com.mycompany.app;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class CustHashMapTest {
    
    @Test
    public void testPut(){
        CustHashMap<Integer,Integer> hashMap = new CustHashMap<>();
        hashMap.put(1,1000);
        hashMap.put(2,2000);
        hashMap.put(3,3000);
        
        assertTrue(hashMap.get(2) == 2000);
    }

    @Test 
    public void testGet(){
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
        hashMap.put(11,11000);
        hashMap.put(12,12000);
        hashMap.put(13,13000);
        hashMap.put(14,14000);
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
        
        assertTrue(hashMap.get(22) == 22000);
    }

    @Test
    public void testRemove(){
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
        hashMap.put(11,11000);
        hashMap.put(12,12000);
        hashMap.put(13,13000);
        hashMap.put(14,14000);
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
        
        hashMap.remove(22);
        assertTrue(hashMap.get(22) == null);
    }
}
