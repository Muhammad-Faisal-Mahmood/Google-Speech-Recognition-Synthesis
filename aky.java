/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.media.AudioDeviceInfo
 *  android.media.LoudnessCodecController
 *  android.media.MediaCodec
 *  android.media.MediaCrypto
 *  android.media.MediaFormat
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.SystemClock
 *  android.util.Pair
 *  hom
 */
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import j$.util.Objects;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;

public final class aky
extends ama
implements aji {
    private final akx E;
    private int F;
    private boolean G;
    private adu H;
    private adu I;
    private long J;
    private boolean K;
    private boolean L;
    private int M;
    private final awf N;
    private final bxt O;

    public aky(Context context, amc amc2, Handler handler, aiv aiv2, akx akx2) {
        alr alr2 = new alr(context);
        awf awf2 = agf.a >= 35 ? new awf() : null;
        super(alr2, amc2);
        context.getApplicationContext();
        this.E = akx2;
        this.N = awf2;
        this.M = -1000;
        this.O = new bxt(handler, aiv2);
    }

    private final void au() {
        ((ama)this).Q();
        long l2 = this.E.x();
        if (l2 != Long.MIN_VALUE) {
            if (!this.K) {
                l2 = Math.max(this.J, l2);
            }
            this.J = l2;
            this.K = false;
        }
    }

    private static final int av(alx alx2, adu adu2) {
        if ("OMX.google.raw.decoder".equals(alx2.a)) {
            int n2 = agf.a;
        }
        return adu2.p;
    }

    private static List aw(adu adu2, boolean bl2, akx object) {
        if (adu2.o == null) {
            int n2 = gzx.d;
            return hct.a;
        }
        if (object.v(adu2) && (object = (object = amj.c("audio/raw", false)).isEmpty() ? null : (alx)object.get(0)) != null) {
            return gzx.q(object);
        }
        return amj.d(adu2, false);
    }

    @Override
    protected final void D() {
        this.A = new aie();
        Object object = this.O;
        Object object2 = ((bxt)object).a;
        if (object2 != null) {
            object = new kd(object, 18, null);
            ((Handler)object2).post((Runnable)object);
        }
        this.I();
        this.h();
        this.H();
    }

    @Override
    protected final void E(long l2) {
        this.x = false;
        this.y = false;
        if (this.p) {
            ((aht)this.g).clear();
            ((aht)this.f).clear();
            this.q = false;
            this.i.a();
        } else if (this.ap()) {
            this.aj();
        }
        age age2 = this.B.d;
        if (age2.a() > 0) {
            this.z = true;
        }
        age2.e();
        this.h.clear();
        this.J = l2;
        this.K = true;
    }

    @Override
    public final String P() {
        return "MediaCodecAudioRenderer";
    }

    @Override
    public final boolean Q() {
        return this.y && this.E.u();
    }

    @Override
    public final boolean R() {
        block5: {
            block6: {
                boolean bl2;
                if (this.j == null) break block5;
                if (this.A()) {
                    bl2 = this.e;
                } else {
                    anv anv2 = this.b;
                    abr.i(anv2);
                    bl2 = anv2.c();
                }
                if (bl2 || super.aq()) break block6;
                if (this.o == -9223372036854775807L) break block5;
                this.H();
                if (SystemClock.elapsedRealtime() >= this.o) break block5;
            }
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    protected final int U(amc object, adu adu2) {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        block14: {
            block16: {
                block15: {
                    boolean bl2 = ael.c(adu2.o);
                    n6 = 0;
                    if (!bl2) {
                        n5 = 0;
                        return vy.m(n5, 0, 0);
                    }
                    n4 = adu2.K;
                    n5 = 1;
                    n3 = 4;
                    n2 = 8;
                    if ((n4 ^= 1) != 0) {
                        if (this.E.v(adu2)) return vy.m(4, 8, 32);
                    }
                    if ("audio/raw".equals(adu2.o) && !this.E.v(adu2)) {
                        return vy.m(n5, 0, 0);
                    }
                    if (!this.E.v(agf.q(2, adu2.D, adu2.E))) {
                        return vy.m(n5, 0, 0);
                    }
                    List list = aky.aw(adu2, false, this.E);
                    if (list.isEmpty()) {
                        return vy.m(n5, 0, 0);
                    }
                    if (n4 == 0) {
                        n5 = 2;
                        return vy.m(n5, 0, 0);
                    }
                    object = (alx)list.get(0);
                    bl2 = ((alx)object).c(adu2);
                    if (!bl2) {
                        for (n5 = 1; n5 < ((hct)list).c; ++n5) {
                            alx alx2 = (alx)list.get(n5);
                            if (!alx2.c(adu2)) continue;
                            n4 = 0;
                            bl2 = true;
                            object = alx2;
                            break;
                        }
                    } else {
                        n4 = 1;
                    }
                    n5 = n3;
                    if (!bl2) {
                        n5 = 3;
                    }
                    n3 = n2;
                    if (!bl2) break block14;
                    if (!((alx)object).i) break block15;
                    n3 = n2;
                    if (!((alx)object).e) break block14;
                    break block16;
                }
                n3 = amj.a;
                adu2 = afm.a(adu2);
                n3 = n2;
                if (adu2 == null) break block14;
                n3 = n2;
                if ((Integer)((Pair)adu2).first != 42) break block14;
            }
            n3 = 16;
        }
        n2 = true != ((alx)object).g ? 0 : 64;
        if (1 != n4) {
            n4 = n6;
            return vy.n(n5, n3, 32, n2, n4);
        }
        n4 = 128;
        return vy.n(n5, n3, 32, n2, n4);
    }

    @Override
    protected final List V(amc object, adu adu2, boolean bl2) {
        object = new ArrayList(aky.aw(adu2, false, this.E));
        amj.b((List)object, new ame(adu2));
        return object;
    }

    @Override
    protected final void W(ahx ahx2) {
        Object object;
        if (agf.a >= 29 && (object = ahx2.a) != null && Objects.equals(((adu)object).o, "audio/opus") && this.p) {
            object = ahx2.f;
            abr.i(object);
            abr.i(ahx2.a);
            if (((Buffer)object).remaining() == 8) {
                ((ByteBuffer)object).order(ByteOrder.LITTLE_ENDIAN).getLong();
            }
        }
    }

    @Override
    protected final void X(Exception object) {
        afx.c("MediaCodecAudioRenderer", "Audio codec error", (Throwable)object);
        Object object2 = this.O;
        object = ((bxt)object2).a;
        if (object != null) {
            object2 = new kd(object2, 19, null);
            ((Handler)object).post((Runnable)object2);
        }
    }

    @Override
    protected final void Y(String object) {
        Object object2 = this.O;
        object = ((bxt)object2).a;
        if (object != null) {
            object2 = new akt(object2, 0);
            ((Handler)object).post((Runnable)object2);
        }
    }

    @Override
    protected final void Z(adu adu2, MediaFormat mediaFormat) {
        Object object = this.I;
        if (object == null) {
            object = adu2;
            if (this.k != null) {
                int n2;
                abr.i(mediaFormat);
                if ("audio/raw".equals(adu2.o)) {
                    n2 = adu2.F;
                } else {
                    n2 = agf.a;
                    n2 = mediaFormat.containsKey("pcm-encoding") ? mediaFormat.getInteger("pcm-encoding") : (mediaFormat.containsKey("v-bits-per-sample") ? agf.g(mediaFormat.getInteger("v-bits-per-sample")) : 2);
                }
                object = new adt();
                ((adt)object).a("audio/raw");
                ((adt)object).D = n2;
                ((adt)object).E = adu2.G;
                ((adt)object).F = adu2.H;
                ((adt)object).k = adu2.l;
                Object object2 = adu2.m;
                ((adt)object).a = adu2.a;
                object2 = adu2.b;
                ((adt)object).b = null;
                ((adt)object).c = gzx.o(adu2.c);
                ((adt)object).d = adu2.d;
                n2 = adu2.e;
                ((adt)object).e = 0;
                n2 = adu2.f;
                ((adt)object).f = 0;
                ((adt)object).B = mediaFormat.getInteger("channel-count");
                ((adt)object).C = mediaFormat.getInteger("sample-rate");
                adu2 = new adu((adt)object);
                object = adu2;
                if (this.G) {
                    n2 = adu2.D;
                    object = adu2;
                }
            }
        }
        try {
            if (agf.a >= 29 && this.p) {
                this.I();
            }
            this.E.w((adu)object);
            return;
        }
        catch (aku aku2) {
            throw this.d(aku2, null, 5001);
        }
    }

    @Override
    public final long a() {
        if (this.a == 2) {
            this.au();
        }
        return this.J;
    }

    @Override
    protected final void aa() {
        try {
            this.E.s();
            return;
        }
        catch (akw akw2) {
            int n2 = true != this.p ? 5002 : 5003;
            throw this.e(akw2, null, false, n2);
        }
    }

    @Override
    protected final boolean ab(adu adu2) {
        this.I();
        return this.E.v(adu2);
    }

    @Override
    protected final float ac(float f2, adu[] aduArray) {
        int n2 = -1;
        for (int i2 = 0; i2 < aduArray.length; ++i2) {
            int n3 = aduArray[i2].E;
            int n4 = n2;
            if (n3 != -1) {
                n4 = Math.max(n2, n3);
            }
            n2 = n4;
        }
        if (n2 == -1) {
            return -1.0f;
        }
        return (float)n2 * f2;
    }

    @Override
    protected final void ad(String object, long l2, long l3) {
        Object object2 = this.O;
        object = ((bxt)object2).a;
        if (object != null) {
            object2 = new akt(object2, 1);
            ((Handler)object).post((Runnable)object2);
        }
    }

    @Override
    protected final boolean ae(alu object, ByteBuffer object2, int n2, int n3, int n4, boolean bl2, adu adu2) {
        abr.i(object2);
        if (this.I != null && (n3 & 2) != 0) {
            abr.i(object);
            object.l(n2);
            return true;
        }
        if (bl2) {
            if (object != null) {
                object.l(n2);
            }
            object = this.A;
            ((aie)object).f += n4;
            return true;
        }
        try {
            bl2 = this.E.y((ByteBuffer)object2);
            if (bl2) {
                if (object != null) {
                    object.l(n2);
                }
                object = this.A;
                ((aie)object).e += n4;
                return true;
            }
            return false;
        }
        catch (akw akw2) {
            if (this.p) {
                this.I();
            }
            throw this.e(akw2, adu2, false, 5002);
        }
        catch (akv akv2) {
            object2 = this.H;
            if (this.p) {
                this.I();
            }
            throw this.e(akv2, (adu)object2, false, 5001);
        }
    }

    @Override
    protected final void af(arq object) {
        Object object2;
        block14: {
            Object object3;
            block16: {
                Object object4;
                block18: {
                    int n2;
                    Object object5;
                    block25: {
                        block23: {
                            block19: {
                                boolean bl2;
                                block24: {
                                    block22: {
                                        block20: {
                                            block21: {
                                                int n3;
                                                block17: {
                                                    block15: {
                                                        object3 = ((arq)object).a;
                                                        abr.i(object3);
                                                        this.H = object3;
                                                        this.z = true;
                                                        object2 = ((arq)object).a;
                                                        abr.i(object2);
                                                        object4 = ((adu)object2).o;
                                                        if (object4 == null) break block14;
                                                        object3 = object2;
                                                        if (Objects.equals(object4, "video/av01")) {
                                                            object3 = object2;
                                                            if (!((adu)object2).r.isEmpty()) {
                                                                object3 = new adt((adu)object2);
                                                                ((adt)object3).p = null;
                                                                object3 = new adu((adt)object3);
                                                            }
                                                        }
                                                        this.D = (bzb)((arq)object).b;
                                                        this.j = object3;
                                                        if (!this.p) break block15;
                                                        this.r = true;
                                                        break block16;
                                                    }
                                                    object = this.k;
                                                    if (object != null) break block17;
                                                    this.m = null;
                                                    this.aj();
                                                    break block16;
                                                }
                                                object2 = this.n;
                                                abr.i(object2);
                                                object4 = this.l;
                                                abr.i(object4);
                                                Object object6 = this.C;
                                                object5 = this.D;
                                                if (object6 != object5) break block18;
                                                bl2 = object5 != object6;
                                                if (bl2) {
                                                    n2 = agf.a;
                                                }
                                                abr.f(true);
                                                object5 = ((alx)object2).a((adu)object4, (adu)object3);
                                                n2 = n3 = ((aif)object5).e;
                                                if (this.ar((adu)object3)) {
                                                    n2 = n3 | 0x8000;
                                                }
                                                n3 = n2;
                                                if (aky.av((alx)object2, (adu)object3) > this.F) {
                                                    n3 = n2 | 0x40;
                                                }
                                                object6 = ((alx)object2).a;
                                                if (n3 != 0) {
                                                    n2 = 0;
                                                } else {
                                                    n2 = ((aif)object5).d;
                                                    n3 = 0;
                                                }
                                                object5 = new aif((String)object6, (adu)object4, (adu)object3, n2, n3);
                                                n2 = ((aif)object5).d;
                                                if (n2 == 0) break block19;
                                                if (n2 == 1) break block20;
                                                if (n2 == 2) break block21;
                                                if (!super.as((adu)object3)) break block22;
                                                this.l = object3;
                                                if (bl2) {
                                                    super.at();
                                                }
                                                break block23;
                                            }
                                            if (!super.as((adu)object3)) break block22;
                                            this.s = true;
                                            this.t = 1;
                                            this.l = object3;
                                            if (bl2) {
                                                super.at();
                                            }
                                            break block23;
                                        }
                                        if (super.as((adu)object3)) break block24;
                                    }
                                    n2 = 16;
                                    break block25;
                                }
                                this.l = object3;
                                if (bl2) {
                                    super.at();
                                } else if (this.w) {
                                    this.u = 1;
                                    this.v = 1;
                                }
                                break block23;
                            }
                            super.ai();
                        }
                        n2 = 0;
                    }
                    if (((aif)object5).d != 0 && (this.k != object || this.v == 3)) {
                        new aif(((alx)object2).a, (adu)object4, (adu)object3, 0, n2);
                    }
                    break block16;
                }
                super.ai();
                new aif(((alx)object2).a, (adu)object4, (adu)object3, 0, 128);
            }
            object3 = this.O;
            object = ((bxt)object3).a;
            if (object != null) {
                object3 = new kd(object3, 20, null);
                ((Handler)object).post((Runnable)object3);
            }
            return;
        }
        throw this.d(new IllegalArgumentException("Sample MIME type is null."), (adu)object2, 4005);
    }

    @Override
    protected final cya ag(alx alx2, adu adu2, MediaCrypto object, float f2) {
        int n2;
        int n3;
        adu[] aduArray = this.C();
        int n4 = aduArray.length;
        int n5 = aky.av(alx2, adu2);
        if (n4 == 1) {
            n3 = n5;
        } else {
            n2 = 0;
            while (true) {
                n3 = n5;
                if (n2 >= n4) break;
                object = aduArray[n2];
                n3 = n5;
                if (alx2.a((adu)adu2, (adu)object).d != 0) {
                    n3 = Math.max(n5, aky.av(alx2, (adu)object));
                }
                ++n2;
                n5 = n3;
            }
        }
        this.F = n3;
        n5 = agf.a;
        object = alx2.a;
        boolean bl2 = ((String)object).equals("OMX.google.opus.decoder") || ((String)object).equals("c2.android.opus.decoder") || ((String)object).equals("OMX.google.vorbis.decoder") || ((String)object).equals("c2.android.vorbis.decoder");
        this.G = bl2;
        object = alx2.c;
        n2 = this.F;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", (String)object);
        mediaFormat.setInteger("channel-count", adu2.D);
        mediaFormat.setInteger("sample-rate", adu2.E);
        object = adu2.r;
        for (n5 = 0; n5 < object.size(); ++n5) {
            mediaFormat.setByteBuffer(a.af(n5, "csd-"), ByteBuffer.wrap((byte[])object.get(n5)));
        }
        if (n2 != -1) {
            mediaFormat.setInteger("max-input-size", n2);
        }
        mediaFormat.setInteger("priority", 0);
        if (f2 != -1.0f) {
            mediaFormat.setFloat("operating-rate", f2);
        }
        if (agf.a <= 28 && "audio/ac4".equals(adu2.o)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (this.E.q(agf.q(4, adu2.D, adu2.E)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (agf.a >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (agf.a >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.M));
        }
        bl2 = "audio/raw".equals(alx2.b);
        aduArray = null;
        object = aduArray;
        if (bl2) {
            object = aduArray;
            if (!"audio/raw".equals(adu2.o)) {
                object = adu2;
            }
        }
        this.I = object;
        return new cya(alx2, mediaFormat, adu2, null, this.N);
    }

    @Override
    public final aeo b() {
        return this.E.r();
    }

    @Override
    public final void c(aeo aeo2) {
        this.E.t(aeo2);
    }

    @Override
    public final aji f() {
        return this;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void m(int n2, Object object) {
        if (n2 == 2) {
            abr.i(object);
            ((Float)object).floatValue();
            return;
        }
        if (n2 == 3) {
            abr.i((adi)object);
            return;
        }
        if (n2 == 6) {
            abr.i((adj)object);
            return;
        }
        if (n2 == 12) {
            n2 = agf.a;
            object = (AudioDeviceInfo)object;
            return;
        }
        if (n2 != 16) {
            if (n2 == 9) {
                abr.i(object);
                ((Boolean)object).booleanValue();
                return;
            }
            if (n2 != 10) {
                if (n2 != 11) return;
                object = (vy)object;
                return;
            }
            abr.i(object);
            n2 = (Integer)object;
            if (agf.a < 35 || (object = this.N) == null) return;
            Object object2 = ((awf)object).b;
            if (object2 != null) {
                ki$$ExternalSyntheticApiModelOutline0.m(ki$$ExternalSyntheticApiModelOutline0.m(object2));
                ((awf)object).b = null;
            }
            ((awf)object).b = object2 = ki$$ExternalSyntheticApiModelOutline0.m(n2, (Executor)hom.a, new als());
            object = ((HashSet)((awf)object).a).iterator();
            while (object.hasNext()) {
                if (ki$$ExternalSyntheticApiModelOutline0.m((LoudnessCodecController)object2, (MediaCodec)object.next())) continue;
                object.remove();
            }
            return;
        }
        abr.i(object);
        this.M = (Integer)object;
        object = this.k;
        if (object == null || agf.a < 35) return;
        Bundle bundle = new Bundle();
        bundle.putInt("importance", Math.max(0, -this.M));
        object.i(bundle);
    }

    @Override
    protected final void p() {
        this.L = true;
        this.H = null;
        try {
            this.j = null;
            super.ao(alz.a);
            this.h.clear();
            this.ap();
            return;
        }
        finally {
            this.O.m(this.A);
        }
    }

    @Override
    protected final void q() {
        Object object;
        if (agf.a >= 35 && (object = this.N) != null) {
            ((HashSet)((awf)object).a).clear();
            object = ((awf)object).b;
            if (object != null) {
                ki$$ExternalSyntheticApiModelOutline0.m(ki$$ExternalSyntheticApiModelOutline0.m(object));
            }
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    protected final void r() {
        Throwable throwable222222;
        super.ah();
        this.al();
        this.D = null;
        if (!this.L) return;
        this.L = false;
        return;
        {
            catch (Throwable throwable222222) {}
        }
        catch (Throwable throwable3) {
            this.D = null;
            throw throwable3;
        }
        if (!this.L) {
            throw throwable222222;
        }
        this.L = false;
        throw throwable222222;
    }

    @Override
    protected final void s() {
        this.au();
    }
}

