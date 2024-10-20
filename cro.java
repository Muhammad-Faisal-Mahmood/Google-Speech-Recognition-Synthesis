/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;

public final class cro {
    public final cre a;
    public final cri b;

    protected cro(Context object, cri object2) {
        fxf.K(object);
        Context context = object.getApplicationContext();
        crp crp2 = new crp();
        object = new crd(null);
        ((crd)object).a();
        if (context != null) {
            ((crd)object).a = context;
            ((crd)object).c = gto.i(crp2);
            ((crd)object).a();
            if (((crd)object).e == 1 && (crp2 = ((crd)object).a) != null) {
                this.a = new cre((Context)crp2, ((crd)object).b, ((crd)object).c, ((crd)object).d);
                this.b = object2;
                return;
            }
            object2 = new StringBuilder();
            if (((crd)object).a == null) {
                ((StringBuilder)object2).append(" context");
            }
            if (((crd)object).e == 0) {
                ((StringBuilder)object2).append(" googlerOverridesCheckbox");
            }
            throw new IllegalStateException("Missing required properties:".concat(object2.toString()));
        }
        throw new NullPointerException("Null context");
    }

    public static cro a(Context context, crc crc2) {
        return new cro(context, new cri(crc2));
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("CollectionBasisLogVerifier{collectionBasisContext=");
        stringBuilder.append(this.a);
        stringBuilder.append(", basis=");
        stringBuilder.append(this.b);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

