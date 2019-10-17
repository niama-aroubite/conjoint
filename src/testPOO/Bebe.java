package testPOO;

public class Bebe {
	
	private String nom;
	private String prenom;
	private Personne papa;
	private Personne maman;
	
	public Bebe(Personne papa,Personne maman) {
		
		this.papa = papa;
		this.maman = maman;
	}
    public Bebe(String nom,String prenom,Personne papa, Personne maman) {
    	
    	this.nom = nom;
    	this.prenom = prenom;
    	this.papa = papa;
    	this.maman = maman;
    }
}

