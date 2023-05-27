
package ClassDemo;

import InterfaceDemo.CourseOperations;


public class Student implements CourseOperations {
    
    String name;
    int sid ;
    Course courses;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public Course getCourses() {
        return courses;
    }

    public void setCourses(Course courses) {
        this.courses = courses;
    }

    @Override
    public void insertCourse(Course c) {
        
    }

    @Override
    public void removeCourse(Course c) {
        
    }

    @Override
    public Course getCourse(int CourseNumber) {          
        return null;
    }

    @Override
    public void showAllCourse() {
        
    }  

    void setCredit(int credit) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setcourseNumber(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
