
package InterfaceDemo;

import ClassDemo.Student;


public interface StudentOperation {
    
    void setStudent(Student s);
    void getStudent(int sid);
    void insertStudent(Student s);
    void removeStudent(Student s);
    void showAllStudents(); 
    
}
