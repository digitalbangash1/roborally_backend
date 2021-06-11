package com.example.demo.model.response;

public class BoardResponse {
    public final int boardId;
    public final String boardName;
    public final int height;
    public final int width;
    public final SpaceResponse[][] spaceDtos;
    public final PlayerResponse[] playerDtos;

    public BoardResponse(
            int boardId, String boardName, int width, int height,
            SpaceResponse[][] spaceDtos, PlayerResponse[] playerDtos){
        this.boardId = boardId;
        this.boardName = boardName;
        this.width = width;
        this.height = height;
        this.spaceDtos = spaceDtos;
        this.playerDtos = playerDtos;

    }
}
