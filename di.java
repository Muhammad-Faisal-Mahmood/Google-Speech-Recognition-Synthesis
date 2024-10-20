/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.DialogInterface$OnClickListener
 *  android.content.DialogInterface$OnKeyListener
 *  android.content.DialogInterface$OnMultiChoiceClickListener
 *  android.graphics.drawable.Drawable
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.widget.ListAdapter
 */
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListAdapter;

public final class di {
    public final Context a;
    public final LayoutInflater b;
    public Drawable c;
    public CharSequence d;
    public View e;
    public CharSequence f;
    public CharSequence g;
    public DialogInterface.OnClickListener h;
    public CharSequence i;
    public DialogInterface.OnClickListener j;
    public CharSequence k;
    public DialogInterface.OnClickListener l;
    public boolean m;
    public DialogInterface.OnKeyListener n;
    public CharSequence[] o;
    public ListAdapter p;
    public DialogInterface.OnClickListener q;
    public View r;
    public boolean[] s;
    public boolean t;
    public boolean u;
    public int v = -1;
    public DialogInterface.OnMultiChoiceClickListener w;

    public di(Context context) {
        this.a = context;
        this.m = true;
        this.b = (LayoutInflater)context.getSystemService("layout_inflater");
    }
}

