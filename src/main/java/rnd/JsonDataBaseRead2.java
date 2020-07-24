/*package rnd;

import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class JsonDataBaseRead2 {
	
	DataBaseUtility du = new DataBaseUtility();
	
	@BeforeClass
	public void dataBaseConnectionDone() throws Exception {
		DataBaseUtility.dataBaseAttributeName("Players_data", ".//dataBaseFile//output2.json");
	}
	
	@DataProvider(name="dp")
	public String [] readJson() throws Exception{
		JSONParser jsonParse = new JSONParser();
		FileReader file= new FileReader(".//dataBaseFile//output.json");
		Object obj = jsonParse.parse(file);
		JSONObject userLoginJsonObject=(JSONObject)obj;
		JSONArray userJsonArray=(JSONArray)userLoginJsonObject.get("Players_data");
	
	String arr [] = new String[userJsonArray.size()];
	
	     for(int i =0 ;i<=userJsonArray.size()-1;i++) {
	    	 JSONObject users=(JSONObject)userJsonArray.get(i);
	    	 String First_Name= (String) users.get("First_Name");
		    	String address= (String) users.get("address");
		    	String Last_Name= (String) users.get("Last_Name");
		    	String ID=String.valueOf(users.get("ID"));
		    	String salary= (String) users.get("salary");
		    	String Place_Of_city=String.valueOf(users.get("Place_Of_city"));
		    	 
		    	arr[i]=First_Name+","+address+","+Last_Name+","+ID+","+salary+","+Place_Of_city;
	     }
	     
	     return arr;
	}
	
	@Test(dataProvider="dp")
	public void dataTest(String data) {
		
		String[] users = data.split(",");
		System.out.println(users[0]+","+users[1]+","+users[2]+","+users[3]);
		System.out.println("testing code");
	}

}
*/