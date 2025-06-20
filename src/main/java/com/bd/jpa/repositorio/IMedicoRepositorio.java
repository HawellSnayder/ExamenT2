package com.bd.jpa.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bd.jpa.model.Tbl_MedicoT2;
@Repository
public interface IMedicoRepositorio extends CrudRepository<Tbl_MedicoT2,Integer>{

}
