/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 */
import android.os.Build;
import java.io.Serializable;
import java.util.Collections;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;

public final class dmj
implements imb {
    private final jnu a;
    private final jnu b;
    private final int c;

    public dmj(jnu jnu2, jnu jnu3, int n2) {
        this.c = n2;
        this.a = jnu2;
        this.b = jnu3;
    }

    public dmj(jnu jnu2, jnu jnu3, int n2, short[][] sArray) {
        this.c = n2;
        this.b = jnu2;
        this.a = jnu3;
    }

    @Override
    public final /* synthetic */ Object b() {
        Object object;
        block22: {
            Object object2;
            switch (this.c) {
                default: {
                    object2 = this.b;
                    object = this.a;
                    object2 = ima.c((jnu)object2);
                    object = ima.c((jnu)object);
                    jse.e(object2, "bluetoothHeadsetScoAudioController");
                    jse.e(object, "bluetoothHeadsetVCAudioControllerSnowConePlus");
                    if (Build.VERSION.SDK_INT < 31) break;
                    object = object.b();
                    jse.b(object);
                    object = (ehe)object;
                    break block22;
                }
                case 19: {
                    jnu jnu2 = this.a;
                    return new dpq(this.b, jnu2, null, null);
                }
                case 18: {
                    return new ege((ivu)this.b.b(), ((ilt)this.a).a());
                }
                case 17: {
                    gto gto2 = (gto)((imc)this.b).a;
                    efu efu2 = (efu)this.a.b();
                    jse.e(gto2, "audioRecordFactoryOverride");
                    jse.e(efu2, "defaultAudioRecordFactory");
                    return (efu)gto2.e(efu2);
                }
                case 16: {
                    return new efi((Executor)this.a.b(), ((gdb)this.b).a());
                }
                case 15: {
                    return new cae(((ilt)this.a).a(), ((fjl)this.b).a().a).a();
                }
                case 14: {
                    jnu jnu3 = this.a;
                    return new dpq(this.b, jnu3, null, null);
                }
                case 13: {
                    cgw cgw2 = (cgw)this.b.b();
                    return new iuv((gto)((imc)this.a).a);
                }
                case 12: {
                    cgw cgw3 = (cgw)this.b.b();
                    return new dxd(this.a);
                }
                case 11: {
                    return new gqr((gto)((imc)this.b).a, ((ime)this.a).a());
                }
                case 10: {
                    return new dsg((Random)((gto)((imc)this.a).a).e((Random)this.b.b()));
                }
                case 9: {
                    Object object3 = this.a;
                    Object object4 = this.b.b();
                    object3 = ((drt)object3).a();
                    return new drs((drr)object4, (gto)object3);
                }
                case 8: {
                    hdq hdq2 = ((dqk)((gtt)((bqw)this.a).a()).a).b() ? new hdq(new dqr((Executor)this.b.b())) : Collections.emptySet();
                    idi.m(hdq2);
                    return hdq2;
                }
                case 7: {
                    Object object5 = this.b;
                    object5 = a.m(((bqw)this.a).a(), (jnu)object5);
                    idi.m(object5);
                    return object5;
                }
                case 6: {
                    hav hav2 = ((gto)((imc)this.a).a).g() ? new hdq((dmw)this.b.b()) : hdc.a;
                    idi.m(hav2);
                    return hav2;
                }
                case 5: {
                    Serializable serializable = (gto)((imc)this.a).a;
                    gnu gnu2 = ((doq)this.b).a();
                    serializable = serializable.g() ? new hdq(gnu2) : hdc.a;
                    idi.m(serializable);
                    return serializable;
                }
                case 4: {
                    Set set = a.m((gto)((imc)this.a).a, this.b);
                    idi.m(set);
                    return set;
                }
                case 3: {
                    Object object6 = this.b;
                    object6 = a.m(((bqw)this.a).a(), (jnu)object6);
                    idi.m(object6);
                    return object6;
                }
                case 2: {
                    hav hav3 = !((gto)((imc)this.a).a).g() ? hdc.a : new hdq((dmw)this.b.b());
                    idi.m(hav3);
                    return hav3;
                }
                case 1: {
                    jnu jnu4 = this.b;
                    return new cxu(((dlf)this.a).a(), ((ilt)jnu4).a());
                }
                case 0: {
                    ((bqw)this.a).a();
                    return new hdq((dmw)this.b.b());
                }
            }
            object = object2.b();
            jse.b(object);
            object = (ehe)object;
        }
        idi.m(object);
        return object;
    }
}

