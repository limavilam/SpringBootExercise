package cursoSpringBoot.domain;

///Las clases tipo pojo contienen atributos, getter y setter, constructores

public class Customer {
    //Atributos
    private int ID;
    private String name;
    private String username;
    private String password;

    //Constructor: Poblar los atributos, asignar valores
    public Customer(int ID, String name, String username, String password) {
        this.ID = ID;
        this.name = name;
        this.username = username;
        this.password = password;
    }

    //Getter y Setter: Acceso a variables

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
