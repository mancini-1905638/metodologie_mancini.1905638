package laboratorio4;

public class Carta
{
	private Valore valoreCarta;
	private Seme semeCarta;
	
	public Carta(Valore valoreCarta, Seme semeCarta)
	{
		this.valoreCarta = valoreCarta;
		this.semeCarta = semeCarta;
	}
	
	public String toString()
	{
		return valoreCarta + " DI " + semeCarta;
	}
	
	public static void main(String[] args)
	{
		Carta nuovaCarta = new Carta(Valore.ASSO, Seme.PICCHE);
		System.out.println(nuovaCarta);
	}
}

