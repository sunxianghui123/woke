package project.action;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import project.pojo.User;
import project.util.MySessionFactory;

public class Showmessage extends ActionSupport {
	
	public String execute()
	{
		Session session = MySessionFactory.getCurrentSession();
		Transaction ts = session.beginTransaction();
		String hql = "from User where number=? and password=?";
		Query query = session.createQuery(hql);
		query.setLong(0,125);
		query.setLong(1, 111);
		List<User> list = query.list();
		ActionContext context = ActionContext.getContext();
		for(User u:list)
		{
			context.getSession().put("user",u);
		}
		ts.commit();
		
		return "success";
	}
}
