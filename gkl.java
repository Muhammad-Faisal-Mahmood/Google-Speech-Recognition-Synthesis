/*
 * Decompiled with CFR 0.152.
 */
public final class gkl {
    public final boolean a;
    public final jnu b;
    private final gkk c;
    private final gkh d;

    public gkl() {
        throw null;
    }

    public gkl(gkk gkk2, gkh gkh2, jnu jnu2) {
        this.a = true;
        this.c = gkk2;
        this.d = gkh2;
        this.b = jnu2;
    }

    public final gkh a() {
        fxf.B(this.a, "Synclet binding must be enabled to have a SyncConfig");
        gkh gkh2 = this.d;
        fxf.K(gkh2);
        return gkh2;
    }

    public final gkk b() {
        fxf.B(this.a, "Synclet binding must be enabled to have a SyncKey");
        gkk gkk2 = this.c;
        fxf.K(gkk2);
        return gkk2;
    }

    public final boolean equals(Object object) {
        block4: {
            block6: {
                Object object2;
                block5: {
                    if (object == this) {
                        return true;
                    }
                    if (!(object instanceof gkl)) break block4;
                    object = (gkl)object;
                    if (this.a != ((gkl)object).a || !((object2 = this.c) == null ? ((gkl)object).c == null : ((gkk)object2).equals(((gkl)object).c)) || !((object2 = this.d) == null ? ((gkl)object).d == null : object2.equals(((gkl)object).d))) break block4;
                    object2 = this.b;
                    object = ((gkl)object).b;
                    if (object2 != null) break block5;
                    if (object != null) break block4;
                    break block6;
                }
                if (!object2.equals(object)) break block4;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Object object = this.c;
        int n2 = 0;
        int n3 = object == null ? 0 : ((gkk)object).hashCode();
        int n4 = true != this.a ? 1237 : 1231;
        object = this.d;
        int n5 = object == null ? 0 : object.hashCode();
        object = this.b;
        if (object != null) {
            n2 = object.hashCode();
        }
        return ((n3 ^ (n4 ^ 0xF4243) * 1000003) * 1000003 ^ n5) * 1000003 ^ n2;
    }

    public final String toString() {
        Object object = this.b;
        Object object2 = this.d;
        String string = String.valueOf(this.c);
        object2 = String.valueOf(object2);
        object = String.valueOf(object);
        StringBuilder stringBuilder = new StringBuilder("SyncletBinding{enabled=");
        stringBuilder.append(this.a);
        stringBuilder.append(", syncKey=");
        stringBuilder.append(string);
        stringBuilder.append(", syncConfig=");
        stringBuilder.append((String)object2);
        stringBuilder.append(", syncletProvider=");
        stringBuilder.append((String)object);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

