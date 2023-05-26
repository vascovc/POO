package aula99_D;

import java.io.File;

public class Files {

	static void RecursivePrint(File[] arr,int index,int level)  { 
        // terminate condition 
        if(index == arr.length) 
            return;  
        // tabs for internal levels 
        for (int i = 0; i < level; i++) 
            System.out.print("\t"); 
        // for files 
        if(arr[index].isFile()) 
            System.out.println(arr[index].getName()); 
        // for sub-directories 
        else if(arr[index].isDirectory()) 
        { 
            System.out.println("[" + arr[index].getName() + "]"); 
              
            // recursion for sub-directories 
            RecursivePrint(arr[index].listFiles(), 0, level + 1); 
        } 
           
        // recursion for main directory 
        RecursivePrint(arr,++index, level); 
   } 
     
   // Driver Method 
   public static void main(String[] args){        
       File maindir = new File("C:\\Users\\Vasco\\Documents\\MEGAsync"); 
       if(maindir.exists() && maindir.isDirectory()) { 
           File arr[] = maindir.listFiles(); 
           RecursivePrint(arr,0,0);  
       }  
   } 
} 
