package com.xworkz.linkedinprofile.things;

import java.util.Objects;

class LinkedInProfile {
    private int id;
    private String name;
    private String email;
    private String headline;
    private String skills;
    private String location;

    public LinkedInProfile(int id, String name, String email, String headline, String skills, String location) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.headline = headline;
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

	public String getHeadline() {
		return headline;
	}

	public void setHeadline(String headline) {
		this.headline = headline;
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
		return Objects.hash(email, headline, id, location, name, skills);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LinkedInProfile other = (LinkedInProfile) obj;
		return Objects.equals(email, other.email) && Objects.equals(headline, other.headline) && id == other.id
				&& Objects.equals(location, other.location) && Objects.equals(name, other.name)
				&& Objects.equals(skills, other.skills);
	}

	@Override
	public String toString() {
		return "LinkedInProfile [id=" + id + ", name=" + name + ", email=" + email + ", headline=" + headline
				+ ", skills=" + skills + ", location=" + location + "]";
	}
   }