package Entidades;
import Vistas.ViewBorrarCliente;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

public class DirectorioTelefonico {
    
    public HashMap<Long,Cliente> clientes = new HashMap<>();
    
    
    
    public Cliente agregarCliente(long telefono,Cliente c1){    
        if (clientes.containsKey(telefono)) {
            return null;
        }
        else {
            clientes.put(telefono,c1);
            return c1;
        }             
    }
    
    public void borrarCliente(long dni){
       
        for (Map.Entry<Long,Cliente> borrado : clientes.entrySet()){
            if (borrado.getValue().getDni()==dni) {
                clientes.remove(borrado.getKey());
                JOptionPane.showMessageDialog(ViewBorrarCliente.jbBorrarActionPerformed, "Cliente "+borrado.getValue().getApellido()+" eliminado");
            }
            else{
                JOptionPane.showMessageDialog(ViewBorrarCliente.jbBorrarActionPerformed, "No se encontró cliente");
            }
        }    

    }
    
    public Cliente buscarCliente(long telefono){
        Collection keys = clientes.keySet();
        Cliente c1=null;
        c1 = (Cliente) clientes.getOrDefault(telefono, c1);
        
        for (int i = 0; i < keys.size(); i++) {     
            
            if (keys.contains((long)telefono)) {
                System.out.println("Cliente encontrado");
                System.out.println(c1.getApellido());
                break;
            }
            else  {
                System.out.println("No existe ese telefono en nuestra base de datos");
                break;
            }          
        }
        return c1;      
    }
    
   public ArrayList buscarTelefono(String apellido){
       ArrayList<Long> telefonos = new ArrayList();

       for (Map.Entry<Long,Cliente> tel : clientes.entrySet()){
           
           if (tel.getValue().getApellido()==apellido) {
               telefonos.add(tel.getKey());
           }
       }
       System.out.println(telefonos);
       return telefonos; 
  }
   
   public ArrayList buscarClientes(String ciudad){
       
       Collection<Cliente> conversion = clientes.values();
       ArrayList cli = new ArrayList(conversion);
       ArrayList<Cliente> filtrados = new ArrayList<>();
       Cliente c1 = null;
       
       
       for (int i = 0; i < cli.size(); i++) {
           c1 = (Cliente) cli.get(i);
           
           if(c1.getCiudad()==ciudad){
               filtrados.add(c1);
               System.out.println(c1.getApellido()); 
           }
       }
       return filtrados;
   }

    public void getClientes() {
        System.out.println(clientes.size());
    }

    
}   
   
   
