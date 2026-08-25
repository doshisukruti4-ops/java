/*class employee
{
    int age;
    String name;
    float salary;
    public static void main(String args[])
    {
        employee emp=new employee();
        emp.age=30;
        emp.name="john doe";
        emp.salary=30000.56f;
        System.out.println("--employee data--");
        System.out.println("name:"+emp.name);
        System.out.println("age:"+emp.age);
        System.out.println("salary:"+emp.salary);
        }
}
*/
class rectangle
{
    double length;
    double width;
    void setValue(double length,double width)
    {
        this.length=length;
        this.width=width;
    }
    double calArea()
    {
        return this.length*this.width;
    }
    public static void main(String args[])
    {
        rectangle rect=new rectangle();
        double rectangleLength=15.5;
        double rectangleWidth=8;
        rect.setValue(rectangleLength,rectangleWidth);
        System.out.println("set the rectangle dimention:");
        System.out.println("length:"+rectangleLength);
        System.out.println("width:"+rectangleWidth);
        System.out.println();
        double area=rect.calArea();
        System.out.println("the area of rectangle is="+area);

    }
}