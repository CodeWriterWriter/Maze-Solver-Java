package maze;

import java.util.Arrays;

public class MyStack implements Agenda{
	private String[] stack;
	private int N;
	
	public MyStack(int max)
	{
		stack = new String[max];
	}
	
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (N == 0);
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return (N);
	}

	@Override
	public String remove() {
		if (null != stack && 0 < stack.length)
			return stack[--N];
		else
			return null;
	}

	

	@Override
	public String peek() {
		if (null != stack && 0 < stack.length)
    		return stack[stack.length - 1];
    	else
    		return null;
	}

	@Override
	public void add(String item) {
		stack[N++] = item;
		
	}

	@Override
	public boolean contains(String item) {
		return (Arrays.asList(stack).contains(item));
	}

}
