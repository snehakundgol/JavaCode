package com.xworkz.project_online.things;

import java.util.Objects;

public class OfficeDetails 
{
	private String officeName;
    private String location;
    private int establishedYear;
    private int numberOfEmployees;
    private int numberOfDepartments;
    private String CEOName;
    private String contactEmail;
    private String contactPhone;
    private String website;
    private double annualRevenue;
    private String industryType;
    private String headquarters;
    private String region;
    private boolean isPublicCompany;
    private boolean hasRemoteWorkPolicy;
    private String companyMotto;
    private String postalCode;
    private int officeFloorCount;
    private boolean hasParkingFacility;
    private boolean hasCafeteria;

    public OfficeDetails() 
    { 
    }

    public OfficeDetails(String officeName, String location, int establishedYear, int numberOfEmployees,
                          int numberOfDepartments, String CEOName, String contactEmail, String contactPhone,
                          String website, double annualRevenue, String industryType, String headquarters,
                          String region, boolean isPublicCompany, boolean hasRemoteWorkPolicy, String companyMotto,
                          String postalCode, int officeFloorCount, boolean hasParkingFacility, boolean hasCafeteria) {
        this.officeName = officeName;
        this.location = location;
        this.establishedYear = establishedYear;
        this.numberOfEmployees = numberOfEmployees;
        this.numberOfDepartments = numberOfDepartments;
        this.CEOName = CEOName;
        this.contactEmail = contactEmail;
        this.contactPhone = contactPhone;
        this.website = website;
        this.annualRevenue = annualRevenue;
        this.industryType = industryType;
        this.headquarters = headquarters;
        this.region = region;
        this.isPublicCompany = isPublicCompany;
        this.hasRemoteWorkPolicy = hasRemoteWorkPolicy;
        this.companyMotto = companyMotto;
        this.postalCode = postalCode;
        this.officeFloorCount = officeFloorCount;
        this.hasParkingFacility = hasParkingFacility;
        this.hasCafeteria = hasCafeteria;
    }

    // Getters and Setters
    public String getOfficeName() {
        return officeName;
    }

    public void setOfficeName(String officeName) {
        this.officeName = officeName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getEstablishedYear() {
        return establishedYear;
    }

    public void setEstablishedYear(int establishedYear) {
        this.establishedYear = establishedYear;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfDepartments() {
        return numberOfDepartments;
    }

    public void setNumberOfDepartments(int numberOfDepartments) {
        this.numberOfDepartments = numberOfDepartments;
    }

    public String getCEOName() {
        return CEOName;
    }

    public void setCEOName(String CEOName) {
        this.CEOName = CEOName;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public double getAnnualRevenue() {
        return annualRevenue;
    }

    public void setAnnualRevenue(double annualRevenue) {
        this.annualRevenue = annualRevenue;
    }

    public String getIndustryType() {
        return industryType;
    }

    public void setIndustryType(String industryType) {
        this.industryType = industryType;
    }

    public String getHeadquarters() {
        return headquarters;
    }

    public void setHeadquarters(String headquarters) {
        this.headquarters = headquarters;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public boolean isPublicCompany() {
        return isPublicCompany;
    }

    public void setPublicCompany(boolean publicCompany) {
        isPublicCompany = publicCompany;
    }

    public boolean isHasRemoteWorkPolicy() {
        return hasRemoteWorkPolicy;
    }

    public void setHasRemoteWorkPolicy(boolean hasRemoteWorkPolicy) {
        this.hasRemoteWorkPolicy = hasRemoteWorkPolicy;
    }

    public String getCompanyMotto() {
        return companyMotto;
    }

    public void setCompanyMotto(String companyMotto) {
        this.companyMotto = companyMotto;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public int getOfficeFloorCount() {
        return officeFloorCount;
    }

    public void setOfficeFloorCount(int officeFloorCount) {
        this.officeFloorCount = officeFloorCount;
    }

    public boolean isHasParkingFacility() {
        return hasParkingFacility;
    }

    public void setHasParkingFacility(boolean hasParkingFacility) {
        this.hasParkingFacility = hasParkingFacility;
    }

    public boolean isHasCafeteria() {
        return hasCafeteria;
    }

    public void setHasCafeteria(boolean hasCafeteria) {
        this.hasCafeteria = hasCafeteria;
    }

    @Override
    public String toString() {
        return "OfficeDetails{" +
                "officeName='" + officeName + '\'' +
                ", location='" + location + '\'' +
                ", establishedYear=" + establishedYear +
                ", numberOfEmployees=" + numberOfEmployees +
                ", numberOfDepartments=" + numberOfDepartments +
                ", CEOName='" + CEOName + '\'' +
                ", contactEmail='" + contactEmail + '\'' +
                ", contactPhone='" + contactPhone + '\'' +
                ", website='" + website + '\'' +
                ", annualRevenue=" + annualRevenue +
                ", industryType='" + industryType + '\'' +
                ", headquarters='" + headquarters + '\'' +
                ", region='" + region + '\'' +
                ", isPublicCompany=" + isPublicCompany +
                ", hasRemoteWorkPolicy=" + hasRemoteWorkPolicy +
                ", companyMotto='" + companyMotto + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", officeFloorCount=" + officeFloorCount +
                ", hasParkingFacility=" + hasParkingFacility +
                ", hasCafeteria=" + hasCafeteria +
                '}';
    }


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OfficeDetails other = (OfficeDetails) obj;
		return Objects.equals(CEOName, other.CEOName)
				&& Double.doubleToLongBits(annualRevenue) == Double.doubleToLongBits(other.annualRevenue)
				&& Objects.equals(companyMotto, other.companyMotto) && Objects.equals(contactEmail, other.contactEmail)
				&& Objects.equals(contactPhone, other.contactPhone) && establishedYear == other.establishedYear
				&& hasCafeteria == other.hasCafeteria && hasParkingFacility == other.hasParkingFacility
				&& hasRemoteWorkPolicy == other.hasRemoteWorkPolicy && Objects.equals(headquarters, other.headquarters)
				&& Objects.equals(industryType, other.industryType) && isPublicCompany == other.isPublicCompany
				&& Objects.equals(location, other.location) && numberOfDepartments == other.numberOfDepartments
				&& numberOfEmployees == other.numberOfEmployees && officeFloorCount == other.officeFloorCount
				&& Objects.equals(officeName, other.officeName) && Objects.equals(postalCode, other.postalCode)
				&& Objects.equals(region, other.region) && Objects.equals(website, other.website);
	}

    
	
}
