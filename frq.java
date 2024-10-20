/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gqv
 *  hom
 */
import androidx.wear.ambient.AmbientModeSupport$AmbientController;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public final class frq
implements hnx {
    public List a;
    public final frr b;

    public frq(frr frr2) {
        this.b = frr2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public final hpn a() {
        Object object4;
        Object object2;
        Object object3;
        block13: {
            object3 = this.b;
            object3 = ((frr)object3).d.a("Initialize ".concat(String.valueOf(((frr)object3).a)), gqv.a);
            object2 = this.b.c;
            // MONITORENTER : object2
            if (this.a != null) break block13;
            object4 = this.b;
            this.a = ((frr)object4).e;
            ((frr)object4).e = Collections.emptyList();
        }
        // MONITOREXIT : object2
        try {
            object2 = new ArrayList(this.a.size());
            AmbientModeSupport$AmbientController ambientModeSupport$AmbientController = new AmbientModeSupport$AmbientController(this.b);
            for (Object object4 : this.a) {
                try {
                    object2.add(object4.a(ambientModeSupport$AmbientController));
                }
                catch (Exception exception) {
                    object2.add(hhk.J(exception));
                    break;
                }
            }
            object2 = hhk.aa(object2);
            object4 = new fgm(this, 15);
            object2 = ((iuv)object2).a((Callable)object4, (Executor)hom.a);
            ((gol)object3).a((hpn)object2);
            return object2;
        }
        catch (Throwable throwable) {
            throw throwable;
        }
        finally {
            ((gol)object3).close();
        }
    }
}

