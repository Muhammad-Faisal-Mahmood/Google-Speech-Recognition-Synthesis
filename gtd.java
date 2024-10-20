/*
 * Decompiled with CFR 0.152.
 */
public abstract class gtd {
    protected gtd() {
    }

    public abstract int a(Object var1);

    protected abstract boolean b(Object var1, Object var2);

    public final boolean c(Object object, Object object2) {
        if (object == object2) {
            return true;
        }
        if (object != null && object2 != null) {
            return this.b(object, object2);
        }
        return false;
    }
}

