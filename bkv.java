/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.view.View
 *  android.widget.SeekBar
 *  android.widget.TextView
 */
import android.content.DialogInterface;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import com.android.car.ui.preference.CarUiSeekBarDialogPreference;

public final class bkv
extends bkr {
    @Override
    protected final void B(View view) {
        super.B(view);
        CarUiSeekBarDialogPreference carUiSeekBarDialogPreference = (CarUiSeekBarDialogPreference)this.F();
        carUiSeekBarDialogPreference.b = (SeekBar)bnv.h(view, 2131427859);
        carUiSeekBarDialogPreference.c = (TextView)bnv.h(view, 2131427862);
        carUiSeekBarDialogPreference.d = (TextView)bnv.h(view, 2131427860);
        carUiSeekBarDialogPreference.e = (TextView)bnv.h(view, 2131427861);
        int n2 = carUiSeekBarDialogPreference.a;
        view = carUiSeekBarDialogPreference.b;
        if (view != null) {
            view.setProgress(n2);
        }
        carUiSeekBarDialogPreference.a = n2;
        view = carUiSeekBarDialogPreference.c;
        if (view != null) {
            view.setVisibility(0);
        }
        if ((view = carUiSeekBarDialogPreference.c) != null) {
            view.setText(null);
        }
        if ((view = carUiSeekBarDialogPreference.d) != null) {
            view.setVisibility(0);
        }
        if ((view = carUiSeekBarDialogPreference.d) != null) {
            view.setText(null);
        }
        if ((view = carUiSeekBarDialogPreference.e) != null) {
            view.setVisibility(0);
        }
        if ((view = carUiSeekBarDialogPreference.e) != null) {
            view.setText(null);
        }
        n2 = carUiSeekBarDialogPreference.f;
        view = carUiSeekBarDialogPreference.b;
        if (view != null) {
            view.setMax(n2);
        }
        carUiSeekBarDialogPreference.f = n2;
        view = carUiSeekBarDialogPreference.b;
        if (view != null) {
            view.setOnSeekBarChangeListener(null);
        }
    }

    @Override
    protected final void C(boolean bl2) {
        CarUiSeekBarDialogPreference carUiSeekBarDialogPreference = (CarUiSeekBarDialogPreference)this.F();
        if (bl2) {
            int n2;
            carUiSeekBarDialogPreference.a = n2 = carUiSeekBarDialogPreference.b.getProgress();
            carUiSeekBarDialogPreference.persistInt(n2);
            carUiSeekBarDialogPreference.notifyChanged();
        }
        carUiSeekBarDialogPreference.c = null;
        carUiSeekBarDialogPreference.e = null;
        carUiSeekBarDialogPreference.d = null;
        carUiSeekBarDialogPreference.b = null;
    }

    @Override
    protected final void E() {
        CarUiSeekBarDialogPreference carUiSeekBarDialogPreference = (CarUiSeekBarDialogPreference)this.F();
    }

    @Override
    public final void onClick(DialogInterface object, int n2) {
        this.am = n2;
        object = (CarUiSeekBarDialogPreference)this.F();
    }
}

