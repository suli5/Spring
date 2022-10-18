package com.example.RestJpa.controller;


import com.example.RestJpa.entities.Book;
import com.example.RestJpa.repository.BookRepository;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController//ASI CREAMOS UN CONTROLADOR DE TIPO RestController
public class BookController {

    //CRUD sobre la entidad Book

    //ATRIBUTOS

    private BookRepository bookRepository;

    //CONSTRUCTORES

    public BookController(BookRepository bookRepository) {

        this.bookRepository = bookRepository;
    }

    //GETTER Y SETTER

    //Buscar todos los libros

    @GetMapping("/api/books")//SE SUELE PONER EL NOMBRE DE LA ENTIDAD EN PLURAL
    public List<Book> findAll(){//ASI RECUPERO TODOS LOS LIBROS
        //Recuperar y devolver los libros de la base de datos

        return bookRepository.findAll();

    }

    /**
     * TENEMOS
     * Request
     * Response
     *
     * @param id
     * @return
     */

    //Buscar un solo libro en base de datos en funcion de su Id
    @GetMapping("/api/books/{id}")
    public ResponseEntity<Book>  findOneById(@PathVariable Long id){
        //@PathVariable LO QUE HACE ES VINCULAR EL PARAMETRO Long id CON EL {id}

        Optional<Book> bookOpt = bookRepository.findById(id);

        //OPCION 1
        if(bookOpt.isPresent())
            return  ResponseEntity.ok(bookOpt.get());
        else
            return  ResponseEntity.notFound().build();



        /*OPCION 2:
        return bookOpt.orElse(null);
        return bookOpt.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build();

         */
    }

    //Crear un nuevo libro en base de datos
    @PostMapping("/api/books")
    public Book create(@RequestBody Book book, @RequestHeader HttpHeaders headers){
        System.out.println(headers.get("User-Agent"));
        //Guardamos el libro recibido por parametros en la base de datos
       return bookRepository.save(book);
    }
    //Actualizar un libro existente en base de datos

    //Borrar un libro en base de datos


}
