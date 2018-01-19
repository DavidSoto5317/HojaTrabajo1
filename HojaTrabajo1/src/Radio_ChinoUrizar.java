/**
*@author David Soto 17551
*@author Andres Urizar 17
*@since 17-01-2018
*@version 1.0 
*/

public class Radio_ChinoUrizar implements douglas{

	private boolean encendido_apagado; //Este atributo servirá para saber si el radio esta encendido o apagado
	private boolean amfm; //Este atributo servira para saber si la emisora esta en AM o en FM
	private float [] guardadas = new float [12]; // Aqui se guardaran las 12 emisoras que se deseen

	public Radio_ChinoUrizar(){
            amfm=true;
            encendido_apagado = false;
            
	}
	/**
	*Este metodo va a servir para poder encender y apagar la radio
	*/
	@Override
	public void onOff(){ //Método para prender/apagar la radio
		if(encendido_apagado){
			encendido_apagado = false;
		}else{
			encendido_apagado=true;
		}
	}
	/**
	* Este metodo nos ayudara a cambiar la radio de AM a FM
	* @return un booleano para determinar si la radio esta en AM o en FM
	*/
	@Override
	public float Switch(){ //Método para cambiar AM/FM
		if(amfm){
			amfm = false; //true significa FM
		}else{
			amfm = true; // false significa AM
		}
		float a = 0;
                return a;
	}
    /**
     * Metodo que cambia a la siguiente estacion
     * @param a estacion en la que se esta
     * @return siguiente estacion
     */
    @Override
    public float siguiente(float a){
    	float numeroemisora = 0;
        if (amfm) {
            if(a<107.9){
                numeroemisora=(float)(a+0.2);  
            }else{
                numeroemisora = (float)87.9;
            }
        }
        else{
            if(a<1610){
                numeroemisora=(float)(a+5.0);
            }else{
                numeroemisora = (float)530;
            }
        }
        return numeroemisora;
    }
    /**
     * Metodo que regresa de estacion 
     * @param a estacion en la que se esta
     * @return anterior estacion
     */
    @Override
    public float anterior(float a){
    	float numeroemisora =0;
         if (amfm) {
            if(a>87.9){
                numeroemisora=(float)(a-0.2);
            }else{
                numeroemisora=(float)107.9;
            } 
        }
        else{
            if(a>530){
                numeroemisora=(float)(a-5.0);
            }else{
                numeroemisora=1610;
            }
        }
        return numeroemisora;
    }
    /**
     * Metodo para guardar una emisora en un boton
     * @param e la estacion de radio
     * @param b el numero de boton donde se guardara
     */
    @Override
    public void guardar(float e,int b){
        guardadas[b-1] = e;
    }
    /**
     * En este metodo selecciona la emisora guardada en cierto boton
     * @param b es el numero de boton presionado
     * @return la estacion guardada en el boton
     */
    @Override
    public float seleccionarFav(int b){
        float estacion=(float)(0); //Estacion que se va a devolver, en caso de devolver 0 es porque no hay estacion guardada en el boton
        int espacio= b-1;
        estacion = guardadas[espacio];
        if(estacion==(float)0)
        {
            if(amfm)
            {
                estacion = (float)87.9;
            }else{
                estacion = (float)530;
            }
        }
        return estacion;
    }

}

