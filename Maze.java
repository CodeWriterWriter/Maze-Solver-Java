package maze;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Maze {
	protected Square[][] maze;
	private int x;
	private int y;
	
	public Maze(String path)
	{
		File file = new File(path);
		Scanner input;
		try {
			input = new Scanner(file);
			x = input.nextInt();
			y = input.nextInt();
			maze = new Square[x][y];
			boolean start = false;
			boolean mulStart = false;
			boolean finish = false;
			boolean mulFinish = false;
			for(int j = 0; j < y; j++ )
			{
				String line = input.next();
				for(int i = 0; i < x; i++)
				{
					if (Square.fromChar(line.charAt(i)).equals(Square.START))
					{
						if (start == true)
						{
							mulStart = true;
						}
						start = true;
					}
					if (Square.fromChar(line.charAt(i)).equals(Square.FINISH))
					{
						if (finish == true)
						{
							mulFinish = true;
						}
						finish = true;
					}
					
					maze[i][j] = Square.fromChar(line.charAt(i));
				}
				
			}
			if (mulStart || mulFinish || !start || !finish)
			{
				maze = null;
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public int size()
	{
		return (x*y);
	}
	
	public int returnX()
	{
		return x;
	}
	
	public int returnY()
	{
		return y;
	}

}
