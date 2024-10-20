/*
 * Decompiled with CFR 0.152.
 */
public final class byq {
    public final ezj a;
    public final gto b;
    public final boolean c;
    public final String d;
    public final int e;
    private final gto f;

    public byq() {
        throw null;
    }

    public byq(ezj ezj2, gto gto2, int n2, gto gto3, boolean bl2, String string) {
        if (ezj2 != null) {
            this.a = ezj2;
            this.f = gto2;
            this.e = n2;
            this.b = gto3;
            this.c = bl2;
            if (string != null) {
                this.d = string;
                return;
            }
            throw new NullPointerException("Null languageName");
        }
        throw new NullPointerException("Null descriptor");
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof byq) {
            object = (byq)object;
            if (((Object)this.a).equals(((byq)object).a) && this.f.equals(((byq)object).f) && this.e == ((byq)object).e && this.b.equals(((byq)object).b) && this.c == ((byq)object).c && this.d.equals(((byq)object).d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n2 = ((Object)this.a).hashCode();
        int n3 = this.f.hashCode();
        int n4 = this.e;
        a.E(n4);
        int n5 = this.b.hashCode();
        int n6 = true != this.c ? 1237 : 1231;
        return (((((n2 ^ 0xF4243) * 1000003 ^ n3) * 1000003 ^ n4) * 1000003 ^ n5) * 1000003 ^ n6) * 1000003 ^ this.d.hashCode();
    }

    public final String toString() {
        int n2 = this.e;
        Object object = this.f;
        String string = ((Object)this.a).toString();
        String string2 = object.toString();
        object = n2 != 1 ? (n2 != 2 ? "DOWNLOAD_REQUESTED" : "DOWNLOAD_AVAILABLE") : "ALREADY_UP_TO_DATE";
        Object object2 = this.b;
        boolean bl2 = this.c;
        String string3 = this.d;
        object2 = String.valueOf(object2);
        StringBuilder stringBuilder = new StringBuilder("LanguagePackSettingsItem{descriptor=");
        stringBuilder.append(string);
        stringBuilder.append(", installedData=");
        stringBuilder.append(string2);
        stringBuilder.append(", promotionState=");
        stringBuilder.append((String)object);
        stringBuilder.append(", newUpdateDescriptor=");
        stringBuilder.append((String)object2);
        stringBuilder.append(", isPackUninstallable=");
        stringBuilder.append(bl2);
        stringBuilder.append(", languageName=");
        stringBuilder.append(string3);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

