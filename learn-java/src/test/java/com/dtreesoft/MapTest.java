package com.dtreesoft;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest {

    @Test
    public void display() {
        Map<String, Integer> historyMap = new HashMap<>();
        historyMap.put("22-1", 1000);
        historyMap.put("22-2", 1000);
        historyMap.put("22-10", 1000);
        historyMap.put("22-11", 1000);
        historyMap.put("22-27", 1000);
        historyMap.put("22-38", 1000);
        historyMap.put("22-3", 1000);
        historyMap.put("22-111", 1000);
        historyMap.put("22-211", 1000);
        historyMap.put("22-311", 1000);
        historyMap.put("22-41", 1000);
        historyMap.put("22-52", 1000);
        historyMap.put("22-72", 1000);

        List<String> keyList = new ArrayList<>(historyMap.keySet());
        List<String> newKeyList = new ArrayList<>();
        for (String s : keyList) {
            String[] split = s.split("-");
            String formatted = String.format("%s-%03d", split[0], Integer.parseInt(split[1]));
            newKeyList.add(formatted);
        }

        newKeyList.sort(String::compareTo); // 오름차순 정렬

        System.out.println(newKeyList);

        List<String> resultKeyList = new ArrayList<>();
        for (String s : newKeyList) {
            String[] split = s.split("-");
            String formatted = String.format("%s-%d", split[0], Integer.parseInt(split[1]));
            resultKeyList.add(formatted);
        }

        System.out.println(resultKeyList);
    }
}
