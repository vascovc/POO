package at18mayFicheiros2;

import java.io.File;

/**
 * listagem recursiva de directórios...
 * @author AJST
 *
 */
public class Exemplo4DirListRecursive {

	public static void main(String[] args){
		String dir;
		
		if (args.length>0)
			dir=args[0];
		else
			dir=".";
		
		File f=new File(dir);
		if (f.isDirectory())
			//listDir(f);
			listDir2(f,0);
		else
			System.out.println(dir+" is not a directory");
			
		
		System.out.println("DONE");
	}
	/**
	 * 
	 * @param dir
	 */
	private static void listDir(File dir){
		
		File[] fileList=dir.listFiles();
		
		for (File f:fileList)
			if (f.isDirectory()){
				System.out.println(f.getName());
				listDir(f);
				// TODO: move println here
			}
		
	}

/**
 * similar a listDir, mas tem parâmetro adicional que dá o nível de identação
 * @param dir
 * @param level
 */

private static void listDir2(File dir, int level){
		
		File[] fileList=dir.listFiles();
		
		if (fileList!=null)
		for (File f:fileList)
			if (f.isDirectory()){
				for(int i=1; i<level;i++)
					System.out.print("  ");
				System.out.println(f.getName());
				listDir2(f, level+1);
				// TODO: move println here
			}
		
	}	
}

