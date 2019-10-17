package testPOO;

public interface IPersonne {
 
	public void marier(Personne personne) throws MemeSex, DejaMariee;
	public void divorcer(Personne personne) throws DejaDivorcer;
}
