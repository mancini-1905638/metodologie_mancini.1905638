package laboratorio4;

public class TestMazzo
{
	public static void main(String[] args)
	{
		MazzoDiCarte nuovoMazzo = new MazzoDiCarte();
		
		nuovoMazzo.mescola();
		
		for (int x = 0; x < 52; x++)
		{
			System.out.println(nuovoMazzo.distribuisci());
		}
	}
}
