package Principal;

import Entidades.Cliente;
import Entidades.DirectorioTelefonico;

public class NewMain {

    public static void main(String[] args) {
        DirectorioTelefonico dire = new DirectorioTelefonico();
        
        Cliente nuevo = new Cliente(34104821,"Hernandez","Roberto","Villa larca","9 de julio");
        Cliente n2 = new Cliente(1354688,"Torres","Manuel","Villa larca","San Luis 344");
        Cliente n3 = new Cliente(125543,"Torres","Manuel","Villa larca","San Luis 344");
        
        dire.agregarCliente(425142,nuevo);
        dire.agregarCliente(115483, n3);
        dire.agregarCliente(317728, n2);

        dire.getClientes();
//        dire.buscarCliente(425142);
//        dire.buscarCliente(317728);
//        dire.buscarTelefono("Torres");
//        dire.buscarClientes("Villa Mercedes");
//        dire.borrarCliente(125543);
//        dire.getClientes();
        
    }
    
}
