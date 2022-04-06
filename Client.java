package reseau2;
import java.net.*;
import java.io.*;
import java.util.Scanner;


public class Client{ 
		public static void main(String[] args) throws IOException{
		Socket s = new Socket("localhost", 4999);
		
		PrintWriter pr = new PrintWriter(s.getOutputStream());
		
		InputStreamReader in = new InputStreamReader(s.getInputStream());
		BufferedReader bf = new BufferedReader(in);
		
		String str;

		while (true) {
			// YAB3AAAAAAAAAAAATH
			Scanner myObj = new Scanner(System.in);
			String userName = myObj.nextLine(); 
			pr.println(userName);
			pr.flush();
			
			// YE9BEEEEEEEEEEEELL
			str = bf.readLine();
			if (str!="") {
				System.out.println(str); 
			}

		}
		
	}
}