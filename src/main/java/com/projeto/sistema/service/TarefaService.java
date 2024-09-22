package com.projeto.sistema.service;

import com.projeto.sistema.modelos.Tarefa;
import com.projeto.sistema.respositorios.TarefaRepositorios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarefaService {

    @Autowired
    private TarefaRepositorios tarefaRepositorios;

    public List<Tarefa> listarTarefas() {
        return tarefaRepositorios.findAll();
    }

    public void salvarTarefa(Tarefa tarefa) {
    	tarefaRepositorios.save(tarefa);
    }
}
