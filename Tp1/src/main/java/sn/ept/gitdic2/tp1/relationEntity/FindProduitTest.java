/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sn.ept.gitdic2.tp1.relationEntity;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import sn.ept.gitdic2.tp1.relationEntity.entities.Produit;

/**
 *
 * @author hp
 */
public class FindProduitTest {
    private static final String PU_NAME = "sn.ept.gitdic2.tp1_Tp1_jar_1.0-SNAPSHOTPU2";
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(PU_NAME);
        EntityManager em = emf.createEntityManager();
        
        Query q =em.createNamedQuery("Produit.findAll");
        List<Produit> produits = q.getResultList();
        produits.forEach(produit->{
            System.out.println("id Produit="+produit
                    .getId()+"  ,Nom Produit= "+produit
                            .getNom()+"  ,Categorie Produit="+produit.getCategorieId().getNom());

    });
        
        em.close();
        emf.close();
    }
}
