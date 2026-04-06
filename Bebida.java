public class Bebida extends Producto
{
    boolean alcohol;
    public Bebida (boolean alcohol,String nombre,int unidades,double precio_unidad,double peso_unidad){
        super(nombre,unidades,precio_unidad,peso_unidad);
        this.alcohol=alcohol;
    
    
    }
    public double calcularTasaTransporte(){
        double pesoTotal=this.getUnidades()*this.getPeso_unidad();
        double tasaBasica=pesoTotal*0.10;
        double total=tasaBasica;
        if(this.alcohol){
             total=tasaBasica+0.5;
        }else{
             total=tasaBasica;
        }
        
        return total;
    
    
    
    }
     
}