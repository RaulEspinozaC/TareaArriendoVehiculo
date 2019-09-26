public class Vehiculo {
    private String patente;
    private String marca;
    private String modelo;
    private int año;
    private boolean situacion;

    public Vehiculo(String ppat,String pmar,String pmod,int paño){
        this.patente=ppat;
        this.marca=pmar;
        this.modelo=pmod;
        this.año=paño;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public boolean isSituacion() {
        return situacion;
    }

    public void setSituacion(boolean situacion) {
        this.situacion = situacion;
    }

    public void imprimirDatosVehiculo(){
        System.out.println("Patente: "+getPatente());
        System.out.println("Marca: "+getMarca());
        System.out.println("Modelo: "+getModelo());
        System.out.println("Año: "+getAño());
        if(isSituacion()==true){
            System.out.println("Situacion: Arrendado");
        }else{
            System.out.println("Situacion: No Arrendado");
        }
    }
}
