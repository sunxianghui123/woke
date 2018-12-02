package project.action;

import java.util.Map;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import project.pojo.User;
import project.util.MySessionFactory;

public class ChangePassowrd extends ActionSupport {
	private String oldpassword;
	private String newpassword;
	private String checkpassword;
	
	public String getOldpassword() {
		return oldpassword;
	}

	public void setOldpassword(String oldpassword) {
		this.oldpassword = oldpassword;
	}

	public String getNewpassword() {
		return newpassword;
	}

	public void setNewpassword(String newpassword) {
		this.newpassword = newpassword;
	}

	public String getCheckpassword() {
		return checkpassword;
	}

	public void setCheckpassword(String checkpassword) {
		this.checkpassword = checkpassword;
	}

	public String execute()
	{
		String res="success";
		Session session = MySessionFactory.getCurrentSession();
		Transaction ts = session.beginTransaction();
		ActionContext context = ActionContext.getContext();
		User user = (User)context.getSession().get("user");
		int number = user.getNumber();
		String hql = "update User set password=? where number=? and password=?";
		Query query = session.createQuery(hql);
		query.setString(0, newpassword);
		query.setLong(1,number);
		query.setString(2,oldpassword);
		int bn = query.executeUpdate();
		if(bn>0){}
		else
		{
			res="error";
		}
		ts.commit();
		if(session.isOpen())
		{
			session.close();
		}
		return res;
	}
}
