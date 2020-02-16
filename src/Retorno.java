
public class Retorno {
     //Metado principal 
	public static void main(String[] args) {
		double areaRetangulo = calcularAreaRetangulo(4.2,8.4);
		System.out.println("Esse é area do Retangulo: " + areaRetangulo);
		double areaQuadrado = calcularAreaQuadrado(4.2);
		System.out.println("Esse é area do Quadrado: " + areaQuadrado);
		double areaTriangulo =calcularAreaTriangulo(7.9,11.2);
		System.out.println("Esse é area do Triangulo: " + areaTriangulo);
		olaMundo();
		olaAluno("Thayani");		
	}
	
	public static double calcularAreaQuadrado(double lado) {
		return lado * lado;
		
	}
	
	public static double calcularAreaRetangulo (double altura,double lado) {
		return altura * lado;	
	}
	public static double calcularAreaTriangulo(double base,double altura) {
		return (base*altura)/2;
	}
	
	//Metodo sem parametro e retorno
	public static void olaMundo(){
		System.out.println("Esse é Ola Mundo" );
	}
	//Metodo com parametro sem retorno
	public static void olaAluno(String Nome){
		System.out.println("Esse é Ola Aluno " + Nome);
	}
}

