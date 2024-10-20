/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicBoolean;

public final class dfv
implements ddp {
    final cxu a;
    private final dfw b;
    private final AtomicBoolean c;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public dfv(cxu object, dfw dfw2) {
        this.a = object;
        this.c = new AtomicBoolean(false);
        this.b = dfw2;
        object = dfw2.b;
        synchronized (object) {
            ++dfw2.c;
            return;
        }
    }

    public final dfv b() {
        if (!this.c.get()) {
            return new dfv(this.a, this.b);
        }
        throw new IllegalStateException("Can't copy a closed reference.");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void close() {
        if (this.c.getAndSet(true)) {
            return;
        }
        Object object = this.a.b;
        synchronized (object) {
            Object object2 = this.b.b;
            synchronized (object2) {
                int n2;
                dfw dfw2 = this.b;
                dfw2.c = n2 = dfw2.c - 1;
                if (n2 < 0) {
                    ((hfk)((hfk)ddd.a.h()).j("com/google/android/libraries/micore/superpacks/gc/FileRefTable$FileRefImpl", "close", 110, "FileRefTable.java")).u("File %s was closed more times than it was referenced!", this.b);
                } else if (n2 == 0) {
                    this.a.b.remove(dfw2.a);
                    this.a.e(this.b.a, 2);
                }
                return;
            }
        }
    }

    public final void finalize() {
        super.finalize();
        if (!this.c.get()) {
            ((hfk)((hfk)ddd.a.h()).j("com/google/android/libraries/micore/superpacks/gc/FileRefTable$FileRefImpl", "finalize", 126, "FileRefTable.java")).u("File ref is being finalized but wasn't closed, file: %s", this.b);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String toString() {
        Object object = this.b.b;
        synchronized (object) {
            String string = this.b.a.getName();
            int n2 = this.b.c;
            String string2 = this.c.get() ? "x)" : ")";
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append("(");
            stringBuilder.append(n2);
            stringBuilder.append(string2);
            return stringBuilder.toString();
        }
    }
}

