/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewGroup
 */
import android.view.View;
import android.view.ViewGroup;

public final class jqr
extends jqq
implements jsb,
jro {
    int a;
    final View b;
    private Object c;

    public jqr(View view, jqb jqb2) {
        this.b = view;
        super(jqb2);
    }

    @Override
    public final Object a(Object object) {
        jqh jqh2;
        block8: {
            block6: {
                Object object2;
                block7: {
                    block4: {
                        block5: {
                            jqh2 = jqh.a;
                            int n2 = this.a;
                            if (n2 == 0) break block4;
                            if (n2 == 1) break block5;
                            jns.ak(object);
                            break block6;
                        }
                        object2 = (jtn)this.c;
                        jns.ak(object);
                        object = object2;
                        break block7;
                    }
                    jns.ak(object);
                    object = (jtn)this.c;
                    object2 = this.b;
                    this.c = object;
                    this.a = 1;
                    if (((jtn)object).a(object2, this) == jqh2) break block8;
                }
                object2 = this.b;
                if (!(object2 instanceof ViewGroup)) break block6;
                object2 = new wn((ViewGroup)object2, 0);
                this.c = null;
                this.a = 2;
                object = object2 = ((jtn)object).b(object2.a(), this);
                if (object2 != jqh.a) {
                    object = jon.a;
                }
                if (object == jqh2) break block8;
            }
            return jon.a;
        }
        return jqh2;
    }

    @Override
    public final jqb c(Object object, jqb jqb2) {
        jqb2 = new jqr(this.b, jqb2);
        ((jqr)jqb2).c = object;
        return jqb2;
    }

    @Override
    public final int i() {
        return 2;
    }

    @Override
    public final String toString() {
        String string;
        if (this.k == null) {
            string = jsd.a(this);
            jse.d(string, "renderLambdaToString(...)");
        } else {
            string = super.toString();
        }
        return string;
    }
}

