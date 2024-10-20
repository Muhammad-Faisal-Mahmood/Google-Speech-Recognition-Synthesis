/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.PendingIntent
 *  android.app.PendingIntent$CanceledException
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 *  android.os.Bundle
 */
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.UUID;

public final class fkv {
    public static final hei a = hei.m("com/google/android/libraries/speech/transcription/ui/TranscriptionFragmentPeer");
    public final Activity b;
    public final gpm c;
    public final fdl d;
    public final goi e;
    public final bmu f;
    private final fkr g;

    public fkv(Activity activity, bmu bmu2, goi goi2, gpm gpm2, fdl fdl2, fkr fkr2) {
        this.b = activity;
        this.f = bmu2;
        this.e = goi2;
        this.c = gpm2;
        this.d = fdl2;
        this.g = fkr2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(fex fex2, Uri uri) {
        Throwable throwable2222222;
        block7: {
            Intent intent = new Intent();
            intent.putStringArrayListExtra("android.speech.extra.RESULTS", new ArrayList(fex2.c));
            intent.putExtra("android.speech.extra.CONFIDENCE_SCORES", hhk.ak(fex2.d));
            intent.putExtra("query", (String)fex2.c.get(0));
            if (!Objects.equals(uri, Uri.EMPTY)) {
                intent.setData(uri);
                intent.setFlags(1);
            }
            if ((fex2 = (PendingIntent)(uri = this.b.getIntent()).getParcelableExtra("android.speech.extra.RESULTS_PENDINGINTENT")) == null) {
                this.b.setResult(-1, intent);
                this.b.finish();
                return;
            }
            if ((uri = uri.getBundleExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE")) != null) {
                intent.putExtras((Bundle)uri);
            }
            fex2.send((Context)this.b, -1, intent);
            {
                catch (Throwable throwable2222222) {
                    break block7;
                }
                catch (PendingIntent.CanceledException canceledException) {}
                {
                    a.as(a.g(), "Not possible to start pending intent", "com/google/android/libraries/speech/transcription/ui/TranscriptionFragmentPeer", "createResultIntent", '\u0126', "TranscriptionFragmentPeer.java", canceledException);
                }
                this.b.finish();
                return;
            }
            this.b.finish();
            return;
        }
        this.b.finish();
        throw throwable2222222;
    }

    public final void b() {
        y y2 = new y(this.g.D.getChildFragmentManager());
        String string = this.d.c;
        hwp hwp2 = fdl.a.l();
        String string2 = UUID.randomUUID().toString();
        if (!hwp2.b.B()) {
            hwp2.u();
        }
        hwv hwv2 = hwp2.b;
        fdl fdl2 = (fdl)hwv2;
        string2.getClass();
        fdl2.b |= 1;
        fdl2.c = string2;
        if (!hwv2.B()) {
            hwp2.u();
        }
        hwv2 = (fdl)hwp2.b;
        string.getClass();
        ((fdl)hwv2).b |= 2;
        ((fdl)hwv2).d = string;
        y2.p(2131427963, fkr.e((fdl)hwp2.o()), "transcriptionFragment");
        ((ce)y2).b();
    }
}

