package Manzan;

public class Cronometro {

	public static void main(String[] args) {
		
		     int h=0;
		     
			for (int m = 0; m < 60; m++) {
				if (m==59){
					h++;
				}
				for (int s = 0; s < 60; s++) {
					System.out.println (h+" : "+m+" : "+s);
			
				}
		}

	}

}
