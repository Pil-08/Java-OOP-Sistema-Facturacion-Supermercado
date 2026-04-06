
public class Electrodomestico extends Producto
{
    private int voltaje;
    
    public Electrodomestico(String nombre,int unidades,double precio_unidad,double peso_unidad,int voltaje){
        super(nombre,unidades,precio_unidad,peso_unidad);
        this.voltaje=voltaje;
    
    
    }
    
    public double calcularTasaTransporte(){
        double pesoTotal=this.getUnidades()*this.getPeso_unidad();
        double tasaBasica=pesoTotal*0.10;
        double total=tasaBasica+2;
        return total;
    
    } 
}