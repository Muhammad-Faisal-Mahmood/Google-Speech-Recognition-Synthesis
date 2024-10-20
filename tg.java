/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Insets
 *  android.graphics.Rect
 */
import android.graphics.Insets;
import android.graphics.Rect;

public final class tg {
    public static final tg a = new tg(0, 0, 0, 0);
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    private tg(int n2, int n3, int n4, int n5) {
        this.b = n2;
        this.c = n3;
        this.d = n4;
        this.e = n5;
    }

    public static tg b(tg tg2, tg tg3) {
        return tg.d(Math.max(tg2.b, tg3.b), Math.max(tg2.c, tg3.c), Math.max(tg2.d, tg3.d), Math.max(tg2.e, tg3.e));
    }

    public static tg c(Rect rect) {
        return tg.d(rect.left, rect.top, rect.right, rect.bottom);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static tg d(int n2, int n3, int n4, int n5) {
        int n6 = n2;
        int n7 = n3;
        int n8 = n4;
        if (n2 != 0) return new tg(n6, n7, n8, n5);
        n6 = n2 = 0;
        n7 = n3;
        n8 = n4;
        if (n3 != 0) return new tg(n6, n7, n8, n5);
        if (n4 == 0) {
            if (n5 == 0) return a;
            n7 = 0;
            n8 = 0;
            n6 = n2;
            return new tg(n6, n7, n8, n5);
        } else {
            n7 = 0;
            n8 = n4;
            n6 = n2;
        }
        return new tg(n6, n7, n8, n5);
    }

    public static tg e(Insets insets) {
        return tg.d(dp$$ExternalSyntheticApiModelOutline0.m$3(insets), dp$$ExternalSyntheticApiModelOutline0.m$1(insets), dp$$ExternalSyntheticApiModelOutline0.m(insets), dp$$ExternalSyntheticApiModelOutline0.m$2(insets));
    }

    public final Insets a() {
        return dp$$ExternalSyntheticApiModelOutline0.m(this.b, this.c, this.d, this.e);
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (tg)object;
            if (this.e != ((tg)object).e) {
                return false;
            }
            if (this.b != ((tg)object).b) {
                return false;
            }
            if (this.d != ((tg)object).d) {
                return false;
            }
            return this.c == ((tg)object).c;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b * 31 + this.c) * 31 + this.d) * 31 + this.e;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Insets{left=");
        stringBuilder.append(this.b);
        stringBuilder.append(", top=");
        stringBuilder.append(this.c);
        stringBuilder.append(", right=");
        stringBuilder.append(this.d);
        stringBuilder.append(", bottom=");
        stringBuilder.append(this.e);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

