/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.bluetooth.BluetoothManager
 *  android.os.Looper
 *  gda
 */
import android.bluetooth.BluetoothManager;
import android.os.Looper;
import androidx.wear.ambient.AmbientModeSupport$AmbientController;
import java.util.Map;
import java.util.Set;

public final class flj
implements imb {
    private final jnu a;
    private final int b;

    public flj(jnu jnu2, int n2) {
        this.b = n2;
        this.a = jnu2;
    }

    @Override
    public final /* synthetic */ Object b() {
        switch (this.b) {
            default: {
                BluetoothManager bluetoothManager = (BluetoothManager)((ilt)this.a).a().getSystemService("bluetooth");
                idi.m(bluetoothManager);
                return bluetoothManager;
            }
            case 19: {
                return new bam((bal)this.a.b());
            }
            case 18: {
                return new gcq((bbx)this.a.b(), 0);
            }
            case 17: {
                return new bmu((bzb)((imc)this.a).a);
            }
            case 16: {
                Object object = ((gbb)this.a.b()).c;
                idi.m(object);
                return object;
            }
            case 15: {
                ((ilt)this.a).a();
                return new gay();
            }
            case 14: {
                return new gbs((Looper)this.a.b());
            }
            case 13: {
                return new cqm((hpq)this.a.b());
            }
            case 12: {
                bmu bmu2 = (bmu)this.a.b();
                return new fvd();
            }
            case 11: {
                return new fzu((bmu)this.a.b(), 0);
            }
            case 10: {
                return new AmbientModeSupport$AmbientController((bmu)this.a.b(), null);
            }
            case 9: {
                Object object = (Map)((imc)this.a).a;
                Object object2 = new hat();
                for (Map.Entry entry : object.entrySet()) {
                    object = (String)entry.getKey();
                    if (object != null) {
                        if ((entry = (fzk)entry.getValue()) != null) {
                            ((hat)object2).j(new fzl((String)object, (fzk)((Object)entry)));
                            continue;
                        }
                        throw new NullPointerException("Null provider");
                    }
                    throw new NullPointerException("Null type");
                }
                object2 = ((hat)object2).g();
                idi.m(object2);
                return object2;
            }
            case 8: {
                return new gfs(((fzj)this.a).a(), 1);
            }
            case 7: {
                return new fzc((gib)this.a.b());
            }
            case 6: {
                return new fza((abw)((imc)this.a).a);
            }
            case 5: {
                return new hth((Set)((imc)this.a).a);
            }
            case 4: {
                return new fzu((fyq)this.a.b(), 1);
            }
            case 3: {
                return fym.a(((fyw)this.a).a().a.a(), gda.a);
            }
            case 2: {
                return new fpr(new cxt(((ilt)this.a).a(), null));
            }
            case 1: {
                return new fld(((ilt)this.a).a());
            }
            case 0: 
        }
        return new gpm((dxi)this.a.b());
    }
}

