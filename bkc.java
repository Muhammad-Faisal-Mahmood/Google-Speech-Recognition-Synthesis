/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.View
 */
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.android.car.ui.recyclerview.CarUiRecyclerView;

public interface bkc {
    public View createCarUiPreferenceView(Context var1, AttributeSet var2);

    public CarUiRecyclerView createRecyclerView(Context var1, AttributeSet var2);

    public bok createTextView(Context var1, AttributeSet var2);

    public bnq installBaseLayoutAround(Context var1, View var2, bju var3, boolean var4, boolean var5);
}

