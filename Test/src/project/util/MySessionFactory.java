package project.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

final public class MySessionFactory {
	private static SessionFactory sessionFactory=null;
	//ThreadLocal线程局部模式
	 private static  ThreadLocal<Session>  threadlocal=new ThreadLocal<Session>();
	static {
		sessionFactory=new Configuration().configure().buildSessionFactory();
	}
	
	
	private MySessionFactory() {
		
	}
	
	public static  Session openSession() {
		return sessionFactory.openSession();
	}
	public static Session getCurrentSession(){
		Session session=threadlocal.get();
		if(session==null) {
			session=sessionFactory.openSession();
			threadlocal.set(session);
		}
		return  session;
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

}
