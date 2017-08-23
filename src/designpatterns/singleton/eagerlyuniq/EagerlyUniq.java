package designpatterns.singleton.eagerlyuniq;

public class EagerlyUniq {
    private static EagerlyUniq eagerlyUniq = new EagerlyUniq();

    public static EagerlyUniq getEagerlyUniq(){
        return eagerlyUniq;
    }
}
