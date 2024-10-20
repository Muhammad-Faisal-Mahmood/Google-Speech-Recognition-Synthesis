/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  hom
 */
import androidx.wear.ambient.WearableControllerProvider;
import java.util.concurrent.Executor;

public abstract class bpy {
    public static final String a = "bpy";
    public final bpm b;
    protected final bpq c;
    public final hpq d;
    public final Executor e;
    public final Object f = new Object();
    public hpn g;
    private hpn h;
    private final WearableControllerProvider i;

    protected bpy(bpm bpm2, bpq bpq2, WearableControllerProvider wearableControllerProvider) {
        this.b = bpm2;
        this.c = bpq2;
        this.i = wearableControllerProvider;
        bpm2 = (bqb)bpm2;
        this.d = ((bqb)bpm2).d;
        this.e = ((bqb)bpm2).f;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final hpn a() {
        Object object = this.f;
        synchronized (object) {
            Object object2;
            if (this.h == this.b.a() && (object2 = this.g) != null) {
                return object2;
            }
            object2 = this.i;
            bpm bpm2 = this.b;
            Object object3 = this.c;
            hpn hpn2 = ((bqb)bpm2).b();
            Object object4 = new brk(object3, 1);
            object4 = hph.q(hno.f(hpn2, (gte)object4, ((bqb)bpm2).d));
            object3 = new bpu(this, object2, 1);
            object3 = hph.q(hno.g((hpn)object4, (hny)object3, this.d));
            object2 = new bps(this, 1);
            object2 = hno.g((hpn)object3, (hny)object2, this.d);
            object3 = new bps(this, 0);
            this.g = object2 = hno.g((hpn)object2, (hny)object3, this.d);
            this.h = this.b.a();
            object3 = new cmr(this, 1);
            hhk.T((hpn)object2, (hpb)object3, (Executor)hom.a);
            return object2;
        }
    }

    protected abstract Object b(boz var1);
}

