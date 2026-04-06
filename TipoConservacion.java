public enum TipoConservacion
{
    NORMAL(0.0),
    FRIO(0.02),
    CONGELADO(0.05);
    
    private double coste;
    
    private TipoConservacion(double coste){
        this.coste=coste;
    
    }
    
    public double getCoste(){
        return coste;
    }
    
    
    
}