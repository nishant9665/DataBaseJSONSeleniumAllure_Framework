/*package rnd;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
public class DataBaseToJson {
	public static ResultSet RetrieveData() throws Exception {
		  String name,pass,url;  
		    Connection con = null; 
			
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
		    url="jdbc:mysql://localhost:3306/protractordatabase";  
		    name="root";  
		    pass="password";  
		    try {
				con = DriverManager.getConnection(url,name,pass);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
		    System.out.println("Connection created");
	      //Creating the Statement
	      Statement stmt = con.createStatement();
	      //Retrieving the records
	      ResultSet rs = stmt.executeQuery("select * from persons");
	      return rs;
	   }
public static void main(String[] args) throws Exception {
	//Creating a JSONObject object
  JSONObject jsonObject = new JSONObject();
  //Creating a json array
  JSONArray array = new JSONArray();
  ResultSet rs = RetrieveData();
  //Inserting ResutlSet data into the json object
  while(rs.next()) {
     JSONObject record = new JSONObject();
     //Inserting key-value pairs into the json object
     record.put("ID", rs.getInt("PersonID"));
     record.put("First_Name", rs.getString("FirstName"));
     record.put("Last_Name", rs.getString("LastName"));
     record.put("address", rs.getString("Address"));
     record.put("Place_Of_city", rs.getString("City"));
     record.put("salary", rs.getString("salary"));
     array.add(record);
  }
  
  jsonObject.put("Players_data", array);
  try {
     FileWriter file = new FileWriter(".//dataBaseFile/output.json");
     file.write(jsonObject.toJSONString());
     file.close();
  } catch (IOException e) {
     // TODO Auto-generated catch block
     e.printStackTrace();
  }
  System.out.println("JSON file created......");
}
}
*/