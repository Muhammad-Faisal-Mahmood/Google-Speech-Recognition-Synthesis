/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;

public final class cok
implements imb {
    private final jnu a;
    private final jnu b;

    public cok(jnu jnu2, jnu jnu3) {
        this.a = jnu2;
        this.b = jnu3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final cpz a() {
        Object object = (Map)((imc)this.a).a;
        int n2 = object.size();
        jnu jnu2 = this.b;
        if (n2 != 0) {
            if (n2 != 1) throw new IllegalArgumentException("More than 1 ThreadMonitoringConfiguration: ".concat(String.valueOf(jnu2.toString())));
            object = (cpz)fvd.Q(object.keySet());
        } else {
            object = ((cqa)jnu2).a();
        }
        idi.m(object);
        return object;
    }
}

