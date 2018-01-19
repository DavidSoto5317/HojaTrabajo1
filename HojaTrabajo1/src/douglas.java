/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andres Urizar
 * @author David Soto
 */
public interface douglas {
    
    public boolean onOff();  //Método para prender/apagar la radio
    
    public boolean Switch(); //Método para cambiar AM/FM
    
    public float siguiente(float a);  //Método para cambiar a la siguiente estación
    
    public float anterior(float a);  //Método para cambiar a la estación anterior
    
    public void guardar(float e,int b);  //Método para guardar una estación en favoritos
    
    public float seleccionarFav(int b);  //Método para devolver una de las estación que estén en favoritos
            
}
