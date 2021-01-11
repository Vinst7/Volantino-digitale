package it.begear.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import it.begear.ecommerce.entity.Abbigliamento;
import it.begear.ecommerce.entity.Carrello;
import it.begear.ecommerce.entity.Elettronica;
import it.begear.ecommerce.entity.Libro;
import it.begear.ecommerce.service.AbbigliamentoService;
import it.begear.ecommerce.service.ElettronicaService;
import it.begear.ecommerce.service.LibroService;

@Controller
public class EcommerceController {
	@Autowired 
	AbbigliamentoService abbService;
	@Autowired
	ElettronicaService eleService;
	@Autowired
	LibroService libService;

	Carrello carrello;

	@RequestMapping("/")
	public String viewHomePage(Model model, @Param("keyword") String keyword) {
//		List<Abbigliamento> abbigliamento = abbService.ListAll(keyword);
//		List<Elettronica> elettronica = eleService.ListAll(keyword);
//		List<Libro> libri = libService.ListAll(keyword);
//		
//		model.addAttribute("abbigliamento", abbigliamento);
//		model.addAttribute("keyword", keyword);
//		
//		model.addAttribute("elettronica", elettronica);
//		model.addAttribute("keyword", keyword);
//		
//		model.addAttribute("libri", libri);
//		model.addAttribute("keyword", keyword);
//		
		return "index";
	}
	@RequestMapping("/Abb")
	public String viewHomePageAbb(Model model, @Param("keyword") String keyword) {
		List<Abbigliamento> abbigliamento = abbService.ListAll(keyword);
		
		model.addAttribute("abbigliamento", abbigliamento);
		model.addAttribute("keyword", keyword);
		
		return "Abb";
	}
	@RequestMapping("/Lib")
	public String viewHomePageLibr(Model model, @Param("keyword") String keyword) {
		List<Libro> libri = libService.ListAll(keyword);
		
		model.addAttribute("libri", libri);
		model.addAttribute("keyword", keyword);
		
		return "Lib";
	}
	@RequestMapping("/Ele")
	public String viewHomePageEle(Model model, @Param("keyword") String keyword) {
		List<Elettronica> elettronica = eleService.ListAll(keyword);
		
		model.addAttribute("elettronica", elettronica);
		model.addAttribute("keyword", keyword);
		
		return "Ele";
	}
	
	@RequestMapping("/newAbb")
	public String showNewAbbigliamento(Model model) {
		Abbigliamento a = new Abbigliamento();
		model.addAttribute("abbigliamento", a);
		return "NewAbb";
	}
	
	@RequestMapping("/newEle")
	public String showNewElettronica(Model model) {
		Elettronica e = new Elettronica();
		model.addAttribute("elettronica", e);
		return "NewEle";
	}
	
	@RequestMapping("/newLib")
	public String showNewLibro(Model model) {
		Libro l = new Libro();
		model.addAttribute("libro", l);
		return "NewLib";
	}
	
	
	@RequestMapping(value = "/saveAbb", method = RequestMethod.POST)
	public String saveAbbigliamento(@ModelAttribute("abbigliamento") Abbigliamento a) {
		abbService.save(a);
		return "redirect:/";
	}
	
	@RequestMapping(value = "/saveEle", method = RequestMethod.POST)
	public String saveElettronica(@ModelAttribute("elettronica") Elettronica e) {
		eleService.save(e);
		return "redirect:/";
	}
	
	@RequestMapping(value = "/saveLib", method = RequestMethod.POST)
	public String saveLibro(@ModelAttribute("libro") Libro l) {
		libService.save(l);
		return "redirect:/";
	}
	
	
	@RequestMapping("/edit_Abb/{id_abb}")
	public ModelAndView showEditNewAbbgiliamento(@PathVariable(name = "id_abb") int id_abb) {
		ModelAndView mav = new ModelAndView("Edit_Abb");
		Abbigliamento a = abbService.getAbb(id_abb);
		mav.addObject("abbigliamento", a);
		return mav;
	}
	
	@RequestMapping("/edit_Ele/{id_ele}")
	public ModelAndView showEditNewElettronica(@PathVariable(name = "id_ele") int id_ele) {
		ModelAndView mav = new ModelAndView("Edit_Ele");
		Elettronica e = eleService.getEle(id_ele);
		mav.addObject("elettronica", e);
		return mav;
	}
	
	@RequestMapping("/edit_Lib/{id_lib}")
	public ModelAndView showEditNewLibro(@PathVariable(name = "id_lib") int id_lib) {
		ModelAndView mav = new ModelAndView("Edit_Lib");
		Libro l = libService.getLib(id_lib);
		mav.addObject("libro", l);
		return mav;
	}
	
	@RequestMapping("delete_Abb/{id_abb}")
	public String deleteAbbigliamento(@PathVariable(name = "id_abb") int id_abb) {
		abbService.delete(id_abb);
		return "redirect:/";
	}
	
	@RequestMapping("delete_Ele/{id_ele}")
	public String deleteElettronica(@PathVariable(name = "id_ele") int id_ele) {
		eleService.delete(id_ele);
		return "redirect:/";
	}
	
	@RequestMapping("delete_Lib/{id_lib}")
	public String deleteLibro(@PathVariable(name = "id_lib") int id_lib) {
		libService.delete(id_lib);
		return "redirect:/";
	}
	
//	@RequestMapping("addtocartAbb")
//	public String addtocartAbb() {
////        abbigliamento = abbService.getAbb(id_abb);
////		model.addAttribute("abbigliamento", abbigliamento);
////		model.addAttribute("id_abb", id_abb);
////		
////		AbbigliamentoJava a2= new AbbigliamentoJava();
////		a2.setId_abb(abbigliamento.getId_abb());
////		a2.setMarca(abbigliamento.getMarca());
////		a2.setTipo(abbigliamento.getTipo());
////		a2.setTaglia(abbigliamento.getTaglia());
////		a2.setColore(abbigliamento.getColore());
////		a2.setPrezzo(abbigliamento.getPrezzo());
////		carrello.getCarrello().add(a2);
////		System.out.println(carrello);
//		return "Abb";	
//	}

	

}
