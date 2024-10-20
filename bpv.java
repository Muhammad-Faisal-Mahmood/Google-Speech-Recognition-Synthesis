/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.RemoteException
 *  android.text.SpannableStringBuilder
 *  android.text.TextUtils
 *  android.util.Log
 *  android.view.View
 *  android.widget.Toast
 */
import android.content.Context;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import android.os.RemoteException;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import androidx.wear.ambient.AmbientMode$AmbientController;
import com.google.android.apps.speech.tts.googletts.local.voicepack.ui.MultipleVoicesActivity;
import j$.util.Collection$_EL;
import j$.util.Objects;
import java.util.Iterator;

public final class bpv
implements Runnable {
    public final Object a;
    private final int b;

    public /* synthetic */ bpv(Object object, int n2) {
        this.b = n2;
        this.a = object;
    }

    public bpv(Object object, int n2, byte[] byArray) {
        this.b = n2;
        this.a = object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void run() {
        int n2 = this.b;
        int n3 = 0;
        switch (n2) {
            default: {
                ((cep)this.a).f.b(new cbk(4));
                return;
            }
            case 19: {
                ccp ccp2 = ((cdx)((AmbientMode$AmbientController)this.a).a).b;
                ccp2.i(String.valueOf(ccp2.getClass().getName()).concat(" disconnecting because it was signed out."));
                return;
            }
            case 18: {
                ((cdx)this.a).h();
                return;
            }
            case 17: {
                Object object = this.a;
                Object object2 = Integer.toHexString(System.identityHashCode(object));
                Object object3 = agf.e;
                Object object4 = aeg.a();
                Object object5 = new StringBuilder("Release ");
                ((StringBuilder)object5).append((String)object2);
                ((StringBuilder)object5).append(" [AndroidXMedia3/1.5.0-alpha01] [");
                ((StringBuilder)object5).append((String)object3);
                ((StringBuilder)object5).append("] [");
                ((StringBuilder)object5).append((String)object4);
                ((StringBuilder)object5).append("]");
                afx.d("ExoPlayerImpl", ((StringBuilder)object5).toString());
                object5 = (aiy)object;
                ((aiy)object5).t();
                object4 = ((aiy)object5).u;
                object4 = ((aiy)object5).t;
                object4 = ((aiy)object5).v;
                ((aiy)object5).r.b = null;
                if (!((aiy)object5).f.e()) {
                    ((aiy)object5).g.e(10, new akd(1));
                }
                ((aiy)object5).g.d();
                ((agd)((aiy)object5).e).b.removeCallbacksAndMessages(null);
                object4 = ((aiy)object5).i;
                object = ((aiy)object5).q;
                ((apc)object4).g.O((akl)object);
                object4 = ((aiy)object5).o;
                boolean bl2 = ((ajr)object4).p;
                ((aiy)object5).o = ((ajr)object4).d(1);
                object4 = ((aiy)object5).o;
                ((aiy)object5).o = ((ajr)object4).a(((ajr)object4).c);
                object4 = ((aiy)object5).o;
                ((ajr)object4).q = ((ajr)object4).s;
                ((aiy)object5).o.r = 0L;
                object = ((aiy)object5).q;
                object4 = ((akl)object).f;
                abr.j(object4);
                object4.c(new kd(object, 17, null));
                object3 = ((aiy)object5).d;
                object4 = ((aox)object3).b;
                synchronized (object4) {
                    if (agf.a >= 32 && (object2 = ((aox)object3).e) != null && (object = ((aos)object2).d) != null && ((aos)object2).c != null) {
                        xu$$ExternalSyntheticApiModelOutline6.m(((aos)object2).a, (Spatializer$OnSpatializerStateChangedListener)object);
                        ((aos)object2).c.removeCallbacksAndMessages(null);
                        ((aos)object2).c = null;
                        ((aos)object2).d = null;
                    }
                }
                ((aoz)object3).g = null;
                ((aoz)object3).h = null;
                object4 = ((aiy)object5).n;
                if (object4 != null) {
                    object4.release();
                    ((aiy)object5).n = null;
                }
                n3 = afk.a;
                return;
            }
            case 16: {
                Object object = this.a;
                bvs bvs2 = (bvs)object;
                bvs2.h.i((aeq)object);
                bvs2.h.n();
                return;
            }
            case 15: {
                bvs bvs3 = (bvs)this.a;
                adk adk2 = (adk)((Object)bvs3.h);
                if (adk2.d() == 3 && adk2.l() && adk2.e() == 0) {
                    bvs3.h.k();
                }
                return;
            }
            case 14: {
                this.a.j();
                return;
            }
            case 13: {
                ((bvi)this.a).E();
                return;
            }
            case 12: {
                Toast.makeText((Context)((bve)this.a).b, (int)2132017453, (int)0).show();
                return;
            }
            case 11: {
                ((MultipleVoicesActivity)((buz)this.a).b).G();
                return;
            }
            case 10: {
                ((MultipleVoicesActivity)((buy)this.a).a).G();
                return;
            }
            case 9: {
                ((MultipleVoicesActivity)((buy)this.a).a).G();
                return;
            }
            case 8: {
                ((MultipleVoicesActivity)((buy)this.a).a).G();
                return;
            }
            case 7: {
                Object object = this.a;
                Object object6 = (aiy)((bro)object).a.c;
                ((aiy)object6).t();
                afu afu2 = ((aiy)object6).g;
                afu2.f();
                Iterator iterator = afu2.d.iterator();
                while (true) {
                    if (!iterator.hasNext()) {
                        return;
                    }
                    object6 = (aft)iterator.next();
                    if (!((aft)object6).a.equals(object)) continue;
                    ((aft)object6).a(afu2.c);
                    afu2.d.remove(object6);
                }
            }
            case 6: {
                ((brq)this.a).c.n();
                return;
            }
            case 5: {
                this.a.j();
                return;
            }
            case 4: {
                this.a.k();
                return;
            }
            case 3: {
                this.a.cancel(false);
                return;
            }
            case 2: {
                Object object = bpy.a;
                object = this.a;
                try {
                    ((bpb)object).e();
                    return;
                }
                catch (RemoteException remoteException) {
                    Log.w((String)bpy.a, (String)"Failed to cancel inference", (Throwable)remoteException);
                    return;
                }
            }
            case 1: {
                Object object = this.a;
                bol bol2 = (bol)((Object)object);
                Objects.requireNonNull(bol2.a);
                if (bol2.getLayout() == null) {
                    bpv bpv2 = new bpv(object, 1);
                    bol2.b = vl.a((View)object, bpv2);
                    return;
                }
                bol2.b = null;
                if (Collection$_EL.stream(bol2.a).allMatch(new boa(11))) {
                    return;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                object = "";
                while (true) {
                    if (n3 >= bol2.a.size()) {
                        bol2.setText((CharSequence)spannableStringBuilder);
                        return;
                    }
                    bjh bjh2 = (bjh)bol2.a.get(n3);
                    SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder.append((CharSequence)object);
                    if (bjh2.c.size() > 1) {
                        Iterator iterator = bjh2.c.iterator();
                        while (iterator.hasNext()) {
                            object = (CharSequence)iterator.next();
                            object.length();
                            n2 = bjh2.b;
                            n2 = bjh2.a;
                            if (!TextUtils.equals((CharSequence)object, (CharSequence)bol2.b((CharSequence)object))) continue;
                            break;
                        }
                    } else {
                        object = bjh2.a();
                        n2 = bjh2.a;
                        object = bol2.b((CharSequence)object);
                    }
                    spannableStringBuilder2.append((CharSequence)object);
                    object = "\n";
                    ++n3;
                }
            }
            case 0: 
        }
        Object object = bpy.a;
        object = this.a;
        try {
            ((bpb)object).e();
            return;
        }
        catch (RemoteException remoteException) {
            Log.w((String)bpy.a, (String)"Failed to cancel preparation of inference engine", (Throwable)remoteException);
            return;
        }
    }
}

