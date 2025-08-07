package GestionGroupe;

import java.util.List;

public class Administrateur extends Moderateur{

    public Administrateur(String id, String nom, String email, List<Publication> publications) {
        super(id, nom, email, publications);
    }

    public void supprimerUtilisateur(Utilisateur utilisateur, Groupe groupe) {
        groupe.getUtilisateurs().remove(utilisateur);
    }
}
