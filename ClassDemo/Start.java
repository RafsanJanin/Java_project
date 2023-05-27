
package ClassDemo;

import java.util.Scanner;


public class Start {

    private static int newCredit;

    
    public static void main(String[] args) {
        int choice,subChoice;
        Scanner in = new Scanner( System.in );
        University u =new University();
        while(true){
                System.out.println("1. Faculty Management");
                System.out.println("2.  Student Management");
                System.out.println("3.  Course Transactions");
                System.out.println("4. Exit");
                System.out.println("Enter your choice:");
                choice = in.nextInt();
                in.nextLine();
                if(choice == 1){
                    while(true){
                        System.out.println("\n Options for Faculty Management:");
                        System.out.println("\n  Insert New Faculty " +"  "+ "2.  Remove Existing Faculty"+"  "+ "3.  Show All Faculty "+ " "+  "4 Going Back ");
                        System.out.println("\n Enter your option:");
                        subChoice = in.nextInt();
                        in.nextLine();
                        if(subChoice==1){
                            Faculty f = new Faculty();
                            String newFacultyName;
                            String newFacultyId;
                            double newSalary;
                            
                            System.out.println("\n Enter the name of your Faculty:");
                            newFacultyName = in.nextLine();
                            System.out.println("\n Enter the Id of your Faculty:");
                            newFacultyId = in.nextLine();
                            System.out.println("\n Enter the salary of your Faculty:");
                            newSalary = in.nextDouble();
                            in.nextLine();
                            f.setName(newFacultyName);
                            f.setFid(Integer.parseInt(newFacultyId));
                            f.setSalary(newSalary);
                            u.insertFaculty(f);
                        }
                        else if(subChoice==2){
                            Faculty f = new Faculty();
                            String searchempId;
                            System.out.println("\n Enter the Faculty Id of your Faculty you want to remove:");
                            searchempId = in.nextLine();
                            int id = Integer.parseInt(searchempId);
                            f.setFid(id);
                            u.removeFaculty(f);
                        }
                        else if(subChoice==3){
                            u.showAllFaculty();
                        }
                        else if(subChoice==4){
                            break;
                        }
                                   
                }
                    
            }
             else if(choice==2){
                while(true){
                        System.out.println("\n Options for Student Management:");
                        System.out.println("\n1.  Insert New Student " +"  "+ "2.  Remove Existing Student"+"  "+ "3.  Show All Student"+ " "+  "4 Going Back ");
                        System.out.println("\n Enter your option:");
                        subChoice = in.nextInt();
                        in.nextLine();
                        if(subChoice==1){
                            Student s = new Student();
                            String newStudentName;
                            String newStudentid;
                            String newcourseNumber;
                            String newCredit;

                            System.out.println("\nEnter the name of your Student:");
                            newStudentName = in.nextLine();
                            System.out.println("\nEnter the id of your Student:");
                            newStudentid = in.nextLine();
                            System.out.println("\nEnter the course number of your Student:");
                            newcourseNumber = in.nextLine();
                            System.out.println("\nEnter the Credit of your Student:");
                            newCredit = in.nextLine();
                            
                            s.setName(newStudentName);
                            int id = Integer.parseInt(newStudentid);
                            s.setSid(id);
                            id = Integer.parseInt(newcourseNumber);
                            int credit = (int) Double.parseDouble(newCredit);
                            s.setcourseNumber(id);
                            s.setCredit(credit);
                            u.insertStudent(s);
                        }
                        else if(subChoice==2){
                            Student s = new Student();
                            String searchid;
                            System.out.println("\nEnter the id of your Student you want to remove:");
                            searchid = in.nextLine();
                            int sid = Integer.parseInt(searchid);
                            s.setSid(sid);
                            u.removeStudent(s);
                        }
                        else if(subChoice==3){
                            u.showAllStudents();
                        }
                        else if(subChoice==4){
                            break;
                        }
                        
                }
                    
            }
           else if(choice==3){
                while(true){
                        System.out.println("\n Options for Course Transactions :");
                        System.out.println("\n1.  Adding Course  " +"  "+ "2.  Withdraw Course "+"  "+ "3.  Going Back ");
                        System.out.println("\n Enter your option:");
                        subChoice = in.nextInt();
                        in.nextLine();
                        if(subChoice==1){
                            Course c = new Course();
                            int newcourseNumber;
                            int newCredit;

                            
                            System.out.println("\nEnter the course number :");
                            newcourseNumber = in.nextInt();
                            System.out.println("\nEnter the Credit:");
                            newCredit = in.nextInt();
                            
                            
                           
                            c.setcourseNumber(newcourseNumber);
                            c.setCredit(newCredit);
                            u.adding(c);
                        }
                        else if(subChoice==2){
                            Course c = new Course();
                            int searchid;
                            System.out.println("\nEnter the id of your Student you want to remove:");
                            searchid = in.nextInt();
                            int credit = searchid;
                            int newcourseNumber = 0;
                            c.setcourseNumber(newcourseNumber);
                            c.setCredit(newCredit);
                            u.dropping(c);
                        }
                        else if(subChoice==3){
                            u.showAllStudents();
                        }
                        else if(subChoice==4){
                            break;
                        }
            
                    
            }    
                
                  
    }
    
}
}
}
