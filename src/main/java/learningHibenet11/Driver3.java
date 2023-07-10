package learningHibenet11;
//Remove the data from hibernet
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Driver3 {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the id");
	int id=sc.nextInt();
	Sample e=entityManager.find(Sample.class, id);
	entityTransaction.begin();
	entityManager.remove(e);
	entityTransaction.commit();
	
	
}
}
