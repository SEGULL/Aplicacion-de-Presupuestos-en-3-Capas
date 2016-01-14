package pe.gob.edu.empssapal.core.dao;

import java.util.List;

//import pe.gob.edu.empssapal.core.domain.Eliminacionexedente;
import pe.gob.edu.empssapal.core.domain.Excavacion;

public class CamposaguaDAOImpl extends BaseDAOHibernate implements CamposaguaDAO{
	
//	@Override
	
	public List<Excavacion> excavacionlist() {
		return find(Excavacion.class, "FROM Excavacion");
	}
}
