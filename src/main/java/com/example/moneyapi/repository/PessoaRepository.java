package com.example.moneyapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.moneyapi.model.Categoria;
import com.example.moneyapi.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

}
