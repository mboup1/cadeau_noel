package com.app.cadeaunoel.model;


import jakarta.persistence.*;

@Entity
@Table(name="liste_cadeaux")
public class ListeCadeau {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;

    public ListeCadeau() {
    }

    public ListeCadeau(String nom) {
        this.nom = nom;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "ListeCadeau{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                '}';
    }
}
