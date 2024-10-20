/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dalvik.system.VMStack
 */
import dalvik.system.VMStack;

class hha
extends hgs {
    @Override
    public her a(Class clazz, int n2) {
        return her.a;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public String b(Class serializable) {
        if (hhc.s()) {
            try {
                if (serializable.equals(hhc.p())) {
                    return VMStack.getStackClass2().getName();
                }
            }
            catch (Throwable throwable) {}
        }
        if (!hhc.r()) return null;
        hhk.h(serializable, "target");
        serializable = hic.a.a((Class)serializable);
        if (serializable == null) return null;
        return ((StackTraceElement)serializable).getClassName();
    }
}

