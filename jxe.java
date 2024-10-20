/*
 * Decompiled with CFR 0.152.
 */
public final class jxe
extends kbq
implements Runnable {
    public final long b;

    public jxe(long l2, jqb jqb2) {
        super(jqb2.d(), jqb2);
        this.b = l2;
    }

    @Override
    public final String b() {
        String string = super.b();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append("(timeMillis=");
        stringBuilder.append(this.b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    @Override
    public final void run() {
        Object object;
        block3: {
            long l2;
            block2: {
                object = jvf.e(this.a);
                object = object instanceof jvk ? (jvk)object : null;
                l2 = this.b;
                if (object == null) break block2;
                long l3 = jtw.a;
                jsl.l(l2, jty.c);
                String string = object.a();
                object = string;
                if (string != null) break block3;
            }
            object = new StringBuilder("Timed out waiting for ");
            ((StringBuilder)object).append(l2);
            ((StringBuilder)object).append(" ms");
            object = ((StringBuilder)object).toString();
        }
        this.L(new jxd((String)object, this));
    }
}

