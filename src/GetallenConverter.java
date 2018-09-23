import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
    	
public class GetallenConverter
{
    public static void main(String[] args) 
    {
     	String s = null;
     	int g = 0;
     	
    	System.out.println("Geef getal:");
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			s = br.readLine();
			g = Integer.parseInt(s);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		// omzetten decimaal getal naar binair
		//    0 <- 1 <- 3 <- 7
		//    1    1    1
		
		// stap 1: 7 / 2 = 3 rest 1
		// stap 2: 3 / 2 = 1 rest 1
		// stap 3: 1 / 2 = 0 rest 1
		
		String u;
		int r = 0;
		int k = 0;
		
		// stap 1
		r = g % 2;
		k = g / 2;
		u = Integer.toString(r);
		
		// stap 2
		r = k % 2;
		k = k / 2;
		u = Integer.toString(r) + u;
		
		// stap 3
		r = k % 2;
		k = k / 2;
		u = Integer.toString(r) + u;

		r = k % 2;
		k = k / 2;
		u = Integer.toString(r) + u;
		
		r = k % 2;
		k = k / 2;
		u = Integer.toString(r) + u;

		r = k % 2;
		k = k / 2;
		u = Integer.toString(r) + u;
		
		r = k % 2;
		k = k / 2;
		u = Integer.toString(r) + u;
		
		r = k % 2;
		k = k / 2;
		u = Integer.toString(r) + u;
				
		System.out.println(u);
		
		
    }
}