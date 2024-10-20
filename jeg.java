/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

public abstract class jeg {
    public final Set a = Collections.newSetFromMap(new IdentityHashMap());

    protected abstract void a();

    protected abstract void b();

    public final void c(Object object, boolean bl2) {
        int n2 = this.a.size();
        if (bl2) {
            this.a.add(object);
            if (n2 == 0) {
                this.a();
                return;
            }
        } else if (this.a.remove(object) && n2 == 1) {
            this.b();
        }
    }
}

