/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

public final class bho
implements Callable {
    final auo a;
    final bhw b;

    public bho(bhw bhw2, auo auo2) {
        this.b = bhw2;
        this.a = auo2;
    }

    public final Boolean a() {
        Object object = this.b.a;
        auo auo2 = this.a;
        boolean bl2 = false;
        auo2 = wf.i((aum)object, auo2, false);
        try {
            if (auo2.moveToFirst()) {
                if (auo2.getInt(0) != 0) {
                    bl2 = true;
                }
                object = bl2;
            } else {
                object = false;
            }
            return object;
        }
        finally {
            auo2.close();
        }
    }

    protected final void finalize() {
        this.a.j();
    }
}

