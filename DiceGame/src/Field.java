
public class Field {

	public String name;
	public int value;
	
	
	
	public Field(String newName)
	{
		newName=name;
	
	}
	
	public int setValue(int newValue)
	{
	newValue=value;
		return value;
	}
	
	public String setName(String newName)
	{
	newName=name;
		return name;
	}
	
	public int findField(int getSum){
		// getsum her defineres som en int, skal vaere en metode defineret i Cup. Har bare lavet en
		// getSum int for at jeg kan se om tingen fungerer.
	 
		
	if (getSum==2)
	{
		setValue(250);
		System.out.println("A Trump tower collapses on you, claim 250$ as compensation");
		setName("Tower");
		
	}
	
	}
	
	
	
	
	
}}
