/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;

final class duk {
    public final Context a;
    public final gui b;

    public duk() {
        throw null;
    }

    public duk(Context context, gui gui2) {
        this.a = context;
        this.b = gui2;
    }

    public final boolean equals(Object object) {
        block4: {
            block6: {
                Object object2;
                block5: {
                    if (object == this) {
                        return true;
                    }
                    if (!(object instanceof duk)) break block4;
                    object2 = (duk)object;
                    if (!this.a.equals(((duk)object2).a)) break block4;
                    object = this.b;
                    object2 = ((duk)object2).b;
                    if (object != null) break block5;
                    if (object2 != null) break block4;
                    break block6;
                }
                if (!object.equals(object2)) break block4;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int n2 = this.a.hashCode();
        gui gui2 = this.b;
        int n3 = gui2 == null ? 0 : gui2.hashCode();
        return (n2 ^ 0xF4243) * 1000003 ^ n3;
    }

    public final String toString() {
        Object object = this.b;
        String string = this.a.toString();
        object = String.valueOf(object);
        StringBuilder stringBuilder = new StringBuilder("FlagsContext{context=");
        stringBuilder.append(string);
        stringBuilder.append(", hermeticFileOverrides=");
        stringBuilder.append((String)object);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

