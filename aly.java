/*
 * Decompiled with CFR 0.152.
 */
public final class aly
extends Exception {
    public final String a;
    public final boolean b;
    public final alx c;
    public final String d;

    public aly(adu object, Throwable throwable, boolean bl2, int n2) {
        CharSequence charSequence = object.toString();
        CharSequence charSequence2 = new StringBuilder("Decoder init failed: [");
        charSequence2.append(n2);
        charSequence2.append("], ");
        charSequence2.append((String)charSequence);
        charSequence2 = charSequence2.toString();
        object = ((adu)object).o;
        n2 = Math.abs(n2);
        charSequence = new StringBuilder("androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_neg_");
        ((StringBuilder)charSequence).append(n2);
        this((String)charSequence2, throwable, (String)object, false, null, ((StringBuilder)charSequence).toString());
    }

    public aly(String string, Throwable throwable, String string2, boolean bl2, alx alx2, String string3) {
        super(string, throwable);
        this.a = string2;
        this.b = false;
        this.c = alx2;
        this.d = string3;
    }
}

