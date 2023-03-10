package sn.ept.git.dic2.hellodic2;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.util.Objects;

@Entity
public class Eleve implements Serializable {
    @Id
    private String numero;
    private String prenom;
    private String nom;
    private Double poids;

    public Eleve(String numero, String prenom, String nom, Double poids) {
        this.numero = numero;
        this.prenom = prenom;
        this.nom = nom;
        this.poids = poids;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Eleve() {
    }

    public Eleve(String prenom, String nom, Double poids) {
        this.prenom = prenom;
        this.nom = nom;
        this.poids = poids;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Double getPoids() {
        return poids;
    }

    public void setPoids(Double poids) {
        this.poids = poids;
    }

    @Override
    public String toString() {
        return "Eleve{" +
                "prenom='" + prenom + '\'' +
                ", nom='" + nom + '\'' +
                ", poids=" + poids +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Eleve eleve = (Eleve) o;
        return numero.equals(eleve.numero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero);
    }
}
