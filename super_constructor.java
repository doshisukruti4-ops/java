class fruit
{
    fruit()
    {
        System.out.println("i'm super class constuctor fruit");
    }
}
class mango extends fruit
{
    mango()
    {
        super();
        System.out.println("i'm class mango");
    }
}
class super_constructor
{
    public static void main(String[] args)
    {
        mango m=new mango();
    }
}