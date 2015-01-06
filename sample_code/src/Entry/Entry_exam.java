package Entry;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Entry_exam {

	public static void main(String[] args) {
		Map<String,Object> dataMap = new HashMap<String,Object>();
		dataMap.put("1_key", "1_value");
		dataMap.put("2_key", "2_value");
		dataMap.put("3_key", "3_value");
		
		for(Entry<String,Object> entry : dataMap.entrySet()){
			System.out.println( entry.getKey() + "=======" + entry.getValue() );
		}
	}

}
