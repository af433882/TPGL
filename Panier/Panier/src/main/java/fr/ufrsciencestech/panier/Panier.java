import java.util.ArrayList;

public class Panier
{
	private ArrayList<Orange> liste;
	private int taille;
	

	public Panier(int t)
	{
		this.liste = new ArrayList<Orange>();
		this.taille=t;
	} 

	public ArrayList getPanier()
	{
		return this.liste;
	}

	public int getTaille()
	{
		return this.taille;
	}

	public int getSize()
	{
		return this.liste.size();
	}

	public boolean estPlein()
	{
		if (this.getSize() == this.taille)
			return true;
		else
			return false;
	}

	public boolean estVide()
	{
		if (this.getSize() == 0)
			return true;
		else
			return false;
	}

	public boolean ajoute(Orange o)
	{
		if(this.getSize() < this.taille)
		{
			this.liste.add(o);
			return true;
		}
		return false;
				
	}

	public static void main(String args[]) throws Exception
	{
		Panier p = new Panier(5);
		

		for(int i =0; i<8;i++){
			if(p.estVide())
				System.out.println("le panier est vide");
			if(p.estPlein())
				System.out.println("le panier est plien");
			if(p.ajoute(new Orange(9.99,"france")))
			System.out.println("il y a "+p.getSize()+" element dans le panier de taille : "+p.getTaille());
			else{
				System.out.println("le panier est plien");
			}

		}

	}

}
