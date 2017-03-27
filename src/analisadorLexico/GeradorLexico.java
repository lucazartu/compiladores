package analisadorLexico;

import java.nio.file.Paths;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class GeradorLexico {

	static final Path TEST_FILES_DIR = Paths.get("tests");
	    public static void main(String[] args) throws IOException {
	        for (Path testFile : Files.newDirectoryStream(TEST_FILES_DIR)) {
	            System.out.println(testFile.getFileName());
	            AnalisadorLexico.main(new String[]{testFile.toString()});
	        }
	    }

}