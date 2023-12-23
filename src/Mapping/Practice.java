package Mapping;

import java.util.HashMap;
import java.util.Map;

public class Practice {
    public static void main(String[] args){
        Map<Integer , Integer> map = new HashMap<>();
        map.put(1, 1);
        map.put(3, 2);
        for(Integer i: map.values()){
            System.out.println(i);
        }
    }
}
