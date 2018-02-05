package com.udemy.pontointeligente.api.services;

import java.util.Optional;

import com.udemy.pontointeligente.api.entities.Empresa;

public interface EmpresaService {
	
	/**
	 * Retorna uma empresa dado um CNPJ
	 * @param api
	 * @return
	 */
	Optional<Empresa> buscarPorCnpj(String cnpj);
	
	/**
	 * Cadastra uma nova empresa na base de dados
	 * @param empresa
	 * @return
	 */
	Empresa persistir(Empresa empresa);
	
}
