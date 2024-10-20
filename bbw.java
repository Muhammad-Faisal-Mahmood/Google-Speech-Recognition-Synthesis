/*
 * Decompiled with CFR 0.152.
 */
import androidx.wear.ambient.AmbientModeSupport$AmbientCallback;
import java.util.Set;
import java.util.UUID;

public final class bbw {
    public final UUID a;
    public final bbv b;
    public final Set c;
    public final baq d;
    private final bas e;
    private final bas f;
    private final int g;
    private final int h;
    private final long i;
    private final bbu j;
    private final long k;
    private final int l;

    public bbw(UUID uUID, bbv bbv2, Set set, bas bas2, bas bas3, int n2, int n3, baq baq2, long l2, bbu bbu2, long l3, int n4) {
        jse.e(uUID, "id");
        jse.e((Object)bbv2, "state");
        jse.e(bas2, "outputData");
        jse.e(bas3, "progress");
        this.a = uUID;
        this.b = bbv2;
        this.c = set;
        this.e = bas2;
        this.f = bas3;
        this.g = n2;
        this.h = n3;
        this.d = baq2;
        this.i = l2;
        this.j = bbu2;
        this.k = l3;
        this.l = n4;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && jse.i(this.getClass(), object.getClass())) {
            object = (bbw)object;
            if (this.g != ((bbw)object).g) {
                return false;
            }
            if (this.h != ((bbw)object).h) {
                return false;
            }
            if (!jse.i(this.a, ((bbw)object).a)) {
                return false;
            }
            if (this.b != ((bbw)object).b) {
                return false;
            }
            if (!jse.i(this.e, ((bbw)object).e)) {
                return false;
            }
            if (!jse.i(this.d, ((bbw)object).d)) {
                return false;
            }
            if (this.i != ((bbw)object).i) {
                return false;
            }
            if (!jse.i(this.j, ((bbw)object).j)) {
                return false;
            }
            if (this.k != ((bbw)object).k) {
                return false;
            }
            if (this.l != ((bbw)object).l) {
                return false;
            }
            if (!jse.i(this.c, ((bbw)object).c)) {
                return false;
            }
            return jse.i(this.f, ((bbw)object).f);
        }
        return false;
    }

    public final int hashCode() {
        int n2 = this.a.hashCode();
        int n3 = this.b.hashCode();
        int n4 = this.e.hashCode();
        int n5 = ((Object)this.c).hashCode();
        int n6 = this.f.hashCode();
        Object object = this.d;
        int n7 = this.g;
        int n8 = this.h;
        int n9 = ((baq)object).hashCode();
        object = this.j;
        int n10 = object != null ? object.hashCode() : 0;
        return ((((((((((n2 * 31 + n3) * 31 + n4) * 31 + n5) * 31 + n6) * 31 + n7) * 31 + n8) * 31 + n9) * 31 + AmbientModeSupport$AmbientCallback.b(this.i)) * 31 + n10) * 31 + AmbientModeSupport$AmbientCallback.b(this.k)) * 31 + this.l;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("WorkInfo{id='");
        stringBuilder.append(this.a);
        stringBuilder.append("', state=");
        stringBuilder.append((Object)this.b);
        stringBuilder.append(", outputData=");
        stringBuilder.append(this.e);
        stringBuilder.append(", tags=");
        stringBuilder.append(this.c);
        stringBuilder.append(", progress=");
        stringBuilder.append(this.f);
        stringBuilder.append(", runAttemptCount=");
        stringBuilder.append(this.g);
        stringBuilder.append(", generation=");
        stringBuilder.append(this.h);
        stringBuilder.append(", constraints=");
        stringBuilder.append(this.d);
        stringBuilder.append(", initialDelayMillis=");
        stringBuilder.append(this.i);
        stringBuilder.append(", periodicityInfo=");
        stringBuilder.append(this.j);
        stringBuilder.append(", nextScheduleTimeMillis=");
        stringBuilder.append(this.k);
        stringBuilder.append("}, stopReason=");
        stringBuilder.append(this.l);
        return stringBuilder.toString();
    }
}

