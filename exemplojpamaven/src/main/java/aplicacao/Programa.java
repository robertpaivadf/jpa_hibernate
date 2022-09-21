package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;


public class Programa {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa(null, "Carlos da Silva", "carlos@gmail.com");
		Pessoa p2 = new Pessoa(null, "Joaqui Torres", "joaquim@gmail.com");
		Pessoa p3 = new Pessoa(null, "Ana Maria", "ana@gmail.com");

		// cria a conexão com o bc e toda o contexto de persistêrncia
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa"); // chama essa conf. lá do
																							// persistence.xml
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3); 
		
		em.getTransaction().commit();
		System.out.println("Pronto!");
		
		
	}

}
