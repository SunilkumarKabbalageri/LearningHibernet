package learningHibenet11;
//Fetch all the records from the table
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Driver4 {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Query x = entityManager.createQuery("select q from Sample q");
		List<Sample> l1 = x.getResultList();

		for (Sample s1 : l1) {
			System.out.println(s1);
		}

	}
}
