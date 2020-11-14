// import java.util.ArrayList;

/**
 * fruit_seller
 */
/**
 * GenericFruitSeller
 */
class GenericFruitSeller<FS> {

    FS fsobj;

    GenericFruitSeller(FS fsobj){
        this.fsobj = fsobj; 
    }
    
    public FS addToList(){
        
    }
    
}


public class fruit_seller {

    public static void main(String[] args) {
        GenericFruitSeller<String> gfs = new GenericFruitSeller<String>();
        
    }
}