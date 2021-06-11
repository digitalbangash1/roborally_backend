package com.example.demo.model.response;

public class SpaceResponse {
    public final int x;
    public final int y;
    public final Integer playerId;

    public SpaceResponse(int x, int y, Integer playerId){
        this.x = x;
        this.y = y;
        this.playerId = playerId;
    }
}
