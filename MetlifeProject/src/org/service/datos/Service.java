package org.service.datos;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.dao.datos.DaoDatos;
import org.modelo.datos.Datos;

@Path("/service")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class Service {
	private DaoDatos dao = new DaoDatos();
	
	// URI: http://MetlifeProject/service/datos/nombre
	@GET
	@Path("/datos")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Datos> getDatos() {
		return dao.listDatos();
	}
}
