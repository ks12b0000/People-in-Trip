package kr.co.intrip.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.intrip.login_signup.dto.MemberDTO;
import kr.co.intrip.main.dao.MainDAO;
import kr.co.intrip.main.dto.MainDTO;

@Service("mainService")
public class MainServiceImpl implements MainService {
	
	@Autowired
	private MainDAO mainDAO;

	// 동행구해요 게시판 리스트
	@Override
	public List<MainDTO> listMain() throws Exception {
		List<MainDTO> mainsList = mainDAO.selectBoardList();
		return mainsList;
	}
	
	// 정보게시판 리스트
	@Override
	public List<MainDTO> listMain1() throws Exception {
		List<MainDTO> mainsList = mainDAO.selectBoardList1();
		return mainsList;
	}

}
