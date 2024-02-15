package br.com.herissonnogueira.dao;

import java.util.List;

import br.com.herissonnogueira.domain.Curso;
import br.com.herissonnogueira.domain.Matricula;

/**
 * @author herisson.nogueira
 *
 */

public interface IMatriculaDao {

	Matricula cadastrar(Matricula mat);
	
	Matricula buscarPorCodigoCurso(String codigoCurso);
	
	Matricula buscarPorCurso(Curso curso);
	
	Matricula buscarPorCodigoCursoCriteria(String codigoCurso);
	
	Matricula buscarPorCursoCriteria(Curso curso);
	
	List<Matricula> buscarTodos();
	
	void excluir(Matricula matricula);
}
