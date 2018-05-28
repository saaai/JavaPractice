public class perceptron
 {
	    double[] ini;
	    double t_value;
	    public static void main(String[] args) 
		{        
	        int ip[][] = {{0,0},{0,1},{1,0},{1,1}};//inputs for all the operations
	        int op[] = {0, 1, 1, 1};//OR operation target output
	        int op1[] = {0, 0, 0, 1};//And operation target ouput
		int op2[]={1,0,0,0};//NOR operation target output
		int op3[]={1,1,1,0};//NAND operation target output
	        System.out.println("__________________________________________________________");
	        System.out.println("                                                          ");
		System.out.println("**********************OR operation************************");
	        System.out.println("__________________________________________________________");
	        new perceptron(ip, op, 2, 0.5, 10,0.9,0.7);//given information
	        System.out.println("__________________________________________________________");
		System.out.println("                                                          ");
	        System.out.println("**********************AND operation***********************");
	        System.out.println("__________________________________________________________");
	        new perceptron(ip, op1, 2, 0.5, 10,0.2,0.8);//given information
	        System.out.println("__________________________________________________________");
		System.out.println("                                                          ");
                System.out.println("*********************NOR operation************************");
                System.out.println("__________________________________________________________");
                new perceptron(ip, op2, -3, 0.5, 10,0.9,0.8);//given information
		System.out.println("__________________________________________________________");
                System.out.println("                                                          ");
		System.out.println("*********************NAND operation***********************");
                System.out.println("__________________________________________________________");
                new perceptron(ip, op3, 2, 0.5, 10,0.2,0.8);//given information
	    }
	    
	 	public int computing(int[] inp)
		{
		     System.out.println();
		     System.out.println("input1\t           input2\t            sum\t        Actual output\t ");
		     double sum = 0.0;
			{
				int i=0;
				while(i<inp.length)
				{
				sum += ini[i]*inp[i];
				System.out.println(inp[i]+ " "+ini[i]);
				i++;
				}
		     if(sum>=t_value)
			{
		     	System.out.println(sum);
		         return 1;
		    	}
		     else
		     	System.out.println(sum);	     	
		         return 0;
			}	 	
		}	 	
	public perceptron(int[][] ip, int[] op, double t_value, double coef, int epoch,double a,double b)
	{
		ini = new double[ip[0].length];
	    	this.t_value = t_value;
	    	ini[0] = a;
	       	ini[1] = b;
	       
		{
			int i=0;
		while(i<epoch)
		{
		int err = 0;
                    for(int j =0;j<op.length;j++)
                    {   
                        int output = computing(ip[j]);
                        int error = op[j] - output;
                        err =err +error;
                        int k=0;
                        while(k<ip[0].length)
                        {   
                            double diff = coef * ip[j][k] * error;
                            ini[k] = ini[k] +diff; 
                            System.out.printf("The Updated Weights for input (  %d  ) : %.2f\n",ip[j][k],ini[k]);
                            k++;
                        }               
                        System.out.println("The Updated Weights ( " + ini[0]+" ,"+ini[1]+" )");
                    }
                    if(err == 0)
                        {
                        System.out.println();
                        System.out.printf("***************THE FINAL WEIGHTS ARE %.2f and %.2f***************",ini[0],ini[1] );
                        break;
                        }
			i++;
		}			
	}   
}
}
