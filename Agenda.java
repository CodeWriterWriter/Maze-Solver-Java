package maze;

public interface Agenda {
	
	public boolean isEmpty();
	
	public int size();
	
	public String remove();
	
	public void add(String item);
	
	public String peek();
	
	public boolean contains(String item);

}
