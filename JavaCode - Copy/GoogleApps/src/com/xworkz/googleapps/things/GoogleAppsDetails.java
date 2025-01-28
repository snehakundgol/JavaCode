package com.xworkz.googleapps.things;

import java.util.Objects;

public class GoogleAppsDetails {
	
	private int id;
    private String name;
    private String category;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public int hashCode() {
		return Objects.hash(category, id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GoogleAppsDetails other = (GoogleAppsDetails) obj;
		return Objects.equals(category, other.category) && id == other.id && Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return "GoogleAppsDetails [id=" + id + ", name=" + name + ", category=" + category + "]";
	}
    
    

}
