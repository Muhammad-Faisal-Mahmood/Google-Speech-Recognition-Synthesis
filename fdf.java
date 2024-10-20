/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 */
import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.speech.modelmanager.languagepack.ui.DownloadActivity;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;

public final class fdf
extends fdc {
    private static final hfn a = hfn.q();
    private final ConcurrentHashMap b = new ConcurrentHashMap();
    private final Context c;

    public fdf(Context context) {
        this.c = context;
    }

    @Override
    public final void a(fdh fdh2, jnf object) {
        ((hfk)((hfk)a.f()).j("com/google/android/libraries/speech/modelmanager/languagepack/ui/grpc/DownloadActivityStarterServiceImpl", "showDownloadDialog", 37, "DownloadActivityStarterServiceImpl.java")).r("#showDownloadDialog");
        long l2 = object.hashCode();
        this.b.put(l2, object);
        object = fdh2.b;
        long l3 = fdh2.c;
        Context context = this.c;
        fdh2 = new Intent(context, DownloadActivity.class);
        fdh2.setFlags(0x10000000);
        fdh2.putExtra("com.google.recognition.extra.DISPLAY_NAME", (String)object);
        fdh2.putExtra("com.google.recognition.extra.DOWNLOAD_SIZE", l3);
        fdh2.putExtra("com.google.recognition.extra.REQUEST_ID", l2);
        gqk.m(context, (Intent)fdh2);
    }

    @Override
    public final void b(fdj hwv2, jnf jnf2) {
        ((hfk)((hfk)a.f()).j("com/google/android/libraries/speech/modelmanager/languagepack/ui/grpc/DownloadActivityStarterServiceImpl", "updateDownloadConfirmation", 49, "DownloadActivityStarterServiceImpl.java")).r("#updateDownloadConfirmation");
        Long l2 = hwv2.c;
        if (this.b.containsKey(l2)) {
            int n2;
            jnf jnf3 = Objects.requireNonNull((jnf)this.b.get(l2));
            hwp hwp2 = fdi.a.l();
            int n3 = n2 = a.t(hwv2.d);
            if (n2 == 0) {
                n3 = 1;
            }
            if (!hwp2.b.B()) {
                hwp2.u();
            }
            hwv2 = (fdi)hwp2.b;
            ((fdi)hwv2).c = n3 - 1;
            ((fdi)hwv2).b |= 1;
            jnf3.c((fdi)hwp2.o());
            Objects.requireNonNull((jnf)this.b.get(l2)).a();
            jnf2.c(fdk.a);
            jnf2.a();
            this.b.remove(l2);
            return;
        }
        jnf2.b(new Throwable("No matching request"));
    }
}

