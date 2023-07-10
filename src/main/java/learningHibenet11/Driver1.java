package learningHibenet11;

import java.util.Scanner;
//insert the data into the table using hibernet.
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Driver1 {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Scanner sc=new Scanner(System.in);
		Sample sample=new Sample();
		System.out.println("Enter the id");
		sample.setId(sc.nextInt());
		System.out.println("Enter the name");
		sample.setName(sc.next());
		System.out.println("Enter the number");
		sample.setNumber(sc.nextLong());
		
		entityTransaction.begin();
		entityManager.persist(sample);
		entityTransaction.commit();
		
	}


 
 
 
  
 



}
