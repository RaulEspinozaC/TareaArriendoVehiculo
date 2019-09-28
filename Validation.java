public class Validation {
    public static boolean validationMedioPago(char pmedioPago){
        if(pmedioPago=='T' || pmedioPago=='E'){
            return true;
        }else{ return false; }
    }

    public static boolean validationDias(int pdias){
        if(pdias>0 && pdias<11){
            return true;
        }else{ return false; }
    }

    public static boolean validationPatente(String ppatente){
        String patenteUpperCase= ppatente.toUpperCase();
        if(ppatente.length()==8 && ppatente.equals(patenteUpperCase)){
            return true;
            } else { return false; }
    }

    public static boolean validationAño(int paño){
        if(paño>=2000 && paño<=2020){
            return true;
        }else{ return false; }
    }

    public static boolean validationRut(String prut){
        if(prut.charAt(8)=='-' && prut.length()==10){
            return true;
        }else{ return false; }
    }




}
