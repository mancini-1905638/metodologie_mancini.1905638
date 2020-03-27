package laboratorio4;

public abstract class Animale
{
	protected int zampe;
	protected Taglia taglia;
	protected String verso;
	
	public Animale(Taglia taglia, int zampe, String verso)
	{
		this.taglia = taglia;
		this.zampe = zampe;
		this.verso = verso;
	}
	
	public void emettiverso() { System.out.println(verso); }
	public int getNumeroDiZampe() { return zampe; }
	public Taglia getTaglia() { return taglia; }
}

abstract class Mammifero extends Animale
{
	public Mammifero(Taglia taglia, int zampe, String verso)
	{
		super(taglia,zampe,verso);
	}
}

abstract class Felino extends Mammifero
{
	public Felino(Taglia taglia, String verso)
	{
		super(taglia, 4, verso);
	}
}

class Gatto extends Felino
{
	public Gatto()
	{
		super(Taglia.Piccola, "Miao!");
	}	
}

class Tigre extends Felino
{
	public Tigre()
	{
		super(Taglia.Grande, "MIAO!");
	}

}

abstract class Cane extends Mammifero
{
	public Cane(Taglia taglia)
	{
		super(taglia, 4, "Wof!");
	}
}

class Chihuahua extends Cane
{
	public Chihuahua()
	{
		super(Taglia.Piccola);
	}
}

class Beagle extends Cane
{
	public Beagle()
	{
		super(Taglia.Media);
	}
}

class Terranova extends Cane
{
	public Terranova()
	{
		super(Taglia.Grande);
	}
}

abstract class Uccello extends Animale
{
	public Uccello(Taglia taglia, String verso)
	{
		super(taglia, 2, verso);
	}
}

class Corvo extends Uccello
{
	public Corvo()
	{
		super(Taglia.Media, "Cra!");
	}
}

class Passero extends Uccello
{
	public Passero()
	{
		super(Taglia.Piccola, "Chip!");
	}
}

class Millepiedi extends Animale
{
	public Millepiedi()
	{
		super(Taglia.Piccola, 1000, "♫ E il millepiedi come fa? ♫");
	}
}