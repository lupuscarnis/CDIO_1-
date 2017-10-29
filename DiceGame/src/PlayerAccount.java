

public class PlayerAccount {

	public int balance;
	public int value;
	public boolean tjek;
	
	public PlayerAccount() {
		
		balance=1000;
	}
	
	
	 public int getBalance()
	  {
		 System.out.println(balance);
		  return balance;
		  
	  }
	  
	  int setBalance(int newBalance)
	  {
	  newBalance=balance;
	  
	  return balance;
	  }
	
  public boolean deposit(int value) {
	
	  balance+=value;
	
	  setBalance(balance);
	
	  if (value<=0)
	{
	tjek=true;
	
	}
	
    if (value<0)
    {tjek=false;	

	}
		
    return tjek;
  
  }
	
  public boolean withdraw(int value)
  {
	  balance+=value;
	  
	  setBalance(balance);
	  
	  return tjek;
	  
	  
  }
  
 
  
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
	
	


