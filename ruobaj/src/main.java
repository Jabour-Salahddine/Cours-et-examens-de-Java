/*
 
                      //juste un esai:
 
import java.util.Scanner;
public class main {
                                
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scanner = new Scanner(System.in);
		
	System.out.println("we are in GOOD's hands");	
    System.out.println("what is your name?");
    
    String name = scanner.nextLine();
    
    System.out.println("and how old are you,");
    
    int x = scanner.nextInt(); 
    
    scanner.nextLine(); // le role de getchar
    
    System.out.println("and what is your family name?");
    
    String fname = scanner.nextLine();
    
    System.out.println("nice to meet you " +name+fname);
    
    
	
	
	}

}
*/


                   //expression maths:


/*
public class main {

 public static void main(String[] args) {
  
  // expression =     operands & operators
  // operands =  values, variables, numbers, quantity
  // operators = + - * / % 

 int x = 10;
 x++;  // x=x+1;
 System.out.println(x);
  } 
}
*/





                 // how to make a simple gui: graphical user interface:



/*
import javax.swing.JOptionPane;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

    String name =  JOptionPane.showInputDialog("what is your name?");
    JOptionPane.showMessageDialog(null,"hello "+name);	
    
    int age =Integer.parseInt(JOptionPane.showInputDialog("enter your age:"));  //showInputDialog:give a string!!
    JOptionPane.showMessageDialog(null,"you are "+age+" years old ");           // il informer le sys qu'on veut u int
    
    double height = Double.parseDouble(JOptionPane.showInputDialog("enter your height:"));
    JOptionPane.showMessageDialog(null,"your height is "+height+"cm");
    
	
	
	}
}
*/


                     // quelque methode de la class Math:                


/*
Math.max(x,y)
Math.min(x,y)
Math.abs(y)
Math.sqrt(x)          
Math.round(x)
Math.ceil(x)
Math.floor(x) 
*/


                       // generer des valleurs grace à la class Random
/*
import java.util.Random;

public class main {

 public static void main(String[] args) {
  
  Random random = new Random();
  
  int x = random.nextInt(6)+1; // donne un nombre int aleatoire entre 0 et 5 si on veut entre 1 et 6 on ajoute+1
  //double y = random.nextDouble();
  //boolean z = random.nextBoolean();
  
  System.out.println(x);
    
 }
}
*/





              //   Java if statements same thing in c.
/*
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		// if statement = performs a block of code if it's condition evaluates to be true
		
		Scanner scanner = new Scanner(System.in);
		
		int age = scanner.nextInt();
		
		if(age>=50) {
			System.out.println("Ok Boomer!");
		}
		else if(age>=18 && age <50) {
			System.out.println("You are an adult!");
		}
		else if(age>=13) {
			System.out.println("You are a teenager!");
		}
		else {
			System.out.println("You are not an adult!");
		}
				
	}
}

*/







               //  switch = statement that allows a variable to be tested for equality against a list of values
/*
public class main {

 public static void main(String[] args) {
  
  // switch = statement that allows a variable to be tested for equality against a list of values
  
  String day = "Friday";
  
  switch(day) {
   case "Sunday": System.out.println("It is Sunday!");
   break;
   case "Monday": System.out.println("It is Monday!");
   break;
   case "Tuesday": System.out.println("It is Tuesday!");
   break;
   case "Wednesday": System.out.println("It is Wednesday!");
   break;
   case "Thursday": System.out.println("It is Thursday!");
   break;
   case "Friday": System.out.println("It is Friday!");
   break;
   case "Saturday": System.out.println("It is Saturday!");
   break;
   default: System.out.println("That is not a day!");
  }
    
 }
}

*/





/*
import java.util.Scanner;


public class main {

 public static void main(String[] args) {

	    Scanner scanner = new Scanner(System.in);    
	 
	    System.out.println("You are playing a game! Press q or Q to quit");
		String response = scanner.next();
		
		if( response.equals("q")|| response.equals("Q")) {
			System.out.println("YOu quit the game!");
		}
		else {
			System.out.println("YOu are still playing the game");
		}
    
 
  }
 }

*/

                           //la boucle while

