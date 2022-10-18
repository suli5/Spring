package com.example.RestJpa;

import com.example.RestJpa.entities.Book;
import com.example.RestJpa.repository.BookRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;

@SpringBootApplication
public class RestJpaApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(RestJpaApplication.class, args);

		BookRepository repository = context.getBean(BookRepository.class);

		//CRUD
		//CREAR LIBRO
		Book book1 = new Book(null, "Homo Deus", "Yuval Noah", 450, 29.99, LocalDate.of(2018,12,1),true);
		Book book2 = new Book(null, "Homo Sapiens", "Yuval Noah", 450, 19.99, LocalDate.of(2013,12,1),true);

		//ALMACENAR UN LIBRO

		System.out.println("Numero de libros en la base de datos: " + repository.findAll().size());

		repository.save(book1);
		repository.save(book2);

		//RECUPERAR TODOS LOS LIBROS
		System.out.println(repository.findAll().size());

		//BORRAR UN LIBRO
		//repository.deleteById(1L);

		System.out.println("Numero de libros en la base de datos: " + repository.findAll().size());

	}

}
