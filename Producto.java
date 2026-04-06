public abstract class Producto
{
    private String nombre;
    private int unidades;
    private double precio_unidad;
    private double peso_unidad; 
    
    public Producto(String nombre,int unidades,double precio_unidad,double peso_unidad){
        this.nombre=nombre;
        this.unidades=unidades;
        this.peso_unidad=peso_unidad;
        this.precio_unidad=precio_unidad;
    
    }
    
    
    public String getNombre(){
        return nombre;
    
    }
    public int getUnidades(){
        return unidades;
    }
    public double getPrecio_unidad(){
    
    return precio_unidad;
    
    }
    public double getPeso_unidad(){
        return peso_unidad;
    
    }
    
    public abstract double calcularTasaTransporte();
    
    
}