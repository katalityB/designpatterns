package designpatterns.singleton.doublevol;

public class DoubleVol {
    private volatile static DoubleVol uniqueInstance;

    private DoubleVol() {}

    public static DoubleVol getUniqueInstance() {
        if(uniqueInstance == null){
            synchronized (DoubleVol.class) {
                if(uniqueInstance == null) {
                    uniqueInstance = new DoubleVol();
                }
            }
        }
        return uniqueInstance;
    }
}
