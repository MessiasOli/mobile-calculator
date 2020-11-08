package com.example.calculadorapdm20202;

import java.math.BigDecimal;
import java.nio.file.attribute.UserPrincipalLookupService;
import java.util.ArrayList;
import java.util.List;

public class Math {

    public String calc(String expression) {
        String str1 = "";
        String str2 = "";

        try{
            if (expression.contains("*")) {
                str1 = expression.substring(0, expression.indexOf("*"));
                str2 = expression.substring(expression.indexOf("*")+1);
                System.out.println("Multiplicar: " + str1 + " * " + str2 + " = " + (Double.parseDouble(str1) * Double.parseDouble(str2)));
                return String.valueOf (new BigDecimal(Double.parseDouble(str1) * Double.parseDouble(str2)).toPlainString());
            }
            else if (expression.contains("/")){
                str1 = expression.substring(0, expression.indexOf("/"));
                str2 = expression.substring(expression.indexOf("/")+1);
                if (str1.equals("0"))
                    return "Infinito";

                System.out.println("Dividir: " + str1 + " / " + str2 + " = " + (Double.parseDouble(str1) / Double.parseDouble(str2)));
                return String.valueOf (new BigDecimal(Double.parseDouble(str1) / Double.parseDouble(str2)).toPlainString());
            }
            else if (expression.contains("+")) {
                str1 = expression.substring(0, expression.indexOf("+"));
                str2 = expression.substring(expression.indexOf("+")+1);
                if (str1.equals(""))
                    return expression;
                System.out.println("Somar: " + str1 + " + " + str2 + " = " + (Double.parseDouble(str1) + Double.parseDouble(str2)));
                return String.valueOf (new BigDecimal(Double.parseDouble(str1) + Double.parseDouble(str2)).toPlainString());
            }
            else if (expression.contains("-")) {
                str1 = expression.substring(0, expression.indexOf("-"));
                str2 = expression.substring(expression.indexOf("-")+1);
                if (str1.equals(""))
                    return expression;
                System.out.println("Subitrair: " + str1 + " - " + str2 + " = " + (Double.parseDouble(str1) - Double.parseDouble(str2)));
                return String.valueOf (new BigDecimal(Double.parseDouble(str1) - Double.parseDouble(str2)).toPlainString());
            }
        }catch (Exception e) {
            return "Erro!";
        }
        return expression;
    }
}
