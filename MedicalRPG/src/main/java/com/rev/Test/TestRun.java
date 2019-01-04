package com.rev.Test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.rev.Beans.Player;
import com.rev.Dao.PlayerDao;
import com.rev.DaoImpl.PlayerDaoImpl;
import com.rev.Hibernate.HibernateTest;
import com.rev.Singleton.Single;

public class TestRun {

	public TestRun() {
		// TODO Auto-generated constructor stub
	}
	public static void main (String[] args) {
		Single.instance().Dummy();
		PlayerDao use = new PlayerDaoImpl();
		SessionFactory sf = HibernateTest.getSession();
		//System.out.println(use.getallPlayers());	
		System.out.println(use.getPlayerbyID(10200));
		funWithSessions(sf);
	}
	static void funWithSessions(SessionFactory sf)
	{
		Session s =sf.getCurrentSession();
		Transaction tx = s.beginTransaction();
		Player p1 = s.get(Player.class, 33);
		System.out.println(p1);
		Player p2 = s.get(Player.class, 34);
		System.out.println(p2);
		Player p3 = s.load(Player.class, 10360);
		System.out.println(p3);
		System.out.println(s.save(p3)); //adds a new one
		Player p4 = s.get(Player.class, 10360);
		p4.setEmail("Boom.com");
		tx.commit();
		s.close();
	}

}
