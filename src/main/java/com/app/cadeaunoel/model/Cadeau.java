package com.app.cadeaunoel.model;

import jakarta.persistence.*;

@Entity
@Table(name="cadeaux")
public class Cadeau {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String description;
    private double prix;

    @ManyToOne
    @JoinColumn(name = "liste_cadeau_id")
    private ListeCadeau listeCadeau;

    public Cadeau() {
    }

    public Cadeau(String nom, String description, double prix) {
        this.nom = nom;
        this.description = description;
        this.prix = prix;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public ListeCadeau getListeCadeau() {
        return listeCadeau;
    }

    public void setListeCadeau(ListeCadeau listeCadeau) {
        this.listeCadeau = listeCadeau;
    }

    @Override
    public String toString() {
        return "Cadeau{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", description='" + description + '\'' +
                ", prix=" + prix +
                '}';
    }
}
