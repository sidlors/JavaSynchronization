package sidlors.se.project.notsync;

import sidlors.se.project.use.Table;

public class TableNotSync  implements Table{
	
	public void printTable(int n){//method not synchronized  
		   for(int i=1;i<=5;i++){  
		     System.out.println(n*i);  
		     try{  
		      Thread.sleep(400);  
		     }catch(Exception e){System.out.println(e);}  
		   }  
		  
		 }  
}  


