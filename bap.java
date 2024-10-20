/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
import android.net.Uri;

public final class bap {
    public final Uri a;
    public final boolean b;

    public bap(Uri uri, boolean bl2) {
        jse.e(uri, "uri");
        this.a = uri;
        this.b = bl2;
    }

    public final boolean equals(Object object) {
        Class<?> clazz;
        if (this == object) {
            return true;
        }
        Class<?> clazz2 = this.getClass();
        if (!jse.i(clazz2, clazz = object != null ? object.getClass() : null)) {
            return false;
        }
        jse.c(object, "null cannot be cast to non-null type androidx.work.Constraints.ContentUriTrigger");
        object = (bap)object;
        if (!jse.i(this.a, ((bap)object).a)) {
            return false;
        }
        return this.b == ((bap)object).b;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31 + a.f(this.b);
    }
}

