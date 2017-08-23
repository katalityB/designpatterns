package designpatterns.singleton.synclazily;

public class SyncLazily {
    private static SyncLazily syncLazilyUniq;

    private SyncLazily(){}

    public static synchronized SyncLazily getSyncLazilyUniq(){
        if(syncLazilyUniq == null){
            syncLazilyUniq = new SyncLazily();
        }
        return syncLazilyUniq;
    }
}
