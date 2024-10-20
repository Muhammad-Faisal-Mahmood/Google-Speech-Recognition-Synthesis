/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import java.util.Map;

public final class acc
implements awe {
    public Bundle a;
    private final awf b;
    private boolean c;
    private final jny d;

    public acc(awf awf2, aco aco2) {
        jse.e(awf2, "savedStateRegistry");
        this.b = awf2;
        this.d = new jog(new mq(aco2, 6));
    }

    private final acd c() {
        return (acd)this.d.a();
    }

    @Override
    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.a;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : this.c().a.entrySet()) {
            String string = (String)entry.getKey();
            Bundle entry2 = ((abw)entry.getValue()).f.a();
            if (jse.i(entry2, Bundle.EMPTY)) continue;
            bundle.putBundle(string, entry2);
        }
        this.c = false;
        return bundle;
    }

    public final void b() {
        if (!this.c) {
            Bundle bundle = this.b.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
            Bundle bundle2 = new Bundle();
            Bundle bundle3 = this.a;
            if (bundle3 != null) {
                bundle2.putAll(bundle3);
            }
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            this.a = bundle2;
            this.c = true;
            this.c();
        }
    }
}

