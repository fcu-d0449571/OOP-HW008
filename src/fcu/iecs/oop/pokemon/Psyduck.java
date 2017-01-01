package fcu.iecs.oop.pokemon;

public class Psyduck extends Pokemon
{

	public Psyduck(String name, PokemonType type, int cp) 
	{
		super(name, type, cp);
	}
	
	public void attack()
	{
		System.out.println("Aqua Tail");
	}
}