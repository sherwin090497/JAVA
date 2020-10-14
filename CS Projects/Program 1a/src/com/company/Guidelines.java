/**
 *  Program #1a
 *  Guidelines
 *  CS108-2 (or CS108-3)
 *  9/8/19
 *  Sherwin labadan
 */
package com.company;


public class Guidelines {
    private String fullName;

    public String getInfo() {
        String Program = "Program #1,";
        String firstName = "Sherwin";                //assign the name "Sherwin" to firstName
        String lastName = "Labadan";                 //assign the name "Labadan" to lastName
        String space = " ";
        fullName = Program + space + firstName + space + lastName;
        return fullName;                            //fullname will be printed if getInfo() is called
    }
}