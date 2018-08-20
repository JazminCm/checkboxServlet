package pojos;


public class Login {

    private String nombre;
    private String pass;
    private String[] lenguajes;

    public Login() {
        System.out.println("no estas enviando parametros");
    }

    public Login(String nombre, String pass,String[] lenguajes) {
        this.nombre = nombre;
        this.pass = pass;
        this.lenguajes = lenguajes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String[] getLenguajes() {
        return lenguajes;
    }

    public void setLenguajes(String[] lenguajes) {
        this.lenguajes = lenguajes;
    }
    
    
}
