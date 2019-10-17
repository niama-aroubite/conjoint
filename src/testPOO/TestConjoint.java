package testPOO;

public class TestConjoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Personne Y = new Personne("EL-Mahi","Yassine",Sex.homme);
		Personne N = new Personne();
		
		try {
			Y.marier(N);
		} catch (MemeSex e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DejaMariee e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	System.out.println(Y.toString()+"est marié à"+N.toString());
	}
}
