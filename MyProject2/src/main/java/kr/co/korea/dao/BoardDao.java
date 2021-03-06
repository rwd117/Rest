package kr.co.korea.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.korea.beans.BoardBean;

@Repository
public class BoardDao {

	@Autowired
	private SqlSessionTemplate sqltemp;
	
	public void writeboard(BoardBean boardbean) {
		sqltemp.insert("board.writeboard",boardbean);
	}
	
	public BoardBean readboard(int bid) {
		return sqltemp.selectOne("board.readboard",bid);
	}
	
	public List<BoardBean> getboardlist(){
		return sqltemp.selectList("board.getboardlist");
	}
	
	public void updateBoard(BoardBean boardbean) {
		sqltemp.update("board.updateboard",boardbean);
	}
	
	public void deleteBoard(int bid) {
		sqltemp.delete("board.deletebaord",bid);
	}
	
	
}
