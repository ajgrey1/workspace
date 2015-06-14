package nature;

public interface Animal {

	public boolean isAPet = true;
	public String owner = "Fred";
	
	public void sleep();
	
	public void eat();
	
	public abstract void move();
}
