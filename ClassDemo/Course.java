
package ClassDemo;

import InterfaceDemo.CourseTransactions;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Course implements CourseTransactions 
 {
    
    int courseNumber;
    int credit;
    
    File file = new File("History.txt");
    
    void setCourseNumber(int courseNumber)
    {
        this.courseNumber=courseNumber;
    }
    void setCredit(int credit)
    {
        this.credit=credit;
    }
    int getCourseNumber()
    {
        return courseNumber;
    }
    int getCredit()
    {
        return credit;
    } 

    @Override
    public void adding(int quantity) {
       this.credit=this.credit+quantity;
       try
		{
			
			FileWriter writer = new FileWriter(file, true);
			this.file.createNewFile();
			writer.write("Adding ->"+quantity+"\r"+"\n");	
			writer.flush();	
			writer.close();	
			System.out.println("Added transaction To History");
		}
		
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
    }

    @Override
    public void dropping(int quantity) {
     this.credit=this.credit-quantity;
     try
		{
			
			FileWriter writer = new FileWriter(file, true);
			this.file.createNewFile();
			writer.write("Dropping ->"+quantity+"\r"+"\n");	
			writer.flush();	
			writer.close();	
			System.out.println("Added transaction To History");
		}
		
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
    }
    
    void showInfo() throws IOException 
    {
       try
               {
               File FileObject=new File("History.txt");
               Scanner myReader =new Scanner(FileObject);
               while(myReader .hasNextLine()){
               String data=myReader .nextLine();
                   System.out.println(data);
               }
                myReader.close();
                }
                catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }   
    }      

    void setcourseNumber(int newcourseNumber) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setSid(int sid) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}  

