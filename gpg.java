/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.PopupMenu
 *  android.widget.PopupMenu$OnMenuItemClickListener
 */
import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import com.google.android.apps.speech.tts.googletts.local.voicepack.ui.MultipleVoicesActivity;

public final class gpg
implements View.OnClickListener {
    public final Object a;
    public final Object b;
    public final Object c;
    private final int d;

    public /* synthetic */ gpg(MultipleVoicesActivity multipleVoicesActivity, Context context, izk izk2, int n2) {
        this.d = n2;
        this.a = multipleVoicesActivity;
        this.c = context;
        this.b = izk2;
    }

    public /* synthetic */ gpg(gpm gpm2, String string, View.OnClickListener onClickListener, int n2) {
        this.d = n2;
        this.a = gpm2;
        this.b = string;
        this.c = onClickListener;
    }

    public final void onClick(View view) {
        if (this.d != 0) {
            Context context = (Context)this.c;
            view = new PopupMenu(context, view);
            view.getMenuInflater().inflate(2131755009, view.getMenu());
            MenuItem menuItem = view.getMenu().getItem(0);
            izk izk2 = (izk)this.b;
            menuItem.setVisible(izk2.g());
            view.getMenu().getItem(1).setVisible(izk2.f());
            view.setOnMenuItemClickListener((PopupMenu.OnMenuItemClickListener)new buu((MultipleVoicesActivity)this.a, izk2, context));
            view.show();
            return;
        }
        Object object = this.b;
        object = ((gpm)this.a).d((String)object);
        Object object2 = this.c;
        try {
            object2.onClick(view);
            return;
        }
        finally {
            object.close();
        }
    }
}

