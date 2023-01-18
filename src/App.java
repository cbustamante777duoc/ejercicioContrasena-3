public class App {
    public static void main(String[] args) throws Exception {
        Password password = new Password();
        password.generarContraseña();

        System.out.println(password.toString());
        System.out.println(password.contieneMinusculas());
        System.out.println(password.contieneMayusculas());
        System.out.println(password.contieneNumeros());
        System.out.println(password.validar());

        // Informacion Password: 
        // longitud: 8
        // contraseña : 615pd18IB

        // Contiene minusculas 
        // Contiene Mayusculas 
        // Tiene numeros       
        // Contraseña es fuerte
    
    }
}
