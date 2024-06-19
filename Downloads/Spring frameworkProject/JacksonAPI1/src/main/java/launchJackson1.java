import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class launchJackson1 
{

	public static void main(String[] args) throws JsonProcessingException 
	{
		Alien alien=new Alien();
		alien.setId(45);
		alien.setName("Srini");
		alien.setCity("Bengaluru");
		
		Alien alien2=new Alien();
		alien2.setId(44);
		alien2.setName("Vishal");
		alien2.setCity("Delhi");
		
		Alien alien3=new Alien();
		alien3.setId(44);
		alien3.setName("manas");
		alien3.setCity("Delhi");
		
//		System.out.println(alien);
		List<Alien> list=new ArrayList<>();
		list.add(alien);
		list.add(alien2);
		list.add(alien3);
		
		ObjectMapper mapper = new ObjectMapper();
		//String json=mapper.writeValueAsString(alien);
		String json=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(list);
		System.out.println(json);

	}

}
