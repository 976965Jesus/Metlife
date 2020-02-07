package org.dao.datos;

import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.modelo.datos.Datos;

public class DaoDatos {
	private static ObjectMapper mapper = new ObjectMapper();
	
	
	@SuppressWarnings("unchecked")
	public List<Datos> listDatos() {
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.getCurrentSession();
		List<Datos> dato = null;
		try {
			session.beginTransaction();
			dato = (List<Datos>) session.createQuery("from Datos").list();
			session.getTransaction().commit();
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}
		return dato;
	}
	
	
	public <T> T convertJsonToJavaObject(String jsonString, Class<T> cls) {
		T result = null;
		try {
			result = mapper.readValue(jsonString, cls);
		} catch (JsonParseException e) {
			System.out.println("EXCEPTION OCURRED WHILE CONVERT JSON TO JAVA OBJECT" + e.getMessage());
			e.printStackTrace();
		} catch (JsonMappingException e) {
			System.out.println("EXCEPTION OCURRED WHILE CONVERT JSON TO JAVA OBJECT" + e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("EXCEPTION OCURRED WHILE CONVERT JSON TO JAVA OBJECT" + e.getMessage());
			e.printStackTrace();
		}
		return result;
	}
}
