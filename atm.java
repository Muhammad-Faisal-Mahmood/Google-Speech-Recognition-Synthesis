/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.ColorStateList
 *  android.graphics.drawable.Drawable
 *  android.util.SparseArray
 *  android.view.View
 *  android.widget.TextView
 */
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;

public final class atm
extends lg {
    public final Drawable a;
    public ColorStateList b;
    public boolean c;
    public boolean d;
    private final SparseArray e;

    public atm(View view) {
        super(view);
        SparseArray sparseArray;
        this.e = sparseArray = new SparseArray(4);
        TextView textView = (TextView)view.findViewById(16908310);
        sparseArray.put(16908310, (Object)textView);
        sparseArray.put(0x1020010, (Object)view.findViewById(0x1020010));
        sparseArray.put(16908294, (Object)view.findViewById(16908294));
        sparseArray.put(2131427682, (Object)view.findViewById(2131427682));
        sparseArray.put(16908350, (Object)view.findViewById(16908350));
        this.a = view.getBackground();
        if (textView != null) {
            this.b = textView.getTextColors();
        }
    }

    public final View a(int n2) {
        View view = (View)this.e.get(n2);
        if (view != null) {
            return view;
        }
        view = this.itemView.findViewById(n2);
        if (view != null) {
            this.e.put(n2, (Object)view);
        }
        return view;
    }
}

