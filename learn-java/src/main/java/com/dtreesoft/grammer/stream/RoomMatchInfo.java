package com.dtreesoft.grammer.stream;

import java.io.Serializable;
import java.util.List;

public class RoomMatchInfo implements Serializable {

    private String roomId;
    private String gameId;

    private int suddaType;
    private long seedMoney;
    private int curUserCount;
    private long averageMoney;
    private List<String> userCIList;// = new ArrayList<>();    // 동일 CI 입장제한 체크를 위해 선언한다.
    private int msgRoomType;
    private int friendlyMatchRoomNumber;

    public RoomMatchInfo(String roomId, String gameId, int suddaType, long seedMoney, int curUserCount, long averageMoney, List<String> userCIList, int msgRoomType, int friendlyMatchRoomNumber) {
        this.roomId = roomId;
        this.gameId = gameId;
        this.suddaType = suddaType;
        this.seedMoney = seedMoney;
        this.curUserCount = curUserCount;
        this.averageMoney = averageMoney;
        this.userCIList = userCIList;
        this.msgRoomType = msgRoomType;
        this.friendlyMatchRoomNumber = friendlyMatchRoomNumber;
    }

    public String getRoomId() {
        return roomId;
    }

    public String getGameId() {
        return gameId;
    }

    public int getSuddaType() {
        return suddaType;
    }

    public long getSeedMoney() {
        return seedMoney;
    }

    public int getCurUserCount() {
        return curUserCount;
    }

    public long getAverageMoney() {
        return averageMoney;
    }

    public List<String> getUserCIList() {
        return userCIList;
    }

    public int getMsgRoomType() {
        return msgRoomType;
    }

    public int getFriendlyMatchRoomNumber() {
        return friendlyMatchRoomNumber;
    }
}
