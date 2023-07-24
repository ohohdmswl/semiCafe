package web.dao.face;

import java.sql.Connection;
import java.util.List;
import java.util.Map;

import web.dto.UserInfo;

public interface GetDbDataByLoginSessionDao {

	public UserInfo getUserInfoByUserId(Connection conn, UserInfo userInfo);

	public int getUserNoByUserId(Connection conn, String userId);
	
	public String getUserNickByUserId(Connection conn, String userId);

}
