package com.xworkz.jobapplication.things;

import java.util.Objects;

public class JobApplication 
{
		private int id;
	    private String name;
	    private String email;
	    private String place;
	    private String language;
	    private String jobRole;
	    
	    public JobApplication(int id, String name, String email, String place, String language, 
	    		String jobRole) 
	    {
	        this.id = id;
	        this.name = name;
	        this.email = email;
	        this.place = place;
	        this.language = language;
	        this.jobRole = jobRole;
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

		public String getPlace() {
			return place;
		}

		public void setPlace(String place) {
			this.place = place;
		}

		public String getLanguage() {
			return language;
		}

		public void setLanguage(String language) {
			this.language = language;
		}

		public String getJobRole() {
			return jobRole;
		}

		public void setJobRole(String jobRole) {
			this.jobRole = jobRole;
		}

		@Override
		public int hashCode() {
			return Objects.hash(email, id, jobRole, language, name, place);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			JobApplication other = (JobApplication) obj;
			return Objects.equals(email, other.email) && id == other.id && Objects.equals(jobRole, other.jobRole)
					&& Objects.equals(language, other.language) && Objects.equals(name, other.name)
					&& Objects.equals(place, other.place);
		}

		@Override
		public String toString() 
		{
			return "JobApplication [id=" + id + ", name=" + name + ", email=" + email + ", place=" + place
					+ ", language=" + language + ", jobRole=" + jobRole + "]";
		}
	}

