package org.example;

public class Factorial {
    public int Fact (int number)
    {

        int factorial =1;

        while (number >= 1 )
        {
            factorial = factorial * number;

            number --;
        }
        return factorial;
    }
}
