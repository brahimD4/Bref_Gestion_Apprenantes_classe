package dossier2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Apprenant {
	 private String Nom;
	 private String Prenom;
	 private String Adresse;
	 private int NumTelephone;
	 private Calendar Date_de_naissance;
	 
	 Scanner scan=new Scanner(System.in);
	 
	 public Apprenant() {
		 int jour,mois,anne;
		     Date_de_naissance=Calendar.getInstance();
		
		    //SimpleDateFormat sdf=new SimpleDateFormat("EEEEE dd/MM/yyyy");
		    
		    
			System.out.printf("Nom =");
			Nom=scan.next();
			System.out.printf("Prenom =");
			Prenom=scan.next();
			System.out.printf("Adresse :");
			Adresse=scan.next();
			System.out.printf("Tel :");
			NumTelephone=scan.nextInt();
			System.out.println("Date :");
			
			System.out.printf("jour=");
			jour=scan.nextInt();
			System.out.printf("mois=");
			mois=scan.nextInt();
			System.out.printf("anne=");
			anne=scan.nextInt();
			Date_de_naissance.set(anne, mois-1, jour);
			
	}
public void AfficheApprenants() {
	SimpleDateFormat sdf=new SimpleDateFormat("EEEEE dd/MM/yyyy");
	System.out.println();
	System.out.println("NOM=:"+Nom);
	System.out.println("Prenom :"+Prenom);
	System.out.println("Adresse :"+Adresse);
	System.out.println("Tel :"+NumTelephone);
	System.out.println("date :"+sdf.format(Date_de_naissance.getTime()));
	System.out.println("****************************");
}
public void ModifieApprenants(Apprenant A) {
	int jour,mois,anne;
	System.out.printf("Nou_Nom =");
	A.Nom=scan.next();
	System.out.printf("Nou_Prenom =");
	A.Prenom=scan.next();
	System.out.printf("Nou_Adresse :");
	A.Adresse=scan.next();
	System.out.printf("Nou_Tel :");
	A.NumTelephone=scan.nextInt();
	System.out.println("Date :");
	
	System.out.printf("jour=");
	jour=scan.nextInt();
	System.out.printf("mois=");
	mois=scan.nextInt();
	System.out.printf("anne=");
	anne=scan.nextInt();
	A.Date_de_naissance.set(anne, mois-1, jour);
	
}
	 
	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public String getPrenom() {
		return Prenom;
	}

	public void setPrenom(String prenom) {
		Prenom = prenom;
	}

	public String getAdresse() {
		return Adresse;
	}

	public void setAdresse(String adresse) {
		Adresse = adresse;
	}

	public int getNumTelephone() {
		return NumTelephone;
	}

	public void setNumTelephone(int numTelephone) {
		NumTelephone = numTelephone;
	}

	public Calendar getDate_de_naissance() {
		return Date_de_naissance;
	}

	public void setDate_de_naissance(Calendar date_de_naissance) {
		Date_de_naissance = date_de_naissance;
	}

	@Override
	public String toString() {
		return "Apprenant [Nom=" + Nom + ", Prenom=" + Prenom + ", Adresse=" + Adresse + ", NumTelephone="
				+ NumTelephone + ", Date_de_naissance=" + Date_de_naissance + "]";
	}
	 
	
}
	
