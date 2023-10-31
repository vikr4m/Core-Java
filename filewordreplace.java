import java.io.*;
import java.util.*;

public class filewordreplace{
	public static void main(String args[]){
		int count = 0;
		File f = new File("A.txt");

	try{
		FileWriter w = new FileWriter("B.txt");
		BufferedReader r = new BufferedReader( new FileReader(f));
		String line = "", oldtxt = "";

		while((line = r.readLine()) != null){
			System.out.println("line: "+line);
			StringTokenizer words = new StringTokenizer((line));
			oldtxt += line + "\n";

			while(words.hasMoreTokens()){
				if(words.nextToken().equals("file"))
					count++;
			}
		}

		String newtxt = oldtxt.replace("file","txtFile");
		w.write(newtxt);
		System.out.println("\n\tReplacement: "+count);

		r.close();
		w.flush();
		w.close();
	}catch (Exception e) {
		System.out.println(e.getMessage());
	}
	}
}