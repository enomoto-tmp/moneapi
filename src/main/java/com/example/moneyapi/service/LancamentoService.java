package com.example.moneyapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.moneyapi.model.Lancamento;
import com.example.moneyapi.model.Pessoa;
import com.example.moneyapi.repository.LancamentoRepository;
import com.example.moneyapi.repository.PessoaRepository;
import com.example.moneyapi.service.exception.PessoaInexistenteOuInativaException;

@Service
public class LancamentoService {

	@Autowired
	private  PessoaRepository pessoaRepository;
	
	@Autowired
	public LancamentoRepository lancamentoRepository;
	public Lancamento salvar(Lancamento lancamento) {
		
		Pessoa pessoa = pessoaRepository.findById(lancamento.getPessoa().getCodigo()).orElse(null);
		if(pessoa == null || pessoa.isInativo()) {
			throw new PessoaInexistenteOuInativaException();
		}
		return lancamentoRepository.save(lancamento);
	}
}
