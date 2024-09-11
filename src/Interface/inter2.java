package Interface;

public interface inter2 extends inter1
{
	

	void Add();
	
	static void cancel()
	{
		System.out.println("i am cancel method of inter2");
	}
	
	public static void main(String[] args)
	{
		cancel();
		inter1.cancel();
	}
	
	
}
