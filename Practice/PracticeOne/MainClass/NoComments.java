package MainClass;

public class NoComments{
    public static void main(String[] args) {
    	String myString = " // Student Name:\r\n" + 
    			"// CS320 Programming Languages\r\n" + 
    			"public class Driver {\r\n" + 
    			"  Driver(String [] args){\r\n" + 
    			"    if( args.length > 0 )\r\n" + 
    			"\tSystem.out.println(args[0]);\r\n" + 
    			"\t}\r\n" + 
    			"\npublic static void main(String [] args){" + 
    			"// Ignore the { in the comment\r" + 
    			"   new Driver(args);\r\n" + 
    			"   System.out.println(\"Complete.({[\");\r\n" + 
    			"\t}\r\n" + 
    			"} " +
    			" \n\rIm sherwin \n\rhello"
    			+ "// this is a comment";
    	String noCommentString = myString.replaceAll("//.*", "");
    	System.out.print(noCommentString);
    }
}

                                                                                                  