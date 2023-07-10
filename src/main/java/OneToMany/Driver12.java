package OneToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Persistence;

@Entity
class Laptop{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String brand;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
}

@Entity
class Student12{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int rno;
	private String stdname;
	private String stdphno;
	@OneToMany
	List<Laptop> l1;
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getStdname() {
		return stdname;
	}
	public void setStdname(String stdname) {
		this.stdname = stdname;
	}
	public String getStdphno() {
		return stdphno;
	}
	public void setStdphno(String stdphno) {
		this.stdphno = stdphno;
	}
	public List<Laptop> getL1() {
		return l1;
	}
	public void setL1(List<Laptop> l1) {
		this.l1 = l1;
	}
	
}
public class Driver12 {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	
	Laptop l1=new Laptop();
	l1.setBrand("Dell12");
	Laptop l2=new Laptop();
	l2.setBrand("Dell24");
	Laptop l3=new Laptop();
	l3.setBrand("Dell36");
	
	List<Laptop> m=new ArrayList<Laptop>();
	m.add(l1);
	m.add(l2);
	m.add(l3);
	
	Student12 student12=new Student12();
	student12.setStdname("MOHAN31");
	student12.setStdphno("9731269078");
	student12.setL1(m);
	
	entityTransaction.begin();
	entityManager.persist(l1);
	entityManager.persist(l2);
	entityManager.persist(l3);
	entityManager.persist(student12);
	entityTransaction.commit();
	
}
}
