/*
 * Decompiled with CFR 0.152.
 */
public final class dia {
    public final diu a;
    public final dil b;
    public final hpr c;
    public final dgv d;
    public final bzq e;

    public dia() {
        throw null;
    }

    public dia(diu diu2, dil dil2, hpr hpr2, dgv dgv2, bzq bzq2) {
        this.a = diu2;
        this.b = dil2;
        this.c = hpr2;
        this.d = dgv2;
        this.e = bzq2;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof dia) {
            dia dia2 = (dia)object;
            if (this.a.equals(dia2.a) && ((object = this.b) == null ? dia2.b == null : object.equals(dia2.b)) && this.c.equals(dia2.c) && this.d.equals(dia2.d) && this.e.equals(dia2.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n2 = this.a.hashCode();
        dil dil2 = this.b;
        int n3 = dil2 == null ? 0 : dil2.hashCode();
        return ((((n2 ^ 0xF4243) * 1000003 ^ n3) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d.hashCode()) * 1000003 ^ this.e.hashCode();
    }

    public final String toString() {
        Object object = this.e;
        Object object2 = this.d;
        Object object3 = this.c;
        Object object4 = this.b;
        String string = String.valueOf(this.a);
        object4 = String.valueOf(object4);
        object3 = String.valueOf(object3);
        object2 = String.valueOf(object2);
        object = String.valueOf(object);
        StringBuilder stringBuilder = new StringBuilder("DownloadJobConfig{scheduler=");
        stringBuilder.append(string);
        stringBuilder.append(", retryParameters=");
        stringBuilder.append((String)object4);
        stringBuilder.append(", controlExecutor=");
        stringBuilder.append((String)object3);
        stringBuilder.append(", downloadFetcher=");
        stringBuilder.append((String)object2);
        stringBuilder.append(", downloadQueue=");
        stringBuilder.append((String)object);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

