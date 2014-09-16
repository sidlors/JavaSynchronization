package sidlors.se.project.app;


import sidlors.se.project.sync.TableSync;
import sidlors.se.project.use.MyThread1;
import sidlors.se.project.use.MyThread2;
import sidlors.se.project.use.Table;

public class Use {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table obj = new TableSync();//only one object  
		MyThread1 t1=new MyThread1(obj);  
		MyThread2 t2=new MyThread2(obj);  
		t1.start();  
		t2.start();  
	}

}
