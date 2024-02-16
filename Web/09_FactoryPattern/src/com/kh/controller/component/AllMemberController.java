package com.kh.controller.component;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.controller.Controller;
import com.kh.controller.ModelAndView;
import com.kh.model.dao.MemberDAO;
import com.kh.model.vo.Member;

public class AllMemberController implements Controller {

	@Override
	public ModelAndView handle(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// 2. DAO
		MemberDAO dao = new MemberDAO();
		ArrayList<Member> list = new ArrayList<>();

		list = dao.allShowMember();
		System.out.println(list.size());

		// 3. 바인딩(list 뿌리는 기능)
		request.setAttribute("list", list);

		return new ModelAndView("views/allShow.jsp");
	}

}
