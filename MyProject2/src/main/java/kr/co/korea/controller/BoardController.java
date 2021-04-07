package kr.co.korea.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.co.korea.beans.BoardBean;
import kr.co.korea.service.BoardService;

@RestController
@RequestMapping("/board")
public class BoardController {

	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);

	@Autowired
	private BoardService boardservice;

	@GetMapping("")
	public List<BoardBean> list() {
		logger.info("boardlist");
		
		List<BoardBean> list = boardservice.getboardlist();
		
		return list;
	}

	@GetMapping("/{bid}")
	public BoardBean read(@PathVariable int bid) {
		
		logger.info("boardread");
		
		BoardBean boardbean = boardservice.readboard(bid);
		return boardbean;
	}

	@PostMapping("")
	public void write(@RequestBody BoardBean boardbean) {
		logger.info("write");
		
		String username="admin";
		
		boardservice.writeboard(boardbean,username);
	}
	
	@PutMapping("/{bid}")
	public void updateok(@RequestBody BoardBean boardbean,@PathVariable int bid) {
		logger.info("updateok");
		boardbean.setBid(bid);
		
		boardservice.updateBoard(boardbean);
		
	}
	
	
	@DeleteMapping("/{bid}")
	public void delete(@PathVariable int bid) {
		logger.info("delete");
		boardservice.deleteBoard(bid);
	}
	
}
