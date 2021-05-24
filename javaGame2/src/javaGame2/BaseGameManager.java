package javaGame2;

public abstract class  BaseGameManager  implements GameManager{

	@Override
	public abstract void add(Game game);

	@Override
	public abstract void update(Game game);

	@Override
	public abstract void delete(Game game);

	

}
