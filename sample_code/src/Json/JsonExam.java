package Json;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONValue;

public class JsonExam {

	public static void main(String[] args) {

		Map<String,String> nMap = new HashMap<String,String>();
		nMap.put("질럿", "하나얌");
		nMap.put("마린", "둘이얌");
		nMap.put("드론", "셋이얌");
		
		String jsonText = JSONValue.toJSONString(nMap);
		
		System.out.println(jsonText);
		
		

		
	}

}
