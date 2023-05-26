package at18mayFicheiros2;

import java.io.File;
import java.io.IOException;

/**
 * Demonstração de alguns métodos da classe File
 * @author AJST
 *
 */
public class Exemplo3File {
	
	public static void main (String[] args) throws IOException{
		
		String fileName="major.txt";
		
		File f=new File(fileName);
		
		System.out.println(f.getCanonicalPath() );
		
		
		System.out.println(f.exists() ? "Exists" :" File no found ");
		
		if (f.exists()){
			System.out.println("Canonical Path: "+f.getCanonicalPath() );
			System.out.println("Absolute Path: "+f.getAbsolutePath() );
			System.out.println("Path: "+f.getPath());
			System.out.println("Parent: "+f.getParent() );
			System.out.println("Name: "+f.getName() );
			
			
			//  ver permissões
			System.out.println(f.canRead() ? "Readable" :" No access to read ");
			System.out.println(f.canWrite() ? "Writable" :" No access to write ");
			System.out.println(f.canExecute() ? "Executable" :" No access to excute ");
			
			
			//
			f=new File ("c:\\windows");
			System.out.println(f.getTotalSpace());
			
			//
			for (File file:f.listFiles()) {
				System.out.printf("%s \t-> %c %c %c %c \n", file,
						(file.isDirectory() ? 'D':'-'),
						(file.canRead() ? 'R':'-'),
						(file.canWrite() ? 'W':'-'),
						(file.canExecute() ? 'X':'-')
						
						);
				
			}
			
			
		}
		
		
	}

}
