package co.yedam.dolvomee.command.users;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.yedam.dolvomee.comm.Command;
import co.yedam.dolvomee.service.users.UsersService;
import co.yedam.dolvomee.service.users.UsersServiceImpl;
import co.yedam.dolvomee.service.users.UsersVO;

public class UsersSelect implements Command {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		//회원 리스트에서 회원 조회
		HttpSession session = request.getSession();
		session.getAttribute("usersEmail");
		UsersService usersDao = new UsersServiceImpl();
		UsersVO vo = new UsersVO();
		
		vo.setUsersEmail((String)session.getAttribute("usersEmail"));
		
		System.out.println((String)session.getAttribute("usersEmail"));
		
		vo = usersDao.selectUser(vo);
		request.setAttribute("users", vo);
		
		return "users/usersSelect";
	}

}
