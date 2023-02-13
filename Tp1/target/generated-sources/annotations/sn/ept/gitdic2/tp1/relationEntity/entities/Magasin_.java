package sn.ept.gitdic2.tp1.relationEntity.entities;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sn.ept.gitdic2.tp1.relationEntity.entities.Commande;
import sn.ept.gitdic2.tp1.relationEntity.entities.Employe;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-02-12T20:59:40", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Magasin.class)
public class Magasin_ { 

    public static volatile SingularAttribute<Magasin, String> ville;
    public static volatile SingularAttribute<Magasin, String> codeZip;
    public static volatile SingularAttribute<Magasin, String> adresse;
    public static volatile SingularAttribute<Magasin, String> telephone;
    public static volatile SingularAttribute<Magasin, Integer> id;
    public static volatile SingularAttribute<Magasin, String> nom;
    public static volatile SingularAttribute<Magasin, String> etat;
    public static volatile CollectionAttribute<Magasin, Employe> employeCollection;
    public static volatile SingularAttribute<Magasin, String> email;
    public static volatile CollectionAttribute<Magasin, Commande> commandeCollection;

}