package pe.gob.edu.empssapal.core.dao.test;

import org.springframework.beans.factory.annotation.Autowired;

import pe.gob.edu.empssapal.core.dao.CamposaguaDAO;

public class CamposaguaDAOtest extends AbstractUnitTest{

	@Autowired
	protected CamposaguaDAO camposaguaDAO;

	public void testEspecificacionList() {
		
		System.out.println("::::: " + camposaguaDAO.excavacionlist());
	
	}
}
