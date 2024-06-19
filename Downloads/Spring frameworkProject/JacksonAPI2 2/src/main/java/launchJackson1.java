import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class launchJackson1 
{

	public static void main(String[] args) throws IOException 
	{
		//createobject Mapper
		
		ObjectMapper mapper=new ObjectMapper();
		
		
		//JSON to Java
		Alien alien=mapper.readValue(new File("json/sample.json"), Alien.class);
		
		System.out.println(alien);

	}

}
