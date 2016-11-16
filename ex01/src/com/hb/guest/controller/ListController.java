package com.hb.guest.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hb.guest.model.GuestDao;
import com.hb.guest.model.GuestDto;

@WebServlet("/guest/list.do")
public class ListController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		GuestDao dao;
		ArrayList list = null;
		
		try {
			dao = new GuestDao();
			list = dao.selectAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		request.setAttribute("alist", list);
		request.getRequestDispatcher("list.jsp").forward(request, response);
		
		

//		for(int i=0; i<list.size(); i++){
////			HashMap map = (HashMap)list.get(i);
//			GuestDto dto = (GuestDto)list.get(i);
//			
//			
//			System.out.print(dto.getSabun());//arraylist 배열과 비슷한데 hashmap은 키값을 주어 월하는 벨류만 가져올수있다
//			System.out.print(",");
//			System.out.print(dto.getName());
//			System.out.print(",");
//			System.out.print(dto.getNalja());
//			System.out.print(",");
//			System.out.println(dto.getPay());
//		}//for		
		
	}//doGet
}
