/*
 * Decompiled with CFR 0.152.
 */
public final class jlh {
    public String[] a;
    public String[] b;
    public boolean c;

    public jlh() {
    }

    public jlh(jli jli2) {
        boolean bl2 = jli2.b;
        this.a = jli2.c;
        this.b = jli2.d;
        this.c = jli2.e;
    }

    public final void a(jlg ... jlgArray) {
        String[] stringArray = new String[jlgArray.length];
        for (int i2 = 0; i2 < jlgArray.length; ++i2) {
            stringArray[i2] = jlgArray[i2].bb;
        }
        this.a = stringArray;
    }

    public final void b() {
        this.c = true;
    }

    public final void c(jlr ... jlrArray) {
        String[] stringArray = new String[jlrArray.length];
        for (int i2 = 0; i2 < jlrArray.length; ++i2) {
            stringArray[i2] = jlrArray[i2].f;
        }
        this.b = stringArray;
    }
}

