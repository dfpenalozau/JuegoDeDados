public class Dado {

    int Valor1;
    int Valor2;
    
    public void Lanzar(){
        
        Valor1=(int) (Math.random()*6+1);
        Valor2=(int) (Math.random()*6+1);
        
    }
    
}
