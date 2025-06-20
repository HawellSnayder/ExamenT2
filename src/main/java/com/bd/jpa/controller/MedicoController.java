package com.bd.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bd.jpa.model.Tbl_MedicoT2;
import com.bd.jpa.service.IMedicoService;


@Controller
@RequestMapping("/vistas")
public class MedicoController {
	
	@Autowired
	IMedicoService medServ;
	@GetMapping("/ListadoMedicos")
	public String ListadoMedicos(Model modelo) {
		modelo.addAttribute("medico",medServ.listadoMedico());
		return "/vistas/ListadoMedicos";
	}
	@GetMapping("/RegistrarMedico")
	public String RegistarMedico(Model modelo) {
		Tbl_MedicoT2 medico=new Tbl_MedicoT2();
		modelo.addAttribute("regmedico",medico);
		return "/vistas/FrmRegistroMedico";
	}
	@PostMapping("/GuardarMedico")
	public String GuardarProducto(@ModelAttribute Tbl_MedicoT2 medico,Model modelo) {
		medServ.registrarMedico(medico);
		return "redirect:/vistas/ListadoMedicos";
	}
}
