package com.example.api.controller;

import com.example.codegen.api.LibrosApi;
import com.example.codegen.dto.BookDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/libros")
@CrossOrigin(origins = "*")
public class BookController implements LibrosApi {

    @GetMapping
    public ResponseEntity<List<BookDTO>> librosGet() {

        BookDTO libro1 = BookDTO.builder().id("1").titulo("El principito").autor("Antoine de Saint").build();
        BookDTO libro2 = BookDTO.builder().id("2").titulo("La Divina Comedia").autor("Dante Alighieri").build();
        List<BookDTO> libros = Arrays.asList(libro1, libro2);

        return ResponseEntity.ok(libros);
    }

}
