package notes;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
		
        // en utilisant un tableau statique: Array
        
          
        Note[] tableaunote = new Note[2];
        
        for(int i=0;i<tableaunote.length;i++)
        {
        	Note etudiant = new Note();
        	
        	System.out.println("donner la note de S.E pour etudiant "+(i+1)+":");        	
        	etudiant.note_s=scanner.nextDouble();
        	while(etudiant.note_s>20 || etudiant.note_s<0)
        	{
        		System.out.println("saisie eronnée!");
        		System.out.println("donner la note de S.E pour etudiant "+(i+1)+":");        	
            	etudiant.note_s=scanner.nextDouble();
        		
        	}
        	
        	System.out.println("donner la note de java pour etudiant  "+(i+1)+":");
        	etudiant.note_j=scanner.nextDouble();
        	while(etudiant.note_j>20 || etudiant.note_j<0)
        	{
        		System.out.println("saisie eronnée!");
        		System.out.println("donner la note de Java pour etudiant "+(i+1)+":");        	
            	etudiant.note_j=scanner.nextDouble();
        		
        	}
        	
        	
        	tableaunote[i]=etudiant;
       
        	
        	}
		
       
		    double sommedesmoyenne=0.00;
		    
		    for(int j=0;j<tableaunote.length;j++)
		    {
		    	System.out.println("la noyenne des note de l'etudiant"+(j+1)+":");
		    	System.out.println(tableaunote[j].moy());
		    	
		    	sommedesmoyenne+=tableaunote[j].moy();
		    	
		    }
		
		    System.out.println("la moyenne generale des etudiants est :"+sommedesmoyenne);
	        
		    
	               // en utilisant un tableau dynamique ArrayList
        
      
     /*   
        
        ArrayList<Note> tabdyetu = new ArrayList<Note>();
        System.out.println("saisir les objets (etudiant) que vou voulez:");
        System.out.println("apres chaque saisie pour terminé saisir :-1 sinon taper qlq");
        System.out.println("**************************************");
       
        System.out.println("pour continuer tapé--->(taper qlq part!) ");
        System.out.println("pour terminer tapé---->-1");
        String temp = scanner.nextLine();
        
       
       
        
        
        int i=0;
        while(!temp.equals("-1"))
        {   
        	Note etudiant = new Note();
        	
        	System.out.println("donner la note de S.E pour etudiant "+(i+1)+":");        	
        	etudiant.note_s=scanner.nextDouble();
        	while(etudiant.note_s>20 || etudiant.note_s<0)
        	{
        		System.out.println("saisie eronnée!");
        		System.out.println("donner la note de S.E pour etudiant "+(i+1)+":");        	
            	etudiant.note_s=scanner.nextDouble();
        		
        	}
        	
        	System.out.println("donner la note de java pour etudiant  "+(i+1)+":");
        	etudiant.note_j=scanner.nextDouble();
        	while(etudiant.note_j>20 || etudiant.note_j<0)
        	{
        		System.out.println("saisie eronnée!");
        		System.out.println("donner la note de S.E pour etudiant "+(i+1)+":");        	
            	etudiant.note_j=scanner.nextDouble();
        		
        	}
        	
        	
            tabdyetu.add(etudiant);

            scanner.nextLine();
            System.out.println("pour continuer tapé--->qlq part ");
            System.out.println("pour terminer tapé---->-1");
            temp = scanner.nextLine();	
            
            i+=1;
        
	}
        
        System.out.println("saisie terminé avec succe!");
        double summoyenne=0.00;
        
        for(int j=0;j<tabdyetu.size();j++)
        {
        	System.out.println("la noyenne des note de l'etudiant"+(j+1)+":");
	    	System.out.println(tabdyetu.get(j).moy());
	    	summoyenne+=tabdyetu.get(j).moy();
	    	
        	
        }
        
        System.out.println("la moyenne des etudients est: ");
        System.out.println(summoyenne);
    
   */     
        
    
	
	
	
	
	
	
	
	}

}
