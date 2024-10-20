/*
 * Decompiled with CFR 0.152.
 */
public abstract class her
implements hes {
    public static final her a = new hep();

    public abstract int a();

    public abstract String b();

    public abstract String c();

    public abstract String d();

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("LogSite{ class=");
        stringBuilder.append(this.b());
        stringBuilder.append(", method=");
        stringBuilder.append(this.d());
        stringBuilder.append(", line=");
        stringBuilder.append(this.a());
        if (this.c() != null) {
            stringBuilder.append(", file=");
            stringBuilder.append(this.c());
        }
        stringBuilder.append(" }");
        return stringBuilder.toString();
    }
}

