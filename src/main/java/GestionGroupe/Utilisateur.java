package GestionGroupe;

import java.time.LocalDate;

public class Utilisateur {
    private final String id;
    private String nom;
    private String email;
    private final LocalDate date_de_creation;

    public Utilisateur(String id, String nom, String email) {
        this.id = id;
        this.nom = nom;
        this.email = email;
        this.date_de_creation = LocalDate.now();
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
}
