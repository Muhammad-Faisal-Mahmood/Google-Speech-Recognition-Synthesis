/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  androidx.wear.ambient.AmbientLifecycleObserver$AmbientLifecycleCallback$-CC
 */
import android.text.TextUtils;
import androidx.wear.ambient.AmbientLifecycleObserver$AmbientLifecycleCallback;
import androidx.wear.ambient.AmbientMode$AmbientCallback;
import androidx.wear.ambient.AmbientModeSupport$AmbientCallback;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

public final class bcz
extends AmbientModeSupport$AmbientCallback {
    private static final String g = bbi.b("WorkContinuationImpl");
    public final bdn a;
    public final String b;
    public final List c;
    public final List d;
    public boolean e;
    public final int f;
    private final List h;
    private bbp i;

    public bcz(bdn bdn2, String string, int n2, List list) {
        this(bdn2, string, n2, list, null);
    }

    public bcz(bdn object, String string, int n2, List list, byte[] byArray) {
        super(null);
        this.a = object;
        this.b = string;
        this.f = n2;
        this.c = list;
        this.d = new ArrayList(list.size());
        this.h = new ArrayList();
        for (int i2 = 0; i2 < list.size(); ++i2) {
            if (n2 == 1 && ((bhd)((bmu)list.get((int)i2)).b).v != Long.MAX_VALUE) {
                throw new IllegalArgumentException("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
            }
            object = ((bmu)list.get(i2)).a();
            this.d.add(object);
            this.h.add(object);
        }
    }

    public final bbp v() {
        if (!this.e) {
            Object object = this.a;
            AmbientLifecycleObserver$AmbientLifecycleCallback.-CC -CC2 = ((bdn)object).c.o;
            String string = this.f != 1 ? "KEEP" : "REPLACE";
            Object object2 = ((bdn)object).k.a;
            object = new bdm(this, 1);
            this.i = AmbientMode$AmbientCallback.e(-CC2, "EnqueueRunnable_".concat(string), (Executor)object2, (jqz)object);
        } else {
            bbi bbi2 = bbi.a();
            String string = g;
            StringBuilder stringBuilder = new StringBuilder("Already enqueued work ids (");
            stringBuilder.append(TextUtils.join((CharSequence)", ", (Iterable)this.d));
            stringBuilder.append(")");
            bbi2.f(string, stringBuilder.toString());
        }
        return this.i;
    }
}

