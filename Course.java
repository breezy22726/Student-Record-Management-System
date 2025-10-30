/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registrationsystem;

/**
 *
 * @author 250770695
 */
public class Course {

    //Instance variable declaration
    private final String courseName;
   
    private final String year;
    private final String grade;
    
    public Course(String courseName,String year,String grade)
    {
        this.courseName= courseName;
        
        this.year = year;
        this.grade = grade;
        
    }
    public String getCourseInfo()
    {
        //System.out.println(CourseName+"("+CourseCode+"),"+Credit+"credits");
        return (courseName+" | "+year+" year"+" | Grade: "+grade);
    }
  
}
