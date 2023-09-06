package com.fedex.streamapi;

import java.util.List;
import java.util.Map;

public class FInterfaceClass implements FInterface{

    @Override
    public List<String> getKeys(Map<String, Integer> map) {
        return null;
    }

    @Override
    public int getLengthOfString(String str) {
        return 6;
    }

    @Override
    public int listSize(List<Integer> ls) {
        return 5;
    }
}
