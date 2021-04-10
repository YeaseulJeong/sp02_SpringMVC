package com.encore.spring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class IndexController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		/*
		 * 1. form값 받아서
		 * 2. 원래는 DAO 연결 했지만 여기서 Service 메서드 호출
		 * 3. 값 리턴 받아서
		 * 4. ModelAndView 에 저장 (하면 어느 페이지로 갈지 나온다 _네비게이션)
		 */
		ModelAndView mv = new ModelAndView();
		mv.setViewName("result");  
		// 결과 페이지 이름  -- 확장자 안썼음   web.xml 에서 /WEB-INF/spring/appServlet/servlet-context.xml 아니면dispatcher-servlet.xml들어가서 확인 
		// _ 결과 페이지의 위치 정보와 확장자
		mv.addObject("message", "Hello First SpringMVC!!");
		// 라이브러리 ModelAndView 는 데이터도 저장할 수 있도록 해줌 
		return mv;
	}

}
