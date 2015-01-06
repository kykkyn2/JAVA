package Iterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Iterator_exam {

	public static void main(String[] args) {
		
		Map<String,Object> dataMap = new HashMap<String,Object>();
		dataMap.put("1_key", "1_value");
		dataMap.put("2_key", "2_value");
		dataMap.put("3_key", "3_value");
		
		for(Iterator<String> iter =dataMap.keySet().iterator(); iter.hasNext();){
			String key = (String) iter.next();
			System.out.println( key + "=======" + dataMap.get(key) );
		}
		
	}

}
