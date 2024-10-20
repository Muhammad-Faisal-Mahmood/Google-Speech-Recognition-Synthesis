/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;

public final class cqa
implements imb {
    private final jnu a;

    public cqa(jnu jnu2) {
        this.a = jnu2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final cpz a() {
        Object object = (Map)((imc)this.a).a;
        int n2 = object.size();
        if (n2 != 0) {
            if (n2 != 1) throw new IllegalArgumentException("More than 1 ThreadMonitoringConfiguration");
            object = (cpz)fvd.Q(object.keySet());
        } else {
            object = new cpp();
        }
        object.d();
        object.d();
        object.d();
        fxf.F(true, "ThreadMonitoringConfiguration.threadCountSamplesPerThousand() must be between [0, %s] but found %s", 1000, 1);
        object.e();
        object.e();
        fxf.C(true, "ThreadMonitoringConfiguration.threadCountThreshold must be positive but found %s", 1000);
        object.a();
        object.a();
        object.a();
        fxf.F(true, "ThreadMonitoringConfiguration.queueSizeSamplesPerThousand() must be between [0, %s] but found %s", 1000, 1);
        object.b();
        object.b();
        fxf.C(true, "ThreadMonitoringConfiguration.queueSizeThreshold must be positive but found %s", 1000);
        object.c();
        object.c();
        object.c();
        fxf.F(true, "ThreadMonitoringConfiguration.taskTimeoutSamplesPerThousand() must be between [0, %s] but found %s", 1000, 1);
        object.f();
        object.f();
        fxf.D(true, "ThreadMonitoringConfiguration.taskTimeoutDuration must be positive but found %s", 1L);
        idi.m(object);
        return object;
    }
}

