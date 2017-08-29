package com.cg.playBook1.Service;

import java.sql.SQLException;

import com.cg.playBook1.Bean.PlayBookBean;
import com.cg.playBook1.Dao.IPlayBookDao;
import com.cg.playBook1.Dao.PlayBookDaoImpl;

public class PlayBookServiceImpl implements IPlayBookService{
IPlayBookDao IPlyBook=new PlayBookDaoImpl();
	@Override
	public PlayBookBean createAccount(PlayBookBean plyBK) throws SQLException {
		// TODO Auto-generated method stub
	
		return IPlyBook.createAccount(plyBK);
	}
	@Override
	public PlayBookBean updateCrm(PlayBookBean plyBK) throws SQLException {
		// TODO Auto-generated method stub
		return IPlyBook.updateCrm(plyBK);
	}

}
