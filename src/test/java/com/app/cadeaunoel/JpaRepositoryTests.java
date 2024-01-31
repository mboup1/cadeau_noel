package com.app.cadeaunoel;

import com.app.cadeaunoel.model.Cadeau;
import com.app.cadeaunoel.repository.CadeauRepository;
import com.app.cadeaunoel.repository.ListCadeauRepository;
import com.app.cadeaunoel.model.ListeCadeau;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

@SpringBootTest
class JpaRepositoryTests {

	@Autowired
	CadeauRepository cadeauRepository;

	@Autowired
	ListCadeauRepository listCadeauRepository;


	@Test
	void testAjouterCadeau() {
		Cadeau cadeau = new Cadeau("iPhone7", "iPhone 12 Pro Max", 1000);
		cadeauRepository.save(cadeau);
	}

	@Test
	void testFindAllCadeaux() {
		List<Cadeau> cadeaux = cadeauRepository.findAll();

		if (cadeaux.isEmpty()) {
			System.out.println("Aucun cadeau trouvé");
		} else {
			for (Cadeau cadeau : cadeaux) {
				System.out.println(cadeau);
			}
		}
	}


	@Test
	void testFindCadeauById() {
		Optional<Cadeau> cadeauOptional = cadeauRepository.findById(1L);
		if(cadeauOptional.isEmpty())
			System.out.println("id non trouvé");
		else {
			Cadeau cadeau = cadeauOptional.get();
			System.out.println(cadeau);
		}
	}

	@Test
	void testDeleteCadeauById() {
		cadeauRepository.deleteById(1L);
	}

	@Test
	void testUpdateCadeauById() {
		// Supposons que l'ID 1 existe déjà dans la base de données
		Optional<Cadeau> cadeauOptional = cadeauRepository.findById(2L);
		if (cadeauOptional.isPresent()) {
			Cadeau cadeau = cadeauOptional.get();
			cadeau.setPrix(1350L);
			cadeauRepository.save(cadeau);
		}
	}

	@Test
	void testManyToOneCadeau() {
		ListeCadeau listeCadeau = new ListeCadeau("jouets2");
		listCadeauRepository.save(listeCadeau);

		Cadeau cadeau2 = new Cadeau("voiture2", "une petite voiture2", 10);
		cadeau2.setListeCadeau(listeCadeau);
		cadeauRepository.save(cadeau2);

	}

}
