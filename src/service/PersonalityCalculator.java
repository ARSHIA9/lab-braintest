package service;
public class PersonalityCalculator 
{
	public int[] findAnswers(String options) 
	{
		
		String c[]=options.split(",");
		int n=c.length;
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=Integer.parseInt(c[i]);
			
		}
			
	return a;
    }
	
	public String findYourBrainType(String options) 
	{
		
		int value[]=findAnswers(options);
		
		int a= value[0]+value[1]+value[2]+value[4]+value[7]+value[9]+value[10]+value[11]+value[13]+value[17]+value[19];
        int b= value[3]+value[5]+value[6]+value[8]+value[12]+value[14]+value[15]+value[16]+value[18];
		int sum=66-a+b;
		System.out.println("Sum " + sum);
		if(sum>=20 && sum<=55)
		{
			String message= "leftbrained";
			return message;
		}
		
		if(sum>=56 && sum<=64)
		{
			String message= "No clear preference";
			return message;
		}
		
		if(sum>=65 && sum<=100)
		{
			String message = "rightbrained";
			return message;
		}                                                                          
		else
		{
		return "false";
		}
		
	}
}
		


