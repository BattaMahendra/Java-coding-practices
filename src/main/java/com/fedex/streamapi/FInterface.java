package com.fedex.streamapi;

import java.util.List;
import java.util.Map;


@FunctionalInterface
public interface FInterface {
    List<String> getKeys(Map<String,Integer> map);
    default int getLengthOfString(String str){
        return str.length();
    }

    static boolean keyExists(Map<String, Integer> map) {
        return map.containsKey("SKS");
    }

    default int listSize(List<Integer> ls) {
        return ls.size();
    }
}
