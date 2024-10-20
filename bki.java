/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.os.Build$VERSION
 *  android.util.AttributeSet
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnApplyWindowInsetsListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.WindowManager$LayoutParams
 *  android.widget.FrameLayout
 *  android.widget.FrameLayout$LayoutParams
 */
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.android.car.ui.recyclerview.CarUiRecyclerView;

public final class bki
implements bkc {
    @Override
    public final View createCarUiPreferenceView(Context context, AttributeSet attributeSet) {
        return blf.d(context, attributeSet);
    }

    @Override
    public final CarUiRecyclerView createRecyclerView(Context context, AttributeSet attributeSet) {
        return new blp(context, attributeSet);
    }

    @Override
    public final bok createTextView(Context context, AttributeSet attributeSet) {
        return new bol(context, attributeSet);
    }

    @Override
    public final bnq installBaseLayoutAround(Context context, View view, bju bju2, boolean bl2, boolean bl3) {
        int n2 = Build.VERSION.SDK_INT;
        bl3 = true;
        boolean bl4 = n2 <= 29;
        n2 = bl2 ? (bl4 ? (!view.getResources().getBoolean(2131034135) ? 2131623971 : 2131623972) : 2131623970) : 2131623969;
        LayoutInflater layoutInflater = LayoutInflater.from((Context)context);
        bnu bnu2 = null;
        layoutInflater = layoutInflater.inflate(n2, null, false);
        ViewGroup viewGroup = (ViewGroup)view.getParent();
        n2 = viewGroup.indexOfChild(view);
        viewGroup.removeView(view);
        viewGroup.addView((View)layoutInflater, n2, view.getLayoutParams());
        ((FrameLayout)bnv.i((View)layoutInflater, 2131427467)).addView(view, (ViewGroup.LayoutParams)new FrameLayout.LayoutParams(-1, -1));
        if (bl2) {
            bnu2 = bl4 ? new bnu(context, bnv.i((View)layoutInflater, 2131427515)) : new bnu(context, (View)layoutInflater);
        }
        if (Build.VERSION.SDK_INT >= 32 && (viewGroup = bnv.f(context)) instanceof Activity) {
            viewGroup = ((Activity)viewGroup).getWindow();
            WindowManager.LayoutParams layoutParams = viewGroup.getAttributes();
            bl2 = context.getResources().getBoolean(2131034124) && fs$$ExternalSyntheticApiModelOutline0.m(layoutParams) == 3 ? bl3 : false;
            if (bl2 && Build.VERSION.SDK_INT < 35) {
                viewGroup.getDecorView().setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener)new bke(0));
            } else if (Build.VERSION.SDK_INT >= 35) {
                layoutInflater.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener)new bkf(bl2));
            }
        }
        new bkh((View)layoutInflater, (View)view).g = bju2;
        return bnu2;
    }
}

