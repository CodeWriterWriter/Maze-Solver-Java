package maze;

import java.util.Arrays;

public class MyQueue implements Agenda{
	private String[] que;
	private int N;
	private int top = -1;
	private int rear = 0;
	
	public MyQueue(int max)
	{
		que = new String[max];
	}

	@Override
	public boolean isEmpty() {
		return (N == 0);
	}

	@Override
	public int size() {
		return (N);
	}

	@Override
	public String remove() {
		String item = que[rear];
		que[rear] = null;
		rear++;
		return item;
	}

	@Override
	public String peek() {
		return que[rear];
	}

	@Override
	public void add(String item) {
		que[top++] = item;		
	}

	@Override
	public boolean contains(String item) {
		
		return (Arrays.asList(que).contains(item));
	}

}
