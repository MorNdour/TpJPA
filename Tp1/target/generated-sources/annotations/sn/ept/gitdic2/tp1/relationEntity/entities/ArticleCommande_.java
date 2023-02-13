package sn.ept.gitdic2.tp1.relationEntity.entities;

import java.math.BigDecimal;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sn.ept.gitdic2.tp1.relationEntity.entities.ArticleCommandePK;
import sn.ept.gitdic2.tp1.relationEntity.entities.Commande;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-02-12T20:59:40", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(ArticleCommande.class)
public class ArticleCommande_ { 

    public static volatile SingularAttribute<ArticleCommande, Integer> produitId;
    public static volatile SingularAttribute<ArticleCommande, ArticleCommandePK> articleCommandePK;
    public static volatile SingularAttribute<ArticleCommande, BigDecimal> prixDepart;
    public static volatile SingularAttribute<ArticleCommande, BigDecimal> remise;
    public static volatile SingularAttribute<ArticleCommande, Commande> commande;
    public static volatile SingularAttribute<ArticleCommande, Integer> quantite;

}