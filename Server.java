package reseau2;

import java.net.*;
import java.io.*;
import java.util.Scanner;

public class Server{
		public static void main(String[] args) throws IOException{
			
			ServerSocket ss = new ServerSocket (4999);
			Socket s = ss.accept();
			System.out.println("client1 connected");
			
			ServerSocket ss2 = new ServerSocket (5000);
			Socket s2 = ss2.accept();
			System.out.println("client2 connected\n");
			
			InputStreamReader in = new InputStreamReader(s.getInputStream());
			BufferedReader bf = new BufferedReader(in);
			
			InputStreamReader in2 = new InputStreamReader(s2.getInputStream());
			BufferedReader bf2 = new BufferedReader(in2);

			String str;
			String str2;

			PrintWriter pr = new PrintWriter(s.getOutputStream());
			PrintWriter pr2 = new PrintWriter(s2.getOutputStream());
			while(true) {
				str = bf.readLine();
				if (str!="") {
					System.out.println("Client1 b3ath message ("+str+")");
					pr2.println("Client1: "+str) ;
					pr2.flush();
				}

				str2 = bf2.readLine();
				if (str2!="") {
					System.out.println("Client2 b3ath message ("+str2+")");
					pr.println("Client2: "+str2) ;
					pr.flush();
				}

			}
		}
}