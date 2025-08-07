package GestionGroupe;

import java.util.List;

public class Moderateur extends UtilisateurStandart{
    public Moderateur(String id, String nom, String email, List<Publication> publications) {
        super(id, nom, email, publications);
    }

    public void supprimerPublication(Publication publication) {
        this.getPublications().remove(publication);
    }

    public void supprimerCommentaire(Publication publication, Commentaire commentaire) {
        publication.getCommentaires().remove(commentaire);
    }
}
