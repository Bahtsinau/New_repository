
public class Walking implements Runnable {
	public void run(){
		for(int i=1;i<10;i++){
			System.out.println("Walking");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	
	

}
}
