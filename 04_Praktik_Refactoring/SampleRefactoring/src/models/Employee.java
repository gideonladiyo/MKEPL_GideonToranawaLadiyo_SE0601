import java.sql.Date;
import Departement;
import EmployeeContact;
import models.JobInfo;
import models.PersonalInfo;

public class Employee {
    private PersonalInfo personalInfo;
    private EmergencyContact emergencyContact;
    private JobInfo jobInfo;

    public Employee(PersonalInfo personalInfo,
            EmergencyContact emergencyContact,
            JobInfo jobInfo) {
        this.personalInfo = personalInfo;
        this.emergencyContact = emergencyContact;
        this.jobInfo = jobInfo;
    }

    public String getPersonalInfo() {
        return personalInfo;
    }

    public void setPersonalInfo(PersonalInfo personalInfo) {
        this.personalInfo = personalInfo;
    }

    public String getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(EmergencyContact emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    public String getJobInfo() {
        return jobInfo;
    }

    public void setJobInfo(JobInfo jobInfo) {
        this.jobInfo = jobInfo;
    }
}