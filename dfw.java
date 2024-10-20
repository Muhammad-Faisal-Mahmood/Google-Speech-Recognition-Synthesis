/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;

public final class dfw {
    final File a;
    final Object b = new Object();
    int c = 0;

    public dfw(File file) {
        this.a = file;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String toString() {
        Object object = this.b;
        synchronized (object) {
            String string = this.a.getName();
            int n2 = this.c;
            CharSequence charSequence = new StringBuilder();
            charSequence.append(string);
            charSequence.append("[");
            charSequence.append(n2);
            charSequence.append("]");
            return charSequence.toString();
        }
    }
}

