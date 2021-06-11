package com.example.demo.model.response;

public class PlayerResponse {
    public final int boardId;
    public final int playerId;
    public final String playerName;
    public final Integer x;
    public final Integer y;

    public PlayerResponse(int boardId, int playerId, String playerName, Integer x, Integer y){
        this.boardId = boardId;
        this.playerId = playerId;
        this.playerName = playerName;
        this.x = x;
        this.y = y;
    }
}
