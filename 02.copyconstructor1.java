
class student{
    String name;
    int id;
    student(String name, int id){
        this.name=name;
        this.id=id;
    }
    student(student b){
        name=b.name;
        id=b.id;
    }
}
class Copy{
    public static void main(String args[]){
        student a=new student("hasini",108);
        System.out.print("Student details are : \nName = "+a.name+"\nId = "+a.id);
        System.out.print("\nAfter use of copy constructor\n");
        student b=new student(a);
        System.out.print("Student Name is "+b.name+" and Id is "+b.id);
    }
}
