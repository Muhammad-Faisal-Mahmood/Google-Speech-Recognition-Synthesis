/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 */
import android.content.DialogInterface;
import com.google.android.libraries.speech.modelmanager.languagepack.ui.DownloadActivity;
import com.google.protobuf.contrib.android.ProtoParsers$InternalDontUse;

public final class fco
implements DialogInterface.OnClickListener {
    public final Object a;
    private final int b;

    public fco(asi asi2, int n2) {
        this.b = n2;
        this.a = asi2;
    }

    public /* synthetic */ fco(Object object, int n2) {
        this.b = n2;
        this.a = object;
    }

    public final void onClick(DialogInterface object, int n2) {
        int n3 = this.b;
        if (n3 != 0) {
            if (n3 != 1) {
                if (n3 != 2) {
                    if (n3 != 3) {
                        ((heg)((heg)fda.ag.c()).j("com/google/android/libraries/speech/modelmanager/languagepack/ui/DownloadDialogFragment", "onCreateDialog", 63, "DownloadDialogFragment.java")).r("Cancel button pressed");
                        ((DownloadActivity)((fda)this.a).ah).D();
                        return;
                    }
                    ((heg)((heg)fda.ag.c()).j("com/google/android/libraries/speech/modelmanager/languagepack/ui/DownloadDialogFragment", "onCreateDialog", 56, "DownloadDialogFragment.java")).r("Download button pressed");
                    object = (DownloadActivity)((fda)this.a).ah;
                    ((heg)((heg)DownloadActivity.k.f()).j("com/google/android/libraries/speech/modelmanager/languagepack/ui/DownloadActivity", "onDownloadClicked", 80, "DownloadActivity.java")).r("#onDownloadClicked");
                    hyg hyg2 = fdj.a.l();
                    long l2 = object.m;
                    if (!hyg2.b.B()) {
                        hyg2.u();
                    }
                    hwv hwv2 = hyg2.b;
                    Object object2 = (fdj)hwv2;
                    ((fdj)object2).b |= 1;
                    ((fdj)object2).c = l2;
                    if (!hwv2.B()) {
                        hyg2.u();
                    }
                    object2 = (fdj)hyg2.b;
                    ((fdj)object2).d = 1;
                    ((fdj)object2).b |= 2;
                    hyg2 = (fdj)hyg2.o();
                    object2 = fxf.aj(object.n.b((fdj)hyg2), new dti(19), object.l);
                    object.p.T(new cxt(object2), object.o, new ProtoParsers$InternalDontUse(null, (hyf)hyg2));
                    return;
                }
                ((heg)((heg)fct.a.f()).j("com/google/android/libraries/speech/modelmanager/languagepack/legacy/DownloadDialogFragmentPeer", "onCreateDialog", 289, "DownloadDialogFragmentPeer.java")).r("Cancel button pressed");
                object = (fct)this.a;
                if (object.k && object.s.q(object.n).isPresent()) {
                    ((fbz)object.s.q(object.n).get()).d(6);
                    object.s.r(object.n);
                }
                object.h.a(dxv.an.c(2));
                object.b.finish();
                return;
            }
            Object object3 = this.a;
            ((asi)object3).ag = n2;
            ((ast)object3).onClick((DialogInterface)object, -1);
            object.dismiss();
            return;
        }
        fct fct2 = (fct)this.a;
        if (fct2.k) {
            fch fch2 = fct2.j;
            object = fct2.n;
            fch2.a((String)object, fct2.s.p((String)object).a, fct2.s.p(fct2.n), fct2.s.q(fct2.n), false);
            fct2.s.r(fct2.n);
            fct2.b();
        }
    }
}

