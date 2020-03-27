package laboratorio4;

public enum Valore
{
	/**
	 * Ho aggiunto i valori numerici per esercizio, non perché mi siano utili in questo caso
	 */
	ASSO(1), DUE(2), TRE(3), QUATTRO(4), CINQUE(5), SEI(6), SETTE(7), OTTO(8), NOVE(9), DIECI(10), JACK(11), REGINA(12), RE(13);
	
	private int valore;
	
	Valore(int valore) { this.valore = valore; }
	
	public int toInt() { return valore; }
}
