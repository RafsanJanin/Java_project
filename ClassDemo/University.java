package ClassDemo;

import InterfaceDemo.FacultyOperation;
import InterfaceDemo.StudentOperation;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class University implements StudentOperation,FacultyOperation {
    Student student;
    Faculty faculties;
    
    List<String> list = new ArrayList<String>(100); 
    List<String> listStudent = new ArrayList<String>(500); 
    Scanner input = new Scanner(System.in);

   
    @Override
    public void setStudent(Student s) {
        s.setName(s.name);
        s.setSid(s.sid);
    }

    @Override
    public void getStudent(int sid) {
        
    }

    @Override
    public void insertStudent(Student s) {
        setStudent(s);
        
        listStudent.add(s.getName());
        listStudent.add(Integer.toString(s.getSid()));
      //  listCustomer.add(Integer.toString(c.getAccountNumber()));
        //listCustomer.add(Double.toString(c.getBalance()));
        
        System.out.println("Student added sucessfully...");
    }

    @Override
    public void removeStudent(Student s) {
       //System.out.println(c.nid);
        int i,j=0;
        for(i=1;i<listStudent.size();i=i+4){
            //System.out.println(listCustomer.get(i));
            if(Integer.toString(s.sid).equals(listStudent.get(i))){
                //System.out.println("Match found");
                //listCustomer.remove(i-1);
          
                for(j=i+2;j>=4;j--){
                    listStudent.remove(j);
                }
            }
            else{
                //System.out.println("Not found");
            }
        }
        System.out.println("Customer Removed...");
    }

    @Override
    public void showAllStudents() {
       System.out.println("\n Students are:"+listStudent);
    }

    @Override
    public void setFaculty(Faculty e) {
        e.setName(e.name);
        e.setFid(Integer.parseInt(e.fid));
        e.setSalary(e.salary);
    }

    @Override
    public void getFaculty(String fid) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertFaculty(Faculty e) {
        setFaculty(e);
        
        list.add(e.getName());
        list.add(Integer.toString(e.getFid()));
        list.add(Double.toString(e.getSalary()));
        
        System.out.println("Employee added sucessfully...");
    }

    @Override
    public void removeFaculty(Faculty e) {
        int i;
        for(i=1;i<list.size();i=i+3){
            System.out.println(list.get(i));
            if(e.fid.equals(list.get(i))){
                System.out.println("Match found");
                list.remove(i-1);
                list.remove(i);
                list.remove(i+1);
            }
            else{
                System.out.println("Not found");
            }
        }
    }

    @Override
    public void showAllFaculty() {
        
        System.out.println("\n Faculties are:" +list);
    }

    void removeStudent(Course c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void insertStudent(Course c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void adding(Course c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void dropping(Course c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
