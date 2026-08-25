class test_throw {
    void checknum(int num)
    {
        if (num < 1)
        {
            throws new ArithmeticException("\nnumber is negeive..!");
        }
        else
        {
            System.out.println("number is positive..!");
        }
    }
}