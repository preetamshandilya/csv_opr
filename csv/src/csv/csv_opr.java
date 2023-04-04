package csv;

import java.util.Scanner;
import java.io.*;  // ---->> it has new File instance which converts given pathname into abstract pathname.

public class csv_opr {

	public static void main(String[] args)throws Exception {
		
		Scanner sc =new Scanner(new File("/home/preetamshandilya/learnings_club/csv/info.csv"));
		
		sc.useDelimiter(","); // --> used to identify the separator pattern.
		while(sc.hasNext()) {
			System.out.println(sc.next());
			
		}

	}

}
