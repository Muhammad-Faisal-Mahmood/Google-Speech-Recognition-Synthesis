/*
 * Decompiled with CFR 0.152.
 */
public abstract class dfy {
    public static dfx g() {
        dfx dfx2 = new dfx();
        dfx2.e(0L);
        dfx2.b(0);
        dfx2.d(1);
        dfx2.a = dcv.a;
        return dfx2;
    }

    public abstract int a();

    public abstract int b();

    public abstract long c();

    public abstract dcv d();

    public abstract ddn e();

    public int f() {
        throw null;
    }

    public String toString() {
        String string = ((Object)this.e()).toString();
        long l2 = this.c();
        StringBuilder stringBuilder = new StringBuilder("{");
        stringBuilder.append(string);
        stringBuilder.append(": ");
        stringBuilder.append(l2);
        stringBuilder.append(" bytes}");
        return stringBuilder.toString();
    }
}

