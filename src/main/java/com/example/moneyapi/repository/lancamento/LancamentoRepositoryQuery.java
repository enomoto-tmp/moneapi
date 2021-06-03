package com.example.moneyapi.repository.lancamento;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.moneyapi.model.Lancamento;
import com.example.moneyapi.repository.filter.LancamentoFilter;

public interface LancamentoRepositoryQuery  {

	public Page<Lancamento>filtrar(LancamentoFilter lancamentoFilter, Pageable pageable);
	
}
