/**
 * Program 3
 * reads in a text file line by line, replaces all spaces
 * with commas, and writes new lines to a new CSV file.
 * CS108-2 (or CS108-3)
 * 9/27/19
 * Sherwin labadan
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteCSV {
    public static void main(String[] args) {
        //  Grading program needs hardcoded filename. Oh, well. "
        String inputFilename = "coords.txt";
        String outputFilename = changeFileExtToCsv(inputFilename);      //Open files
        Scanner input = openInput(inputFilename);                       //call method to open input file
        PrintWriter output = openOutput(outputFilename);                //call method to open output file
        while (input.hasNextLine()) {                                   //Read input line, replace all spaces with commas,
            String nextLine = input.nextLine();                         //       and write output line
            String content = nextLine.replaceAll(" ", ",");
            output.println(content);
        }
        output.close();                                                 //close streams
        System.out.println("The file" + outputFilename + "has been created");
    }
            /**
             * Changes file extension to ".csv"
             *
             * @param filename
             * @return
             */
    public static String changeFileExtToCsv(String filename) {
        return filename.substring(0, filename.lastIndexOf('.')) + ".csv";
    }
            /**
             * Open input for reading
             *
             * @param filename
             * @return
             */
    public static Scanner openInput(String filename) {
        Scanner in = null;
        try {
            File infile = new File(filename);
            in = new Scanner(infile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println(filename + " could not be found");
            System.exit(0);
        }
        return in;
    }
            /**
             * Open output for writing
             *
             * @param filename
             * @return
             */
    public static PrintWriter openOutput(String filename) {
        PrintWriter printWriter = null;
        try {
            printWriter = new PrintWriter(new FileOutputStream(new File(filename),true));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return printWriter;
    }
    public String getIdentificationString() {
        return "Program 5a, Sherwin Labadan";
    }
}