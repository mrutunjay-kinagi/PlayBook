package com.cg.playBook1.Service;

import java.sql.SQLException;

import com.cg.playBook1.Bean.PlayBookBean;

public interface IPlayBookService {
	public abstract PlayBookBean createAccount(PlayBookBean plyBK) throws SQLException;
	public abstract PlayBookBean updateCrm(PlayBookBean plyBK) throws SQLException;
	public abstract PlayBookBean fetchDetails(PlayBookBean plyBK) throws Exception;

}
