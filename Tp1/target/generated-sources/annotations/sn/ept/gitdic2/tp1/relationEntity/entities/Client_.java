package sn.ept.gitdic2.tp1.relationEntity.entities;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sn.ept.gitdic2.tp1.relationEntity.entities.Commande;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-02-12T20:59:40", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Client.class)
public class Client_ { 

    public static volatile SingularAttribute<Client, String> ville;
    public static volatile SingularAttribute<Client, String> codeZip;
    public static volatile SingularAttribute<Client, String> adresse;
    public static volatile SingularAttribute<Client, String> telephone;
    public static volatile SingularAttribute<Client, Integer> id;
    public static volatile SingularAttribute<Client, String> prenom;
    public static volatile SingularAttribute<Client, String> nom;
    public static volatile SingularAttribute<Client, String> etat;
    public static volatile SingularAttribute<Client, String> email;
    public static volatile CollectionAttribute<Client, Commande> commandeCollection;

}