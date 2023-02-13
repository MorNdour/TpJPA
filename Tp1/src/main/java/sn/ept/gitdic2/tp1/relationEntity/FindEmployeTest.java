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
import sn.ept.gitdic2.tp1.relationEntity.entities.Employe;


/**
 *
 * @author hp
 */
public class FindEmployeTest {
    private static final String PU_NAME = "sn.ept.gitdic2.tp1_Tp1_jar_1.0-SNAPSHOTPU";
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(PU_NAME);
        EntityManager em = emf.createEntityManager();
        
        Query q =em.createNamedQuery("Employe.findAll");
         List<Employe> employes = q.getResultList();
        employes.forEach(employe->{
            System.out.println("Nom:"+employe
                    .getNom()+"  ,Prenom:"+employe
                            .getPrenom()+" ,Email:"+employe.getEmail());
    });
        
        em.close();
        emf.close();
    }
}
