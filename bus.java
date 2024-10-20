/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.RadioButton
 *  android.widget.TextView
 */
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

final class bus
extends lg {
    public final TextView a;
    public final RadioButton b;
    public final LinearLayout c;
    public final ImageView d;

    public bus(View view, TextView textView, RadioButton radioButton, LinearLayout linearLayout, ImageView imageView) {
        super(view);
        this.a = textView;
        this.b = radioButton;
        this.c = linearLayout;
        this.d = imageView;
    }
}

