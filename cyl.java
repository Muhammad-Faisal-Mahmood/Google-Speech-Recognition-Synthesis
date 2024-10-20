/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.AudioAttributes
 *  android.media.AudioFormat
 *  android.media.AudioFormat$Builder
 *  android.media.Spatializer
 */
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.Spatializer;
import j$.util.Collection$_EL;
import java.util.Collection;
import java.util.zip.ZipEntry;

public final class cyl
implements gtq {
    public final Object a;
    private final int b;

    public /* synthetic */ cyl(Object object, int n2) {
        this.b = n2;
        this.a = object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final boolean a(Object object) {
        int n2 = this.b;
        if (n2 == 0) {
            return cyo.h((cth)object, (String)this.a);
        }
        int n3 = 4;
        boolean bl2 = false;
        if (n2 != 1) {
            ctq ctq2;
            if (n2 == 2) {
                return cyo.h(((cxr)object).b, (String)this.a);
            }
            if (n2 != 3) {
                hqa hqa2;
                if (n2 != 4) {
                    object = (ZipEntry)object;
                    return Collection$_EL.stream((Collection)this.a).anyMatch(new bod(object, 12));
                }
                object = (Exception)object;
                object = this.a;
                synchronized (object) {
                    hqa2 = ((dgu)object).f;
                }
                if (hqa2 != null) return false;
                return true;
            }
            ctl ctl2 = (ctl)object;
            n2 = cyx.d;
            ctl ctl3 = (ctl)this.a;
            ctq ctq3 = ctl3.c;
            object = ctq3;
            if (ctq3 == null) {
                object = ctq.a;
            }
            ctq3 = ctq2 = ctl2.c;
            if (ctq2 == null) {
                ctq3 = ctq.a;
            }
            if (!((hwv)object).equals(ctq3)) return false;
            if (ctl3.f != ctl2.f) return false;
            if (ctl3.d != ctl2.d) return false;
            return true;
        }
        Object object2 = this.a;
        Object object3 = ((aox)object2).b;
        object = (adu)object;
        synchronized (object3) {
            block40: {
                Object object4;
                block38: {
                    block39: {
                        if (!((aox)object2).d.p) return true;
                        if (((aox)object2).c) return true;
                        if (((adu)object).D <= 2) return true;
                        object4 = ((adu)object).o;
                        if (object4 == null) break block38;
                        n2 = ((String)object4).hashCode();
                        switch (n2) {
                            default: {
                                break;
                            }
                            case 1504578661: {
                                if (!((String)object4).equals("audio/eac3")) break;
                                n2 = 1;
                                break block39;
                            }
                            case 187078297: {
                                if (!((String)object4).equals("audio/ac4")) break;
                                n2 = 3;
                                break block39;
                            }
                            case 187078296: {
                                if (!((String)object4).equals("audio/ac3")) break;
                                n2 = 0;
                                break block39;
                            }
                            case -2123537834: {
                                if (!((String)object4).equals("audio/eac3-joc")) break;
                                n2 = 2;
                                break block39;
                            }
                        }
                        n2 = -1;
                    }
                    if (n2 != 0 && n2 != 1 && n2 != 2 && n2 != 3) break block38;
                    if (agf.a < 32) return true;
                    object4 = ((aox)object2).e;
                    if (object4 == null) return true;
                    if (!((aos)object4).b) break block40;
                }
                boolean bl3 = bl2;
                if (agf.a < 32) return bl3;
                object4 = ((aox)object2).e;
                bl3 = bl2;
                if (object4 == null) return bl3;
                bl3 = bl2;
                if (!((aos)object4).b) return bl3;
                bl3 = bl2;
                if (!xu$$ExternalSyntheticApiModelOutline6.m(((aos)object4).a)) return bl3;
                bl3 = bl2;
                if (!xu$$ExternalSyntheticApiModelOutline6.m$1(((aox)object2).e.a)) return bl3;
                Object object5 = ((aox)object2).e;
                object4 = ((aox)object2).f;
                int n4 = "audio/eac3-joc".equals(((adu)object).o) && ((adu)object).D == 16 ? 12 : ((adu)object).D;
                n2 = n3;
                switch (n4) {
                    default: {
                        n2 = 0;
                        break;
                    }
                    case 12: {
                        n2 = 743676;
                        break;
                    }
                    case 10: {
                        if (agf.a >= 32) {
                            n2 = 737532;
                            break;
                        }
                    }
                    case 8: {
                        n2 = 6396;
                        break;
                    }
                    case 7: {
                        n2 = 1276;
                        break;
                    }
                    case 6: {
                        n2 = 252;
                        break;
                    }
                    case 5: {
                        n2 = 220;
                        break;
                    }
                    case 4: {
                        n2 = 204;
                        break;
                    }
                    case 3: {
                        n2 = 28;
                        break;
                    }
                    case 2: {
                        n2 = 12;
                        break;
                    }
                    case 1: 
                }
                if (n2 == 0) {
                    return bl2;
                }
                object2 = new AudioFormat.Builder();
                object2 = object2.setEncoding(2).setChannelMask(n2);
                n2 = ((adu)object).E;
                if (n2 != -1) {
                    object2.setSampleRate(n2);
                }
                object = ((aos)object5).a;
                if (((adi)object4).b == null) {
                    ((adi)object4).b = object5 = new bzb(null, null, null);
                }
                object4 = ((adi)object4).b.a;
                object2 = object2.build();
                bl3 = bl2;
                if (!xu$$ExternalSyntheticApiModelOutline6.m((Spatializer)object, (AudioAttributes)object4, (AudioFormat)object2)) return bl3;
            }
            return true;
        }
    }
}

