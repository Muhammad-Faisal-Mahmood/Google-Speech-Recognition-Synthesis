/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.text.SpannableString
 *  android.text.style.ClickableSpan
 *  android.view.View
 *  android.widget.TextView
 */
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.text.SpannableString;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import androidx.preference.PreferenceGroup;
import androidx.viewpager.widget.ViewPager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import com.android.car.ui.core.CarUiInstaller;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

public final class akt
implements Runnable {
    public final Object a;
    private final int b;

    public /* synthetic */ akt(Object object, int n2) {
        this.b = n2;
        this.a = object;
    }

    public akt(Object object, int n2, byte[] byArray) {
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
        switch (this.b) {
            default: {
                if (!((bma)this.a).d.isEnabled()) break;
                bma bma2 = (bma)this.a;
                int n2 = bma2.b;
                bma2.a.postDelayed((Runnable)this, (long)n2);
                bma2 = (bma)this.a;
                View view = bma2.d;
                bma2.c.onClick(view);
                ((bma)this.a).e = true;
                return;
            }
            case 19: {
                int n3 = CarUiInstaller.a;
                bkd.a(((Context)this.a).getApplicationContext());
                return;
            }
            case 18: {
                ((bjr)this.a).lambda$new$0$com-android-car-ui-appstyledview-AppStyledDialog();
                return;
            }
            case 17: {
                TextView textView = (TextView)this.a;
                if (((ClickableSpan[])((SpannableString)textView.getText()).getSpans(0, textView.getText().length(), ClickableSpan.class)).length == 0) {
                    textView.setFocusable(false);
                }
                return;
            }
            case 16: {
                Object object = this.a;
                Object object2 = (beh)object;
                if (((beh)object2).e != 0) {
                    bbi.a();
                    Objects.toString(((beh)object2).c);
                    return;
                }
                ((beh)object2).e = 1;
                bbi.a();
                Objects.toString(((beh)object2).c);
                Object object3 = ((beh)object2).d;
                Object object4 = ((beh)object2).m;
                if (((bem)object3).d.g((bzb)object4)) {
                    object4 = ((beh)object2).d;
                    object2 = ((beh)object2).c;
                    object3 = ((bem)object4).c;
                    object4 = ((bir)object3).d;
                    synchronized (object4) {
                        bbi.a();
                        Objects.toString(object2);
                        ((bir)object3).a((bgs)object2);
                        bcv bcv2 = new bcv(object3, object2, 3);
                        ((bir)object3).b.put(object2, bcv2);
                        ((bir)object3).c.put(object2, object);
                        ((bir)object3).a.b(600000L, bcv2);
                        return;
                    }
                }
                ((beh)object2).a();
                return;
            }
            case 15: {
                beh beh2 = (beh)this.a;
                Object object = beh2.c.a;
                if (beh2.e >= 2) {
                    bbi.a();
                    return;
                }
                beh2.e = 2;
                bbi.a();
                Object object5 = beh2.a;
                object = beh2.c;
                object5 = new Intent(object5, SystemAlarmService.class);
                object5.setAction("ACTION_STOP_WORK");
                bee.f((Intent)object5, (bgs)object);
                beh2.g.execute(new bej(beh2.d, (Intent)object5, beh2.b));
                object = beh2.d;
                object5 = beh2.c;
                if (((bem)object).d.c(object5.a)) {
                    bbi.a();
                    object5 = beh2.a;
                    object = beh2.c;
                    Executor executor = beh2.g;
                    bem bem2 = beh2.d;
                    int n4 = beh2.b;
                    executor.execute(new bej(bem2, bee.d(object5, (bgs)object), n4));
                    return;
                }
                bbi.a();
                return;
            }
            case 14: {
                ((AtomicBoolean)this.a).set(true);
                return;
            }
            case 13: {
                Object object = this.a;
                if (object != null) {
                    jvf.j((jwi)object);
                }
                return;
            }
            case 12: {
                ((AtomicBoolean)this.a).set(true);
                return;
            }
            case 11: {
                ((ViewPager)((Object)this.a)).a(0);
                return;
            }
            case 10: {
                ((ate)this.a).f();
                return;
            }
            case 9: {
                synchronized (this) {
                    ((PreferenceGroup)this.a).a.clear();
                    return;
                }
            }
            case 8: {
                RecyclerView recyclerView = ((ata)this.a).b;
                recyclerView.focusableViewAvailable((View)recyclerView);
                return;
            }
            case 7: {
                ((ase)this.a).E();
                return;
            }
            case 6: {
                this.a.shutdown();
                return;
            }
            case 5: {
                Object object = this.a;
                Object object6 = (ann)object;
                if (!((ann)object6).u) {
                    object6 = ((ann)object6).g;
                    abr.i(object6);
                    object6.b((anx)object);
                }
                return;
            }
            case 4: {
                ((ann)this.a).r();
                return;
            }
            case 3: {
                ((ann)this.a).p = true;
                return;
            }
            case 2: {
                Object object = this.a;
                Object object7 = ((alp)((Object)object)).a;
                synchronized (object7) {
                    long l2;
                    if (((alp)((Object)object)).h) {
                        return;
                    }
                    ((alp)((Object)object)).g = l2 = ((alp)((Object)object)).g - 1L;
                    long l3 = l2 - 0L;
                    long l4 = l3 == 0L ? 0 : (l3 < 0L ? -1 : 1);
                    if (l4 > 0) {
                        return;
                    }
                    if (l4 < 0) {
                        IllegalStateException illegalStateException = new IllegalStateException();
                        Object object8 = ((alp)((Object)object)).a;
                        synchronized (object8) {
                            ((alp)((Object)object)).i = illegalStateException;
                            return;
                        }
                    }
                    ((alp)((Object)object)).a();
                    return;
                }
            }
            case 1: {
                int n5 = agf.a;
                akl akl2 = ((aiv)((bxt)this.a).b).a.q;
                akl2.u(akl2.t(), 1008, new akd(14));
                return;
            }
            case 0: {
                int n6 = agf.a;
                akl akl3 = ((aiv)((bxt)this.a).b).a.q;
                akl3.u(akl3.t(), 1012, new akd(5));
                return;
            }
        }
        ((bma)this.a).e = false;
    }
}

