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
	public PlayBookBean insertCrm(PlayBookBean plyBK) throws SQLException {
		// TODO Auto-generated method stub
	
		return IPlyBook.insertCrm(plyBK);
	}
	@Override
	public PlayBookBean fetchDetails(PlayBookBean plyBK) throws Exception {
		// TODO Auto-generated method stub
		return IPlyBook.fetchDetails(plyBK);
	}
	public PlayBookBean insertPortal(PlayBookBean plyBK) throws SQLException {
		// TODO Auto-generated method stub
	
		return IPlyBook.insertPortal(plyBK);
	}
	@Override
	public PlayBookBean insertCoresys(PlayBookBean plyBk) throws Exception {
		// TODO Auto-generated method stub
		return IPlyBook.insertCoreSys(plyBk);
	}
	@Override
	public PlayBookBean insertRating(PlayBookBean plyBk) throws Exception {
		// TODO Auto-generated method stub
		return IPlyBook.insertRating(plyBk);
	}
	@Override
	public PlayBookBean insertMid(PlayBookBean plyBk) throws Exception {
		// TODO Auto-generated method stub
		return IPlyBook.insertMid(plyBk);
	}
	@Override
	public PlayBookBean insertECM(PlayBookBean plyBk) throws Exception {
		// TODO Auto-generated method stub
		return IPlyBook.insertECM(plyBk);
	}
	@Override
	public PlayBookBean insertDWH(PlayBookBean plyBk) throws Exception {
		// TODO Auto-generated method stub
		return IPlyBook.insertDWH(plyBk);
	}
	@Override
	public PlayBookBean insertAny(PlayBookBean plyBk) throws Exception {
		// TODO Auto-generated method stub
		return IPlyBook.insertAny(plyBk);
	}

}
