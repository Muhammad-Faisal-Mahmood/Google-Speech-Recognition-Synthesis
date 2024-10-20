/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import java.io.Serializable;
import java.util.Arrays;

public final class bsw {
    public final buc a;
    public final long b;
    public final boolean c;
    public final boolean d;
    public final gzx e;
    private final String f;

    public bsw() {
        throw null;
    }

    public bsw(buc buc2, long l2, boolean bl2, boolean bl3, String string, gzx gzx2) {
        this.a = buc2;
        this.b = l2;
        this.c = bl2;
        this.d = bl3;
        this.f = string;
        if (gzx2 != null) {
            this.e = gzx2;
            return;
        }
        throw new NullPointerException("Null locales");
    }

    public final String a(bub object) {
        Object object2;
        char c2 = File.separatorChar;
        String string = ((bub)object).f;
        Object object3 = object2 = bua.b(((bub)object).d);
        if (object2 == null) {
            object3 = bua.a;
        }
        object = object2 = btz.b(((bub)object).e);
        if (object2 == null) {
            object = btz.b;
        }
        buc buc2 = this.a;
        object2 = this.f;
        object = btj.e(buc2, string, (bua)object3, (btz)object);
        object3 = new StringBuilder();
        ((StringBuilder)object3).append((String)object2);
        ((StringBuilder)object3).append(c2);
        ((StringBuilder)object3).append((String)object);
        return ((StringBuilder)object3).toString();
    }

    public final boolean equals(Object object) {
        if (!(object instanceof bsw)) {
            return false;
        }
        Object object2 = (bsw)object;
        if (a.k(this.e, ((bsw)object2).e) && this.b == ((bsw)object2).b) {
            object = this.a;
            object2 = ((bsw)object2).a;
            if (((buc)object).c.equals(((buc)object2).c) && ((buc)object).e == ((buc)object2).e && ((buc)object).d.equals(((buc)object2).d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        buc buc2 = this.a;
        int n2 = (buc2.b & 1) != 0 ? buc2.c.hashCode() : 0;
        return Arrays.hashCode(new Object[]{((n2 + 31) * 31 + buc2.e) * 31 + buc2.d.hashCode(), this.e, this.a.c, this.b});
    }

    public final String toString() {
        Serializable serializable = this.e;
        String string = ((Object)this.a).toString();
        String string2 = serializable.toString();
        serializable = new StringBuilder("InstalledVoicePackInfo{voiceMetadata=");
        ((StringBuilder)serializable).append(string);
        ((StringBuilder)serializable).append(", size=");
        ((StringBuilder)serializable).append(this.b);
        ((StringBuilder)serializable).append(", isRemovable=");
        ((StringBuilder)serializable).append(this.c);
        ((StringBuilder)serializable).append(", isGoogleOnly=");
        ((StringBuilder)serializable).append(this.d);
        ((StringBuilder)serializable).append(", absoluteVoicePackPath=");
        ((StringBuilder)serializable).append(this.f);
        ((StringBuilder)serializable).append(", locales=");
        ((StringBuilder)serializable).append(string2);
        ((StringBuilder)serializable).append("}");
        return ((StringBuilder)serializable).toString();
    }
}

