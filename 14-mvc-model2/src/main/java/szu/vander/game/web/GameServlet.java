package szu.vander.game.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import szu.vander.game.service.GuessService;

/**
* @author : Vander Choi
* @date : 2018-09-24
* @description :
*/
public class GameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	GuessService guessService;
	
    public GameServlet() {
    	guessService = new GuessService();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int number = Integer.parseInt(request.getParameter("number"));
		HttpSession session = request.getSession();
		String tips = guessService.getTips(number, session);
		request.setAttribute("tips", tips);
		request.getRequestDispatcher("/game.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
