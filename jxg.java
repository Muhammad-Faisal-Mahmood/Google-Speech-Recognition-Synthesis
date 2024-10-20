/*
 * Decompiled with CFR 0.152.
 */
public final class jxg
extends juy {
    public static final int a = 0;

    static {
        new jxg();
    }

    private jxg() {
    }

    @Override
    public final void a(jqf jqf2, Runnable runnable) {
        if ((jqf2 = (jxk)jqf2.get(jxk.b)) != null) {
            ((jxk)jqf2).a = true;
            return;
        }
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }

    @Override
    public final boolean b(jqf jqf2) {
        return false;
    }

    @Override
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}

