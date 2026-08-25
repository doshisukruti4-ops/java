class student
{
    String name;
    int age;
    char gender;
    student (String name)
    {
        this.name=name;
        this.age=0;
        this.gender="N";
    }
    student(String name,int age)
    {
        this.name=name;
        this.age=0;
        this.gender=gender;
    }
    student(String name,int age,char gender)
    {
         this.name=name;
        this.age=0;
        this.gender=gender;
    }
    void display()
    {
        System.out.println("Student Information..");
        System.out.println("Name:"+this.name);
        System.out.println("Age:"+this.age);
        System.out.println("Age:"+this.gender);
        
    }
    public static void main(String args[])
    {
        Student std1=new student("alice");
        Student std2=new student("bob",20);
        Student std3=new student("charlie",22,"m");
        std1.display();
        System.out.println();
        Std2.display();
        System.out.println();
        std3.display();
        
    }
}