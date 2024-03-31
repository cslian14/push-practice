
public class Package 
{
	private double weightInOunces;
	private char shippingMethod;
	private double shipping;
	
	public Package(double weightInOunces, char shippingMethod)
	{
		this.weightInOunces = weightInOunces;
		this.shippingMethod = shippingMethod;
		calculateCost();
	}
	
	public void calculateCost()
	{
		if(shippingMethod == 'A')
		{
			if(weightInOunces >= 1 && weightInOunces <= 8)
			{
        		shipping = weightInOunces * 2.0; 
			}
			else if(weightInOunces >= 9 && weightInOunces <= 16)
			{
				shipping = weightInOunces * 3.0; 
			}
			else if(weightInOunces >= 17)
			{
				shipping = weightInOunces * 4.50; 
			}
			else
			{
				System.out.print("Invalid input");
			}
		}
		else if(shippingMethod == 'T')
		{
			if(weightInOunces >= 1 && weightInOunces <= 8)
			{
        		shipping = weightInOunces * 1.50; 
			}
			else if(weightInOunces >= 9 && weightInOunces <= 16)
			{
				shipping = weightInOunces * 2.35; 
			}
			else if(weightInOunces >= 17)
			{
				shipping = weightInOunces * 3.25; 
			}
			else
			{
				System.out.print("Invalid Input");
			}
		}
		else if(shippingMethod == 'M')
		{
			if(weightInOunces >= 1 && weightInOunces <= 8)
			{
        		shipping = weightInOunces * .50; 
			}
			else if(weightInOunces >= 9 && weightInOunces <= 16)
			{
				shipping = weightInOunces * 1.50; 
			}
			else if(weightInOunces >= 17)
			{
				shipping = weightInOunces * 2.15; 
			}
			else
			{
				System.out.print("Invalid Input");
			}
		}
	}
	
	public double getWeightInOunces()
	{
		return this.weightInOunces;
	}
	
	public char getShippingMethod()
	{
		return this.shippingMethod;
	}
	
	public double getShipping()
	{
		return this.shipping;
	}
	
	public void display()
	{
		System.out.println("Weight: " + weightInOunces + " ounces");
        System.out.println("Shipping Method: " + shippingMethod);
        System.out.println("Shipping Cost: $" + shipping);
    }
	
}
