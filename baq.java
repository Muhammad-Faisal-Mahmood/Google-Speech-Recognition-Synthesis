/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.NetworkRequest
 */
import android.net.NetworkRequest;
import java.util.Set;

public final class baq {
    public static final baq a = new baq(bbj.a);
    public final bbj b;
    public final bid c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final long h;
    public final long i;
    public final Set j;

    public baq(baq baq2) {
        jse.e(baq2, "other");
        this.d = baq2.d;
        this.e = baq2.e;
        this.c = baq2.c;
        this.b = baq2.b;
        this.f = baq2.f;
        this.g = baq2.g;
        this.j = baq2.j;
        this.h = baq2.h;
        this.i = baq2.i;
    }

    public baq(bbj bbj2) {
        jse.e((Object)bbj2, "requiredNetworkType");
        jse.e((Object)bbj2, "requiredNetworkType");
        jpc jpc2 = jpc.a;
        jse.e((Object)bbj2, "requiredNetworkType");
        this.c = new bid(null);
        this.b = bbj2;
        this.d = false;
        this.e = false;
        this.f = false;
        this.g = false;
        this.h = -1L;
        this.i = -1L;
        this.j = jpc2;
    }

    public baq(bid bid2, bbj bbj2, boolean bl2, boolean bl3, boolean bl4, boolean bl5, long l2, long l3, Set set) {
        jse.e(bid2, "requiredNetworkRequestCompat");
        jse.e((Object)bbj2, "requiredNetworkType");
        jse.e(set, "contentUriTriggers");
        this.c = bid2;
        this.b = bbj2;
        this.d = bl2;
        this.e = bl3;
        this.f = bl4;
        this.g = bl5;
        this.h = l2;
        this.i = l3;
        this.j = set;
    }

    public final NetworkRequest a() {
        return (NetworkRequest)this.c.b;
    }

    public final boolean b() {
        return !this.j.isEmpty();
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && jse.i(this.getClass(), object.getClass())) {
            object = (baq)object;
            if (this.d != ((baq)object).d) {
                return false;
            }
            if (this.e != ((baq)object).e) {
                return false;
            }
            if (this.f != ((baq)object).f) {
                return false;
            }
            if (this.g != ((baq)object).g) {
                return false;
            }
            if (this.h != ((baq)object).h) {
                return false;
            }
            if (this.i != ((baq)object).i) {
                return false;
            }
            if (!jse.i(this.a(), ((baq)object).a())) {
                return false;
            }
            if (this.b != ((baq)object).b) {
                return false;
            }
            return jse.i(this.j, ((baq)object).j);
        }
        return false;
    }

    public final int hashCode() {
        int n2 = this.b.hashCode();
        long l2 = this.i;
        Set set = this.j;
        long l3 = this.h;
        int n3 = this.d;
        int n4 = this.e;
        int n5 = this.f;
        int n6 = this.g;
        int n7 = (int)(l3 ^ l3 >>> 32);
        int n8 = (int)(l2 ^ l2 >>> 32);
        int n9 = ((Object)set).hashCode();
        set = this.a();
        int n10 = set != null ? ((Object)set).hashCode() : 0;
        return (((((((n2 * 31 + n3) * 31 + n4) * 31 + n5) * 31 + n6) * 31 + n7) * 31 + n8) * 31 + n9) * 31 + n10;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Constraints{requiredNetworkType=");
        stringBuilder.append((Object)this.b);
        stringBuilder.append(", requiresCharging=");
        stringBuilder.append(this.d);
        stringBuilder.append(", requiresDeviceIdle=");
        stringBuilder.append(this.e);
        stringBuilder.append(", requiresBatteryNotLow=");
        stringBuilder.append(this.f);
        stringBuilder.append(", requiresStorageNotLow=");
        stringBuilder.append(this.g);
        stringBuilder.append(", contentTriggerUpdateDelayMillis=");
        stringBuilder.append(this.h);
        stringBuilder.append(", contentTriggerMaxDelayMillis=");
        stringBuilder.append(this.i);
        stringBuilder.append(", contentUriTriggers=");
        stringBuilder.append(this.j);
        stringBuilder.append(", }");
        return stringBuilder.toString();
    }
}

