package pe.gob.edu.empssapal.core.dao;

import java.util.List;

import pe.gob.edu.empssapal.core.domain.Cajamedidor;
import pe.gob.edu.empssapal.core.domain.Cajaregistradora;
import pe.gob.edu.empssapal.core.domain.Camaapoyo;
import pe.gob.edu.empssapal.core.domain.Camposagua;
import pe.gob.edu.empssapal.core.domain.Camposalcantarillado;
import pe.gob.edu.empssapal.core.domain.Eliminacionexedente;
import pe.gob.edu.empssapal.core.domain.Empalmered;
import pe.gob.edu.empssapal.core.domain.Excavacion;
import pe.gob.edu.empssapal.core.domain.Pruebahidraulica;
import pe.gob.edu.empssapal.core.domain.Relleno;
import pe.gob.edu.empssapal.core.domain.Reposicion;
import pe.gob.edu.empssapal.core.domain.Rotura;
import pe.gob.edu.empssapal.core.domain.Tendido;
import pe.gob.edu.empssapal.core.domain.Tipopista;
import pe.gob.edu.empssapal.core.domain.Vereda;

public class CamposaguaDAOImpl extends BaseDAOHibernate implements CamposaguaDAO{
	
//	@Override

	//campos presupuesto alcantarillado
	
	public void guardandopresupuestoalcantarillado(Camposalcantarillado camposalcantarillado){
		this.save(camposalcantarillado);
	}
	
	public List<Vereda> Listarveredawherealcantarillado(){
		return find(Vereda.class, "FROM Vereda where TipoServicioVere='Alcantarillado' ");
	}
	public List<Tipopista> Listartipopistaalcantarillado(){
		return find(Tipopista.class, "FROM Tipopista where Tiposerviciopista='Alcantarillado'");
	}
	public List<Empalmered> Listarempalme6alcantarillado(){
		return find(Empalmered.class, "FROM Empalmered where TipoServicioEmpalme='Alcantarillado' and NombreDiametro='6'");
	}
	public List<Empalmered> Listarempalme160alcantarillado(){
		return find(Empalmered.class, "FROM Empalmered where TipoServicioEmpalme='Alcantarillado' and NombreDiametro='160'");
	}
	public List<Empalmered> Listarempalme200alcantarillado(){
		return find(Empalmered.class, "FROM Empalmered where TipoServicioEmpalme='Alcantarillado' and NombreDiametro='200'");
	}
	
	
	//campos presupuesto agua
	
	public void guardandopresupuestoagua(Camposagua campoagua){
		this.save(campoagua);
	}
	
	public List<Vereda> Listarveredawhere(){
		return find(Vereda.class, "FROM Vereda where TipoServicioVere='Agua' ");
	}
	public List<Tipopista> Listartipopista(){
		return find(Tipopista.class, "FROM Tipopista where Tiposerviciopista='Agua'");
	}
	public List<Empalmered> Listarempalme(){
		return find(Empalmered.class, "FROM Empalmered where TipoServicioEmpalme='Agua' and NombreDiametro='15'");
	}
	public List<Empalmered> Listarempalme20(){
		return find(Empalmered.class, "FROM Empalmered where TipoServicioEmpalme='Agua' and NombreDiametro='20'");
	}
	public List<Empalmered> Listarempalme25(){
		return find(Empalmered.class, "FROM Empalmered where TipoServicioEmpalme='Agua' and NombreDiametro='25'");
	}
	public List<Empalmered> Listarempalme38(){
		return find(Empalmered.class, "FROM Empalmered where TipoServicioEmpalme='Agua' and NombreDiametro='38'");
	}
	//Excavacion  where Tiposerviciopista='Agua'
	public List<Excavacion> excavacionlist() {
		return find(Excavacion.class, "FROM Excavacion");
	}
	
	public Excavacion FindIdExcavacion(int IdEscavacion){
		StringBuffer queryBuffer = new StringBuffer();
		queryBuffer.append(" FROM Excavacion  WHERE IdEscavacion=" + IdEscavacion);
		return findFirst(Excavacion.class, queryBuffer.toString());
	}
	public void updateexcavcacion(Excavacion excava){
		this.update(excava);
	}
	//Caja medidora
	public List<Cajamedidor> Cajamedidorlist(){
		return find(Cajamedidor.class, "FROM Cajamedidor");
	}
	public Cajamedidor FindIdCajamedidor(int IdCajaMedidor){
		StringBuffer queryBuffer = new StringBuffer();
		queryBuffer.append(" FROM Cajamedidor  WHERE IdCajaMedidor=" + IdCajaMedidor);
		return findFirst(Cajamedidor.class, queryBuffer.toString());
	}
	public void updateCajamedidor(Cajamedidor caja){
		this.update(caja);
	}

