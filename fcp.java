/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.google.protobuf.contrib.android.ProtoParsers$InternalDontUse;
import j$.util.Optional;

public final class fcp
implements View.OnClickListener {
    public final fcq a;
    public final huw b;

    public /* synthetic */ fcp(fcq fcq2, huw huw2) {
        this.a = fcq2;
        this.b = huw2;
    }

    public final void onClick(View object) {
        ((heg)((heg)fct.a.f()).j("com/google/android/libraries/speech/modelmanager/languagepack/legacy/DownloadDialogFragmentPeer$1", "onNewData", 121, "DownloadDialogFragmentPeer.java")).r("Download button pressed");
        object = this.a;
        Object object2 = object.a.g;
        Object object3 = this.b;
        object2 = bzb.H(((fbt)object2).d(((huw)object3).d, ((huw)object3).f, Optional.empty(), false));
        object3 = new bzb(new ProtoParsers$InternalDontUse(null, (hyf)object3));
        object = object.a;
        object.e.d((bzb)object2, (bzb)object3, object.q);
    }
}

