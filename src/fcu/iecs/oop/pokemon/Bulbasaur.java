package fcu.iecs.oop.pokemon;

public class Bulbasaur extends Pokemon 
{
	public Bulbasaur(String name,PokemonType type, int cp)
	{
		super(name, type, cp);
	}
	public void attack() 
	{
		System.out.println("Tackle");
	}
}