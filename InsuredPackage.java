
public class InsuredPackage extends Package{
	private double weightInOunces, shipping, insuranceCost, newAd, add;
	private char shippingMethod;
	
	public InsuredPackage(double weightInOunces, char shippingMethod)
	{
		super(weightInOunces, shippingMethod);
		this.weightInOunces = weightInOunces;
		this.shippingMethod = shippingMethod;
		
		calculateInsuranceCost();
	}

	private void calculateInsuranceCost()
	{	
		if(shippingMethod == 'A')
		{
			if(weightInOunces >= 1 && weightInOunces <= 8)
			{
        		shipping = weightInOunces * 2.0 + 3.95; 
			}
			else if(weightInOunces >= 9 && weightInOunces <= 16)
			{
				shipping = weightInOunces * 3.0 + 3.95; 
			}
			else if(weightInOunces >= 17)
			{
				shipping = weightInOunces * 4.50 + 5.55; 
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
        		shipping = weightInOunces * 1.50 + 3.95; 
			}
			else if(weightInOunces >= 9 && weightInOunces <= 16)
			{
				shipping = weightInOunces * 2.35 + 3.95; 
			}
			else if(weightInOunces >= 17)
			{
				shipping = weightInOunces * 3.25 + 5.55; 
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
        		shipping = weightInOunces * .50 + 2.45; 
			}
			else if(weightInOunces >= 9 && weightInOunces <= 16)
			{
				shipping = weightInOunces * 1.50 + 3.95; 
			}
			else if(weightInOunces >= 17)
			{
				shipping = weightInOunces * 2.15 + 3.95; 
			}
			else
			{
				System.out.print("Invalid Input");
			}
		}
	}
	
//	private void calculateInsuranceCost()
//	{
//		if(insuranceCost >=0 && insuranceCost <= 1.00)
//		{
//			add = super.getShipping();
//			newAd = add + 2.45;
//		}
//		else if(insuranceCost >= 1.01 && insuranceCost <= 3.00)
//		{
//			add = super.getShipping();
//			newAd = add + 3.95;
//		}
//		else if(insuranceCost >= 3.01)
//		{
//			add = super.getShipping();
//			newAd = add + 5.55;
//		}
//	}
	
	public double getShipping()
	{
		return this.shipping;
	}
	
	public void display()
	{
		super.display();
		System.out.println("Shipping Cost with insurance: $" + shipping);
	}
	

}
