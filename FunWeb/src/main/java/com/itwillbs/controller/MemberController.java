package com.itwillbs.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MemberController extends HttpServlet {
	RequestDispatcher dispatcher = null;
	// HttpServlect 처리 담당자 -> 자동으로 doGet, doPost호
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("MemberController doGet()");
		doProcess(request, response);
}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("MemberControlloer doPost()");
		doProcess(request, response);
	}
	
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("MemberControlloer doProcess()");
		// 가상주소 뽑아오기
		String sPath=request.getServletPath();
		System.out.println("뽑은 가상주소 : " + sPath);
		// 뽑은 가상주소 비교하기 => 실제페이지 연결
	
		if(sPath.equals("/insert.me")) {
			// member/join.jsp 연결, 주소매핑
			
			// 주소가 변경되지 않으면서 이동하는 방식 (forward방식)
			// request, response 정보도 들고 이동
			dispatcher = request.getRequestDispatcher("member/join.jsp");
			dispatcher.forward(request, response);
		}
	}
}
