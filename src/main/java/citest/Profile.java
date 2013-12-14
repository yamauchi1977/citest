package citest;

import java.util.ArrayList;
import java.util.List;

public class Profile {
	private String name = "じょん";
	private List<String> tags = new ArrayList<>();

	public String getName(){
		return name;
	}

	public void addTag(String tag){
		this.tags.add(tag);
	}
}
