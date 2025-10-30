/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registrationsystem;

import java.util.ArrayList;

/**
 *
 * @author 250770695
 */
public class Student {

    private final String name;
    private final String studentId;
    private final String contactNo;
    private final String email;
    private final String Address;
     private final String degree;
    
    private final ArrayList<Course> registeredCourses;

    public Student(String name,String studentId,String contactNo,String email,String Address,String degree)
    {
        this.name =name;
        this.studentId = studentId;
        this.contactNo = contactNo;
        this.email = email;
        this.Address = Address;
        this.degree = degree;
        this.registeredCourses = new ArrayList<>();
    }
    public void registerCourse(Course course)
    {
        registeredCourses.add(course);
    }
    public void printRegisteredCourses()
    {
        //System.out.println("Student: "+name+" | Student No.:  "+studentId+" | Course list: "+registeredCourses);
        for(int i = 0;i<registeredCourses.size();i++)
        {
            System.out.println(registeredCourses.get(i).getCourseInfo());
        }
//        System.out.println(registeredCourses.get(i).getCourseInfo());
    } 
    public void getName()
    {
        System.out.println("Student: "+name);
    }
    public String getStudentInfo()
    {
        //System.out.println(CourseName+"("+CourseCode+"),"+Credit+"credits");
        return ("Student: "+name+" | Student No.:  "+studentId+" | Contact No. : "+contactNo+" | Email: "+email+" | Address: "+Address+" | Degree: BTech "+degree);
    }
}
