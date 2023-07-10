package onetoone;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main1 {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	Scanner sc=new Scanner(System.in);
	
	Pancard pancard=new Pancard();
	System.out.println("Enter the address");
	pancard.setAddress(sc.next());
	System.out.println("Enter the id");
	pancard.setId(sc.nextInt());
	System.out.println("Enter the mob_no");
	pancard.setMobileno(sc.next());
	
	Person person=new Person();
	person.setP(pancard);
	System.out.println("Enter the name");
	person.setPname(sc.next());
	
	entityTransaction.begin();
	entityManager.persist(person);
	entityManager.persist(pancard);
	entityTransaction.commit();
}
}
