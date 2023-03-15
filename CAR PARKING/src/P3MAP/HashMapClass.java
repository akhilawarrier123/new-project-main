package P3MAP;

import java.util.HashMap;

public class HashMapClass {

	
	public void mapdata(String Vnumber,String VDetails) 
	
	{
		Object ContactNumber;
		String alldata=ContactNumber.getText().toString()+"_"+VehicleTime.getText().toString();
			
		hashmapclass.mapdata(VehicleLabel.getText().toString(),alldata);
		HashMap<String,String> map  = new HashMap<>();
		map.put(Vnumber, VDetails);
		
		/* String[] Fulldeatils =VDetails.split("-");
		 String Time=Fulldeatils[0];
		 String Address=Fulldeatils[1];*/
	}

}
