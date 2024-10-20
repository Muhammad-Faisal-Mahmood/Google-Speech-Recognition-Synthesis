/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicBoolean;

public final class jjo {
    public static final jjo a = new jjo(new kmp[0]);
    public final kmp[] b;
    private final AtomicBoolean c = new AtomicBoolean(false);

    public jjo(kmp[] kmpArray) {
        this.b = kmpArray;
    }

    public static /* synthetic */ void f(jjo jjo2) {
        Object object;
        for (int i2 = 0; i2 < ((kmp[])(object = jjo2.b)).length; ++i2) {
            object = object[i2];
        }
    }

    public static jjo g(iuc[] iucArray, its its2) {
        jjo jjo2 = new jjo(iucArray);
        for (int i2 = 0; i2 < iucArray.length; ++i2) {
            iucArray[i2].d(its2);
        }
        return jjo2;
    }

    public final void a() {
        Object object;
        for (int i2 = 0; i2 < ((kmp[])(object = this.b)).length; ++i2) {
            object = (iuc)object[i2];
        }
    }

    public final void b(long l2) {
        kmp[] kmpArray;
        for (int i2 = 0; i2 < (kmpArray = this.b).length; ++i2) {
            kmpArray[i2].b(l2);
        }
    }

    public final void c(long l2) {
        kmp[] kmpArray;
        for (int i2 = 0; i2 < (kmpArray = this.b).length; ++i2) {
            kmpArray[i2].c(l2);
        }
    }

    public final void d() {
        kmp[] kmpArray;
        for (int i2 = 0; i2 < (kmpArray = this.b).length; ++i2) {
            ((iuc)kmpArray[i2]).a();
        }
    }

    public final void e() {
        Object object;
        for (int i2 = 0; i2 < ((kmp[])(object = this.b)).length; ++i2) {
            object = (iuc)object[i2];
        }
    }

    public final void h() {
        kmp[] kmpArray = this.c;
        if (kmpArray.compareAndSet(false, true)) {
            kmpArray = this.b;
            for (int i2 = 0; i2 < kmpArray.length; ++i2) {
                kmpArray[i2].h();
            }
        }
    }
}

