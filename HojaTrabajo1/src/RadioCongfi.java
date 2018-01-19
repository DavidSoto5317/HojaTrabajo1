/**
 * Clase que contiene los metodos llamados mediante la interfaz
 * @author: Oscar Juárez - 17315; Josue Florian - 17081
 * @version: 19.01.18
 * Algoritmos y Estructura de Datos - seccion: 10
 */

public class RadioCongfi implements douglas {

    private boolean OnOff;
    private boolean AmFm;
    private float ultimaFM;
    private float ultimaAM;
    private float[] favoritoAm = new float[12];
    private float[] favoritosFm = new float[12];
    
    public RadioCongfi(){
        OnOff = false;
        AmFm = false;
        ultimaFM = (float) 89.7;
        ultimaAM = 530;
        
        // Si AmFm es falso = FM
        // Si AmFm es verdadero = AM
        
    }
    /**
     * esta funcion se encarga de encender el radio
     */
    public void onOff(){              
        OnOff = !(OnOff);
        
    }
    /**
     * esta funcion se encarga de poner el radio en am o fm
     * @return el valor de encendido o apagado
     */
    public float Switch(){
        
        float frecuencia;
        
        AmFm = !(AmFm);                
        
        if (AmFm) {
            
            frecuencia = ultimaAM;            
            
        } else {
            
            frecuencia = ultimaFM;
            
        }                                                 
        
        return frecuencia;
    }
    /**
     * esta funcion se encarga de regresar a una frecuencia de -10 en am o 0.2 en fm al presionar
     * el boton de anterior
     * @param frecuencia
     * @return regresa +10 a la frecuencia actual o +0.2
     */
    public float siguiente(float frecuencia){                
        
        if (OnOff) {
            
            if (AmFm) {
                
                if (frecuencia < 1610) {
                    
                    frecuencia += 10;
                    
                } else {
                    
                    frecuencia = 530;
                    
                }                
                ultimaAM = frecuencia;                 
                               
            } else {
                
                if (frecuencia < 107.9) {
                    
                    frecuencia += 0.2;
                    frecuencia = (float) (Math.round(frecuencia*10.0)/10.0);
                    
                } else {
                    
                    frecuencia = (float) 87.9;
                }  
                
                ultimaFM = frecuencia;                                
            }          
        }                
        
        return frecuencia;
    }
    /**
     * esta funcion se encarga de regresar a una frecuencia de -10 en am o 0.2 en fm al presionar
     * el boton de anterior
     * @param frecuencia
     * @return regresa -10 a la frecuencia actual o +0.2
     */
    public float anterior(float frecuencia){
        
        if (OnOff) {
            
            if (AmFm) {
                
                if (frecuencia > 530) {
                    
                    frecuencia -= 10;                    
                    
                } else {
                    
                    frecuencia = 1610;
                    
                }
                
            } else {
                
                if (frecuencia > 88.0) {
                    
                    frecuencia -= 0.2;
                    frecuencia = (float) (Math.round(frecuencia*10.0)/10.0);
                    
                } else {
                    
                    frecuencia = (float) 107.9;
                }                
            }            
        }                
        
        return frecuencia;
    }
    
    /**
     * Metodo que guarda una frecuencia especifica en una posicion de las listas de radio.
     * @param frecuencia: la frecuencia que se quiere guardar
     * @param boton: el boton en donde se quiere guardar la frecuencia
     */
    public void guardar(float frecuencia, int boton){
        
        if  (OnOff) {
                    
            //Si la radio es AM
            if (AmFm) {

                favoritoAm[boton] = frecuencia;            

            //Si la radio es FM
            } else {

                favoritosFm[boton] = frecuencia;                        
            }      
        }                
    }
    
    /**
     * Metodo que selecciona las radios favoritas guardadas por el usuario
     * @param boton: El boton del cual se quiere seleccionar la radio
     * @return: La radio guardada en dicho boton.
     */
    public float seleccionarFav(int boton) {
        
        float frecuenciaGuardada=0;
        
        if (OnOff) {
        
            //Si la radio es AM
            if (AmFm) {

                frecuenciaGuardada = favoritoAm[boton];

            //Si la radio es FM
            } else {

                frecuenciaGuardada = favoritosFm[boton];

            }   
        }                
        
        return frecuenciaGuardada;        
    }    
    
}
