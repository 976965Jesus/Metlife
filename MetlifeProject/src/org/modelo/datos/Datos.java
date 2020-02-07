package org.modelo.datos;

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement(name="datos")
public class Datos {
	private int id;
	private String nombre;
	private String ape_pat;
	private String ape_mat;
	private String fecha_inicio;
	private String fecha_termino;
	private String descripcion;
	
	
	//CONSTRUCTORS
	public Datos() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Datos(int id, String nombre, String ape_pat, String ape_mat, String fecha_inicio, String fecha_termino,
			String descripcion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.ape_pat = ape_pat;
		this.ape_mat = ape_mat;
		this.fecha_inicio = fecha_inicio;
		this.fecha_termino = fecha_termino;
		this.descripcion = descripcion;
	}



	//GETTERS AND SETTERS
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApe_pat() {
		return ape_pat;
	}
	public void setApe_pat(String ape_pat) {
		this.ape_pat = ape_pat;
	}
	public String getApe_mat() {
		return ape_mat;
	}
	public void setApe_mat(String ape_mat) {
		this.ape_mat = ape_mat;
	}
	public String getFecha_inicio() {
		return fecha_inicio;
	}
	public void setFecha_inicio(String fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}
	public String getFecha_termino() {
		return fecha_termino;
	}
	public void setFecha_termino(String fecha_termino) {
		this.fecha_termino = fecha_termino;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}
