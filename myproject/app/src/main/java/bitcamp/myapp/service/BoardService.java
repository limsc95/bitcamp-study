package bitcamp.myapp.service;

import bitcamp.myapp.dao.BoardDao;
import bitcamp.myapp.dao.MemberDao;
import bitcamp.myapp.vo.Board;
import bitcamp.myapp.vo.Member;

import java.util.List;

public interface BoardService {

    List<Board> list() throws Exception;

    void add(Board board) throws Exception;

    Board get(int no) throws Exception;

    void update(Board board) throws Exception;

    void delete(int no) throws Exception;
}
