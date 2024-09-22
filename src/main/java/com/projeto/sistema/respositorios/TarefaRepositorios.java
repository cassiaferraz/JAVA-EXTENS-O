package com.projeto.sistema.respositorios;

import com.projeto.sistema.modelos.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepositorios extends JpaRepository<Tarefa, Long> {
}