	//Caja registradora
	public List<Cajaregistradora> cajaregistradoralist(){
		return find(Cajaregistradora.class, "FROM Cajaregistradora");
	}
	public Cajaregistradora FindIdCajaRegistradora(int IdCajaRegistradora){
		StringBuffer queryBuffer = new StringBuffer();
		queryBuffer.append(" FROM Cajaregistradora  WHERE IdCajaRegistradora=" + IdCajaRegistradora);
		return findFirst(Cajaregistradora.class, queryBuffer.toString());
	}
	public void updateCajaregistradora(Cajaregistradora cajare){
		this.update(cajare);
	}
	//Camaapoyo
	public List<Camaapoyo> Camaapoyolist(){
		return find(Camaapoyo.class, "FROM Camaapoyo");
	}
	public Camaapoyo FindIdCamaapoyo(int IdCama){
		StringBuffer queryBuffer = new StringBuffer();
		queryBuffer.append(" FROM Camaapoyo  WHERE IdCama=" + IdCama);
		return findFirst(Camaapoyo.class, queryBuffer.toString());
	}
	public void updateCamaapoyo(Camaapoyo cama){
		this.update(cama);
	}
	//Eliminacionexedente
		public List<Eliminacionexedente> Eliminacionexedentelist(){
			return find(Eliminacionexedente.class, "FROM Eliminacionexedente");
		}
		public Eliminacionexedente FindIdEliminacionexedente(int IdEliminacion){
			StringBuffer queryBuffer = new StringBuffer();
			queryBuffer.append(" FROM Eliminacionexedente  WHERE IdEliminacion=" + IdEliminacion);
			return findFirst(Eliminacionexedente.class, queryBuffer.toString());
		}
		public void updateEliminacionexedente(Eliminacionexedente eliminacion){
			this.update(eliminacion);
		}
	
		//Empalmered
		public List<Empalmered> Empalmeredlist(){
			return find(Empalmered.class, "FROM Empalmered");
		}
		public Empalmered FindIdEmpalmered(int IdEmpalmeRed){
			StringBuffer queryBuffer = new StringBuffer();
			queryBuffer.append(" FROM Empalmered  WHERE IdEmpalmeRed=" + IdEmpalmeRed);
			return findFirst(Empalmered.class, queryBuffer.toString());
		}
		public void updateEmpalmered(Empalmered empalme){
			this.update(empalme);
		}
		
		//Pruebahidraulica
				public List<Pruebahidraulica> PruebaHidraulicalist(){
					return find(Pruebahidraulica.class, "FROM Pruebahidraulica");
				}
				public Pruebahidraulica FindIdPruebahidraulica(int IdPruebaHidraulica){
					StringBuffer queryBuffer = new StringBuffer();
					queryBuffer.append(" FROM Pruebahidraulica  WHERE IdPruebaHidraulica=" + IdPruebaHidraulica);
					return findFirst(Pruebahidraulica.class, queryBuffer.toString());
				}
				public void updatePruebahidraulica(Pruebahidraulica empalme){
					this.update(empalme);
				}
				//Relleno
				public List<Relleno> Rellenolist(){
					return find(Relleno.class, "FROM Relleno");
				}
				public Relleno FindIdRelleno(int IdRelleno){
					StringBuffer queryBuffer = new StringBuffer();
					queryBuffer.append(" FROM Relleno  WHERE IdRelleno=" + IdRelleno);
					return findFirst(Relleno.class, queryBuffer.toString());
				}
				public void updateRelleno(Relleno relleno){
					this.update(relleno);
				}
				//Reposicion
				public List<Reposicion> Reposicionlist(){
					return find(Reposicion.class, "FROM Reposicion");
				}
				public Reposicion FindIdReposicion(int IdReposicion){
					StringBuffer queryBuffer = new StringBuffer();
					queryBuffer.append(" FROM Reposicion  WHERE IdReposicion=" + IdReposicion);
					return findFirst(Reposicion.class, queryBuffer.toString());
				}
				public void updateReposicion(Reposicion reposicion){
					this.update(reposicion);
				}
//				Rotura
				public List<Rotura> Roturalist(){
					return find(Rotura.class, "FROM Rotura");
				}
				public Rotura FindIdRotura(int IdRotura){
					StringBuffer queryBuffer = new StringBuffer();
					queryBuffer.append(" FROM Rotura  WHERE IdRotura=" + IdRotura);
					return findFirst(Rotura.class, queryBuffer.toString());
				}
				public void updateRotura(Rotura rotura){
					this.update(rotura);
				}

//				Tendido
				public List<Tendido> Tendidolist(){
					return find(Tendido.class, "FROM Tendido");
				}
				public Tendido FindIdTendido(int IdTendido){
					StringBuffer queryBuffer = new StringBuffer();
					queryBuffer.append(" FROM Tendido  WHERE IdTendido=" + IdTendido);
					return findFirst(Tendido.class, queryBuffer.toString());
				}
				public void updateTendido(Tendido tendido){
					this.update(tendido);
				}

				//				Vereda
				public List<Vereda> Veredalist(){
					return find(Vereda.class, "FROM Vereda");
				}
				public Vereda FindIdVereda(int IdVereda){
					StringBuffer queryBuffer = new StringBuffer();
					queryBuffer.append(" FROM Vereda  WHERE IdVereda=" + IdVereda);
					return findFirst(Vereda.class, queryBuffer.toString());
				}
				public void updateVereda(Vereda vereda){
					this.update(vereda);
				}
}