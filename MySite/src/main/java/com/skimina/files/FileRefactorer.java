/*In this class I did format text files
  which contains list of most popular names and last names in Poland in 2015.
  Placed in src/main/resources */

package com.skimina.files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class FileRefactorer {
	 protected static final String lastNameFile = "/nazwiska.txt";
	 public static final String refactoredLastNameFile = "/nazwiska2.txt";

	protected static final String firstNameFile = "/imiona.txt";
	public static final String refactoredFirstNameFile = "/imiona2.txt";

	public void refactorLastNamesFile(String lastNameFile, String refactoredFile) throws IOException {
		PrintWriter writer = new PrintWriter(new File(this.getClass().getResource(refactoredFile).getPath()));
		BufferedWriter bw = new BufferedWriter(writer);

		InputStreamReader isReader = new InputStreamReader(this.getClass().getResourceAsStream(lastNameFile));
		BufferedReader br = new BufferedReader(isReader);
		String nextLine = null;

		while ((nextLine = br.readLine()) != null) {
			nextLine = nextLine.replaceAll("\\d", "");
			bw.write(nextLine.trim());
			bw.newLine();
		}
		bw.close();
		bw = null;
		writer.close();
		writer = null;
		br.close();
		br = null;
		isReader.close();
		isReader = null;
	}

	public void refactorFirstNamesFile(String firstNameFile, String refactoredfirstNameFile) throws IOException {
		PrintWriter writer = new PrintWriter(new File(this.getClass().getResource(refactoredfirstNameFile).getPath()));
		BufferedWriter bw = new BufferedWriter(writer);

		InputStreamReader isReader = new InputStreamReader(this.getClass().getResourceAsStream(firstNameFile));
		BufferedReader br = new BufferedReader(isReader);
		String nextLine = null;
		StringBuilder sb = new StringBuilder();
		int counter = 0;
		while ((nextLine = br.readLine()) != null) {
			nextLine = nextLine.replaceAll("\\d", "");
			for (int i = 0; i < nextLine.length(); i++) {
				char c = nextLine.charAt(i);
				if (c >= 65) {
					if (c >= 65 && c <= 90)
						counter++;
					if (counter > 1) {
						bw.write(sb.toString());
						bw.newLine();
						counter = 1;
						sb = new StringBuilder();
					}
					sb.append(c);
				}
			}

		}
		bw.close();
		bw = null;
		writer.close();
		writer = null;
		br.close();
		br = null;
		isReader.close();
		isReader = null;
	}
}
