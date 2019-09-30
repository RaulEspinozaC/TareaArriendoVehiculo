import java.util.Scanner;

public class PrincipalAdminEstudiantes {
    public static void main(String[] args){

        String prut= null;
        String pnom= null;
        String ppatente= null;
        String pmarca= null;
        String pmod= null;
        int paño= 0;
        String pfec= null;
        char mp= '\u0000';
        int pdias=0;

        Cliente pcli= new Cliente(prut,pnom);
        Vehiculo pveh= new Vehiculo(ppatente,pmarca,pmod,paño);
        Arriendo a1= new Arriendo(pveh,pcli,pfec,mp,pdias);

        show_menu();

        Scanner myObj= new Scanner(System.in);
        System.out.println("Ingrese su opción: "); // INGRESAR LA OPCION
        int opcion= myObj.nextInt();

        while(opcion != 4){
            switch (opcion){

                case 1:
                    Scanner rut= new Scanner(System.in); // INGRESAR RUT
                    System.out.println("Ingrese el rut: ");
                    a1.getPcli().setRut(rut.nextLine());

                    if(!Validation.validationRut(a1.getPcli().getRut())){     // VALIDAR RUT
                        System.out.println("Error: Rut Inválido.");
                        break;
                    }

                    Scanner nombre= new Scanner(System.in); // INGRESAR NOMBRE
                    System.out.println("Ingrese el nombre: ");
                    a1.getPcli().setNombre(nombre.nextLine());

                    Scanner patente=new Scanner(System.in);   // INGRESAR PATENTE
                    System.out.println("Ingrese la patente: ");
                    a1.getPveh().setPatente(patente.nextLine());

                    if(!Validation.validationPatente(a1.getPveh().getPatente())){       // VALIDAR PATENTE
                        System.out.println("Error: Patente inválida.");
                        break;
                    }

                    Scanner marca= new Scanner(System.in);     // INGRESAR MARCA
                    System.out.println("Ingrese la marca: ");
                    a1.getPveh().setMarca(marca.nextLine());

                    Scanner model=new Scanner(System.in);     // INGRESAR MODELO
                    System.out.println("Ingrese el modelo: ");
                    a1.getPveh().setModelo(model.nextLine());

                    Scanner año=new Scanner(System.in);       // INGRESAR AÑO
                    System.out.println("Ingrese el año: ");
                    a1.getPveh().setAño(año.nextInt());

                    if(!Validation.validationAño(a1.getPveh().getAño())){       // VALIDAR AÑO
                        System.out.println("Error: Año inválido.");
                        break;
                    }

                    Scanner fecha=new Scanner(System.in);      // INGRESAR FECHA
                    System.out.println("Ingrese la fecha de arriendo: ");
                    a1.setFechaArriendo(fecha.nextLine());

                    Scanner medio=new Scanner(System.in);       // INGRESAR MEDIO DE PAGO
                    System.out.println("Ingrese el medio de pago: ");
                    a1.setMedioPago(medio.next().charAt(0));

                    if(!Validation.validationMedioPago(a1.getMedioPago())){          // VALIDAR MEDIO DE PAGO
                        System.out.println("Error: Medio de pago inválido.");
                        break;
                    }

                    Scanner dias=new Scanner(System.in);             // INGRESAR DIAS DE ARRIENDO
                    System.out.println("Ingrese los días de arriendo");
                    a1.setDias(dias.nextInt());

                    if(!Validation.validationDias(a1.getDias())){          // VALIDAR LOS DIAS DE ARRIENDO
                        System.out.println("Error: No se puede arrendar por esa cantidad de días.");
                        break;
                    }

                    Scanner precio=new Scanner(System.in);
                    System.out.println("Ingrese el precio diario: ");
                    int pprecio= precio.nextInt();

                    if(a1.registrarVehiculoArrendado()){
                        System.out.println("El vehiculo ha sido arrendado");
                        a1.generarFichaArriendo(pprecio);
                        break;
                    }else{
                        System.out.println("El vehiculo no ha sido arrendado");
                        break;
                    }

                case 2:
                    Scanner myObj2= new Scanner(System.in);
                    System.out.println("Ingrese la patente: ");

                    String patenteVeh= myObj2.nextLine();

                    a1.registrarDevolucionVehiculo(patenteVeh);

                    System.out.println("Devolución Exitosa.");
                    break;

                case 3:
                    a1.getPcli().setVigencia(true);
                    break;
            }

            show_menu();

            Scanner myObj3= new Scanner(System.in);
            System.out.println("Ingrese su opción: "); // INGRESAR LA OPCION
            opcion= myObj3.nextInt();
        }
    }

    public static void show_menu(){
        System.out.println("      M    E    N    U        ");
        System.out.println("##########################");
        System.out.println("1) Arrendar un vehículo.");
        System.out.println("2) Devolver un vehículo.");
        System.out.println("3) Invalidar un Cliente.");
        System.out.println("4) Salir.");
    }
}
