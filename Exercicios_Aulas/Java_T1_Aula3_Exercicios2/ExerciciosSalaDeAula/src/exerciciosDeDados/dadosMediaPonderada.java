package exerciciosDeDados;

public class dadosMediaPonderada {
		private 
		float a, b, c, x, y, z;
		
		public static float calcMediaPonderada (float a, float b, float c, float x, float y, float z){
					return (a * x + b * y + c * z) / (x + y + z);
		}
		
		public static void main(String[] args) {
			float a, b, c, x, y, z;
			a = (float) 1.0;
			b = (float) 2.5;
			c = (float) 3.75;
			x = 2;
			y = 1;
			z = 2;
			
			System.out.println("A média ponderada é " + calcMediaPonderada (a, b, c, x, y, z));
		}
}