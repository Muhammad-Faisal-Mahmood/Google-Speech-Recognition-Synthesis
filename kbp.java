/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicReferenceArray;

public final class kbp {
    public volatile AtomicReferenceArray array;

    public kbp(int n2) {
        this.array = new AtomicReferenceArray(n2);
    }

    public final Object a(int n2) {
        AtomicReferenceArray atomicReferenceArray = this.array;
        if (n2 < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(n2);
        }
        return null;
    }

    public final void b(int n2, Object object) {
        AtomicReferenceArray atomicReferenceArray = this.array;
        int n3 = atomicReferenceArray.length();
        if (n2 < n3) {
            atomicReferenceArray.set(n2, object);
            return;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<Object>(jse.k(n2 + 1, n3 + n3));
        for (int i2 = 0; i2 < n3; ++i2) {
            atomicReferenceArray2.set(i2, atomicReferenceArray.get(i2));
        }
        atomicReferenceArray2.set(n2, object);
        this.array = atomicReferenceArray2;
    }
}

