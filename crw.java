/*
 * Decompiled with CFR 0.152.
 */
public final class crw
extends hnk {
    Object a;

    public crw(Object object) {
        this.a = object;
    }

    @Override
    public final String a() {
        Object object = this.a;
        if (object == null) {
            return "";
        }
        return object.toString();
    }

    @Override
    protected final void b() {
        this.a = null;
    }
}

