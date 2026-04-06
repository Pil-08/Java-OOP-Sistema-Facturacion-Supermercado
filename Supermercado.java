import java.util.ArrayList;
public class Supermercado

{
    public double calcularCosteTransporte(ArrayList<Producto> listaCompra){
        double precio=0.0;
        
        for(Producto p:listaCompra){
            precio=precio+p.calcularTasaTransporte();
        
        }if(precio<5.0){
            return 5.0;
        }else{
            return precio;
        
        }
    }

    
}