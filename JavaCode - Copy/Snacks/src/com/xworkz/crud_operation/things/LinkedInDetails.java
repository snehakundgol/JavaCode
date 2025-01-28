package com.xworkz.crud_operation.things;

import java.util.Objects;

public class LinkedInDetails 
{
		private int id;
	    private String name;
	    private String email;
	    private String skills;
	    private String location;

	    public LinkedInDetails () 
	    {
	        this.id = id;
	        this.name = name;
	        this.email = email;
	        this.skills = skills;
	        this.location = location;
	    }

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

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getSkills() {
			return skills;
		}

		public void setSkills(String skills) {
			this.skills = skills;
		}

		public String getLocation() {
			return location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		@Override
		public int hashCode() {
			return Objects.hash(email, id, location, name, skills);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			LinkedInDetails other = (LinkedInDetails) obj;
			return Objects.equals(email, other.email) && id == other.id
					&& Objects.equals(location, other.location) && Objects.equals(name, other.name)
					&& Objects.equals(skills, other.skills);
		}

		@Override
		public String toString() {
			return "LinkedInDetails [id=" + id + ", name=" + name + ", email=" + email + ", skills=" + skills + ", location=" + location + "]";
		}

		public Object getUserId() {
			return null;
		}
}
