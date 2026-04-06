public class Alimento extends Producto
{
    private TipoConservacion conservacion;
    
    public Alimento (TipoConservacion conservacion,String nombre,int unidades,double precio_unidad,double peso_unidad){
        super(nombre,unidades,precio_unidad,peso_unidad);
        this.conservacion=conservacion;
    
    
    }
    
    public double calcularTasaTransporte(){
        double pesoTotal=this.getUnidades()*this.getPeso_unidad();
        double tasaBasica=pesoTotal*0.10;
        double extra=0.0;
        
        if(this.conservacion==TipoConservacion.NORMAL){
            extra=extra+0.01;
        
        }else if (this.conservacion==TipoConservacion.CONGELADO||this.conservacion==TipoConservacion.FRIO){
            extra=pesoTotal*this.conservacion.getCoste();
 
        }
        
        return extra+tasaBasica;
    }   
}