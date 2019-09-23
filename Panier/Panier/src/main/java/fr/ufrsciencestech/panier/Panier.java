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
        public void retire()
	{
		this.liste.remove(this.liste.size()-1);
	}

	public double getPrix()
	{
		double total=0;
		for(int i=0; i<this.getSize();i++)
		{
			total= total+this.liste.get(i).getPrix();
		}
		return total;
        }
        
        public String toString(){
            String res ="";
            double total=0;
            for(int i=0; i<this.getSize();i++)
            {
            	res+= "element "+i+" : origine "+this.liste.get(i).getOrigine()+" et prix :"+this.liste.get(i).getPrix()+"$\n";
            }
            return res;
            
        }
        
        public void boycotteOrigine(String s)
        {
            for(int i=0;i<this.liste.size();i++)
            {
                if(this.liste.get(i).getOrigine().equals(s) )
                    this.liste.remove(i);
            }
            
            
            
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
			System.out.println("il y a "+p.getSize()+" element dans le panier de taille : "+p.getTaille()+"est le prix est de "+p.getPrix());
			else{
				System.out.println("le panier est plien");
			}

		}
		p.retire();
                System.out.println("element retirer il y a "+p.getSize()+" element dans le panier de taille : "+p.getTaille()+"est le prix est de "+p.getPrix());
                System.out.println(p.toString());
                
                Panier p2 = new Panier(5);
                
                p2.ajoute(new Orange(0.80,"France"));
                p2.ajoute(new Orange(0.80,"Espagne"));
                p2.ajoute(new Orange(0.90,"Floride"));
                p2.boycotteOrigine("France");
                
                System.out.println("----------------------");
                System.out.println(p2.toString());
                
	}

}
