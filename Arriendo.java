public class Arriendo {
    private String fechaArriendo;
    private char medioPago;
    private int dias;
    private Cliente pcli;
    private Vehiculo pveh;


    public Arriendo(Vehiculo pveh, Cliente pcli, String pfec, char mp, int pdias){
        this.fechaArriendo= pfec;
        this.medioPago= mp;
        this.dias= pdias;
        this.pcli=pcli;
        this.pveh=pveh;
    }

    public String getFechaArriendo() {
        return fechaArriendo;
    }

    public void setFechaArriendo(String fechaArriendo) {
        this.fechaArriendo = fechaArriendo;
    }

    public char getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(char medioPago) { this.medioPago=medioPago; }

    public int getDias() { return dias; }

    public void setDias(int dias) { this.dias=dias; }

    public Cliente getPcli() {
        return pcli;
    }

    public void setPcli(Cliente pcli) {
        this.pcli = pcli;
    }

    public Vehiculo getPveh() {
        return pveh;
    }

    public void setPveh(Vehiculo pveh) {
        this.pveh = pveh;
    }

    public void imprimirDatosArriendo() {
        System.out.println("Fecha Arriendo: " + getFechaArriendo());
        System.out.println("Dias: " + getDias());
        System.out.println("Medio de Pago: " + getMedioPago());

    }

    public boolean registrarVehiculoArrendado(){
        if(pcli.isVigencia() && !pveh.isSituacion()){
            pveh.setSituacion(true);
            return true;
        }else{
            return false;
        }
    }

    public int obtenerValorArriendo(int pprecio){
        return getDias() * pprecio;
    }

    public void generarFichaArriendo(int pprecio){
        String medio = null;
        if(getMedioPago()=='T'){
            medio="Tarjeta";
        }else if (getMedioPago()=='E'){
            medio="Efectivo";
        }
        System.out.println("                         F I C H A  A R R I E N D O  D E  V E H I C U L O");
        System.out.println(                                                                                                        );
        System.out.println("                              Vehiculo      : "+pveh.getPatente()+"  "+ pveh.getMarca() +"  " +pveh.getModelo());
        System.out.println("                              Precio por dia: $"+ pprecio);
        System.out.println("                                                                                                       ");
        System.out.println("Fecha Arriendo   Rut Cliente   Nombre Cliente   Dias Arriendo   Valor Arriendo   Medio de Pago");
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println("   "+getFechaArriendo()+"      "+pcli.getRut()+"      "+pcli.getNombre()+"              "+getDias()+"             $"+obtenerValorArriendo(pprecio)+"           "+medio);
        System.out.println("----------------------------------------------------------------------------------------------");
    }

    public boolean registrarDevolucionVehiculo(String patente){
        if(patente.equals(pveh.getPatente()) && pveh.isSituacion()){
            pveh.setSituacion(false);
            return true;
        }else{
            return false;
        }
    }


}
