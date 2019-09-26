public class Cliente {
    private String rut;
    private String nombre;
    private boolean vigencia;

    public Cliente(String prut, String pnom){
        this.rut=prut;
        this.nombre=pnom;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isVigencia() {
        return vigencia;
    }

    public void setVigencia(boolean vigencia) {
        this.vigencia = vigencia;
    }

    public void imprimirDatosCliente(){
        System.out.println("Nombre: "+getNombre());
        System.out.println("Rut: "+getRut());
        if(isVigencia()==true){
            System.out.println("Vigencia: Vigente");
        }else{
            System.out.println("Vigencia: No Vigente");
        }
    }
}
