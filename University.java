/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.ArrayList;
import registrationsystem.Course;
import registrationsystem.Student;

/**
 *
 * @author Sandisiwe Nkomba
 */
public class University {
    
    private final ArrayList<Student> students;
    private final ArrayList<Course> courses;
    
    

    public University()
    {
        this.students = new ArrayList<>();
        this.courses = new ArrayList<>();
    }
    
    public void addStudent(Student student)
    {
        students.add(student);
    }
    public void addCourse(Course course)
    {
        courses.add(course);
    }
    public ArrayList<Student> getStudent()
    {
        return students;
    }
    public ArrayList<Course> getCourse()
    {
        return courses;
    }
    public ArrayList<String>  getFullCourseDetails()
    {
        ArrayList<String> CourseList = new ArrayList<>() ;
        for(int i = 0; i<courses.size();i++)
        {
            CourseList.add(courses.get(i).getCourseInfo());
        }
        return CourseList;
    }
    public ArrayList<String>  getFullStudentDetails()
    {
        ArrayList<String> StudentList = new ArrayList<>() ;
        for(int i = 0; i<courses.size();i++)
        {
            StudentList.add(students.get(i).getStudentInfo());
        }
        return StudentList;
    }
//        @Override
//    public String toString() {
//        return "MyObject{name='" + this.courses.get(0) + "', id=" + id + "}";
//    }

 
    
}
