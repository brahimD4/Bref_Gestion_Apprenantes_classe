package dossier2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Administrateur {
	private String nom;
	private int cin;
	
	Scanner scan=new Scanner(System.in);
	
	public Administrateur(String nom, int cin) {
		this.nom = nom;
		this.cin = cin;
	}
	
public void AjouterApprenantes(ArrayList<Apprenant> Tab) {
	Apprenant ap1=new Apprenant();
	Tab.add(ap1);
}
   
public void AffichelisteApprenantes(ArrayList<Apprenant> Tab) {
	System.out.println();
	System.out.println("liste des Apprenantes");
	for(Apprenant A :Tab) {
		A.AfficheApprenants();
		
	}
	
}
public void ModifierApprenantes(ArrayList<Apprenant> Tab) {
	 System.out.println("mdifier les informations d'un apprenant");
	 String nom=new String();
	 System.out.println();
	 System.out.printf("entrez le nom :");
	 nom=scan.next();
	 for(Apprenant A:Tab) {
		   if(nom.equals(A.getNom())){
			   A.ModifieApprenants(A);
			   System.out.println("les modifications est enregistre avec succes");
			   break;
		   }
			   
		}
}
public void SupprimerApprenant(ArrayList<Apprenant> Tab) {
	 System.out.println("supprimer un apprenant ");
	 String nom= new String();
	 System.out.println();
	 System.out.printf("entrez le nom :");
	 nom=scan.next();
	 for(Apprenant A:Tab) {
		   if(nom.equals(A.getNom())){
			   Tab.remove(A);
			   System.out.println("Apprenant "+nom+" "+A.getPrenom() +" est suppreme avec succes");
			   break;
		   }
			   
		}
}
public void RechercherApprenantes(ArrayList<Apprenant> Tab) {
	 System.out.println("recherche un apprenant par nom");
	 String nom=new String();
	 System.out.println();
	 System.out.printf("entrez le nom :");
	 nom=scan.next();
	 for(Apprenant A:Tab){
		   if(nom.equals(A.getNom())){
			   A.AfficheApprenants();
		   }
			   
		}
}



//gestion des classe 
public void AjouterUneClasse(ArrayList<Classe> TClas) {
	Classe clas =new Classe();
	clas.saisircllas(clas);
	TClas.add(clas);
}

public void AfficheList(ArrayList<Classe> TClas) {
	System.out.println("Listes des classe");
		for(Classe C:TClas) {
			C.Afficheclasse(C);
		}
	}

public void ModifierClasse(ArrayList<Classe> TClas) {
	int Num;
	System.out.println("Numero classe a modifier");
	Num = scan.nextInt();
	for(Classe cls:TClas) {
		if(Num ==cls.getNumeroclasse()) {
			cls.ModifierClass(cls);
			System.out.println("les mofefictions est enregistre avec succes");
			break;
		}
	}
}
public void SupprimerClasse(ArrayList<Classe> TClas) {
	int Num;
	System.out.println("Numero classe a modifier");
	Num = scan.nextInt();
	for(Classe cls:TClas) {
		if(Num==cls.getNumeroclasse()) {
			TClas.remove(cls);
			System.out.println("cette classe est suppremer avec succes");
			break;
		}
	}
}
}
