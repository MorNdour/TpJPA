package sn.ept.gitdic2.tp1.relationEntity.entities;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sn.ept.gitdic2.tp1.relationEntity.entities.Commande;
import sn.ept.gitdic2.tp1.relationEntity.entities.Employe;
import sn.ept.gitdic2.tp1.relationEntity.entities.Magasin;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-02-12T20:59:40", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Employe.class)
public class Employe_ extends Person_ {

    public static volatile SingularAttribute<Employe, Magasin> magasinId;
    public static volatile SingularAttribute<Employe, Short> actif;
    public static volatile SingularAttribute<Employe, Employe> managerId;
    public static volatile CollectionAttribute<Employe, Employe> employeCollection;
    public static volatile CollectionAttribute<Employe, Commande> commandeCollection;

}