package dossier2;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
	    Administrateur Admin=new Administrateur("admin",22);
	    
	    Scanner scan=new Scanner(System.in);
	    
	    
	    ArrayList<Apprenant> TabApp =new  ArrayList<>();
	    
	    ArrayList<Classe> TabClass =new  ArrayList<>();
	    
	    int choix1=0;
	    int choix3=0;
	    int choix2=0;
	    int choix=0;

		   System.out.println("1 :Gestion des apprenantes");
		   System.out.println("2 :Gestion des classes");
		   System.out.printf(" choiser votre operation:");
		   choix1=scan.nextInt();  
	
	   
	   if(choix1==1) {
		  
		    do {
		    	System.out.println(" 1 :Ajouter un apprenant");
		    	System.out.println(" 2 :Modifier les informatios des apprenants");
		    	System.out.println(" 3 :Afficher la liste des apprenants ");
		    	System.out.println(" 4 :supprimer un apprenants");
		    	System.out.println(" 5 :Recherche sur un apprenant par nom");
		    	System.out.println(" 6 :Quitte");
		    	System.out.printf(" choiser votre operation:");
		    	choix2=scan.nextInt();
		    	
		    	switch(choix2) {
		    	case 1:
		    		Admin.AjouterApprenantes(TabApp);
		    		break;
		    	case 2:
		    		 Admin.ModifierApprenantes(TabApp);
		    		break;
		    	case 3:
		    		Admin.AffichelisteApprenantes(TabApp);
		    		break;
		    	case 4:
		    		 Admin.SupprimerApprenant(TabApp);
		    		break;
		    	case 5:
		    		 Admin.RechercherApprenantes(TabApp);
		    		break;
		    	default:
		    		System.out.println("entrez bon choix");
		    		break;
		    	}
		    	
		    }while(choix2!=6);
		   
	   }else if(choix1==2) {
		   do {
		    	System.out.println(" 1 :Ajouter une classe");
		    	System.out.println(" 2 :Modifier une classe");
		    	System.out.println(" 3 :Afficher la liste des classes ");
		    	System.out.println(" 4 :Supprimer une classe");
		    	System.out.println(" 5 :Fittrer apprenant par classe");
		    	System.out.println(" 6 :Quiter");
		    	System.out.printf(" choiser votre operation:");
		    	choix3=scan.nextInt();
		    	
		    	switch(choix3) {
		    	case 1:
		    		Admin.AjouterUneClasse(TabClass);
		    		break;
		    	case 2:
		    		 Admin.ModifierClasse(TabClass);
		    		break;
		    	case 3:
		    		Admin.AfficheList(TabClass);
		    		break;
		    	case 4:
		    		 Admin.SupprimerClasse(TabClass);
		    		break;
		    	case 5:
		    		// Admin.Filtrerapprenantesparclasse(TabClass);
		    		break;
		    	default:
		    		System.out.println("entrez bon choix");
		    		break;
		    	}
		    	
		    }while(choix3!=6); 
		   
	   }
		   
	    
	    

	  
	  
	}
}
