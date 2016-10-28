
public class Talking extends  Thread  {
	
	public void run(){
		for(int i=1;i<10;i++){
			System.out.println("Talking");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
