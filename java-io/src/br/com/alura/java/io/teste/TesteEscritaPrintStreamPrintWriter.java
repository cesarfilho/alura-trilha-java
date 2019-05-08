package br.com.alura.java.io.teste;

import java.io.IOException;
import java.io.PrintWriter;

public class TesteEscritaPrintStreamPrintWriter {

	public static void main(String[] args) throws IOException {

//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);

//		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
		
		PrintWriter pw = new PrintWriter("lorem2.txt","UTF-8");
		
		pw.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod ");
//		ps.newLine();
//		bw.write(System.lineSeparator());
		pw.print("jdkasfhadlsfkjhadsfkljhasdfklhfadkshfjadsfkljdhafs");
		pw.close();
	}

}

