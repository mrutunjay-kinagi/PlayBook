package com.cg.playBook1.Service;

import java.sql.SQLException;

import com.cg.playBook1.Bean.PlayBookBean;

public interface IPlayBookService {
	public abstract PlayBookBean createAccount(PlayBookBean plyBK) throws SQLException;
	public abstract PlayBookBean insertCrm(PlayBookBean plyBK) throws SQLException;
	public abstract PlayBookBean fetchDetails(PlayBookBean plyBK) throws Exception;
	public abstract PlayBookBean insertPortal(PlayBookBean plyBK) throws Exception;
	public abstract PlayBookBean insertCoresys(PlayBookBean plyBk)throws Exception;
	public abstract PlayBookBean insertRating(PlayBookBean plyBk)throws Exception;
	public abstract PlayBookBean insertMid(PlayBookBean plyBk)throws Exception;
	public abstract PlayBookBean insertECM(PlayBookBean plyBk)throws Exception;
	public abstract PlayBookBean insertDWH(PlayBookBean plyBk)throws Exception;
	public abstract PlayBookBean insertAny(PlayBookBean plyBk)throws Exception;
}
