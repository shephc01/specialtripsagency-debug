package org.specialtripsagency;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * This class was automatically generated by the data modeler tool.
 * $HASH(2c06ba0e4d7108439ea12be040df563c)
 */
@org.kie.api.definition.type.Label(value = "Applicant")
@Entity
public class Applicant extends java.lang.Object implements java.io.Serializable {

    static final long serialVersionUID = 1L;
    
    @Id 
    @GeneratedValue( strategy=GenerationType.AUTO )
    private Integer appId;
    
    @org.kie.api.definition.type.Label(value = "Email Address")
    @org.kie.api.definition.type.Position(value = 1)
    private java.lang.String emailAddress;
    
    @org.kie.api.definition.type.Label(value = "Applicant Name")
    @org.kie.api.definition.type.Position(value = 0)
    private java.lang.String name;
    
    @org.kie.api.definition.type.Label(value = "Number Of Travelers")
    @org.kie.api.definition.type.Position(value = 2)
    private java.lang.Integer numberOfTravelers;
    
    @org.kie.api.definition.type.Label(value = "Additional Details of Applicant")
    @org.kie.api.definition.type.Position(value = 3)
    private java.lang.String otherDetails;

    public Applicant() {
    }

    public Applicant(java.lang.String name, java.lang.String emailAddress, java.lang.Integer numberOfTravelers, java.lang.String otherDetails) {
        this.name = name;
        this.emailAddress = emailAddress;
        this.numberOfTravelers = numberOfTravelers;
        this.otherDetails = otherDetails;
    }
  
    public Integer getAppId() {
        return appId;
     }

     public void setAppId(Integer appId) {
        this.appId = appId;
     }
    
    public java.lang.String getEmailAddress() {
        return this.emailAddress;
    }

    public void setEmailAddress(java.lang.String emailAddress) {
        this.emailAddress = emailAddress;
    }
    
    public java.lang.String getName() {
        return this.name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }
    
    public java.lang.Integer getNumberOfTravelers() {
        return this.numberOfTravelers;
    }

    public void setNumberOfTravelers(java.lang.Integer numberOfTravelers) {
        this.numberOfTravelers = numberOfTravelers;
    }
    
    public java.lang.String getOtherDetails() {
        return this.otherDetails;
    }

    public void setOtherDetails(java.lang.String otherDetails) {
        this.otherDetails = otherDetails;
    }
}