package com.bd.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bd.jpa.model.Tbl_MedicoT2;
import com.bd.jpa.repositorio.IMedicoRepositorio;

@Service
public class MedicoServiceImpl implements IMedicoService{
	
	@Autowired
	IMedicoRepositorio medRepo;
	
	@Override
	public void registrarMedico(Tbl_MedicoT2 medico) {
		// TODO Auto-generated method stub
		medRepo.save(medico);
	}

	@Override
	public void eliminarMedico(Tbl_MedicoT2 medico) {
		// TODO Auto-generated method stub
		medRepo.delete(medico);
	}

	@Override
	public List<Tbl_MedicoT2> listadoMedico() {
		// TODO Auto-generated method stub
		return (List<Tbl_MedicoT2>) medRepo.findAll();
	}

	@Override
	public Tbl_MedicoT2 medicoPorId(Integer id) {
		// TODO Auto-generated method stub
		return medRepo.findById(id).orElse(null);
	}

}
