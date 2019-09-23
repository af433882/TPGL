
import java.util.logging.Level;
import java.util.logging.Logger;

public class Orange
{

	private double prix;
	private String origine;

	public Orange(double p, String o) throws Exception	
        {	
		this.prix=p;
		this.origine=o;
                if(prix<0)
                    throw new Exception("prix invalide");
	}
        

	public double getPrix()
	{
		return this.prix;
	}

	public String getOrigine()
	{
		return this.origine;
	}

	public static void main (String[] args){
	{
		System.out.println("test");
            try {
                Orange o = new Orange(15,"Espagne");
            } catch (Exception ex) {
                Logger.getLogger(Orange.class.getName()).log(Level.SEVERE, null, ex);
            }
	}

        
  }
}
