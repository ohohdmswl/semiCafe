package web.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web.dto.FreeComm;
import web.service.face.FreeCommService;
import web.service.impl.FreeCommServiceImpl;

@WebServlet("/comm/freecommupdate")
public class FreeCommUpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	FreeCommService freeCommService = new FreeCommServiceImpl();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("/comm/commupdate [POST]");

		//한글 인코딩
		req.setCharacterEncoding("UTF-8");
				
		//응답 웹페이지 한글 인코딩
		resp.setContentType("text/html; charset=UTF-8");
		
		freeCommService.updateComm(req);
		
		int idx = Integer.parseInt(req.getParameter("idx"));

		resp.sendRedirect("/board/freeview?idx=" + idx);
		
	}
	
}
