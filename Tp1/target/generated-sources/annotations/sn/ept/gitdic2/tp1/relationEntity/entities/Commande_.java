package sn.ept.gitdic2.tp1.relationEntity.entities;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sn.ept.gitdic2.tp1.relationEntity.entities.ArticleCommande;
import sn.ept.gitdic2.tp1.relationEntity.entities.Client;
import sn.ept.gitdic2.tp1.relationEntity.entities.Employe;
import sn.ept.gitdic2.tp1.relationEntity.entities.Magasin;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-02-12T20:59:40", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Commande.class)
public class Commande_ { 

    public static volatile SingularAttribute<Commande, Employe> vendeurId;
    public static volatile SingularAttribute<Commande, Client> clientId;
    public static volatile SingularAttribute<Commande, Integer> numero;
    public static volatile SingularAttribute<Commande, Date> dateLivraison;
    public static volatile SingularAttribute<Commande, Magasin> magasinId;
    public static volatile SingularAttribute<Commande, Date> dateCommande;
    public static volatile SingularAttribute<Commande, Date> dateLivraisonVoulue;
    public static volatile SingularAttribute<Commande, Short> statut;
    public static volatile CollectionAttribute<Commande, ArticleCommande> articleCommandeCollection;

}