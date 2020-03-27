package laboratorio4;

public abstract class Animale
{
	protected int zampe;
	protected Taglia taglia;
	
	public Animale(Taglia taglia, int zampe)
	{
		this.taglia = taglia;
		this.zampe = zampe;
	}
	
	abstract void emettiVerso();
	public int getNumeroDiZampe() { return zampe; }
	public Taglia getTaglia() { return taglia; }
}

abstract class Mammifero extends Animale
{
	public Mammifero(Taglia taglia, int zampe)
	{
		super(taglia,zampe);
	}
}

abstract class Felino extends Mammifero
{
	public Felino(Taglia taglia)
	{
		super(taglia, 4);
	}
}

class Gatto extends Felino
{
	public Gatto()
	{
		super(Taglia.Piccola);
	}	
	
	public void emettiVerso()
	{
		System.out.println("Miao!");
	}
}

class Tigre extends Felino
{
	public Tigre()
	{
		super(Taglia.Grande);
	}
	
	public void emettiVerso()
	{
		System.out.println("MIAO!!");
	}
}

abstract class Cane extends Mammifero
{
	public Cane(Taglia taglia)
	{
		super(taglia, 4);
	}
}

class Chihuahua extends Cane
{
	public Chihuahua()
	{
		super(Taglia.Piccola);
	}
	
	public void emettiVerso()
	{
		System.out.println("Bau");
	}
}

class Beagle extends Cane
{
	public Beagle()
	{
		super(Taglia.Media);
	}
	
	public void emettiVerso()
	{
		System.out.println("Bau!");
	}
}

class Terranova extends Cane
{
	public Terranova()
	{
		super(Taglia.Grande);
	}
	
	public void emettiVerso()
	{
		System.out.println("BAU!");
	}
}

abstract class Uccello extends Animale
{
	public Uccello(Taglia taglia)
	{
		super(taglia, 2);
	}
}

class Corvo extends Uccello
{
	public Corvo()
	{
		super(Taglia.Media);
	}
	
	public void emettiVerso()
	{
		System.out.println("Cra!");
	}
}

class Passero extends Uccello
{
	public Passero()
	{
		super(Taglia.Piccola);
	}
	
	public void emettiVerso()
	{
		System.out.println("Chip!");
	}
}

class Millepiedi extends Animale
{
	public Millepiedi()
	{
		super(Taglia.Piccola, 1000);
	}
	
	public void emettiVerso()
	{
		System.out.println("♫ E il millepiedi come fa? ♫");
	}
}