/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 */
import android.content.Context;
import android.content.Intent;

final class ezp
implements hpb {
    private final Context a;
    private final String b;
    private final int c;

    public ezp(Context context, String string, int n2) {
        jse.e(string, "locale");
        this.a = context;
        this.b = string;
        this.c = n2;
    }

    private final void c(int n2) {
        Intent intent = new Intent("com.google.recognition.action.LANGUAGE_DOWNLOAD_COMPLETE");
        hwp hwp2 = fbs.a.l();
        if (!hwp2.b.B()) {
            hwp2.u();
        }
        fbs fbs2 = (fbs)hwp2.b;
        fbs2.c = n2 - 1;
        fbs2.b |= 1;
        intent = intent.putExtra("com.google.recognition.extra.LANGUAGE_DOWNLOAD_RESULT", ((fbs)hwp2.o()).g()).putExtra("android.speech.extra.LANGUAGE", this.b);
        jse.d(intent, "putExtra(...)");
        this.a.sendBroadcast(intent);
    }

    @Override
    public final void a(Throwable throwable) {
        jse.e(throwable, "throwable");
        ((hfk)((hfk)ezs.a.g()).i(throwable)).A("LanguagePack [%s %d] download threw error.", this.b, this.c);
        this.c(3);
    }
}