/*
import java.util.Scanner;


public class main {

 public static void main(String[] args) {

	    Scanner scanner = new Scanner(System.in);    
	 
	    System.out.println("enter a number:");
		long response = scanner.nextInt();
		long X=response;
		int n =0;
		while(X/10!=0)
		{
           n++;
           X=X/10;
	      		
		}
  
        n++;
        
        System.out.println("le nombre de chiffres est: "+n);

        // other example:
        
       String name = "";
		
		while(name.isBlank()) {
			System.out.print("Enter your name: ");
			name = scanner.nextLine();
		}                                          
		System.out.println("Welcome "+name);
		
	}
          /*isBlank() n'est ni une classe ni une méthode standard.
           * C'est en réalité une méthode introduite dans la classe java.lang.String 
           * à partir de Java 11.
           *  Elle est utilisée pour vérifier si une chaîne de caractères (String) 
           *  est vide ou ne contient que des espaces blancs (caractères de tabulation,
           *   espace, etc.).
           */
 
  
 
            /*La méthode equals() est une méthode standard en Java
             *  qui est utilisée pour comparer si deux objets sont égaux 
             *  en termes de contenu. Cette méthode est héritée de la classe
             *   java.lang.Object, ce qui signifie qu'elle est disponible
             *    pour toutes les classes Java, car toutes les classes
             *     sont implicitement des sous-classes de Object.
             

             La méthode equals() est souvent utilisée pour comparer deux objets
             de la même classe pour vérifier s'ils ont la même valeur.
             Par défaut, la méthode equals() de la classe Object compare les références mémoire, 
             ce qui signifie qu'elle renvoie true uniquement si les deux références
             font référence au même objet en mémoire. Cependant, de nombreuses
             classes Java (telles que String, Integer, Double, etc.) 
             substituent la méthode equals() pour effectuer une comparaison basée 
             sur le contenu plutôt que sur la référence mémoire. 
              */
 
 
 /*
 }
 
 }

*/

                            // la boucle for comme dans langage c ! pad la peine...


/*
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		// nested loops = a loop inside of a loop
		
		Scanner scanner = new Scanner(System.in);
		int rows;
		
		String symbol;
		
		System.out.println("Enter # of rows: ");
		rows = scanner.nextInt();
		
		System.out.println("Enter symbol to use: ");
		symbol = scanner.next();
		
		for(int i=1; i<=rows; i++) {
			System.out.println();
			for(int j=1; j<=i;j++) {
				System.out.print(symbol);
			}
		}	
	}
}
*/



                     // creation d'un tableau de chaine de caracteres:
  /*                   // dimension 1   : String[] cars = new String[nombreDeVoitures]

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        // Créer un scanner pour lire l'entrée de l'utilisateur
        Scanner scanner = new Scanner(System.in);

        System.out.print("Combien de voitures souhaitez-vous entrer ? ");
        int nombreDeVoitures = scanner.nextInt();
        scanner.nextLine(); // pour recevoire "l'entrer" qu on a tape.

        // Créer un tableau de chaînes de caractères pour stocker les noms des voitures
        String[] cars = new String[nombreDeVoitures];

        // Demander à l'utilisateur d'entrer les noms des voitures
        for (int i = 0; i < nombreDeVoitures; i++) {
            System.out.print("Entrez le nom de la voiture " + (i + 1) + ": ");
            cars[i] = scanner.nextLine();
        }

        // Afficher les noms des voitures
        System.out.println("Noms des voitures :");
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        // Fermer le scanner
        scanner.close();
    }
}

*/




   //creation d'un tableau de caractères telque chaque case contient un caractère individuel:
   //   char[] caracteres = new char[donner.length()]

/*
import java.util.Scanner;

public class main {

        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez une chaîne de caractères : ");
        String donner = scanner.nextLine();

        // Créer un tableau de caractères pour stocker chaque caractère
        char[] caracteres = new char[donner.length()];
                                           
        // Copier chaque caractère de la chaîne dans le tableau
        for (int i = 0; i < donner.length(); i++) {
            caracteres[i] = donner.charAt(i);
        }                                 
                      
        // Afficher chaque caractère du tableau
        System.out.println("Caractères individuels dans le tableau :");
        for (int i=0;i<donner.length();i++) {
            System.out.println(caracteres[i]);
        }

        scanner.close();                    
    }
}

*/



/*               consernant les tableau:
R.M:

En Java, le nom d'un tableau (qu'il s'agisse d'un tableau de caractères char[] ou 
d'un autre type) est en réalité une référence à l'emplacement mémoire où 
les données du tableau sont stockées. Le nom du tableau lui-même ne contient pas 
directement les données, mais il "pointe" vers l'emplacement mémoire où 
les données du tableau sont conservées.

Pour clarifier davantage :

Lorsque vous déclarez un tableau comme char[] monTableau;, 
vous créez essentiellement une référence (monTableau) qui peut contenir 
l'emplacement mémoire où les caractères seront stockés.

Pour allouer de la mémoire pour le tableau et y stocker des valeurs, 
vous devez utiliser l'opérateur new comme ceci : monTableau = new char[5];. 
Cela crée effectivement un tableau de caractères de taille 5 en mémoire.

Vous pouvez maintenant accéder et manipuler les valeurs individuelles du tableau 
en utilisant l'index, par exemple : monTableau[0] = 'a';.
*/



