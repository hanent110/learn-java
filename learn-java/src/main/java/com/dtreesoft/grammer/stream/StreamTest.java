package com.dtreesoft.grammer.stream;

import java.util.*;

public class StreamTest {

    public static void main(String[] args) {
        StreamTest streamTest = new StreamTest();
        streamTest.testFindFirst();
    }

    private void testFindFirst() {
        Set<RoomMatchInfo> roomMatchInfos = prepareGivenData();

        Optional<RoomMatchInfo> first = roomMatchInfos.stream().sorted(Comparator.comparing(RoomMatchInfo::getRoomId)).findFirst();
        System.out.println("first.get() = " + first.get().getRoomId());

        for (Object info : roomMatchInfos.stream().sorted(Comparator.comparing(RoomMatchInfo::getRoomId)).toArray()) {
            RoomMatchInfo matchInfo = (RoomMatchInfo) info;
            System.out.println("roomId = " + matchInfo.getRoomId());
        }
    }

    private Set<RoomMatchInfo> prepareGivenData() {
        RoomMatchInfo roomMatchInfo = new RoomMatchInfo(
                "SPACE@MSUDDA@10.161.64.168@15002:0",
                "MSUDDA", 1,2, 4, 0, new ArrayList<>(), 3, 0);

        RoomMatchInfo roomMatchInfo1 = new RoomMatchInfo(
                "SPACE@MSUDDA@10.161.64.169@15002:0",
                "MSUDDA", 1,2, 3, 0, new ArrayList<>(), 3, 0);

        RoomMatchInfo roomMatchInfo2 = new RoomMatchInfo(
                "SPACE@MSUDDA@10.161.64.170@15001:0",
                "MSUDDA", 1,2, 2, 0, new ArrayList<>(), 3, 0);

        RoomMatchInfo roomMatchInfo3 = new RoomMatchInfo(
                "SPACE@MSUDDA@10.161.64.168@15002:1",
                "MSUDDA", 1,2, 2, 0, new ArrayList<>(), 3, 0);

        RoomMatchInfo roomMatchInfo4 = new RoomMatchInfo(
                "SPACE@MSUDDA@10.161.64.168@15001:0",
                "MSUDDA", 1,2, 1, 0, new ArrayList<>(), 3, 0);

        Set<RoomMatchInfo> matchInfos = new HashSet<>();
        matchInfos.add(roomMatchInfo);
        matchInfos.add(roomMatchInfo1);
        matchInfos.add(roomMatchInfo2);
        matchInfos.add(roomMatchInfo3);
        matchInfos.add(roomMatchInfo4);

        return matchInfos;
    }

}
