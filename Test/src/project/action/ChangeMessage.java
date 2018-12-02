package project.action;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.opensymphony.xwork2.ActionSupport;

import project.util.MySessionFactory;

public class ChangeMessage extends ActionSupport {
	private String name;
	private String sex;
	private String department;
	private String grade;
	private String number;
	
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String execute()
	{
		String s="success";
		Session session = MySessionFactory.getCurrentSession();
		Transaction ts = session.beginTransaction();
		String hql="update User set name=?,sex=?,department=?,grade=? where number=? ";
		Query query = session.createQuery(hql);
		query.setString(0,name);
		query.setString(1,sex);
		query.setString(2,department);
		query.setString(3,grade);
		query.setString(4,number);
		query.executeUpdate();
		ts.commit();
		if(session.isOpen())
			session.close();
		return s;
	}
}
