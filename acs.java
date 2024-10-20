/*
 * Decompiled with CFR 0.152.
 */
public final class acs
extends acr {
    public acs() {
        this((byte[])null);
    }

    public acs(acr object) {
        jse.e(object, "initialExtras");
        object = ((acr)object).b;
        this.b.putAll(object);
    }

    public /* synthetic */ acs(byte[] byArray) {
        this(acp.a);
    }

    @Override
    public final Object a(acq acq2) {
        return this.b.get(acq2);
    }

    public final void b(acq acq2, Object object) {
        this.b.put(acq2, object);
    }
}

