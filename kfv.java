/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.TimeUnit;

public final class kfv {
    public static final int j = 0;
    public final boolean a;
    public final boolean b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final int g;
    public final int h;
    public final boolean i;
    private final int k;
    private final boolean l;
    private final boolean m;
    private String n;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        jse.e((Object)timeUnit, "timeUnit");
        timeUnit.toSeconds(Integer.MAX_VALUE);
    }

    public kfv(boolean bl2, boolean bl3, int n2, int n3, boolean bl4, boolean bl5, boolean bl6, int n4, int n5, boolean bl7, boolean bl8, boolean bl9, String string) {
        this.a = bl2;
        this.b = bl3;
        this.c = n2;
        this.k = n3;
        this.d = bl4;
        this.e = bl5;
        this.f = bl6;
        this.g = n4;
        this.h = n5;
        this.i = bl7;
        this.l = bl8;
        this.m = bl9;
        this.n = string;
    }

    public final String toString() {
        String string = this.n;
        CharSequence charSequence = string;
        if (string == null) {
            charSequence = new StringBuilder();
            if (this.a) {
                ((StringBuilder)charSequence).append("no-cache, ");
            }
            if (this.b) {
                ((StringBuilder)charSequence).append("no-store, ");
            }
            if (this.c != -1) {
                ((StringBuilder)charSequence).append("max-age=");
                ((StringBuilder)charSequence).append(this.c);
                ((StringBuilder)charSequence).append(", ");
            }
            if (this.k != -1) {
                ((StringBuilder)charSequence).append("s-maxage=");
                ((StringBuilder)charSequence).append(this.k);
                ((StringBuilder)charSequence).append(", ");
            }
            if (this.d) {
                ((StringBuilder)charSequence).append("private, ");
            }
            if (this.e) {
                ((StringBuilder)charSequence).append("public, ");
            }
            if (this.f) {
                ((StringBuilder)charSequence).append("must-revalidate, ");
            }
            if (this.g != -1) {
                ((StringBuilder)charSequence).append("max-stale=");
                ((StringBuilder)charSequence).append(this.g);
                ((StringBuilder)charSequence).append(", ");
            }
            if (this.h != -1) {
                ((StringBuilder)charSequence).append("min-fresh=");
                ((StringBuilder)charSequence).append(this.h);
                ((StringBuilder)charSequence).append(", ");
            }
            if (this.i) {
                ((StringBuilder)charSequence).append("only-if-cached, ");
            }
            if (this.l) {
                ((StringBuilder)charSequence).append("no-transform, ");
            }
            if (this.m) {
                ((StringBuilder)charSequence).append("immutable, ");
            }
            if (charSequence.length() == 0) {
                return "";
            }
            ((StringBuilder)charSequence).delete(((StringBuilder)charSequence).length() - 2, ((StringBuilder)charSequence).length());
            charSequence = ((StringBuilder)charSequence).toString();
            this.n = charSequence;
        }
        return charSequence;
    }
}

