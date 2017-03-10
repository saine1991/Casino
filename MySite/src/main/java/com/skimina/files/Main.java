package com.skimina.files;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		FileRefactorer fc = new FileRefactorer();
		fc.refactorFirstNamesFile(FileRefactorer.firstNameFile, FileRefactorer.refactoredFirstNameFile);
		fc.refactorLastNamesFile(FileRefactorer.lastNameFile, FileRefactorer.refactoredLastNameFile);
	}

}
