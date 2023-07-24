package web.service.face;

import java.sql.Connection;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

public interface GetDbDataByLoginSessionService {

	public String getUserIdFromLoginSession(HttpServletRequest req);
	
	public int getUserNoByUserId(Connection conn, HttpServletRequest req);
	
	public String getUserNickByUserId(Connection conn, HttpServletRequest req);

}
