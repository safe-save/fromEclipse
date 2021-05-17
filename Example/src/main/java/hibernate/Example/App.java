package hibernate.Example;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App {

	public static void main(String[] args) {
		System.out.println("hey");
		
		Developer insertdev1=new Developer();
		insertdev1.setName("new me");
		insertdev1.setPsid(19973);
		insertdev1.setRole("Developer");
		
		Configuration con = new Configuration().configure().addAnnotatedClass(Developer.class);
		
		SessionFactory sf= con.buildSessionFactory();
		
		Session session=sf.openSession();
		
		Transaction tx= session.beginTransaction();
		
		session.save(insertdev1);
		
		tx.commit();
		
		System.out.println("\nnew developer is added to database successfully..!!\n");
		
		Developer showdev1=null;
		
		showdev1=session.get(Developer.class, 39973);
		
		System.out.println("\nold developer from database is fetched successfully by his psid..!!\n");
		
		System.out.println(showdev1);
		

	}

}
