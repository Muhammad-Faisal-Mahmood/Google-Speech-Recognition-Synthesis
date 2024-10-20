/*
 * Decompiled with CFR 0.152.
 */
public final class jxc {
    public static final ThreadLocal a = new ThreadLocal();

    public static final jvt a() {
        jvt jvt2;
        ThreadLocal threadLocal = a;
        jvt jvt3 = jvt2 = (jvt)threadLocal.get();
        if (jvt2 == null) {
            jvt3 = new jui(Thread.currentThread());
            threadLocal.set(jvt3);
        }
        return jvt3;
    }
}

