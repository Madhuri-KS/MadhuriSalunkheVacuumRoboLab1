package edu.fiu.jit;

public class Engine  extends Component {   
			int numberOfCylinders;
			float capacity;
						
		 	public void start(String name)
			{
				System.out.println("\nStarted " + name);
			}
		 	
		 	public void stop(String name)
			{
				System.out.println("\nStop " + name);
			}
		 	
		 	public void heatingcheck(String name)
			{
				System.out.println("\nNot Heated " + name);
			}


	}
 
