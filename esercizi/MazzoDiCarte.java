package laboratorio4;

public class MazzoDiCarte
{
	private Carta[] carte = new Carta[52];
	
	public MazzoDiCarte()
	{
		Seme[] semi = Seme.values();
		Valore[] valori = Valore.values();
		int count = 0;
		
		for (int x = 0; x < semi.length; x++)
			for (int y = 0; y < valori.length; y++)
			{
				carte[count] = new Carta(valori[y], semi[x]);
				count++;
			}
	}
	
	public void mescola()
	{
		for (int x = 0; x < 100; x++)
		{
			int carta1 = (int)(Math.random()*52);
			int carta2 = (int)(Math.random()*52);
			Carta temp = carte[carta1];
			carte[carta1] = carte[carta2];
			carte[carta2] = temp;
		}
	}
	
	public Carta distribuisci()
	{
		Carta cartaDaRitornare;
		
		for (int i = 0; i < 52; i++)
		{
			if (carte[i] != null)
			{
				cartaDaRitornare = carte[i];
				carte[i] = null;
				return cartaDaRitornare;
			}
		}
		return null;
	}
	
}
