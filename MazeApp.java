package maze;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class MazeApp {
	
	public String filePath;
	public boolean stack;

	public static void main(String[] args) {
		MazeApp app = new MazeApp();
	}
			
	public MazeApp()
		{
			JFrame frame = new JFrame ("window");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			//frame.setSize(800,600);
			
			
			JPanel load = new JPanel();
			frame.add(load);
			JButton loadButton = new JButton("Load");
			load.add(loadButton);
			
			JPanel startStack = new JPanel();
			frame.add(startStack);
			JButton startStackButton = new JButton("Start(stack)");
			load.add(startStackButton);
			
			JPanel startQueue = new JPanel();
			frame.add(startQueue);
			JButton startQueueButton = new JButton("Start(queue)");
			load.add(startQueueButton);
			
			
			JPanel step = new JPanel();
			frame.add(step);
			JButton stepButton = new JButton("Step");
			load.add(stepButton);
			
			JPanel toggleAnimation = new JPanel();
			frame.add(toggleAnimation);
			JButton toggleAnimationButton = new JButton("Toggle Animation");
			load.add(toggleAnimationButton);
			
			JTextField file = new JTextField();
			
			frame.add(file);
			
			
			
			frame.pack();
			frame.setVisible(true);
			
			filePath = file.getText();
			
		}
		
	public void process()
	{
		MazeSolver solve = new MazeSolver(stack,filePath);
		if (solve.start())
		{
			System.out.println("Maze Solved");
		}
		else
		{
			System.out.println("Maze Unsolved");	 
		}
		
	}
}
