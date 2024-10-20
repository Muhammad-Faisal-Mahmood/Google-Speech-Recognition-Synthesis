/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public final class jic {
    final int a;
    final int b;
    final int c;
    final AtomicInteger d;

    public jic(float f2, float f3) {
        int n2;
        AtomicInteger atomicInteger;
        this.d = atomicInteger = new AtomicInteger();
        this.c = (int)(f3 * 1000.0f);
        this.a = n2 = (int)(f2 * 1000.0f);
        this.b = n2 / 2;
        atomicInteger.set(n2);
    }

    final boolean a() {
        return this.d.get() > this.b;
    }

    final boolean b() {
        int n2;
        int n3;
        do {
            if ((n3 = this.d.get()) != 0) continue;
            return false;
        } while (!this.d.compareAndSet(n3, Math.max(n2 = n3 - 1000, 0)));
        return n2 > this.b;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof jic)) {
            return false;
        }
        object = (jic)object;
        return this.a == ((jic)object).a && this.c == ((jic)object).c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.c});
    }
}

