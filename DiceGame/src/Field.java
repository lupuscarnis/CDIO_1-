
public class Field {

	public String name,description;
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
	
	public String setDescription(String newDescription)
	{
		newDescription=description;
	return description;
	}
	
	public int findField(int getSum){
		// getsum her defineres som en int, skal vaere en metode defineret i Cup. Har bare lavet en
		// getSum int for at jeg kan se om tingene fungerer.
	 
		
	if (getSum==2)
	{
		setValue(250);
		System.out.println("A Trump tower collapses on you, claim 250$ as compensation");
		setName("Tower");
		setDescription("A Trump tower collapses on you, claim 250$ as compensation");
	}
	
	if (getSum==3)
	{
		setValue(-100);
		System.out.println("if you like Vredefort, you'll love this, because it is the exact"
				+ " same, except larger and more expensive ");
		setName("Crater");
		setDescription("if you like Vredefort, you'll love this, because it is the exact"
				+ " same, except larger and more expensive");
	}
	
	if (getSum==4)
	{
		setValue(100);
		System.out.println("you see a beautiful palace in the distance, and decide to steal its gates");
		setName("Palace gates");
		setDescription("you see a beautiful palace in the distance, and decide to steal its gates");
		setName("Palace gates");
	}
	
	if (getSum==5)
	{
		setValue(-20);
		System.out.println("you ordered a cold dessert, you didn't get exacly what you wanted, "
				
				+ "but it still cost you 20$");
		setName("Cold Desert");
		setDescription("you ordered a cold dessert, you didn't get exacly what you wanted, "
				
				+ "but it still cost you 20$");
		setName("Cold Desert");
	}
	
	if (getSum==6)
	{
		setValue(180);
		System.out.println("As soon as the army heard the sound of the trumpets, they shouted"
				+ " loudly and the wall collapsed. you earn 180$ by pillaging jericho");
		setName("Walled city");
		setDescription("As soon as the army heard the sound of the trumpets, they shouted"
				+ " loudly and the wall collapsed. you earn 180$ by pillaging jericho");
		setName("Walled city");
	}
	
	if (getSum==7)
	{
		setValue(-0);
		System.out.println("you expected beautifyl nuns, but there were only bald men. "
				+ "At least the sex was free");
		setName("Monastary");
		setDescription("you expected beautifyl nuns, but there were only bald men. "
				+ "At least the sex was free");
		setName("Monastary");
	}
	
	if (getSum==8)
	{
		setValue(-70);
		System.out.println("The Black cave is a wonderful inn, but it is also expensive...");
		setName("Black cave");
		setDescription("The Black cave is a wonderful inn, but it is also expensive...");
		setName("Black cave");
	}
	
	if (getSum==9)
	{
		setValue(60);
		System.out.println("Apparently, this is where the hood is. You earn 60$ in a rap battle ");
		setName("Huts in the mountain");
		setDescription("Apparently, this is where the hood is. You earn 60$ in a rap battle ");
		setName("Huts in the mountain");
	}
	
	if (getSum==10)
	{
		setValue(-80);
		System.out.println("A wall of werewolves might sound terrifying, but once the twitching stops,"
				+ " it won't stop a single determined mexican");
		setName("The Werewall");
		//exacly how we give the player another turn depends on the main system
		setDescription("A wall of werewolves might sound terrifying, but once the twitching stops,"
				+ " it won't stop a single determined mexican");
		setName("The Werewall");
	}
	
	if (getSum==11)
	{
		setValue(-50);
		System.out.println("You drop a 50$ bill into a pit, how unfortunate");
		setName("The pit");
		setDescription("You drop a 50$ bill into a pit, how unfortunate");
	}
	
	if (getSum==12)
	{
		setValue(60);
		System.out.println("Apparently, this is where the hood is. You earn 60$ in a rap battle ");
		setName("Huts in the mountain");
		setDescription("Apparently, this is where the hood is. You earn 60$ in a rap battle ");
		setName("Huts in the mountain");
	}
	
	if (getSum==12)
	{
		setValue(650);
		System.out.println("And who says that slave labour doesn't pay");
		setName("Goldmine");
		setDescription("And who says that slave labour doesn't pay");
	}
	
	else
	{
		setValue(-10000000);
		System.out.println("Remind yourself, that overconfidence is a slow, and insidious killer");
		setName("The chamber of dead memes");
		setDescription("Remind yourself, that overconfidence is a slow, and insidious killer");
	}
	
	
	return 2;
	}
	

	
	
}












