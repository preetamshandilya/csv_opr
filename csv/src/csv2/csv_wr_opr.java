package csv2;
import com.opencsv.*;
import java.io.*;
public class csv_wr_opr {

	public static void main(String[] args)throws Exception{
		
		CSVWriter writer=new CSVWriter(new FileWriter("/home/preetamshandilya/learnings_club/csv/info.csv"));
		String l1[]= {"Thomas Shelby","44","457875484","England"};
		String l2[]= {"Bruce Wayne","41","4154","Gotham"};
		
		writer.writeNext(l1);
		writer.writeNext(l2);
		
		writer.flush();
		
		
		System.out.println("Data Entered");
		
		

	}

}
