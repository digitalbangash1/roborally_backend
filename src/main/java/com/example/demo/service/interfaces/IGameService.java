package com.example.demo.service.interfaces;

import com.example.demo.exceptions.DaoException;
import com.example.demo.exceptions.ServiceException;
import com.example.demo.model.Board;
import com.example.demo.model.Player;

import java.util.Collection;


public interface IGameService {
    Board getBoard(int boardId) throws ServiceException, DaoException;

    int saveBoard(Board board) throws ServiceException, DaoException;

    Player getCurrentPlayer(int boardId) throws ServiceException, DaoException;

    Player getPlayer(int playerId) throws ServiceException, DaoException;

    void setCurrentPlayer(int boardId, int playerId) throws ServiceException, DaoException;

    int addPlayer(int boardId, Player player) throws ServiceException, DaoException;

    void moveCurrentPlayer(int boardId, int x, int y) throws ServiceException, DaoException;

    void movePlayer(Board board, int x, int y, int playerId) throws DaoException;

    void switchCurrentPlayer(int boardId) throws ServiceException, DaoException;

    Collection<Board> getBoards();
}
