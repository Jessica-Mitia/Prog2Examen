package GestionGroupe;

import java.time.LocalDate;
import java.util.List;

public class Publication {
    private int id;
    private String description;
    private LocalDate date_de_creation;
    private List<Commentaire> commentaires;

    public Publication(int id, String description, List<Commentaire> commentaires) {
        this.id = id;
        this.description = description;
        this.date_de_creation = LocalDate.now();
        this.commentaires = commentaires;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getDate_de_creation() {
        return date_de_creation;
    }

    public List<Commentaire> getCommentaires() {
        return commentaires;
    }
}
