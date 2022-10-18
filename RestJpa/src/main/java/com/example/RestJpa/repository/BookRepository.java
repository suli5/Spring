package com.example.RestJpa.repository;

import com.example.RestJpa.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {//NOTA: LA SINTAXIS ES LA SIGUIENTE: JpaRepository<Nombre de la clase, tipo del Id>

}
