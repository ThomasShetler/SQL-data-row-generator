import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReadFileIntoArrayList {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	    // reading text file into List in Java 7
	    List<String> lines = Collections.emptyList();
	    try {
	      lines = Files.readAllLines(Paths.get("file.txt"), StandardCharsets.UTF_8);
	    } catch (IOException e) {
	      // TODO Auto-generated catch block
	      e.printStackTrace();
	    }

	    System.out.println("Content of List:");
	    System.out.println(lines);

	    // reading text file into ArrayList in Java 6
	    BufferedReader bufReader = new BufferedReader(new FileReader("file.txt"));
	    ArrayList<String> listOfLines = new ArrayList<>();

	    String line = bufReader.readLine();
	    while (line != null) {
	      listOfLines.add(line);
	      line = bufReader.readLine();
	    }

	    bufReader.close();
	    System.out.println("Content of ArrayLiList:");
	    System.out.println(listOfLines);
	}

}
