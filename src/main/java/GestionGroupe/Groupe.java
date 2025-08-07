package GestionGroupe;

import java.util.List;

public class Groupe {
    private String nom;
    private List<Utilisateur> utilisateurs;

    public Groupe(String nom, List<Utilisateur> utilisateurs) {
        this.nom = nom;
        this.utilisateurs = utilisateurs;
    }

    public List<Utilisateur> getUtilisateurs() {
        return utilisateurs;
    }

    public String getNom() {
        return nom;
    }

    public Publication chercherPublication(String mot) {
        final Publication[] result = {null};
        utilisateurs.forEach(utilisateur -> {
            utilisateur.getPublications().forEach(publication -> {
                if (publication.getDescription().toLowerCase().contains(mot.toLowerCase())){
                    result[0] = publication;
                }
            });
        });
        return result[0];
    }

    public boolean presenceUtilisateur(Utilisateur utilisateur) {
        for (Utilisateur utilisateur1 : utilisateurs) {
            if (utilisateur1.getId().equals(utilisateur.getId())) {
                if (utilisateur1.getNom().equals(utilisateur.getNom())) {
                    if(utilisateur1.getEmail().equals(utilisateur.getEmail())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int nombreDePublications() {
        int total = 0;
        for (Utilisateur utilisateur : utilisateurs) {
            total += utilisateur.getPublications().size();
        }
        return total;
    }
}
