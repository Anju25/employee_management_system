package dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.Query;
import model.Admin;
import utility.HibernateConnectionManager;

public class Admindao  implements AdmindaoInterface
{
private SessionFactory sessionFactory=HibernateConnectionManager.getSessionFactory();
	@Override
	public int signUp(Admin admin) 
	{
		Session session=this.sessionFactory.openSession();
		Transaction transaction =session.beginTransaction();
		if(session.save(admin)!=null)
		{
			transaction.commit();
			session.close();
			return 1;
		}
		else
		return 0;
	}

	@Override
	public boolean loginUser(Admin admin) 
	{
	  Session session=this.sessionFactory.openSession();
	  Transaction transaction=null;
	  try
	  {
		  transaction=session.getTransaction();
		  transaction.begin();
		  Query query=session.createQuery(
				  "from useradmin where email='" + admin.getUsername() + "' password='" + admin.getPassword() +"'");
	      admin=(Admin) query.uniqueResult();
	      
	      transaction.commit();
	      session.close();
	      return true;
	  }catch(Exception e)
	  {
		  if(transaction!=null)
		  {
			  transaction.rollback();
			  session.close();
		  }
		  e.printStackTrace();
	  }
		return false;
	}

}
