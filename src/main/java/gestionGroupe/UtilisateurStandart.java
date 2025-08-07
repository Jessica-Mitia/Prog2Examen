package gestionGroupe;

import java.util.List;

public class UtilisateurStandart extends Utilisateur {

    public UtilisateurStandart(String id, String nom, String email, List<Publication> publications) {
        super(id, nom, email, publications);
    }

    public void creerPublication(Publication publication) {
        super.getPublications().add(publication);
    }

    public void commenterPublication(Publication publication, Commentaire commentaire) {
        publication.getCommentaires().add(commentaire);
    }
}
