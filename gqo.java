/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.SparseArray
 */
import android.util.SparseArray;
import java.util.UUID;

public final class gqo {
    public final String a;
    public final UUID b;
    public final gqm c;
    public final SparseArray d;
    public final int e;

    public gqo() {
        throw null;
    }

    public gqo(String string, UUID uUID, gqm gqm2, SparseArray sparseArray, int n2) {
        this.a = string;
        this.b = uUID;
        this.c = gqm2;
        this.d = sparseArray;
        this.e = n2;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof gqo) {
            object = (gqo)object;
            if (this.a.equals(((gqo)object).a) && this.b.equals(((gqo)object).b) && this.c.equals(((gqo)object).c) && this.d.equals(((gqo)object).d) && this.e == ((gqo)object).e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n2;
        int n3 = this.a.hashCode();
        int n4 = this.b.hashCode();
        gqm gqm2 = this.c;
        if (gqm2.B()) {
            n2 = gqm2.i();
        } else {
            int n5;
            n2 = n5 = gqm2.memoizedHashCode;
            if (n5 == 0) {
                gqm2.memoizedHashCode = n2 = gqm2.i();
            }
        }
        return ((((n3 ^ 0xF4243) * 1000003 ^ n4) * 1000003 ^ n2) * 1000003 ^ this.d.hashCode()) * 1000003 ^ this.e;
    }

    public final String toString() {
        Object object = this.d;
        Object object2 = this.c;
        String string = String.valueOf(this.b);
        object2 = String.valueOf(object2);
        object = String.valueOf(object);
        StringBuilder stringBuilder = new StringBuilder("TraceSnapshot{name=");
        stringBuilder.append(this.a);
        stringBuilder.append(", rootTraceId=");
        stringBuilder.append(string);
        stringBuilder.append(", record=");
        stringBuilder.append((String)object2);
        stringBuilder.append(", spanExtrasSparseArray=");
        stringBuilder.append((String)object);
        stringBuilder.append(", numUnfinishedSpans=");
        stringBuilder.append(this.e);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

