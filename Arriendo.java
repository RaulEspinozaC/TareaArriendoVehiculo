public class Arriendo {
    private String fechaArriendo;
    private char medioPago;
    private int dias;


    public Arriendo(Vehiculo pveh, Cliente pcli, String pfec, char mp, int pdias){
        this.fechaArriendo= pfec;
        this.medioPago= mp;
        this.dias= pdias;
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

    public void setMedioPago(char medioPago) {
        if (medioPago=='T' || medioPago=='E'){
            this.medioPago = medioPago;
        }
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        if (dias < 11 && dias > 0){
            this.dias = dias;
        }
    }

    public void imprimirDatosArriendo(){
        System.out.println("Fecha Arriendo: "+getFechaArriendo());
        System.out.println("Dias: "+getDias());
        System.out.println("Medio de Pago: "+getMedioPago());

    }

    //    I)

    public boolean registrarVehiculoArrendado(){
        if(Cliente.)
    }

    public


}
