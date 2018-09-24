package szu.vander.game.web;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import szu.vander.game.service.GuessService;

/**
* @author      : Vander
* @date        : 2018-08-02
* @description ： 
*/
@Controller
public class GameController {

	@Autowired
	private GuessService guessService;
	
	@RequestMapping(value="/play", method= {RequestMethod.POST, RequestMethod.GET})
	public ModelAndView play(int number, HttpSession session) {
		ModelAndView mv = new ModelAndView();
		String tips = guessService.getTips(number, session);
		mv.addObject("tips", tips);
		mv.setViewName("game");
		return mv;
	}
	
	@RequestMapping(value="/start", method= {RequestMethod.POST, RequestMethod.GET})
	public ModelAndView start(HttpSession session) {
		int result = guessService.getRandomNum();
		session.setAttribute("result", result);
		String tips = guessService.start(session);
		ModelAndView mv = new ModelAndView();
		mv.addObject("tips", tips);
		mv.setViewName("game");
		return mv;
	}
	
}
