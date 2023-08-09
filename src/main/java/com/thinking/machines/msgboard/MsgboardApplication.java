package com.thinking.machines.msgboard;
import java.io.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.*;
import com.google.gson.*;
import com.thinking.machines.msgboard.beans.*;
@SpringBootApplication
public class MsgboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsgboardApplication.class, args);
	}
@Bean
public DataBaseBean getDataBaseBean()
{
System.out.println("getDataBaseBean got called");
DataBaseBean dataBaseBean=null;
try
{
File file = new File("conf"+File.separator+"db.json");
if(file.exists())
{
Gson gson = new Gson();
dataBaseBean=gson.fromJson(new FileReader(file.getAbsolutePath()),DataBaseBean.class);
}
else 
{
dataBaseBean = new DataBaseBean();
}
}catch(Exception exception)
{
System.out.println(exception); // later on it should be logged 
}
return dataBaseBean;
}
}
