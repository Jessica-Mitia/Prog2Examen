package GestionGroupe;

import java.time.LocalDate;
import java.util.List;

public class Utilisateur {
    private final String id;
    private String nom;
    private String email;
    private final LocalDate date_de_creation;
    private List<Publication> publications;

    public Utilisateur(String id, String nom, String email, List<Publication> publications) {
        this.id = id;
        this.nom = nom;
        this.email = email;
        this.date_de_creation = LocalDate.now();
        this.publications = publications;
    }

    public String getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getDate_de_creation() {
        return date_de_creation;
    }

    public List<Publication> getPublications() {
        return publications;
    }
}
