/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import java.util.LinkedHashMap;
import java.util.Map;

public final class awi {
    public final awh a;
    public final Map b;
    public boolean c;
    public Bundle d;
    public boolean e;
    public boolean f;
    public final xm g;
    private final jqz h;

    public awi(awh awh2, jqz jqz2) {
        this.a = awh2;
        this.h = jqz2;
        this.g = new xm();
        this.b = new LinkedHashMap();
        this.f = true;
    }

    public final void a() {
        if (this.a.getLifecycle().a() == aba.b) {
            if (!this.c) {
                this.h.a();
                this.a.getLifecycle().b(new mm(this, 3));
                this.c = true;
                return;
            }
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
    }
}

