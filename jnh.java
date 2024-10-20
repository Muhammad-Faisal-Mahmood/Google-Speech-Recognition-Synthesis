/*
 * Decompiled with CFR 0.152.
 */
public class jnh
extends jng {
    final jni a;

    protected jnh(jni jni2) {
        this.a = jni2;
    }

    @Override
    public void f(iui object, iwf iwf2) {
        jni jni2 = this.a;
        if (jni2.b != iui.e) {
            jni2.b = object;
            jni2.c = iwf2;
            object = jni2.d;
            if (!((jnk)object).g) {
                ((jnk)object).h();
            }
        }
    }

    @Override
    protected final ivz g() {
        return this.a.d.f;
    }
}

