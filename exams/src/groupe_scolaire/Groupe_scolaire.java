
package java101.groupe_scolaire;

public class Groupe_scolaire {

    public static void main(String[] args) {
        ecole e1 = new ecole();
        ecole e2 = new ecole(2,"r3d");
        e1.setId(1);
        e1.setLibelle("r3da");
        
        
        eleve cursor = new eleve(100,"cursor");
        eleve cur = new eleve(200,"cur");
        eleve select = new eleve(300,"select");
        
        e1.create(cursor);
        e1.create(cur);
        e1.create(select);
        e1.delete(cursor);
        
        
        eleve group = new eleve(10,"group");
        eleve by = new eleve(20,"by");
        eleve having = new eleve(30,"having");
        
        
        e2.create(group);
        e2.create(by);
        e2.create(having);
        e2.delete(having);
        
        System.out.println("pour l'ecole avec l'id : "+e1.getId());
        for (int i=0 ; i<e1.liste_ecole.size(); i++)
        {
            System.out.println(e1.liste_ecole.get(i));
        }
        
        System.out.println("pour l'ecole avec l'id : "+e2.getId());
        for (int i=0 ; i<e2.liste_ecole.size(); i++)
        {
            System.out.println(e2.liste_ecole.get(i));
        }
        
        System.out.println("\n\n\nafficher un etudiant avec son code ");
        System.out.println(e1.findByCode("300"));
        
    }
}
