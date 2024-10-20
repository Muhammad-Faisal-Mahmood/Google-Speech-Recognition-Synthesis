/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import androidx.wear.ambient.AmbientDelegate;
import androidx.wear.ambient.AmbientMode$AmbientController;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

public final class mz
extends jsf
implements jrk {
    final Object a;
    private final int b;

    public mz(Object object, int n2) {
        this.b = n2;
        this.a = object;
        super(1);
    }

    @Override
    public final /* synthetic */ Object a(Object object) {
        int n2 = this.b;
        boolean bl2 = true;
        boolean bl3 = true;
        ListIterator listIterator = null;
        Object object2 = null;
        Object object3 = null;
        Object object4 = null;
        switch (n2) {
            default: {
                object = (Throwable)object;
                this.a.cancel(false);
                return jon.a;
            }
            case 19: {
                object = (epi)object;
                jse.e(object, "parent");
                object2 = this.a;
                if (object2.isEmpty()) {
                    bl2 = bl3;
                } else {
                    object2 = object2.iterator();
                    bl2 = bl3;
                    if (object2.hasNext()) {
                        n2 = ((epi)object2.next()).a;
                        n2 = ((epi)object).a;
                        bl2 = false;
                    }
                }
                return bl2;
            }
            case 18: {
                object = (Integer)object;
                jse.e(object, "handoffId");
                n2 = (Integer)object;
                object2 = (epa)this.a;
                object = jsd.k(((epa)object2).j);
                return ((epa)object2).m.F(n2, (hpn)object);
            }
            case 17: {
                object = (Integer)object;
                jse.e(object, "handoffId");
                n2 = (Integer)object;
                object = (eoq)this.a;
                object2 = jsd.k(((eoq)object).k);
                return ((eoq)object).l.F(n2, (hpn)object2);
            }
            case 16: {
                object = (Integer)object;
                jse.e(object, "handoffId");
                n2 = (Integer)object;
                object = (eoi)this.a;
                object2 = jsd.k(((eoi)object).h);
                return ((eoi)object).j.F(n2, (hpn)object2);
            }
            case 15: {
                object = (ebs)object;
                jse.e(object, "failure");
                object2 = ekr.k(ebp.j, ebv.g);
                this.a.a(object2);
                return ekr.a((ebs)object);
            }
            case 14: {
                object2 = (eas)object;
                jse.e(object2, "status");
                object = ((jsj)this.a).a;
                if (object == null) {
                    jse.h("stoppedCompleter");
                    object = object4;
                } else {
                    object = (po)object;
                }
                ((po)object).c(object2);
                return jon.a;
            }
            case 13: {
                object = (Throwable)object;
                this.a.cancel(false);
                return jon.a;
            }
            case 12: {
                object2 = this.a;
                object = (AmbientMode$AmbientController)object;
                listIterator = (eie)object2;
                object2 = ((eie)((Object)listIterator)).k;
                if (object2 != null) {
                    ((AmbientMode$AmbientController)object).f((eih)object2);
                } else if (!((eie)((Object)listIterator)).g.b()) {
                    ((AmbientMode$AmbientController)object).e();
                }
                return jon.a;
            }
            case 11: {
                ((ehi)object).b((List)this.a);
                return jon.a;
            }
            case 10: {
                object = (AmbientMode$AmbientController)object;
                object2 = this.a;
                ((AmbientMode$AmbientController)object).d(ehb.a, ehb.d, (egz)object2);
                return jon.a;
            }
            case 9: {
                ((ehi)object).b((List)this.a);
                return jon.a;
            }
            case 8: {
                ((AmbientMode$AmbientController)object).f((eih)this.a);
                return jon.a;
            }
            case 7: {
                object = (Throwable)object;
                object3 = (heg)eej.a.f().h(hfo.a, "ALT.ReceiverTimestamp").j("com/google/android/libraries/search/audio/audiobuffer/AudioBytesReceiverWithTimestamps", "handleStartTimeCompletion", 72, "AudioBytesReceiverWithTimestamps.kt");
                object2 = (eej)this.a;
                object4 = ((eej)object2).e;
                object = listIterator;
                if (object4 != null) {
                    object4 = (eaf)object4.bE();
                    object = listIterator;
                    if (object4 != null) {
                        if (1 != (((eaf)object4).b & 1)) {
                            bl2 = false;
                        }
                        object = bl2;
                    }
                }
                object3.u("#audio# start time defined(present=%s)", object);
                ((eej)object2).a();
                return jon.a;
            }
            case 6: {
                object = (att)object;
                jse.e(object, "config");
                return ((aum)this.a).c((att)object);
            }
            case 5: {
                object = (awl)object;
                jse.e(object, "db");
                ((AmbientDelegate)this.a).a = object;
                return jon.a;
            }
            case 4: {
                jse.e((bzb)object, "it");
                return ((bho)this.a).a();
            }
            case 3: {
                object = (Throwable)object;
                this.a.cancel(false);
                return jon.a;
            }
            case 2: {
                object3 = (mk)object;
                jse.e(object3, "backEvent");
                object4 = (nf)this.a;
                listIterator = ((nf)object4).b;
                object = listIterator;
                if (listIterator == null) {
                    object = ((nf)object4).a;
                    listIterator = object.listIterator(((joy)object).a);
                    do {
                        object = object2;
                        if (!listIterator.hasPrevious()) break;
                        object = listIterator.previous();
                    } while (!((my)object).b);
                    object = (my)object;
                }
                if (object != null) {
                    ((my)object).c((mk)object3);
                }
                return jon.a;
            }
            case 1: {
                object = (Map.Entry)object;
                jse.e(object, "entry");
                object = wa.f((View)object.getValue());
                return jns.y((Iterable)this.a, object);
            }
            case 0: 
        }
        jse.e((mk)object, "backEvent");
        object2 = (nf)this.a;
        object = ((nf)object2).a;
        listIterator = object.listIterator(((joy)object).a);
        do {
            object = object3;
            if (!listIterator.hasPrevious()) break;
            object = listIterator.previous();
        } while (!((my)object).b);
        object = (my)object;
        if (((nf)object2).b != null) {
            ((nf)object2).a();
        }
        ((nf)object2).b = object;
        if (object != null) {
            ((my)object).d();
        }
        return jon.a;
    }
}

