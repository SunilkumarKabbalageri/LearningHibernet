package dao;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dto.Patientdto;

public class patientdao {
EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
EntityManager entityManager=entityManagerFactory.createEntityManager();
EntityTransaction entityTransaction=entityManager.getTransaction();
public void insert(int pid, String pname, String padd, long pno, String date) {
	// TODO Auto-generated method stub
	Patientdto patientdto=new Patientdto();
	patientdto.setPid(pid);
	patientdto.setPname(pname);
	patientdto.setPadd(padd);
	patientdto.setPnumber(pno);
	patientdto.setDate(date);
	entityTransaction.begin();
	entityManager.persist(patientdto);
	entityTransaction.commit();
	
	
	
}
public void Update(int pid, String pname, long pnumber) {
	// TODO Auto-generated method stub
	Patientdto e=entityManager.find(Patientdto.class, pid);
	e.setPname(pname);
	e.setPnumber(pnumber);
	entityTransaction.begin();
	entityManager.merge(e);
	entityTransaction.commit();
}
public void Remove(int pid) {
	// TODO Auto-generated method stub
	Patientdto e=entityManager.find(Patientdto.class, pid);
	if(e!=null){
		entityTransaction.begin();
		entityManager.remove(e);
		entityTransaction.commit();
	}
	else{
		System.out.println("DATA not found");
	}
}
public void fetchAll() {
	// TODO Auto-generated method stub
	 Query e=entityManager.createQuery("select a from Patientdto a");
	 //java persistence Query Language...
	 List<Patientdto> l1=e.getResultList();
	 
	for(Patientdto p1:l1){
		System.out.println(p1);
	}
	
}
public void deleteAll() {
	// TODO Auto-generated method stub
	Query q=entityManager.createQuery("delete from Patientdto");
	entityTransaction.begin();
	q.executeUpdate();
	entityTransaction.commit();
	
}

}
