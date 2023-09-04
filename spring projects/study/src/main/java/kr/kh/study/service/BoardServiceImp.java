package kr.kh.study.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.kh.study.dao.BoardDAO;
import kr.kh.study.vo.BoardVO;

@Service
public class BoardServiceImp implements BoardService{

	@Autowired
	private BoardDAO boardDao;

	@Override
	public List<BoardVO> getBoardList() {
		
		List<BoardVO> list = boardDao.selectBoardList();
		return list;
	}

	@Override
	public BoardVO getBoard(Integer bo_num) {
		if(bo_num == null) {
			return null;
		}
		BoardVO board = boardDao.selectBoard(bo_num);
		return board;
	}

	
}
