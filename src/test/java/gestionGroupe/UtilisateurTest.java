package gestionGroupe;

import GestionGroupe.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class UtilisateurTest {
    Commentaire commentaire = new Commentaire(1, "wow");
    Commentaire commentaire2 = new Commentaire(2, "serieux");
    List<Commentaire> commentaireList = List.of(commentaire2);
    List<Commentaire> commentaireList2 = List.of(commentaire, commentaire2);

    Publication publication = new Publication(1, "incendie à Antaninarenina", commentaireList);
    Publication publication2 = new Publication(2, "vol de téléphone", commentaireList);
    List<Publication> publications = List.of(publication, publication2);


    UtilisateurStandart koto = new UtilisateurStandart("001", "Koto", "koto@gmail.com", publications);
    UtilisateurStandart bema = new UtilisateurStandart("005", "Bema", "bema@gmail.com", publications);
    Publication publication3 = new Publication(3, "promotion au superU", commentaireList);

    Publication publication4 = new Publication(4, "promotion au supermaki", commentaireList2);
    List<Publication> publications2 = List.of(publication4);
    Moderateur moderateur = new Moderateur("002", "Soa", "soa@gmail.com", publications2);

    Administrateur administrateur = new Administrateur("745", "Carina", "carina@gmail.com", publications2);
    List<Utilisateur> utilisateurs = List.of(administrateur, moderateur, koto, bema);
    Groupe groupe = new Groupe("Geek club", utilisateurs);

    @Test
    public void creerPublicationTest() {
        koto.creerPublication(publication3);
        assertEquals(publication3, koto.getPublications().get(2));
    }

    @Test
    public void ajouterCommentaireTest() {
        koto.commenterPublication(publication3, commentaire);
        assertEquals(commentaire, publication3.getCommentaires().get(1));
    }

    @Test
    public void suppmerCommentaireTest() {
        moderateur.supprimerCommentaire(publication4, commentaire);
        assertArrayEquals(commentaireList.toArray(), publication4.getCommentaires().toArray());
    }

    @Test
    public void supprimerUtilisateurTest() {
        List<Utilisateur> result = List.of(administrateur, moderateur, bema);
        administrateur.supprimerUtilisateur(koto, groupe);
        assertArrayEquals(result.toArray(), groupe.getUtilisateurs().toArray());
    }
}
