package javaGame2;

public class Game  implements Entity{
	
	 private int id;
	 private String gameName;
	 private String gameType;
	 private Double price;
	 private String description;
	
	public Game() {
		
	}

	public Game(int id, String gameName, String gameType, Double price, String description) {
		super();
		this.id = id;
		this.gameName = gameName;
		this.gameType = gameType;
		this.price = price;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public String getGameType() {
		return gameType;
	}

	public void setGameType(String gameType) {
		this.gameType = gameType;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	

}
