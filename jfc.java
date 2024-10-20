/*
 * Decompiled with CFR 0.152.
 */
public final class jfc
extends iwf {
    final Throwable a;
    private final iwb b;

    public jfc(Throwable object) {
        this.a = object;
        object = iyh.j.e("Panic! This is a bug!").d((Throwable)object);
        iwb iwb2 = iwb.a;
        fxf.r(((iyh)object).g() ^ true, "drop status shouldn't be OK");
        this.b = new iwb(null, (iyh)object, true);
    }

    @Override
    public final iwb a(iwc iwc2) {
        return this.b;
    }

    public final String toString() {
        gtn gtn2 = fxf.Q(jfc.class);
        gtn2.b("panicPickResult", this.b);
        return gtn2.toString();
    }
}

