package com.shenba.example2;

import java.util.HashMap;
import java.util.Map;

public class DummyDBService {
	
	public Map<String, String> getOptions(String field) {
		Map<String, String> options = new HashMap<String, String>();
		switch (field) {
			case "GENDER" :
				options.put("Male", "M");
				options.put("Female", "F");
				options.put("Other", "O");
				return options;
			case "NATIONALITY" :
				options.put("India", "IND");
				options.put("NRI", "NRI");
				options.put("Other", "OTH");
				return options;
			case "LANGUAGES" :
				options.put("Tamil", "TA");
				options.put("English - US", "EN-US");
				options.put("English - UK", "EN-UK");
				options.put("French", "FR");
				options.put("German", "DE");
				return options;
			case "SKILLS" :
				options.put("Java", "JAVA");
				options.put("Python", "PY");
				options.put("JavaScript", "JS");
				options.put("PL/SQL", "SQL");
				options.put("Shell Script", "SH");
				return options;
			default :
				return options;
		}
			
	}

}
