package kr.ac.kopo.test;

import static org.junit.Assert.assertNotNull;

import org.apache.ibatis.session.SqlSession;

import kr.ac.kopo.MyConfig;
import kr.ac.kopo.dao.BoardDAO;

public class Test {

	@org.junit.Test
	public void myConfigTest() throws Exception {
		MyConfig config = new MyConfig();
		SqlSession session = config.getInstance();
		
		assertNotNull(session);
	}

	@org.junit.Test
	public void boradDAOTest() throws Exception {
		BoardDAO dao = new BoardDAO();
		assertNotNull(dao.getSession());
	}
	
	@org.junit.Test
	public void boradDAOSelectTest() throws Exception {
		BoardDAO dao = new BoardDAO();
		assertNotNull(dao.select());
	}


}
