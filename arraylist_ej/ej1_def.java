package arraylist_ej;
import java.util.ArrayList;
import java.util.Scanner;

public class ej1_def {
}



class Contacto {
    protected String name;
    private String phonenumber;

    public Contacto(String name, String phonenumber) {
        this.name = name;
        this.phonenumber = phonenumber;
    }

    public String getName() {
        return name;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public static Contacto createContact (String name, String phonenumber){
        return new Contacto(name, phonenumber);
    }

}

class TelefonoMovil {
    private String myNumber;
    ArrayList<Contacto> myContacts;


    public TelefonoMovil(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    //devolver boolean, pasar Contacto como parametro
    public boolean addNewContact (Contacto contacto){
        // si el contacto existe ya devuelve true y se actualiza, si no false
        if (myContacts.contains(contacto)){
            System.out.println("Contacto existente");
            return false;}
        myContacts.add(contacto);
        return true;
    }

    public boolean updateContact (Contacto antiguo, Contacto nuevo){
        // si el contacto exise > true y actualiza
        int indexAntiguo = myContacts.indexOf(antiguo); // buscar contacto antiguo
        if (indexAntiguo == -1 || (!antiguo.equals(nuevo) && myContacts.contains(nuevo))) {
            System.out.println("Error contacto no existente o contacto con el mismo nombre que el nuevo");
            return false;
        }
        myContacts.set(indexAntiguo, nuevo);
        return true;
    }

    public boolean removeContact (Contacto con1){
        if (myContacts.contains(con1)){
        myContacts.remove(con1);
        System.out.println("Se elimino con exito");}
        System.out.println("NO existe");
        return false;
    }

    public int findContact (Contacto cont){
        return myContacts.indexOf(cont);
    }

    public Contacto findContact(String nombre) {
        Contacto c1 = new Contacto(nombre, "");
            for (Contacto c : myContacts) {
                if (c.getName().equals(nombre)) {
                    return c;
                }
            }
            return null;
            // No se encontró
    }

    public void printContacts(){
        System.out.println("Lista de contactos:\n");
        int i = 1;
        for (Contacto c : myContacts) {
            System.out.println(i + ". " + c.getName() + " -> " + c.getPhonenumber());
            i++;
        }
    }
}



