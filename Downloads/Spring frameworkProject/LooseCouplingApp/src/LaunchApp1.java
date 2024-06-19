import services.BlueDart;

public class LaunchApp1 
{

	public static void main(String[] args) 
	{
		System.out.println("Welcome to our First loosely coupled application App");
		
		//Constructor Injection
		Amazon amz=new Amazon(new BlueDart());
		
		//setter dependency injection
		//amz.setService(new DHL());
		
		Boolean status=amz.deliverTheProduct(4554.4);
		
		if(status)
			System.out.println("Product Delivered Successfully");
		else
			System.out.println("Failed to deliver product");

	}

}
