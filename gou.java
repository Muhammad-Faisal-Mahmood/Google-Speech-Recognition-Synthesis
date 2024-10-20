/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Map;

final class gou {
    int a;
    final int b;
    gou c;
    final Map d = new HashMap(0);

    public gou(int n2, int n3) {
        if (n2 <= n3) {
            this.a = n2;
            this.b = n3;
            this.c = null;
            return;
        }
        throw new IllegalArgumentException();
    }

    public final String toString() {
        int n2 = System.identityHashCode(this);
        StringBuilder stringBuilder = new StringBuilder("Node");
        stringBuilder.append(n2);
        return stringBuilder.toString();
    }
}

