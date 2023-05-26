package at18mayFicheiros2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * basic example of NIO Paths, Path and File
 * @author AJST
 *
 */
public class Exemplo6NIO {

	public static void main(String[] args) throws IOException {

		// Paths.get()
		Path p=Paths.get(".","major.txt");
		
		// exemplo de método de Path
		System.out.println(p.toAbsolutePath());
		System.out.println(p.getParent().getFileName());
		
		// file exists? etc   -- Files methods
		System.out.println(Files.exists(p));
		System.out.println(Files.probeContentType(p));  // text
		System.out.println(Files.isReadable(p));
		System.out.println(Files.isWritable(p));
		System.out.println(Files.isExecutable(p));
		
		//  example of File use to read all lines
		List<String> lines= Files.readAllLines(p);
		
		
		for (String line: lines)
			for (String w:line.split("[ ,-.]"))
				System.out.println(w);
		
		// reading bytes
		byte[] all=Files.readAllBytes(p); //  to read binary
		System.out.print(all.length+ " bytes");
	
		
		
		

	}

}
