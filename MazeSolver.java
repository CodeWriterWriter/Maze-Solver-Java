package maze;

public class MazeSolver {
	private Maze maze;
	private Agenda agenda;
	
	public MazeSolver (boolean Choice, String path)
	{
		maze = new Maze(path);
		if (Choice == true)
		{
			agenda = new MyStack(maze.size());
		}
		else
		{
			agenda = new MyQueue(maze.size());
		}
	}
	
	public boolean start()
	{
		for (int i = 0; i < maze.returnX(); i++)
		{
			for (int j = 0; j < maze.returnY(); j++)
			{
				if (maze.maze[i][j].equals(Square.START))
				{
					agenda.add(i + "" + j);
				}
			}
		}
		while (!agenda.isEmpty())
		{
			boolean found = false;
			String ref = agenda.remove();
			int x = Character.getNumericValue(ref.charAt(0));
			int y = Character.getNumericValue(ref.charAt(1));
			String check;
			if (!(x < 0))
			{
				check = (x-1) + "" + y;
				if (maze.maze[x-1][y].equals(Square.FINISH))
				{
					found = true;
				}
				else if (!(maze.maze[x-1][y].equals(Square.WALL)))
				{
					if (!(agenda.contains(check)))
					{
						agenda.add(check);
					}
				}
			}
			if (!(y < 0))
			{
				check = (x) + "" + (y-1);
				if (maze.maze[x][y-1].equals(Square.FINISH))
				{
					found = true;
				}
				else if (!(maze.maze[x][y-1].equals(Square.WALL)))
				{
					if (!(agenda.contains(check)))
					{
						agenda.add(check);
					}
				}
			}
			if (!(y >= maze.returnY()))
			{
				check = (x) + "" + (y+1);
				if (maze.maze[x][y+1].equals(Square.FINISH))
				{
					found = true;
				}
				else if (!(maze.maze[x][y+1].equals(Square.WALL)))
				{
					if (!(agenda.contains(check)))
					{
						agenda.add(check);
					}
				}
			}
			if (!(x >= maze.returnX()))
			{
				check = (x+1) + "" + (y);
				if (maze.maze[x][y+1].equals(Square.FINISH))
				{
					found = true;
				}
				else if (!(maze.maze[x+1][y].equals(Square.WALL)))
				{
					if (!(agenda.contains(check)))
					{
						agenda.add(check);
					}
				}
			}
			if (found = true)
			{
				break;
			}
		}
		if (!agenda.isEmpty())
		{
			return true;
		}
		return false;
	}

}
