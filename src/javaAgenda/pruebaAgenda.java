package javaAgenda;
import java.util.Scanner;
//import java.util.Vector;

public class pruebaAgenda {

	public static void main(String[] args) {
		int totalPersonas = 0; //testing third commit after creating readme files
		
		int entrarAlMenu = 0; //testing second commit
		
		int salirDelProgramaPrincipal = 1; //VARIABLE PARA SALIR DEL PROGRAMA
		
		int salidaDelMenuSalir=0;
		
		String nombreTemporal;
		
		String apellidoTemporal;
		
		int dniTemporal=0;
		
		int edadTemporal=0;
		
		int localidadTemporalSwitch;
		
		String localidadTemporal="";
		
		int telefonoTemporal=0;
		
        String salirDelPrograma;
		
		Scanner teclado = new Scanner(System.in);
		
		Personas vectorDePersonas[];
		/*
		do {
			System.out.println("--------------------------------------------\n");
			System.out.println("Bienvenido a MiAgenda\n");
			System.out.println("Puede guardar entre 10 y 20 contactos\n");
			System.out.println("Ingresar cantidad de personas para agendar:\n");
			System.out.println("--------------------------------------------");
			
			totalPersonas = teclado.nextInt();
			
			vectorDePersonas = new Personas[totalPersonas];
			
			
			
		}while(totalPersonas <10 || totalPersonas >20); */
			
			
		System.out.println("--------------------------------------------\n");
		System.out.println("Bienvenido a MiAgenda\n");
		System.out.println("Puede guardar entre 10 y 20 contactos\n");
		System.out.println("Ingresar cantidad de personas para agendar:\n");
		System.out.println("--------------------------------------------");
		
		totalPersonas = teclado.nextInt();
		
		vectorDePersonas = new Personas[totalPersonas];
		
		
		/*
		if(totalPersonas >= 10 && totalPersonas <= 20) {
			Personas vectorDePersonas[] = new Personas[totalPersonas];
		}
		
		*/
		
		
	//	int vectorOrdenado[] = new int [totalPersonas];
		
		
		
		
		do{
			System.out.println("--------------------------------------------\n");
			System.out.println("Seleccione la opcion del menu:\n");
			
			System.out.println("1) CARGAR NUEVA PERSONA");
			
			System.out.println("2) LISTAR PERSONAS AGENDADAS");
			
			System.out.println("3) MOSTRAR PERSONA MAS GRANDE");
			
			System.out.println("4) LISTAR PERSONA POR LOCALIDAD");
			
			System.out.println("5) BUSCAR PERSONA POR DNI");
			
			System.out.println("6) ORDENAR PERSONAS POR DNI");
			
			System.out.println("7) SALIR DEL PROGRAMA");
			System.out.println("--------------------------------------------\n");
			
			entrarAlMenu = teclado.nextInt();
			
			switch(entrarAlMenu) {
		
			case 1:
				
				System.out.println("Cargar personas con todos los datos");
				
				for (int i = 0; i < vectorDePersonas.length; i++) {
					
					System.out.println("*Ingrese el nombre de la persona:" + i);
					
					nombreTemporal = teclado.next();
					
					System.out.println("*Ingrese el apellido de la persona:" + i);
					
					apellidoTemporal = teclado.next();
					
					System.out.println("*Ingrese el DNI de la persona:" + i);
					
					dniTemporal = teclado.nextInt();
					
					System.out.println("*Ingrese la EDAD de la persona:" + i);
					
					edadTemporal = teclado.nextInt();
					
					System.out.println("*Ingrese EL NUMERO DE la localidad de la persona:" + i);
					
					System.out.println("1) RAMOS MEJIA");
					
					System.out.println("2) VILLA LUZURIAGA");
					
					System.out.println("3) ISIDRO CASANOVA");
					
					System.out.println("4) MORON");
					
					System.out.println("5) HAEDO");
					
					localidadTemporalSwitch = teclado.nextInt();
					
					switch(localidadTemporalSwitch){
					case 1:
						localidadTemporal = "Ramos Mejia";
						break;
					case 2:
						localidadTemporal = "Villa Luzuriaga";
						break;
					case 3:
						localidadTemporal = "Isidro Casanova";
						break;
					case 4:
						localidadTemporal = "Moron";
						break;
					case 5:
						localidadTemporal = "Haedo";
						break;
					default:
						
						System.out.println("--------------------------------------------\n");
						System.out.println("Caracter invalido\n");
						System.out.println("Vuelva a ingresar un caracter valido");
						
					
					}
					
					
					System.out.println("*Ingrese el telefono de la persona:" + i);
					
					telefonoTemporal = teclado.nextInt();
					
					vectorDePersonas[i]=new Personas(nombreTemporal, apellidoTemporal, dniTemporal, edadTemporal, localidadTemporal, telefonoTemporal);
					
					}
				
				salirDelProgramaPrincipal = 1;
				
				break;
				
			case 2: 
				System.out.println("Mostrar la lista de personas");
				
					for (int i = 0; i < vectorDePersonas.length; i++) {
						
					System.out.println("--------------------------------------------");
						
					System.out.println("PERSONA NUMERO "+ i +"\nNombre: " + vectorDePersonas[i].getNombre() + " Apellido: " + vectorDePersonas[i].getApellido());
					
					
					System.out.println("Edad: " + vectorDePersonas[i].getDni());
					
					System.out.println("Telefono: " + vectorDePersonas[i].getTelefono());
					
					
					
					}
				
				salirDelProgramaPrincipal = 1;
				
				break;
			
			case 3:
				System.out.println("--------------------------------------------");
				System.out.println("Mostrar a la persona mas grande");
				
				
				//algortimo bubblesort
				
					// inicia VP = 3
				
					//VP = 2
				for (int i = vectorDePersonas.length -1; i > 0; i--) {  
					
					// INICIA j = 0
					
					
					
					
					for (int j = 0; j < i; j++) { 
						
						// J(0) < I(2) ?
						
						 	//JULIETA						//LEANDRO
						if (vectorDePersonas[j].getDni() > vectorDePersonas[j + 1].getDni() ) {
							
							Personas value = vectorDePersonas[j + 1]; //GUARDO A LEANDRO
							
							//vectorDePersonas
							vectorDePersonas[j + 1] = vectorDePersonas[j]; //SOBRECARGO EL OBJETO
							
							vectorDePersonas[j] = value;
							
						}
						
					}// ACA SUMA I++ // ACA TERMINA EL FOR DENTRO DEL FOR
				}
				
				System.out.println("--------------------------------------------");
				System.out.println("Nombre: "+vectorDePersonas[0].getNombre() + " Apellido: "+vectorDePersonas[0].getApellido());
				
				System.out.println("DNI: " +  vectorDePersonas[0].getDni());
				
				break;
				
				/*
				 * 
				 * ESTE BUCLE SIRVE PARA MOSTRAR LA LISTA DE PERSONAS DE MENOR A MAYOR
				 * 
				for(int k = 0; k < vectorDePersonas.length; k++) {
					System.out.println("--------------------------------------------");
					System.out.println("Nombre: "+vectorDePersonas[k].getNombre() + "Apellido: "+vectorDePersonas[k].getApellido());
					
					System.out.println("DNI: " +  vectorDePersonas[k].getDni());
				}
				
				break;
				*/
			case 4:
				System.out.println("Mostrar personas por localidad");
				System.out.println("*Ingrese EL NUMERO DE la localidad");
				
				System.out.println("1) RAMOS MEJIA");
				
				System.out.println("2) VILLA LUZURIAGA");
				
				System.out.println("3) ISIDRO CASANOVA");
				
				System.out.println("4) MORON");
				
				System.out.println("5) HAEDO");
				
				localidadTemporalSwitch = teclado.nextInt();
				
				switch(localidadTemporalSwitch){
				case 1:
					localidadTemporal = "Ramos Mejia";
					for(int i = 0; i<vectorDePersonas.length; i++) {
						if(localidadTemporal == vectorDePersonas[i].getLocalidad()) {
							System.out.println("--------------------------------------------");
							
							System.out.println("PERSONA NUMERO "+ i +"\nNombre: " + vectorDePersonas[i].getNombre() + " Apellido: " + vectorDePersonas[i].getApellido());
							
							
							System.out.println("Edad: " + vectorDePersonas[i].getDni());
							
							System.out.println("Telefono: " + vectorDePersonas[i].getTelefono());
						}
					}
					break;
				case 2:
					localidadTemporal = "Villa Luzuriaga";
					for(int i = 0; i<vectorDePersonas.length; i++) {
						if(localidadTemporal == vectorDePersonas[i].getLocalidad()) {
							System.out.println("--------------------------------------------");
							
							System.out.println("PERSONA NUMERO "+ i +"\nNombre: " + vectorDePersonas[i].getNombre() + " Apellido: " + vectorDePersonas[i].getApellido());
							
							
							System.out.println("Edad: " + vectorDePersonas[i].getDni());
							
							System.out.println("Telefono: " + vectorDePersonas[i].getTelefono());
						}
					}
					break;
				case 3:
					localidadTemporal = "Isidro Casanova";
					for(int i = 0; i<vectorDePersonas.length; i++) {
						if(localidadTemporal == vectorDePersonas[i].getLocalidad()) {
							System.out.println("--------------------------------------------");
							
							System.out.println("PERSONA NUMERO "+ i +"\nNombre: " + vectorDePersonas[i].getNombre() + " Apellido: " + vectorDePersonas[i].getApellido());
							
							
							System.out.println("Edad: " + vectorDePersonas[i].getDni());
							
							System.out.println("Telefono: " + vectorDePersonas[i].getTelefono());
						}
					}
					break;
				case 4:
					localidadTemporal = "Moron";
					for(int i = 0; i<vectorDePersonas.length; i++) {
						if(localidadTemporal == vectorDePersonas[i].getLocalidad()) {
							System.out.println("--------------------------------------------");
							
							System.out.println("PERSONA NUMERO "+ i +"\nNombre: " + vectorDePersonas[i].getNombre() + " Apellido: " + vectorDePersonas[i].getApellido());
							
							
							System.out.println("Edad: " + vectorDePersonas[i].getDni());
							
							System.out.println("Telefono: " + vectorDePersonas[i].getTelefono());
						}
					}
					break;
				case 5:
					localidadTemporal = "Haedo";
					for(int i = 0; i<vectorDePersonas.length; i++) {
						if(localidadTemporal == vectorDePersonas[i].getLocalidad()) {
							System.out.println("--------------------------------------------");
							
							System.out.println("PERSONA NUMERO "+ i +"\nNombre: " + vectorDePersonas[i].getNombre() + " Apellido: " + vectorDePersonas[i].getApellido());
							
							
							System.out.println("Edad: " + vectorDePersonas[i].getDni());
							
							System.out.println("Telefono: " + vectorDePersonas[i].getTelefono());
						}
					}
					break;
				default:
					
					System.out.println("--------------------------------------------\n");
					System.out.println("Caracter invalido\n");
					System.out.println("Vuelva a ingresar un caracter valido");
					
				
				}
				break;
				
			case 5:
				System.out.println("Buscar persona por dni");
				
				System.out.println("Ingrese el numero de DNI: ");
				
				int verificarDni;
				
				verificarDni = teclado.nextInt();
				
				for(int i = 0; i< vectorDePersonas.length;i++) {
					if(verificarDni == vectorDePersonas[i].getDni()) {
						System.out.println("--------------------------------------------\n");
						System.out.println("Nombre: "+ vectorDePersonas[i].getNombre());
						System.out.println("Apellido: "+ vectorDePersonas[i].getApellido());
						System.out.println("DNI: "+ vectorDePersonas[i].getDni());
						System.out.println("Edad: "+ vectorDePersonas[i].getEdad());
						System.out.println("Localidad: "+ vectorDePersonas[i].getLocalidad());
						System.out.println("Telefono: "+ vectorDePersonas[i].getTelefono());
					}else {
						System.out.println("--------------------------------------------\n");
						System.out.println("DNI NO ENCONTRADO");
					}
				}
				
				
				break;
				
			case 6:
				System.out.println("Ordernar personas por DNI");
				System.out.println("Elija la opcion que desea: ");
				System.out.println("1) ORDENAR DE MENOR A MAYOR");
				System.out.println("2) ORDERNAR DE MAYOR A MENOR");
				
				int entrarAlSwitch=0;
				
				entrarAlSwitch = teclado.nextInt();
				switch(entrarAlSwitch) {
				case 1:
					for (int i = vectorDePersonas.length -1; i > 0; i--) {  
						
						for (int j = 0; j < i; j++) { 

							if (vectorDePersonas[j].getDni() > vectorDePersonas[j + 1].getDni() ) {
								
								Personas value = vectorDePersonas[j + 1]; 
								
						
								vectorDePersonas[j + 1] = vectorDePersonas[j]; 
								
								vectorDePersonas[j] = value;
								
							}
							
						}
					}
					for(int i = 0; i < vectorDePersonas.length; i++) {
						System.out.println("--------------------------------------------\n");
						System.out.println("Nombre: "+ vectorDePersonas[i].getNombre());
						System.out.println("Apellido: "+ vectorDePersonas[i].getApellido());
						System.out.println("DNI: "+ vectorDePersonas[i].getDni());
						System.out.println("Edad: "+ vectorDePersonas[i].getEdad());
						System.out.println("Localidad: "+ vectorDePersonas[i].getLocalidad());
						System.out.println("Telefono: "+ vectorDePersonas[i].getTelefono());
					}
					break;
					
				case 2:
					for (int i = vectorDePersonas.length -1; i > 0; i--) {  
						
						// INICIA j = 0
						
						
						
						
						for (int j = 0; j < i; j++) { 
							
							// J(0) < I(2) ?
							
							 	//JULIETA						//LEANDRO
							if (vectorDePersonas[j].getDni() < vectorDePersonas[j + 1].getDni() ) {
								
								Personas value = vectorDePersonas[j + 1]; //GUARDO A LEANDRO
								
								//vectorDePersonas
								vectorDePersonas[j + 1] = vectorDePersonas[j]; //SOBRECARGO EL OBJETO
								
								vectorDePersonas[j] = value;
								
							}
							
						}// ACA SUMA I++ // ACA TERMINA EL FOR DENTRO DEL FOR
					}
					for(int i = 0; i < vectorDePersonas.length; i++) {
						System.out.println("--------------------------------------------\n");
						System.out.println("Nombre: "+ vectorDePersonas[i].getNombre());
						System.out.println("Apellido: "+ vectorDePersonas[i].getApellido());
						System.out.println("DNI: "+ vectorDePersonas[i].getDni());
						System.out.println("Edad: "+ vectorDePersonas[i].getEdad());
						System.out.println("Localidad: "+ vectorDePersonas[i].getLocalidad());
						System.out.println("Telefono: "+ vectorDePersonas[i].getTelefono());
					}
					break;
				}
				break;
				
			case 7:
				do {
				System.out.println("--------------------------------------------\n");
				System.out.println("Desea salir del programa?\n");
				System.out.println("Para salir presione S\n");
				System.out.println("Para seguir presione N\n");
				System.out.println("--------------------------------------------\n");
				
				salirDelPrograma = teclado.next();
				
				
				switch(salirDelPrograma) {
				
				case "s":
					
					System.out.println("--------------------------------------------\n");
					System.out.println("Salio existosamente del programa");
					System.out.println("--------------------------------------------\n");
					
					salidaDelMenuSalir=1;
					
					salirDelProgramaPrincipal=0;
					
					break;
					
				case "S":
					
					System.out.println("--------------------------------------------\n");
					System.out.println("Salio existosamente del programa");
					System.out.println("--------------------------------------------\n");
					salidaDelMenuSalir=1;
					salirDelProgramaPrincipal=0;
					
					break;
					
				case "n":
					
					System.out.println("--------------------------------------------\n");
					System.out.println("Volviendo al menu");
					
					salidaDelMenuSalir=1;
					
					salirDelProgramaPrincipal=1;
					
					break;
					
				case "N":
					
					System.out.println("--------------------------------------------\n");
					System.out.println("Volviendo al menu");
					
					salidaDelMenuSalir=1;
					
					salirDelProgramaPrincipal=1;
					
					break;
					
				default:
					
					System.out.println("--------------------------------------------\n");
					System.out.println("Caracter invalido\n");
					System.out.println("Vuelva a ingresar un caracter valido");
					
					salidaDelMenuSalir=0;
				
				}
			
				
			}while(salidaDelMenuSalir == 0); //ESTO ES DEL SWITCH DEL CASE 7
			
			break;
			
			
			
			
			default:
				System.out.println("--------------------------------------------\n");
				System.out.println("El numero ingresado no es valido\n");
				System.out.println("Ingrese un numero valido\n");
				
				
			
		
		}
		
	}while(salirDelProgramaPrincipal == 1);
	
		
		
		
		
		
	}
	
	}	