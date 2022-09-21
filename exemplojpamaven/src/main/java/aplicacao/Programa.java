package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;


public class Programa {

	public static void main(String[] args) {
		
		// cria a conexão com o bc e toda o contexto de persistêrncia
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa"); // chama essa conf. lá do
		EntityManager em = emf.createEntityManager();

		Pessoa p = em.find(Pessoa.class, 2);
		
		System.out.println(p);
		
		System.out.println("Pronto!");
		em.close();
		emf.close();
		
		
	}

}
