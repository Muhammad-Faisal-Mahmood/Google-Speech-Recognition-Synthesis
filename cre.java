/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import java.io.Serializable;

public final class cre {
    public final Context a;
    public final gto b;
    private final gto c;
    private final gto d;

    public cre() {
        throw null;
    }

    public cre(Context context, gto gto2, gto gto3, gto gto4) {
        this.a = context;
        this.c = gto2;
        this.d = gto3;
        this.b = gto4;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof cre) {
            object = (cre)object;
            if (this.a.equals(((cre)object).a) && this.c.equals(((cre)object).c) && this.d.equals(((cre)object).d) && this.b.equals(((cre)object).b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 0xF4243) * 1000003 ^ 0x79A31AAC) * 1000003 ^ this.d.hashCode()) * 1000003 ^ 0x4D5) * 1000003 ^ 0x79A31AAC;
    }

    public final String toString() {
        Serializable serializable = this.b;
        Object object = this.d;
        Object object2 = this.c;
        String string = String.valueOf(this.a);
        object2 = String.valueOf(object2);
        object = String.valueOf(object);
        String string2 = String.valueOf(serializable);
        serializable = new StringBuilder("CollectionBasisContext{context=");
        ((StringBuilder)serializable).append(string);
        ((StringBuilder)serializable).append(", accountNames=");
        ((StringBuilder)serializable).append((String)object2);
        ((StringBuilder)serializable).append(", stacktrace=");
        ((StringBuilder)serializable).append((String)object);
        ((StringBuilder)serializable).append(", googlerOverridesCheckbox=false, executor=");
        ((StringBuilder)serializable).append(string2);
        ((StringBuilder)serializable).append("}");
        return ((StringBuilder)serializable).toString();
    }
}

