package pe.gob.edu.empssapal.webapp.controller;



import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pe.gob.edu.empssapal.core.domain.Camposagua;
import pe.gob.edu.empssapal.service.services.CamposaguaServiceImpl;

@Controller

public class FormularioAguaController {

	protected Log logger = LogFactory.getLog(getClass());
	
	 @Autowired
	 private CamposaguaServiceImpl empssapalService;

		@RequestMapping(value = "FormularioAgua/Menu", method = RequestMethod.GET)
		public String Menu(Model model, HttpServletRequest request) {
			logger.info("::::::::::::FormularioAgua/Menu:::::::::::::::");
			request.getSession().setAttribute("menuHeader", "FormularioAgua");
			return "FormularioAgua/Menu";
		}
		
		@RequestMapping(value = "FormularioAgua/Reporte", method = RequestMethod.GET)
		public String Reporte(Model model, HttpServletRequest request) {
			logger.info("::::::::::::FormularioAgua/Reporte:::::::::::::::");
			request.getSession().setAttribute("menuHeader", "FormularioAgua");
			return "FormularioAgua/Reporte";
		}

		@RequestMapping(value = "FormularioAgua/dashboard15", method = RequestMethod.GET)
	public String dashboard15(Model model, HttpServletRequest request) {
		logger.info("::::::::::::FormularioAgua/dashboard15:::::::::::::::");
		request.getSession().setAttribute("menuHeader", "FormularioAgua");
		model.addAttribute("veredas", empssapalService.findidveredabyidvereda());
		model.addAttribute("pistas", empssapalService.findListartipopistaagua());
		model.addAttribute("empalmeres", empssapalService.Listarempalme());
		return "FormularioAgua/dashboard15";
	}
		
		
	@RequestMapping(value = "FormularioAgua/dashboard20", method = RequestMethod.GET)
	public String dashboard20(Model model, HttpServletRequest request) {
		logger.info("::::::::::::FormularioAgua/dashboard20:::::::::::::::");
		request.getSession().setAttribute("menuHeader", "FormularioAgua");
		model.addAttribute("veredas", empssapalService.findidveredabyidvereda());
		model.addAttribute("pistas", empssapalService.findListartipopistaagua());
		model.addAttribute("empalmeres", empssapalService.Listarempalme20());
		return "FormularioAgua/dashboard20";
	}
	@RequestMapping(value = "FormularioAgua/dashboard25", method = RequestMethod.GET)
	public String dashboard25(Model model, HttpServletRequest request) {
		logger.info("::::::::::::FormularioAgua/dashboard25:::::::::::::::");
		request.getSession().setAttribute("menuHeader", "FormularioAgua");
		model.addAttribute("veredas", empssapalService.findidveredabyidvereda());
		model.addAttribute("pistas", empssapalService.findListartipopistaagua());
		model.addAttribute("empalmeres", empssapalService.Listarempalme25());
	
		return "FormularioAgua/dashboard25";
	}
	@RequestMapping(value = "FormularioAgua/dashboard38", method = RequestMethod.GET)
	public String dashboard38(Model model, HttpServletRequest request) {
		logger.info("::::::::::::FormularioAgua/dashboard38:::::::::::::::");
		request.getSession().setAttribute("menuHeader", "FormularioAgua");
		model.addAttribute("veredas", empssapalService.findidveredabyidvereda());
		model.addAttribute("pistas", empssapalService.findListartipopistaagua());
		model.addAttribute("empalmeres", empssapalService.Listarempalme38());
	
		return "FormularioAgua/dashboard38";
	}
	
	
	
	@RequestMapping(value = "FormularioAgua/guardar", method = RequestMethod.POST)
	public String guardarpresupuestoagua(@ModelAttribute("FormularioAgua") Camposagua campoagua, Model model) {
		empssapalService.Guardarpresupuestoagua(campoagua);
		return "home/dashboard";
		
	}
	}
