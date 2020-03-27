package laboratorio4;

public class BarraDiEnergia
{
	protected int lunghezza;
	protected int stato = 0;
	
	public BarraDiEnergia(int k)
	{
		this.lunghezza = k;
	}
	
	public void incrementa()
	{
		if (stato < lunghezza) stato++;
		else System.out.println("Barra già piena");
	}
	
	public String toString()
	{
		String barra = "";
		
		for (int x = 0; x < stato; x++) barra += "O";
		for (int y = 0; y < lunghezza-stato; y++) barra += "=";
		return barra;
	}
	
	public static void main(String[] args)
	{
		BarraDiEnergiaConPercentuale nuova = new BarraDiEnergiaConPercentuale(10);
		nuova.incrementa();
		nuova.incrementa();
		nuova.incrementa();
		System.out.println(nuova);
	}
}

class BarraDiEnergiaConPercentuale extends BarraDiEnergia
{
	public BarraDiEnergiaConPercentuale(int k)
	{
		super(k);
	}
	
	public String toString()
	{
		String barra = "";
		
		for (int x = 0; x < stato; x++) barra += "O";
		for (int y = 0; y < lunghezza-stato; y++) barra += "=";
		barra += (100*stato/lunghezza)+"%";
		return barra;
	}
}
