
package InterfaceDemo;

import ClassDemo.Faculty;


public interface FacultyOperation {
 
    void setFaculty(Faculty e);
    void getFaculty(String fid);
    void insertFaculty(Faculty e);
    void removeFaculty(Faculty e);
    void showAllFaculty(); 
    
}
