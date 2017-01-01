package fcu.iecs.oop.pokemon;

public abstract class  Pokemon implements Fightable
{
	private String nickname;
	private final PokemonType type;
	private int cp;

	public Pokemon(String name, PokemonType type, int cp){
		this.nickname = name;
		this.type = type;
		this.cp = cp;
	}
	
	public PokemonType getType(){
		return type;
	}
	public String getNickname(){
		return nickname;
	}
	public int getCp(){
		return cp;
	}
	
	public void setNickname(String name){
		this.nickname = name;
	}
	
	public void setCp(int cp){
		this.cp = cp;
	}
	
}