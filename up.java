/*
 * Decompiled with CFR 0.152.
 */
public final class up
extends uo {
    private final Object a = new Object();

    public up(int n2) {
        super(n2);
    }

    @Override
    public final Object a() {
        Object object = this.a;
        synchronized (object) {
            Object object2 = super.a();
            return object2;
        }
    }

    @Override
    public final boolean b(Object object) {
        jse.e(object, "instance");
        Object object2 = this.a;
        synchronized (object2) {
            boolean bl2 = super.b(object);
            return bl2;
        }
    }
}

