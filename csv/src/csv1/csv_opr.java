package csv1;

import java.io.*;

public class csv_opr {

	public static void main(String[] args) throws Exception {
		String line="";
		String splitBy=",";
		
		BufferedReader br=new BufferedReader(new FileReader("/home/preetamshandilya/learnings_club/csv/info.csv"));
		while((line=br.readLine())!=null) {
			String info[]=line.split(splitBy);
			System.out.println("Name : "+info[0]+ "  Age : "+info[1]+ "  Mobile no. : "+info[2]+ "  Country : "+info[3] );
			
		}
		
		
		

	}

}
