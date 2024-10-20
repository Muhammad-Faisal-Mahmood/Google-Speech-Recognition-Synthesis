/*
 * Decompiled with CFR 0.152.
 */
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

public final class goa
extends PhantomReference {
    public final gnz a = new gnz(this);

    public goa(Object object, ReferenceQueue referenceQueue) {
        super(object, referenceQueue);
    }
}

