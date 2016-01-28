package pe.gob.edu.empssapal.webapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pe.gob.edu.empssapal.service.services.CamposaguaServiceImpl;

@Controller

public class FormularioAlcantarilladoController {
	protected Log logger = LogFactory.getLog(getClass());
	
	 @Autowired
	 private CamposaguaServiceImpl empssapalService;
	@RequestMapping(value = "FormularioAlcantarillado/dashboard6", method = RequestMethod.GET)
	public String dashboard6(Model model, HttpServletRequest request) {
		logger.info("::::::::::::FormularioAlcantarillado/dashboard6:::::::::::::::");
		request.getSession().setAttribute("menuHeader", "FormularioAlcantarillado");
		model.addAttribute("veredas", empssapalService.Listarveredawherealcantarillado());
		model.addAttribute("pistas", empssapalService.Listartipopistaalcantarillado());
		model.addAttribute("empalmeres", empssapalService.Listarempalme6alcantarillado());
		return "FormularioAlcantarillado/dashboard6";
	}
	
	@RequestMapping(value = "FormularioAlcantarillado/dashboard160", method = RequestMethod.GET)
	public String dashboard160(Model model, HttpServletRequest request) {
		logger.info("::::::::::::FormularioAlcantarillado/dashboard160:::::::::::::::");
		request.getSession().setAttribute("menuHeader", "FormularioAlcantarillado");
		model.addAttribute("veredas", empssapalService.Listarveredawherealcantarillado());
		model.addAttribute("pistas", empssapalService.Listartipopistaalcantarillado());
		model.addAttribute("empalmeres", empssapalService.Listarempalme160alcantarillado());
		return "FormularioAlcantarillado/dashboard160";
	}
	
	@RequestMapping(value = "FormularioAlcantarillado/dashboard200", method = RequestMethod.GET)
	public String dashboard200(Model model, HttpServletRequest request) {
		logger.info("::::::::::::FormularioAlcantarillado/dashboard200:::::::::::::::");
		request.getSession().setAttribute("menuHeader", "FormularioAlcantarillado");
		model.addAttribute("veredas", empssapalService.Listarveredawherealcantarillado());
		model.addAttribute("pistas", empssapalService.Listartipopistaalcantarillado());
		model.addAttribute("empalmeres", empssapalService.Listarempalme200alcantarillado());
		return "FormularioAlcantarillado/dashboard200";
	}
}
