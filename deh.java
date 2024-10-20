/*
 * Decompiled with CFR 0.152.
 */
public abstract class deh {
    public static final deh f = new dee(dcv.a, 0, 0, 0, 0, 0);

    public abstract int a();

    public abstract int b();

    public abstract int c();

    public abstract int d();

    public abstract int e();

    public abstract dcv f();

    public final boolean g(boolean bl2) {
        int n2 = this.c();
        if (n2 != 1) {
            if (n2 != 2) {
                return bl2;
            }
            return false;
        }
        return true;
    }

    public String toString() {
        String string = dec.a(this.c(), this.b(), this.d(), this.a());
        String string2 = dec.i(this.e());
        String string3 = ((Object)this.f()).toString();
        StringBuilder stringBuilder = new StringBuilder("{");
        stringBuilder.append(string);
        stringBuilder.append(", ");
        stringBuilder.append(string2);
        stringBuilder.append(", p ");
        stringBuilder.append(string3);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

