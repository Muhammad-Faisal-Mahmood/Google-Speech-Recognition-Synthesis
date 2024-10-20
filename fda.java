/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Dialog
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.os.Bundle
 *  android.text.format.Formatter
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 */
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.format.Formatter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.speech.modelmanager.languagepack.ui.DownloadActivity;

public final class fda
extends at {
    public static final hei ag = hei.m("com/google/android/libraries/speech/modelmanager/languagepack/ui/DownloadDialogFragment");
    public Activity ah;
    private String ai;
    private long aj;

    @Override
    public final Dialog a(Bundle object) {
        object = new fva((Context)this.ah);
        ((fva)object).k(this.ah.getString(2132017267, new Object[]{this.ai}));
        Activity activity = this.ah;
        ((fva)object).h(activity.getString(2132017265, new Object[]{Formatter.formatFileSize((Context)activity, (long)this.aj)}));
        ((fva)object).j(new fco(this, 3));
        ((fva)object).i(new fco(this, 4));
        object = ((dm)object).b();
        object.setCanceledOnTouchOutside(true);
        return object;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        ((heg)((heg)ag.c()).j("com/google/android/libraries/speech/modelmanager/languagepack/ui/DownloadDialogFragment", "onCancel", 81, "DownloadDialogFragment.java")).r("#onCancel");
        ((DownloadActivity)this.ah).D();
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.ah = this.requireActivity();
        bundle = this.l;
        if (bundle == null) {
            ((heg)((heg)ag.g()).j("com/google/android/libraries/speech/modelmanager/languagepack/ui/DownloadDialogFragment", "onCreate", 38, "DownloadDialogFragment.java")).r("Missing arguments");
            this.ah.finish();
            return;
        }
        this.ai = bundle.getString("com.google.recognition.extra.DISPLAY_NAME", "");
        this.aj = bundle.getLong("com.google.recognition.extra.DOWNLOAD_SIZE", 0L);
    }

    @Override
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ((heg)((heg)ag.c()).j("com/google/android/libraries/speech/modelmanager/languagepack/ui/DownloadDialogFragment", "onCreateView", 75, "DownloadDialogFragment.java")).r("#onCreateView");
        return layoutInflater.inflate(2131624048, viewGroup, false);
    }
}

