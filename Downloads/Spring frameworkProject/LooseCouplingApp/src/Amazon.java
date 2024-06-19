import services.DeliveryService;

public class Amazon 
{
	private DeliveryService service;
	
	
	
	public Amazon(DeliveryService service) 
	{
		super();
		this.service = service;
	}
	
	
	public Amazon() 
	{
		super();
		
	}



	public void setService(DeliveryService service) //=new FedEx();
	{
		this.service = service;
	}





	public Boolean deliverTheProduct(Double amount)
	{
		
		return service.deliverProduct(amount);
		
	}

}
