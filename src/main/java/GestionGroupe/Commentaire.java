package GestionGroupe;

import java.time.LocalDate;

public class Commentaire {
    private int id;
    private String contenu;
    private LocalDate date;

    public Commentaire(int id, String contenu) {
        this.id = id;
        this.contenu = contenu;
        this.date = LocalDate.now();
    }

    public int getId() {
        return id;
    }

    public String getContenu() {
        return contenu;
    }

    public LocalDate getDate() {
        return date;
    }
}
