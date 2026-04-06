public class AlimentoBotella extends Alimento
{
    private boolean esCristal;
     public AlimentoBotella (TipoConservacion conservacion,String nombre,int unidades,double precio_unidad,double peso_unidad,boolean esCristal){
        super(conservacion,nombre,unidades,precio_unidad,peso_unidad);
        this.esCristal=esCristal;
    
    
    }
    
    public double calcularTasaTransporte(){
        double totalPadre=super.calcularTasaTransporte();
        if(this.esCristal){
            totalPadre=totalPadre+0.05;
        
        }else{
            totalPadre=totalPadre;
        }
        return totalPadre;
    }
    
    
}