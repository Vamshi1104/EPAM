class SingletonInnerClass
{
  
  private SingletonInnerClass()
  {}
  
  private static class inner
  {
    private static final SingletonInnerClass instance = new SingletonInnerClass();
  }
  
  public static SingletonInnerClass getInstance() 
  {
    return inner.instance;
  }
  
}
public class SingletonUsingInnerClass
{
	public static void main(String[] args)
	{
		SingletonInnerClass obj1=SingletonInnerClass.getInstance();
		SingletonInnerClass obj2=SingletonInnerClass.getInstance();
		if(obj1==obj2)
		{
			System.out.println("Both objects are Same");
		}
		
	}
}