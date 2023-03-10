package sn.ept.git.dic2.hellodic2;

import jakarta.annotation.PostConstruct;
import jakarta.ejb.EJB;
import jakarta.ejb.Singleton;
import jakarta.ejb.Startup;
import jakarta.ejb.Stateful;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.Random;


@Singleton
@Startup
public class InitEleve {

    @EJB
    private EleveFacade eleveFacade;
    @PostConstruct
    public void init(){
        System.out.println("#### initialisation des entites eleves!");
        if (eleveFacade.count()>0){
            return;
        }

        String[] prenoms = {"Oumou","Moussa","Ass"};
        String [] noms = {"Sall","Mboup","Sarr"};
        int nbEleve = 20;
        Random rand = new Random();
         for (int i =0; i<nbEleve;i++){
             String prenom = prenoms[rand.nextInt(prenoms.length)];
             String nom = noms[rand.nextInt(noms.length)];
             double poids= rand.nextDouble()*50+50;
             String numero= "dic2_"+(i+1);

             Eleve eleve = new Eleve(numero,prenom,nom,poids);
             eleveFacade.create(eleve);
         }

    }
}
