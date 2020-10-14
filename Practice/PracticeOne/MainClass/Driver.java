package MainClass;

//Student Name:
//CS320 Programming Languages
public class Driver {
	Driver(String [] args){
		if( args.length > 0 )
			System.out.println(args[0]);
	}

public static void main(String [] args){
//Ignore the { in the comment
	new Driver(args);
	System.out.println("Complete.({[");
	}
}
