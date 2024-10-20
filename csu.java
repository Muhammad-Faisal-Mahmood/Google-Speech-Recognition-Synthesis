/*
 * Decompiled with CFR 0.152.
 */
public final class csu {
    public final String a;
    public final gto b;
    public final gto c;
    public final gto d;
    public final gto e;
    public final gto f;
    public final gto g;
    public final int h;
    public final boolean i;
    public final int j;
    private final gto k;

    public csu() {
        throw null;
    }

    public csu(String string, gto gto2, gto gto3, gto gto4, gto gto5, gto gto6, gto gto7, gto gto8, int n2, int n3, boolean bl2) {
        this.a = string;
        this.b = gto2;
        this.c = gto3;
        this.d = gto4;
        this.e = gto5;
        this.k = gto6;
        this.f = gto7;
        this.g = gto8;
        this.h = n2;
        this.j = n3;
        this.i = bl2;
    }

    public static cst a() {
        cst cst2 = new cst(null);
        cst2.c(0);
        cst2.g = 2;
        byte by2 = cst2.f;
        cst2.e = true;
        cst2.f = (byte)(by2 | 6);
        return cst2;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof csu) {
            object = (csu)object;
            if (this.a.equals(((csu)object).a) && this.b.equals(((csu)object).b) && this.c.equals(((csu)object).c) && this.d.equals(((csu)object).d) && this.e.equals(((csu)object).e) && this.k.equals(((csu)object).k) && this.f.equals(((csu)object).f) && this.g.equals(((csu)object).g) && this.h == ((csu)object).h) {
                int n2 = this.j;
                int n3 = ((csu)object).j;
                if (n2 != 0) {
                    if (n2 == n3 && this.i == ((csu)object).i) {
                        return true;
                    }
                } else {
                    throw null;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int n2 = this.a.hashCode();
        int n3 = this.d.hashCode();
        int n4 = this.e.hashCode();
        int n5 = this.f.hashCode();
        int n6 = this.g.hashCode();
        int n7 = this.j;
        a.E(n7);
        int n8 = true != this.i ? 1237 : 1231;
        return (((((((((((n2 ^ 0xF4243) * 1000003 ^ 0x79A31AAC) * 1000003 ^ 0x79A31AAC) * 1000003 ^ n3) * 1000003 ^ n4) * 1000003 ^ 0x79A31AAC) * 1000003 ^ n5) * 1000003 ^ n6) * 1000003 ^ this.h) * 1000003 ^ n7) * 1000003 ^ 0x4D5) * 1000003 ^ n8;
    }

    public final String toString() {
        int n2 = this.j;
        Object object = this.g;
        Object object2 = this.f;
        Object object3 = this.k;
        Object object4 = this.e;
        Object object5 = this.d;
        Object object6 = this.c;
        String string = String.valueOf(this.b);
        object6 = String.valueOf(object6);
        object5 = String.valueOf(object5);
        object4 = String.valueOf(object4);
        object3 = String.valueOf(object3);
        object2 = String.valueOf(object2);
        String string2 = String.valueOf(object);
        object = n2 != 1 ? (n2 != 2 ? "null" : "ALL") : "NONE";
        n2 = this.h;
        String string3 = this.a;
        boolean bl2 = this.i;
        StringBuilder stringBuilder = new StringBuilder("DownloadFileGroupRequest{groupName=");
        stringBuilder.append(string3);
        stringBuilder.append(", accountOptional=");
        stringBuilder.append(string);
        stringBuilder.append(", variantIdOptional=");
        stringBuilder.append((String)object6);
        stringBuilder.append(", contentTitleOptional=");
        stringBuilder.append((String)object5);
        stringBuilder.append(", contentTextOptional=");
        stringBuilder.append((String)object4);
        stringBuilder.append(", contentIntentOptional=");
        stringBuilder.append((String)object3);
        stringBuilder.append(", downloadConditionsOptional=");
        stringBuilder.append((String)object2);
        stringBuilder.append(", listenerOptional=");
        stringBuilder.append(string2);
        stringBuilder.append(", groupSizeBytes=");
        stringBuilder.append(n2);
        stringBuilder.append(", showNotifications=");
        stringBuilder.append((String)object);
        stringBuilder.append(", preserveZipDirectories=false, verifyIsolatedStructure=");
        stringBuilder.append(bl2);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

