/*
 * Decompiled with CFR 0.152.
 */
import androidx.wear.ambient.AmbientMode$AmbientCallback;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;

public final class gcl {
    public final Class a;
    public final baq b;
    public final gto c;
    public final gcj d;
    public final gto e;
    public final bas f;
    public final gto g;
    public final gto h;
    public final hav i;
    public final gto j;
    public final gto k;
    public final gto l;

    public gcl() {
        throw null;
    }

    public gcl(Class clazz, baq baq2, gto gto2, gcj gcj2, gto gto3, bas bas2, gto gto4, gto gto5, hav hav2, gto gto6, gto gto7, gto gto8) {
        this.a = clazz;
        this.b = baq2;
        this.c = gto2;
        this.d = gcj2;
        this.e = gto3;
        this.f = bas2;
        this.g = gto4;
        this.h = gto5;
        this.i = hav2;
        this.j = gto6;
        this.k = gto7;
        this.l = gto8;
    }

    public static gch a(Class clazz) {
        gch gch2 = new gch(null);
        gch2.a = clazz;
        gch2.b(baq.a);
        gch2.d = new gcj(0L, TimeUnit.SECONDS);
        gch2.d(hdc.a);
        gch2.f = AmbientMode$AmbientCallback.a(new LinkedHashMap());
        return gch2;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof gcl) {
            object = (gcl)object;
            if (this.a.equals(((gcl)object).a) && this.b.equals(((gcl)object).b) && this.c.equals(((gcl)object).c) && ((Object)this.d).equals(((gcl)object).d) && this.e.equals(((gcl)object).e) && this.f.equals(((gcl)object).f) && this.g.equals(((gcl)object).g) && this.h.equals(((gcl)object).h) && this.i.equals(((gcl)object).i) && this.j.equals(((gcl)object).j) && this.k.equals(((gcl)object).k) && this.l.equals(((gcl)object).l)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode()) * 1000003 ^ 0x79A31AAC) * 1000003 ^ ((Object)this.d).hashCode()) * 1000003 ^ this.e.hashCode()) * 1000003 ^ this.f.hashCode()) * 1000003 ^ this.g.hashCode()) * 1000003 ^ this.h.hashCode()) * 1000003 ^ this.i.hashCode()) * 1000003 ^ 0x79A31AAC) * 1000003 ^ 0x79A31AAC) * 1000003 ^ this.l.hashCode();
    }

    public final String toString() {
        Serializable serializable = this.l;
        Object object = this.k;
        Object object2 = this.j;
        Object object3 = this.i;
        Object object4 = this.h;
        Object object5 = this.g;
        Object object6 = this.f;
        Object object7 = this.e;
        Object object8 = this.d;
        Object object9 = this.c;
        Object object10 = this.b;
        String string = String.valueOf(this.a);
        object10 = String.valueOf(object10);
        object9 = String.valueOf(object9);
        object8 = String.valueOf(object8);
        object7 = String.valueOf(object7);
        object6 = String.valueOf(object6);
        object5 = String.valueOf(object5);
        object4 = String.valueOf(object4);
        object3 = String.valueOf(object3);
        object2 = String.valueOf(object2);
        object = String.valueOf(object);
        String string2 = String.valueOf(serializable);
        serializable = new StringBuilder("TikTokWorkSpec{workerClass=");
        ((StringBuilder)serializable).append(string);
        ((StringBuilder)serializable).append(", constraints=");
        ((StringBuilder)serializable).append((String)object10);
        ((StringBuilder)serializable).append(", expedited=");
        ((StringBuilder)serializable).append((String)object9);
        ((StringBuilder)serializable).append(", initialDelay=");
        ((StringBuilder)serializable).append((String)object8);
        ((StringBuilder)serializable).append(", nextScheduleTimeOverride=");
        ((StringBuilder)serializable).append((String)object7);
        ((StringBuilder)serializable).append(", inputData=");
        ((StringBuilder)serializable).append((String)object6);
        ((StringBuilder)serializable).append(", periodic=");
        ((StringBuilder)serializable).append((String)object5);
        ((StringBuilder)serializable).append(", unique=");
        ((StringBuilder)serializable).append((String)object4);
        ((StringBuilder)serializable).append(", tags=");
        ((StringBuilder)serializable).append((String)object3);
        ((StringBuilder)serializable).append(", backoffPolicy=");
        ((StringBuilder)serializable).append((String)object2);
        ((StringBuilder)serializable).append(", backoffDelayDuration=");
        ((StringBuilder)serializable).append((String)object);
        ((StringBuilder)serializable).append(", targetProcess=");
        ((StringBuilder)serializable).append(string2);
        ((StringBuilder)serializable).append("}");
        return ((StringBuilder)serializable).toString();
    }
}

