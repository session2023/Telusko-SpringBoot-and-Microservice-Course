package com.telusko.SpringDataJpa1;




import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.telusko.SpringDataJpa1.dao.JobSeeker;
import com.telusko.SpringDataJpa1.service.JobServiceImpl;




@SpringBootApplication
public class SpringDataJpa1Application {

	public static void main(String[] args) throws IOException 
	{
		ConfigurableApplicationContext container = SpringApplication.run(SpringDataJpa1Application.class, args);

		JobServiceImpl jobService = container.getBean(JobServiceImpl.class);
		
		InputStream inputStream=null;
		FileReader reader=null;
		byte[] image=null;
		char[] textFile=null;
		
		
//		try 
//		{
//			inputStream=new FileInputStream("D:\\LOB\\Java.JPG");
//			image=new byte[inputStream.available()];
//			inputStream.read(image);
//			
//			File file=new File("D:\\LOB\\PersonalInfo.txt");
//			reader=new FileReader(file);
//			textFile=new char[(int)file.length()];
//			reader.read(textFile);
//		} 
//		catch (FileNotFoundException e) 
//		{
//			
//			e.printStackTrace();
//		}
//		catch (IOException e) 
//		{
//			
//			e.printStackTrace();
//		}
//		finally
//		{
//			try {
//				reader.close();
//				inputStream.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//		}
//		
//		
//		JobSeeker job=new JobSeeker();
//		job.setName("Vishal");
//		job.setCity("bengaluru");
//		job.setDob(LocalDate.of(1999, 8,3));
//		job.setImage(image);
//		job.setTextFile(textFile);
//		
//		String msg=jobService.registerJobSeeker(job);
//		System.out.println(msg);
		
		Integer id=2;
		Optional<JobSeeker> optional = jobService.searchJobSeekerInfoById(id);
		if(optional.isPresent())
		{
			JobSeeker job = optional.get();
			System.out.println(job.getId()+" --> "+job.getName()+ " , "+ job.getCity()+ " , "+job.getDob());
			
			FileOutputStream fos = new FileOutputStream("Java.JPG");
			fos.write(job.getImage());
			fos.flush();
			
			FileWriter writer=new FileWriter("PersonalInfo.txt");
			writer.write(job.getTextFile());
			writer.flush();
		}
		else
		{
			System.out.println("There is no record with given id "+ id);
		}
		container.close();
		
	}

}
