/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Map;

public final class btp {
    public static final hei a = hei.m("com/google/android/apps/speech/tts/googletts/local/voicepack/VoiceGenerator");
    public final Map b = new HashMap();
    public final Object c;
    private final Map d = new HashMap();

    public btp() {
        this.c = new Object();
    }

    public static bso a(String object, String object2, bub bub2, bub bub3, buc buc2, String string, boolean bl2, boolean bl3, String string2) {
        int n2 = bub2.c;
        float f2 = (n2 & 0x200) != 0 ? bub2.l : 0.0f;
        float f3 = (n2 & 0x400) != 0 ? bub2.m : Float.POSITIVE_INFINITY;
        bsn bsn2 = new bsn();
        bsn2.b = object;
        object = bub3.f;
        if (object != null) {
            bsn2.c = object;
            bsn2.d = bub3.o;
            bsn2.b(bl3);
            int n3 = a.v(bub3.h);
            boolean bl4 = true;
            n2 = n3;
            if (n3 == 0) {
                n2 = 1;
            }
            bsn2.t = n2;
            bsn2.e = object2;
            object = gzx.o(buc2.d);
            if (object != null) {
                bsn2.g = object;
                n2 = bub3.g;
                object = object2 = bty.b(n2);
                if (object2 == null) {
                    object = bty.a;
                }
                bl3 = bl4;
                if (object != bty.b) {
                    object = object2 = bty.b(n2);
                    if (object2 == null) {
                        object = bty.a;
                    }
                    bl3 = bl4;
                    if (object != bty.d) {
                        object = object2 = bty.b(n2);
                        if (object2 == null) {
                            object = bty.a;
                        }
                        bl3 = object == bty.e ? bl4 : false;
                    }
                }
                bsn2.h = bl3;
                n3 = bsn2.s;
                bsn2.s = (byte)(n3 | 2);
                bsn2.i = buc2.e;
                bsn2.s = (byte)(n3 | 6);
                if (bl2) {
                    object = object2 = bua.b(bub2.d);
                    if (object2 == null) {
                        object = bua.a;
                    }
                } else {
                    object = bua.b;
                }
                if (object != null) {
                    bsn2.j = object;
                    object = object2 = btz.b(bub2.e);
                    if (object2 == null) {
                        object = btz.b;
                    }
                    if (object != null) {
                        bsn2.k = object;
                        object = object2 = bty.b(n2);
                        if (object2 == null) {
                            object = bty.a;
                        }
                        if (object != null) {
                            bsn2.l = object;
                            if (buc2 != null) {
                                bsn2.m = buc2;
                                bsn2.n = string;
                                bsn2.o = f2;
                                bsn2.p = f3;
                                bsn2.q = bl2;
                                bsn2.s = (byte)(n3 | 0x3E);
                                bsn2.a = string2;
                                object = gzx.o(new hxd(bub2.j, bub.a));
                                if (object != null) {
                                    bsn2.r = object;
                                    if (!bl2) {
                                        object = bub3.i.isEmpty() ? null : bub3.i;
                                        bsn2.f = object;
                                    }
                                    return bsn2.a();
                                }
                                throw new NullPointerException("Null features");
                            }
                            throw new NullPointerException("Null metadata");
                        }
                        throw new NullPointerException("Null usage");
                    }
                    throw new NullPointerException("Null voicePlatform");
                }
                throw new NullPointerException("Null voiceType");
            }
            throw new NullPointerException("Null locales");
        }
        throw new NullPointerException("Null externalName");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b() {
        ((heg)((heg)a.f()).j("com/google/android/apps/speech/tts/googletts/local/voicepack/VoiceGenerator", "clearCache", 60, "VoiceGenerator.java")).r("Cache cleared");
        Object object = this.c;
        synchronized (object) {
            this.b.clear();
            this.d.clear();
            return;
        }
    }

    public final int c(int n2) {
        if (--n2 != 1) {
            if (n2 != 6) {
                if (n2 != 3) {
                    if (n2 != 4) {
                        return 400;
                    }
                    return 200;
                }
                return 300;
            }
            return 100;
        }
        return 500;
    }
}

