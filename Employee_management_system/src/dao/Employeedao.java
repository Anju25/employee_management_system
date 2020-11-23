package dao;

import java.sql.SQLException;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import model.Employee;
import utility.HibernateConnectionManager;

public class Employeedao implements Employeedetailsdao 
{
private SessionFactory sessionFactory=HibernateConnectionManager.getSessionFactory();
	@Override
	public int add(Employee emp) throws SQLException
	{
		Session session=this.sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		if(session.save(emp)!=null)
		{
			transaction.commit();
			session.close();
			return 1;
		}
		return 0;
	}
	@Override
	public int delete(String email) 
	{
	Session session=this.sessionFactory.openSession();
	 Transaction transaction=session.beginTransaction();
	 Employee emp=session.get(Employee.class, email);
	 session.delete(emp);
	 transaction.commit();
	 session.close();
	 return 1;
	}
	
	@Override
	public Employee select(String email) {
		Session session=this.sessionFactory.openSession();
		Employee emp=session.get(Employee.class,email);
		session.close();
		return emp;
	}
	@Override
	public List<Employee> display()
	{
		Session session=this.sessionFactory.openSession();
		CriteriaBuilder builder=session.getCriteriaBuilder();
		CriteriaQuery<Employee> query=builder.createQuery(Employee.class);
		Root<Employee> root=query.from(Employee.class);
		query.select(root);
		Query<Employee> q=session.createQuery(query);
		List<Employee> list=q.getResultList();
		return list;
	}
}