/*
la notion de référence à un tableau en Java est similaire à celle en langage C. 
Dans les deux langages, le nom d'un tableau n'est pas directement associé aux 
données du tableau, mais plutôt à l'emplacement mémoire où les données sont stockées. 
Cette référence permet d'accéder aux données du tableau en utilisant l'index approprié.

Cependant, il y a des différences importantes à noter :

Gestion de la mémoire : En Java, la gestion de la mémoire est automatique grâce 
au ramasse-miettes (garbage collector), ce qui signifie que vous n'avez pas à vous 
préoccuper de libérer la mémoire des tableaux ou des objets lorsque vous avez 
terminé de les utiliser. En langage C, vous devez explicitement allouer et 
libérer la mémoire, ce qui peut être source d'erreurs.

Sécurité : Java est conçu pour être plus sécurisé que le langage C. 
Par exemple, en Java, il est plus difficile de provoquer des débordements de 
tampon ou des erreurs de pointeurs qui peuvent être exploitées pour des attaques de 
sécurité. Java inclut des mécanismes de sécurité tels que la vérification des limites
des tableaux (pour éviter les débordements de tampon).

Typage fort : Java est un langage à typage fort, ce qui signifie que les types doivent
être strictement respectés. En langage C, les conversions de type peuvent être plus 
souples et potentiellement source d'erreurs.
*/



/*

public class main {

 public static void main(String[] args) {
  
  // String = a reference data type that can store one or more characters
  //   reference data types have access to useful methods
  
  String name = "Salah";
  
  //boolean result = name.equalsIgnoreCase("Salah");
  //int result = name.length();
  //char result = name.charAt(0);
  //int result = name.indexOf("o");
  //boolean result = name.isEmpty();
  //String result = name.toUpperCase();
  //String result = name.toLowerCase();  
  //String result = name.trim();    // supprimer les espace "  Salah    "
  //String result = name.replace('o', 'a');
   
  //System.out.println(result);
 }
 
}

*/




         // la convertition d'une variable primitive à une variable reference(acces à qlq methode)
         // reference varaible prend plus de temps pour les accede!
         // les variable primitive sont plus vite


/*       
public class main {

 public static void main(String[] args) {
  
    
	 les "wrapper classes" (ou classes enveloppe) sont des classes
	 qui permettent de représenter des types de données primitifs sous forme d'objets
	
	 
	 Double d = 12.21;
	 
	 
 }
 
}
*/



/*
import java.util.ArrayList;

public class main {

 public static void main(String[] args) {
  
    
	 ArrayList <String> l = new ArrayList();
	 //ArrayList <Personne> l = new ArrayList(); tableau dynamique des objets de type Personne.
	 boolean b = l.contains('o');
	 l.add("sal");
	 l.add("yep");
	 l.add("hello");
	 l.add("aadam");

 	 System.out.println(l);
	 
	  
	 
 }
 
}
*/




import java.util.ArrayList;
import java.util.Iterator;

public class main {

	public static void main(String[] args) {
		
		ArrayList<ArrayList<String>> groceryList = new ArrayList();
		
		ArrayList<String> bakeryList = new ArrayList();
		bakeryList.add("pasta");
		bakeryList.add("garlic bread");
		bakeryList.add("donuts");
		
		ArrayList<String> produceList = new ArrayList();
		produceList.add("tomatoes");
		produceList.add("zucchini");
		produceList.add("peppers");
		
		ArrayList<String> drinksList = new ArrayList();
		drinksList.add("soda");
		drinksList.add("coffee");
		
		groceryList.add(bakeryList);
		groceryList.add(produceList);
		groceryList.add(drinksList);
		
		System.out.println(groceryList);
		
		System.out.println();

	
	Iterator itr = groceryList.listIterator();
	
	while(itr.hasNext())
	{
		System.out.println(itr.next());
		
		
	}
	
	
	}
}





/*
import java.util.InputMismatchException;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		// exception = 	an event that occurs during the execution of a program that,
		//				disrupts the normal flow of instructions
		
		Scanner scanner = new Scanner(System.in);
		
		try {
		
			System.out.println("Enter a whole number to divide: ");
			int x = scanner.nextInt();
		
			System.out.println("Enter a whole number to divide by: ");
			int y = scanner.nextInt();
		
			int z = x/y;
		
			System.out.println("result: " + z); // une fois l'ereur est declanché le reste du bloc try ne s'execute pas
		}
			
		catch(Exception e) {
			System.out.println("You can't divide by zero! IDIOT!");
		    return;
			
		}
		
		finally {
			System.out.println("darourii n texecuta bachma britoo!!");
		}
		
		System.out.println("yalah thla");
			
	}
}
*/








	
	
	


