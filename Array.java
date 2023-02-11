class Array {
	public static void main(String[] args) {
		//Arreglo de 15 numeros enteros
		int[] numeros = new int[] {1,2,3,4,9,6,7,8,10,5,60,80,20,19,70};
		
		// Arreglo de nombres 
		Nombre[] Nombres = new Nombre[20];
		Nombres[0] = new Nombre("Francisco");
		Nombres[1] = new Nombre("Luis");
		Nombres[0] = new Nombre("Frank");
		Nombres[3] = new Nombre ("Eric");
		Nombres[4] = new Nombre ("Miguel");
		Nombres[5] = new Nombre ("Jaime");
		Nombres[6] = new Nombre ("Jose");
		Nombres[7] = new Nombre ("Jonathan");
		Nombres[8] = new Nombre ("Felipe");
		Nombres[9] = new Nombre ("Federico");
		Nombres[10] = new Nombre ("Alfonso");
		Nombres[11] = new Nombre ("Alberto");
		Nombres[12] = new Nombre ("Alex");
		Nombres[13] = new Nombre ("Aldo");
		Nombres[14] = new Nombre ("Leonardo");
		Nombres[15] = new Nombre ("Leonel");
		Nombres[16] = new Nombre ("Carlos");
		Nombres[17] = new Nombre ("sergio");
		Nombres[18] = new Nombre ("Bernardo");
		Nombres[19] = new Nombre ("Daniel");
		
		//Arreglo de 100 objetos
		int[] circulo = new int[] {100,2,3,4,1,0,11,38,41,4,48,75,95,
				24,36,5,2,8,4,6,8,1,7,9,154,55,88,66,22,44,77,55,99,
				94,82,71,35,28,64,15,74,25,89,64,62,87,75,51,1,2,79,
				81,28,91,62,34,81,64,72,81,64,28,51,41,58,69,32,25,15,
				8,75,24,85,64,52,41,82,93,71,17,28,39,65,45,89,23,74,
				31,64,97,79,76,74,18,48,18,19,16,37,67,110};
	
		for (int x = 0; x < numeros.length; x++) {
			System.out.printf("Numeros[%d] = %d\n", x, numeros[x]);
		}
		for (int x = 0; x < Nombres.length; x++) {
			System.out.printf("Nombres[%d] = %s\n", x, Nombres[x]);
		}
		for (int x = 0; x < circulo.length; x++) {
			System.out.printf("Circulo[%d] = %d\n", x, circulo[x]);
		}
	}
}


class Nombre {
	private String nombre;

	public Nombre(String nombre) {
		this.nombre = nombre;
	}
	public String toString() {
		return  nombre;
	}
}