package com.universidade.pessoaapi.repository;

import com.universidade.pessoaapi.entity.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
