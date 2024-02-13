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
	ap1.Saisir_informatios();
	Tab.add(ap1);
}
   
public void AffichelisteApprenantes(ArrayList<Apprenant> Tab) {
	System.out.println();
	System.out.println("**liste des Apprenantes**");
	System.out.println("--------------------------");
	for(Apprenant A :Tab) {
		A.AfficheApprenants();
		
	}
	
}
public void ModifierApprenantes(ArrayList<Apprenant> Tab) {
	 System.out.println("--mdifier les informations d'un apprenant--");
	 String nom=new String();
	 System.out.printf("-->entrz nom d'apprenant = ");
	 nom=scan.next();
	 boolean trouve=false;
	 for(Apprenant A:Tab) {
		   if(nom.equals(A.getNom())){
			   A.ModifieApprenants(A);
			   System.out.println("-->les modifications est enregistre avec succes");
			   trouve=true;
			   break;
		   }
			   
		}
	 if(trouve==false) {
		 System.out.println("-->Cette Apprenant n'existe pas ");
	 }
}
public void SupprimerApprenant(ArrayList<Apprenant> Tab) {
	 System.out.println("--Supprimer un apprenant--");
	 String nom= new String();
	 System.out.printf("-->entrez le nom = ");
	 nom=scan.next();
	 boolean trouve=false;
	 for(Apprenant A:Tab) {
		   if(nom.equals(A.getNom())){
			   Tab.remove(A);
			   System.out.println("-->l'apprenant "+nom+" "+A.getPrenom() +" est suppreme avec succes");
			   trouve=true;
			   break;
		   }
			   
		}
	 if(trouve==false) {
		 System.out.println("-->Cette Apprenant n'existe pas ");
	 }
}
public void RechercherApprenantes(ArrayList<Apprenant> Tab) {
	 System.out.println("--Recherche un apprenant par Nom--");
	 String nom=new String();
	 System.out.printf("-->entrez_le_nom = ");
	 nom=scan.next();
	 boolean trouve=false;
	 for(Apprenant A:Tab){
		   if(nom.equals(A.getNom())){
			   A.AfficheApprenants();
			   trouve=true;
		   }
			   
		}
	 if(trouve==false) {
		 System.out.println("-->Cette Apprenant n'existe pas ");
	 }
}



//gestion des classe 

public void AjouterUneClasse(ArrayList<Classe> TClas) {
	Classe clas =new Classe();
	clas.saisircllas(clas);
	TClas.add(clas);
}

public void AfficheListclasse(ArrayList<Classe> TClas) {
	System.out.println();
	System.out.println("****Listes des classe****");
	System.out.println("-------------------------");
		for(Classe C:TClas) {
			C.Afficheclasse(C);
		}
	}

public void ModifierClasse(ArrayList<Classe> TClas) {
	int Num;
	System.out.println("---Modifier un classe---");
	System.out.printf("-->Numero_de_classe = ");
	Num = scan.nextInt();
	boolean trouve=false;
	for(Classe cls:TClas) {
		if(Num ==cls.getNumeroclasse()) {
			cls.ModifierClass(cls);
			System.out.println("-->les modifications est enregistre avec succes");
			 trouve=true;
			break;
		}
	}
	if(trouve==false) {
		 System.out.println("-->Cette Classe n'est pas trouve ");
	 }
}
public void SupprimerClasse(ArrayList<Classe> TClas) {
	int Num;
	System.out.println("---Supprimer un classe---");
	System.out.printf("-->Numero_de_classse = ");
	Num = scan.nextInt();
	boolean trouve=false;
	for(Classe cls:TClas) {
		if(Num==cls.getNumeroclasse()) {
			TClas.remove(cls);
			System.out.println("-->cette classe est suppremer avec succes");
			 trouve=true;
			break;
		}
	}
	if(trouve==false) {
		 System.out.println("-->Cette Classe n'existe pas ");
	 }
}
}
