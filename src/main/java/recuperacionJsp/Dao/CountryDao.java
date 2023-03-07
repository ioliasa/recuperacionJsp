package recuperacionJsp.Dao;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

import recuperacionJsp.model.Country;

public class CountryDao {
	private StandardServiceRegistry sr;
	private SessionFactory sf;
	private Session pruebaS;

	public CountryDao() {
		this.sr = new StandardServiceRegistryBuilder().configure().build();
		this.sf = new MetadataSources(sr).buildMetadata().buildSessionFactory();
		this.pruebaS = sf.openSession();
	}
	
	
	public ArrayList<Country> getList() {
		ArrayList<Country> lista= null;
		try {
			String hql = "SELECT * FROM country u";
			Query<Country> query = pruebaS.createNativeQuery(hql, Country.class);
			lista =  (ArrayList<Country>) query.getResultList();
		} catch (Exception f) {
			System.out.println("Error");
		}
		return lista;
	}

}
