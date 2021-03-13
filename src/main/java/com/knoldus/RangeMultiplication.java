package com.knoldus;

import java.util.function.LongBinaryOperator;

public class RangeMultiplication {

    static long multiply (String firstNum, String secondNum) throws Exception{
        long result;
        LongBinaryOperator operator = (f_Num, s_Num) -> {

            long res = 1;
            while (f_Num <= s_Num)
                res *= s_Num--;
            return res;

        };
        if(Long.parseLong(firstNum)>Long.parseLong(secondNum)){
            throw new Exception("First number should be smaller than second number");
        }
        else {
            try{
            result = operator.applyAsLong(Long.parseLong(firstNum), Long.parseLong(secondNum));
            return result;
            }
            catch (Exception e){
                System.out.println(" Enter Integer Number only  "+e);
                throw new NumberFormatException();
            }
        }

    }
}
