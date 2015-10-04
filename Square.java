package maze;

public enum Square {
	WALL("#"),
	OPEN("."),
	START("o"),
	FINISH("*");
	
	private final String squareType;
	
	private Square (String squareType)
	{
		this.squareType = squareType;
	}
	
	public String toString()
	{
		if (squareType.equals(WALL))
		{
			return "#";
		}
		else if (squareType.equals(OPEN))
		{
			return ".";
		}
		else if (squareType.equals(START))
		{
			return "o";
		}
		else
		{
			return "*";
		}
	}
	
	public static Square fromChar(char ch)
	{
		if (String.valueOf(ch).equals("#"))
		{
			return Square.WALL;
		}
		else if (String.valueOf(ch).equals("."))
		{
			return Square.OPEN;
		}
		else if (String.valueOf(ch).equals("o"))
		{
			return Square.START;
		}
		else if (String.valueOf(ch).equals("#"))
		{
			return Square.FINISH;
		}
		else
		{
			throw new IllegalArgumentException("not valid");
		}
	}

}
