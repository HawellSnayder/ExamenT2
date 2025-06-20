package com.bd.jpa.service;

import java.util.List;

import com.bd.jpa.model.Tbl_MedicoT2;

public interface IMedicoService {
	void registrarMedico(Tbl_MedicoT2 medico);
	void eliminarMedico(Tbl_MedicoT2 medico);
	List<Tbl_MedicoT2> listadoMedico();
	Tbl_MedicoT2 medicoPorId(Integer id);
}
