package learningHibenet11;

import java.util.Scanner;
//Update the dada using Hibernet
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Driver2 {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the id");
	int id=sc.nextInt();
	Sample e=entityManager.find(Sample.class,id);
	System.out.println("Enter the Id");
	e.setId(sc.nextInt());
	System.out.println("Enter the name");
	e.setName(sc.next());
	System.out.println("Enter the number");
	e.setNumber(sc.nextLong());
	
	entityTransaction.begin();
	entityManager.merge(e);
	entityTransaction.commit();
}
}
