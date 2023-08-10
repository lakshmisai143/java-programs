/*Assignment 3: Student Information System

Create a class named "Student" with private attributes: name, rollNumber, age, and marks.
Implement getter and setter methods for all attributes.
Ensure that the marks attribute can only be accessed through getter and setter methods, not directly.
Add a method named calculateGrade() that calculates the grade based on the marks and returns it as a string (e.g., "A+", "B", "C", etc.).
Add a method named displayDetails() that displays the student's name, roll number, age, marks, and grade.
In the main method, create an array of Student objects to store information for multiple students. Prompt the user to input data for each student, calculate their grades, and display their details.*/
class Student
  {
    private String name;
    private int rollnumber;
    private int age;
    private int marks;
    public void setName(String name)
    {
      this.name=name;
    }
   public String getName()
    {
      return name;
    }
   
     public void setRollnum(int rollnumber)
    {
      this.rollnumber=rollnumber;
    }
    public int getRollnum()
    {
      return rollnumber;
    }
     public void setAge(int age)
    {
      this.age=age;
    }
    public int getAge()
    {
      return age;
    }
     public void setMarks(int marks)
    {
      this.marks=marks;
    }
    public int getMarks()
    {
      return marks;
    }
    
  }