package com.shenba.example2;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OptionBuilder {
	
	//imagine that we have a DB service that returns options for various UI fields (HTML)
	//these options can be rendered as check-boxes or radio buttons or select boxes or multi-select
	//let us write a common method with a call-back function
	//as we have seen functional interface in example 1, I am using Java's Function<T, R> interface here
	
	//Just imagine this is a Spring project ;-)
	
	//@Autowired
	//private DummyDBService dbService;
	
	/**
	 * @param field
	 * @param htmlRenderer
	 * @return a HTML string that can be appended to a HTML DIV or SPAN tag to render the options
	 */
	public String getOptionsAsHtml(String field, Function<Map<String, String>, String> htmlRenderer) {
		DummyDBService dbService = new DummyDBService();
		Map<String, String> options = dbService.getOptions(field);
		return htmlRenderer.apply(options);
	}
	
	//@RequestMapping("/get/genders")
	public String getGenders() {
		return getOptionsAsHtml("GENDER", opt -> {
			return opt.entrySet().stream().map(e -> {
				return "<input type='radio' name='gender' value='" + e.getValue() + "'> " + e.getKey();})
					.collect(Collectors.joining(" \n"));
		});
	}
	
	//@RequestMapping("/get/languages")
	public String getLanguages() {
		return getOptionsAsHtml("LANGUAGES", opt -> {
			return opt.entrySet().stream().map(e -> {
				return "<input type='checkbox' name='languages' value='" + e.getValue() + "'> " + e.getKey();})
					.collect(Collectors.joining(" \n"));
		});
	}
	
	//@RequestMapping("/get/nationalities")
	public String getNationalities() {
		return getOptionsAsHtml("NATIONALITY", opt -> {
			return "<select name='nationalities'>\n" + opt.entrySet().stream().map(e -> {
				return "\t<option value='" + e.getValue() + "'>" + e.getKey() + "</option>";})
					.collect(Collectors.joining(" \n")) + "\n</select>";
		});
	}
	
	//@RequestMapping("/get/skills")
	public String getSkills() {
		return getOptionsAsHtml("SKILLS", opt -> {
			return "<select name='skills' multiple>\n" + opt.entrySet().stream().map(e -> {
				return "\t<option value='" + e.getValue() + "'>" + e.getKey() + "</option>";})
					.collect(Collectors.joining(" \n")) + "\n</select>";
		});
	}

}
