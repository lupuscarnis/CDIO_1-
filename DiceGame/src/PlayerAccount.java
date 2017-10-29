

public class PlayerAccount {

	public int balance;
	public int value;
	public boolean tjek;
	
	public PlayerAccount() {
		
		balance=1000;
	}
	
  public deposit(int value) {
	balance+=value;
		
	if (value<=0)
	{
	tjek=true;
	
	}
	
    if (value<0)
    {tjek=false;	

	}
		
    return tjek;
  
  }
	
	
	
}

