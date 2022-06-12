
public class ChocolatChaud extends Boisson {
    public static final ChocolatChaud SINGLETON = new ChocolatChaud();
  
    public float cout() {
        return 2;
    }


    public String description() {
        return "chocolat chaud";
    }
}
