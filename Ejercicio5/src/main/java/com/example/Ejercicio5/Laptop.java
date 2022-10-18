package com.example.Ejercicio5;

import javax.persistence.*;

@Entity
@Table(name = "Laptop")
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String marca;
    private String sistemaOperativo;

    public Laptop() {
    }

    public Laptop(Long id, String marca, String sistemaOperativo) {
        this.id = id;
        this.marca = marca;
        this.sistemaOperativo = sistemaOperativo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }


}
