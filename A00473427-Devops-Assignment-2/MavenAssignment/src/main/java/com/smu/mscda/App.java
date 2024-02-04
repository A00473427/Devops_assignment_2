package com.smu.mscda;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String name = sc.next();
        System.out.println("The Hex is:-"+ capitalizeAndGenerateMD5(name));
        System.out.println("The capital is:-"+ GenerateCapital(name));
    }

    public static String capitalizeAndGenerateMD5(String name) {
        String capitalized = GenerateCapital(name);
        return DigestUtils.md5Hex(capitalized);
    }

    public static String GenerateCapital(String input){
        return StringUtils.capitalize(input);
    }

}
