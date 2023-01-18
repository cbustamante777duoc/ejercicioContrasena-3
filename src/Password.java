public class Password {
    
    private int longitud = 8;
    private String contraseña;
    
    

    public Password() {
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public char contraseñaLetraMiniscula(int res){
        char letras [] = {'a','b','c','d','e','f','g','h','i','j','k',
        'l','m','n','ñ','o','p','k','s','t','u','v','w','x','y','z'};
        return letras[res];
    } 

    public char contraseñaLetraMayuscula(int res){
        char letras [] = {'A','B','C','D','E','F','G','H','I','J','K',
        'L','M','N','Ñ','O','P','K','S','T','U','V','W','X','Y','Z'};
        return letras[res];
    } 

    public String generarContraseña(){

        this.contraseña = "";

        //generar los tres primeros numeros
        for (int i = 0; i < 3; i++) {
            int numero = ((int) Math.floor(Math.random() * 9 + 1));
            this.contraseña += numero;
        }

        //generarLetra 2
        for (int i = 0; i < 2; i++) {
            int numero = ((int) Math.floor(Math.random() * 26 + 1));
            this.contraseña += contraseñaLetraMiniscula(numero);
        }

        //generar numeros 2
        for (int i = 0; i < 2; i++) {
            int numero = ((int) Math.floor(Math.random() * 9 + 1));
            this.contraseña += numero;
        }
        //generar las mayusculas
        for (int i = 0; i < 2; i++) {
            int numero = ((int) Math.floor(Math.random() * 26 + 1));
            this.contraseña += contraseñaLetraMayuscula(numero);

        }

        return this.contraseña;

    }

    public String contieneMinusculas() {
        String mensaje = "";
        char[] letras  = {'a','b','c','d','e','f','g','h','i','j','k',
        'l','m','n','ñ','o','p','k','s','t','u','v','w','x','y','z'};

        boolean validador = false;

        for (int i = 0; i < letras.length; i++) {

            if (this.contraseña.indexOf(letras[i])>= 0) {
                validador= true;
            }
        }
        
        if (validador) {
            mensaje = "Contiene minusculas";
        }
        return mensaje;
    }


    public String contieneMayusculas() {
        String mensaje = "";
        char[] letras  = {'A','B','C','D','E','F','G','H','I','J','K',
        'L','M','N','Ñ','O','P','K','S','T','U','V','W','X','Y','Z'};

        boolean validador = false;

        for (int i = 0; i < letras.length; i++) {

            if (this.contraseña.indexOf(letras[i])>= 0) {
                validador= true;
            }
        }
        
        if (validador) {
            mensaje = "Contiene Mayusculas";
        }
        return mensaje;
    }

    public String contieneNumeros() {
        boolean validador=false;
        String mensaje = "";
        char[] chars = this.contraseña.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(char c : chars){
           if(Character.isDigit(c)){
              sb.append(c);
           }
        }

        if (sb.toString().length()>3) {
            validador = true;
        }

        if (validador) {
            mensaje = "Tiene numeros";
        }

        return mensaje;
        
    }
      
    
    public String validar() {
        String mensaje = "";
        
        if (contieneMinusculas()=="Contiene minusculas"|| contieneMayusculas()=="Contiene Mayusculas" || contieneNumeros()=="Tiene numeros") {
            mensaje = "Contraseña es fuerte";
        }

        return mensaje;
    }


    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Informacion Password:\n"
        + "longitud: " + longitud + "\n"
        + "contraseña : " + contraseña + "\n";
    }


    
}