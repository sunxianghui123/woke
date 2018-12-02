package Test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import project.pojo.User;

public class Test {
	public static void main(String[] args)
	{
		Configuration con = new Configuration().configure();
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction ts = session.beginTransaction();
		
		String hql = "from User where number=? and password=?";
		Query query = session.createQuery(hql);
		query.setLong(0, 111);
		query.setLong(1, 123);
		List<User> list = query.list();
		for(User user:list)
		{
			System.out.println(user.getName());
			System.out.println(user.getNumber());
			System.out.println(user.getPassword());
			System.out.println(user.getSex());
		}
		ts.commit();
		session.close();
	}
}
