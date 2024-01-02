package First.map;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EmailCheck {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		
		BufferedReader br = new BufferedReader(new FileReader("D:\\mera.txt"));

		FileWriter fw = new FileWriter("D:\\shera.txt");

		PrintWriter pw = new PrintWriter(fw);

		String s = br.readLine();

		String regex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
		if (s != null) {
			if (s.matches(regex)) {
				pw.println(s);
				System.out.println(s);
			}
			s = br.readLine();
		}
		pw.close();

	}


}
