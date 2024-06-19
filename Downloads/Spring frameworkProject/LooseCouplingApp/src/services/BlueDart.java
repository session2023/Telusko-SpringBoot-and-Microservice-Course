package services;

public class BlueDart implements DeliveryService 
{

	@Override
	public Boolean deliverProduct(Double amount) 
	{
		System.out.println("Product delivered with BlueDart service and amount paid is : "+ amount);
		return true;
	}

}
