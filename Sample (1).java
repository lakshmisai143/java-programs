class Student {

    int rollno;

    String name;

    String address;

    public String toString()

    {

        return rollno+" "+name+" "+address;

    }

    public static void main(String[] args) {

            Student student=new Student();

            student.rollno=123;

            student.name="sai";

            student.address="vij";

            System.out.println(student);


    }

}