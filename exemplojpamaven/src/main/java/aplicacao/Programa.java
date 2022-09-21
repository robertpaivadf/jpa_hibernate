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

		//pesquisando uma pessoa	
		Pessoa p = em.find(Pessoa.class, 2);
		
		System.out.println(p);
		
		//deletando uma pessoa
		em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();
		
		System.out.println("Pronto!");
		em.close();
		emf.close();
		
		
	}

}
