import java.io.*;
import java.util.*;

public class fileread{
	public static void main(String args[]) throws Exception {
		int char_count = 0;
		int word_count = 0;
		int line_count = 0;
		String filename;
		String line;
		StringTokenizer st;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter filename: ");
		filename = sc.nextLine();

		BufferedReader buf = new BufferedReader(new FileReader(filename));

		while((line=buf.readLine())  != null) {
			line_count++;
			st = new StringTokenizer(line);
			while(st.hasMoreTokens()){
				word_count++;
				String word = st.nextToken();
				char_count += word.length();

			}
		}
		System.out.println("Character count: "+char_count);
		System.out.println("Word count: "+word_count);
		System.out.println("Line count: "+line_count);
		buf.close();
	}

}