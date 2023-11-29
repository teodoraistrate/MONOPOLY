package fr.pantheonsorbonne.miage.game.monopoly.plateau.cartes;

import fr.pantheonsorbonne.miage.game.monopoly.joueur.Joueur;
import fr.pantheonsorbonne.miage.game.monopoly.joueur.PasAssezArgentException;
import fr.pantheonsorbonne.miage.game.monopoly.plateau.NomPasValideException;

public class CartePayerOuChance extends Carte {

    private static int montant;

    public CartePayerOuChance(String description, int montant) {
        super(description);
        this.montant = montant;
    }

    public static int getMontantAPayer() {
        return montant;
    }

    @Override
    public void appliquerEffet(Joueur joueur) throws PasAssezArgentException, NomPasValideException {
        if (joueur.choixPayerOuChance()) {
            
        } else {
            joueur.payer(montant);
        }
    }

    
    
}
