package polymorphisme2;

public class B extends A  {
    
	public int y;
	public B()
	{   
		x++;
	   super.x++;
	  
	   y++;
	 
	};
	
	public B(int i)
	{   this();
		 x=x+i; 
		;
	}
	
	public B(String m)
	{   super();
		//System.out.println("salam cv!");
		x--;
	}
	

}
