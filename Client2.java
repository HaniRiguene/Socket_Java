//package reseau2;
import java.net.*;
import java.io.*;
import java.util.Scanner;


public class Client2{ 
		public static void main(String[] args) throws IOException{
		Socket s = new Socket("10.40.30.63", 5000);
		
		PrintWriter pr = new PrintWriter(s.getOutputStream());
		
		InputStreamReader in = new InputStreamReader(s.getInputStream());
		BufferedReader bf = new BufferedReader(in);
		
		String str;

		while (true) {
			// YE9BEEEEEEEEEEEELL
			str = bf.readLine();
			if (str!="") {
				System.out.println(str); 
			}
			
			// YAB3AAAAAAAAAAAATH
			Scanner myObj = new Scanner(System.in);
			String userName = myObj.nextLine(); 
			pr.println(userName);
			pr.flush();
			

		}
		
	}
}
