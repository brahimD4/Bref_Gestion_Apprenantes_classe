package dossier2;

import java.util.Scanner;

public class Classe {
	
  private int Numeroclasse;
  private String Nomclasse;
  private int Effectif;
	
  public void saisircllas(Classe C) {
	  Scanner scan=new Scanner(System.in);
	  System.out.printf("Numero de clsse= ");
	  C.Numeroclasse=scan.nextInt();
	  System.out.printf("Nom de classe:");
	  C.Nomclasse=scan.next();
	 System.out.printf("Effectif= ");
	  C.Effectif=scan.nextInt();
}
  
  public void Afficheclasse(Classe C) {
	  System.out.println();
	  System.out.println("Numero de clsse= "+C.Numeroclasse);
	  System.out.println("Nom de classe:"+C.Nomclasse);
	  System.out.println("Effectif= "+C.Effectif);
	  System.out.println("*****************");
  }
  
  public void ModifierClass(Classe C) {
	  Scanner scan=new Scanner(System.in);
	  System.out.printf("Nou_Numero= ");
	  C.Numeroclasse=scan.nextInt();
	  System.out.printf("Nou_Nom de classe:");
	  C.Nomclasse=scan.next();
	  System.out.printf("Nou_Effectif= ");
	  C.Effectif=scan.nextInt();
  }

public int getNumeroclasse() {
	return Numeroclasse;
}

public void setNumeroclasse(int numeroclasse) {
	Numeroclasse = numeroclasse;
}

public String getNomclasse() {
	return Nomclasse;
}

public void setNomclasse(String nomclasse) {
	Nomclasse = nomclasse;
}

public int getEffectif() {
	return Effectif;
}

public void setEffectif(int effectif) {
	Effectif = effectif;
}
  
}
