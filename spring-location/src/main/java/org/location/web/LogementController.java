package org.location.web;


import org.location.dao.LogementDAO;
import org.location.dao.TypelogDAO;
import org.location.entities.Logement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value="/logement")
public class LogementController {

	
	@Autowired
	private LogementDAO logement;
	@Autowired
	private TypelogDAO type;
	
	
	
	@RequestMapping(value="/consulter")
	public String consulter_logement(Model model,@RequestParam(name="page",defaultValue="0") int p,
			@RequestParam(name="mc",defaultValue="") String mc) {
	Page <Logement> log=logement.findbyKw(mc, PageRequest.of(0, 5));
	int pageCount=log.getTotalPages();
	int[]pages=new int[pageCount];
	for(int i=0;i<pageCount;i++)pages[i]=i;
	model.addAttribute("pages", pages);
	model.addAttribute("PageLogement", log);
	model.addAttribute("pageCourante", p);
	model.addAttribute("motCle", mc);
	return "consulter_log";
}
	








}
