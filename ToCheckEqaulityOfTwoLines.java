package com.bridgelabz;

public class ToCheckEqaulityOfTwoLines

    {
        static void idstrt(double a1, double b1,
                           double c1, double a2,
                           double b2, double c2)
        {
            if ((a1 / a2 == b1 / b2)
                    && (a1 / a2 == c1 / c2)
                    && (b1 / b2 == c1 / c2))
                System.out.println( "The given straight" +" lines are identical");
            else
                System.out.println("The given straight" + " lines are not identical");
        }
        public static void main(String[] args)
        {
            double a1 = -4, b1 = 8,
                    c1 = 6, a2 = -12,
                    b2 = 24, c2 = 18;
            idstrt(a1, b1, c1, a2, b2, c2);
        }
    }

