package testPOO;


public class Personne implements IPersonne {
 private String nom;
 private String prenom;
 private Sex sex;
 private Personne conjoint;
  
 public Personne() {
	 this.nom="aroubite";
	 this.prenom="niama";
	 this.sex = Sex.femme;
	 this.conjoint=null;
	 
 }
 public Personne(String nom, String prenom,Sex sex,Personne personne) {
	 this.nom = nom;
	 this.prenom = prenom;
	 this.sex = sex;
	 this.conjoint = personne;
 }
 public Personne(String nom, String prenom,Sex sex) {
	 this.nom = nom;
	 this.prenom = prenom;
	 this.sex = sex;
	 
 }
@Override
public void marier(Personne personne) throws MemeSex,DejaMariee {
	// TODO Auto-generated method stub
	if( this.sex == personne.sex ) {
		throw new MemeSex();
		
	
	}
	else if(this.conjoint != null || personne.conjoint != null) {
		 throw new DejaMariee();
	}
	else {
		personne.conjoint = this;
		this.conjoint = personne;
		
		if(this.sex == Sex.femme) {
			this.nom = personne.conjoint.nom;
		}
		else {
			personne.nom = this.nom;
		}
	}
}
@Override
public void divorcer(Personne personne) throws DejaDivorcer {
	// TODO Auto-generated method stub
	if(personne.conjoint == null || this.conjoint == null ) {
		throw new DejaDivorcer();
	}
	if(personne.conjoint != null && this.conjoint != null) {
		this.conjoint = null;
		personne.conjoint =null;
		
		
	}
	
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public Sex getSex() {
	return sex;
}
public void setSex(Sex sex) {
	this.sex = sex;
}
public Personne getConjoint() {
	return conjoint;
}
public void setConjoint(Personne conjoint) {
	this.conjoint = conjoint;
}
@Override
public String toString() {
	return "Personne [nom=" + nom + ", prenom=" + prenom + ", sex=" + sex + ", conjoint=" + conjoint.getNom()+" "+conjoint.getPrenom() +"]";
}

 public Bebe produire() {
	 Bebe B = null;
	 if(this.conjoint != null ) {
		  
		  B = new Bebe(this.conjoint,this);
	 }
	
	return B; 
 }

}
