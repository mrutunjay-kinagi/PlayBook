package com.cg.playBook1.Dao;

import java.sql.SQLException;

import com.cg.playBook1.Bean.PlayBookBean;

public interface IPlayBookDao {
	public abstract PlayBookBean createAccount(PlayBookBean plyBK) throws SQLException;
	public abstract PlayBookBean insertCrm(PlayBookBean plyBK) throws SQLException;
	public abstract PlayBookBean fetchDetails(PlayBookBean plyBK) throws SQLException, Exception;
	public abstract PlayBookBean insertPortal(PlayBookBean plyBK) throws SQLException;
	public abstract PlayBookBean insertCoreSys(PlayBookBean plyBk)throws SQLException;
	public abstract PlayBookBean insertRating(PlayBookBean plyBk) throws SQLException;
	public abstract PlayBookBean insertMid(PlayBookBean plyBk)throws SQLException;
	public abstract PlayBookBean insertECM(PlayBookBean plyBk)throws SQLException;
	public abstract PlayBookBean insertDWH(PlayBookBean plyBk)throws SQLException;
	public abstract PlayBookBean insertAny(PlayBookBean plyBk)throws SQLException;
}
