/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;

public final class cat {
    public static final cat a;
    public static final cat b;
    public static final cat c;
    public final hav d;

    static {
        EnumSet<cau> enumSet = EnumSet.allOf(cau.class);
        if (enumSet instanceof Collection) {
            enumSet = enumSet.isEmpty() ? hdc.a : gzr.a(EnumSet.copyOf(enumSet));
        } else if ((enumSet = enumSet.iterator()).hasNext()) {
            EnumSet<Enum> enumSet2 = EnumSet.of((Enum)enumSet.next());
            fvd.J(enumSet2, (Iterator)((Object)enumSet));
            enumSet = gzr.a(enumSet2);
        } else {
            enumSet = hdc.a;
        }
        a = new cat((hav)((Object)enumSet));
        b = new cat(hdc.a);
        c = new cat(gzr.a(EnumSet.of(cau.a, new cau[0])));
    }

    public cat(hav hav2) {
        this.d = hav2;
    }

    public final boolean a(cau cau2) {
        return this.d.contains((Object)cau2);
    }

    public final boolean equals(Object object) {
        return object instanceof cat && this.d.equals(((cat)object).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}

