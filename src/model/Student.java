package model;

public class Student {
    String name;
    String id;
    String major;
    String university;
    double gpa;
    boolean isgoodjava;
    Campus cmp1 = null;
    Course c1 = null;

    public Student(String name) {
        this.name = name;
        System.out.println("Student name: " + name);
    }

    public Student(String name, String coursenum, String coursename) {
        this.name = name;
        c1 = new Course(coursename, coursenum);
        c1.coursename = coursename;
        c1.coursenum = coursenum;
        System.out.println("Student name: " + name + ", Course: " + coursename);
    }

    public Student(String name, String campusname) {
        this.name = name;
        cmp1 = new Campus(campusname);
        cmp1.campusname = campusname;
        System.out.println("Student name: " + name + ", Campus: " + campusname);
    }

    //Nested class #2
    public class Campus{
        String campusname;

        public Campus(String campusname) {
            this.campusname = campusname;
            System.out.println("-Nested class constructor #2 -- Campus: " + campusname);
        }
    }

    //Nested class #1
    public class Course{
        String coursenum;
        String coursename;

        public Course(String coursename, String coursenum) {
            this.coursename = coursename;
            this.coursenum = coursenum;
            System.out.println("-Nested class constructor #1 -- Course Number: " + coursenum);
        }
    }

    public String toString(){
        return "Student: "+ name;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }
}
