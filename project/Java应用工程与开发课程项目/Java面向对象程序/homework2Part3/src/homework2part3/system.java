/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework2part3;

/**
 *
 * @author 加藤鹰
 */

    import java.io.IOException;

public class system {

    PatientDirectory patientDirectory;
    PersonDirectory personDirectory;

    public system() throws IOException {
        personDirectory = new PersonDirectory();

        System.out.println("\n");
        System.out.println("this shows the part3's requirement and PatientDirectory");
        patientDirectory = new PatientDirectory();
    }

    public system(PatientDirectory patientDirectory, PersonDirectory personDirectory) {
        this.patientDirectory = patientDirectory;
        this.personDirectory = personDirectory;
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(PersonDirectory personDirectory) {
        this.personDirectory = personDirectory;
    }

    public static void main(String[] args)throws IOException {
        system system = new system();
    }
}

