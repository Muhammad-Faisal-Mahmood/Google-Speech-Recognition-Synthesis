/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.SystemClock
 *  android.view.KeyEvent
 *  android.view.MenuItem
 *  android.view.MotionEvent
 *  android.view.View
 *  android.widget.HeaderViewListAdapter
 */
import android.content.Context;
import android.os.SystemClock;
import android.support.v7.view.menu.ListMenuItemView;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HeaderViewListAdapter;

public final class jy
extends jc {
    final int c;
    final int d;
    public jx e;
    private MenuItem f;

    public jy(Context context, boolean bl2) {
        super(context, bl2);
        int n2 = context.getResources().getConfiguration().getLayoutDirection();
        int n3 = 21;
        int n4 = n2 == 1 ? 21 : 22;
        this.c = n4;
        n4 = n3;
        if (n2 == 1) {
            n4 = 22;
        }
        this.d = n4;
    }

    @Override
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        if (this.e != null) {
            Object object;
            int n2;
            Object object2 = this.getAdapter();
            boolean bl2 = object2 instanceof HeaderViewListAdapter;
            int n3 = 0;
            if (bl2) {
                object2 = (HeaderViewListAdapter)object2;
                n2 = object2.getHeadersCount();
                object = (fp)object2.getWrappedAdapter();
            } else {
                object = (fp)((Object)object2);
                n2 = 0;
            }
            int n4 = motionEvent.getAction();
            Object var10_8 = null;
            object2 = n4 != 10 && (n4 = this.pointToPosition((int)motionEvent.getX(), (int)motionEvent.getY())) != -1 && (n2 = n4 - n2) >= 0 && n2 < ((fp)((Object)object)).getCount() ? ((fp)((Object)object)).a(n2) : null;
            Object object3 = this.f;
            if (object3 != object2) {
                fs fs2 = ((fp)((Object)object)).a;
                if (object3 != null && (object = ((jz)this.e).b) != null) {
                    ((fl)object).a.a.removeCallbacksAndMessages((Object)fs2);
                }
                this.f = object2;
                if (object2 != null && (object = ((jz)this.e).b) != null) {
                    block10: {
                        object3 = (fl)object;
                        object3.a.a.removeCallbacksAndMessages(null);
                        n4 = object3.a.b.size();
                        for (n2 = n3; n2 < n4; ++n2) {
                            if (fs2 != ((dvy)object3.a.b.get((int)n2)).c) {
                                continue;
                            }
                            break block10;
                        }
                        n2 = -1;
                    }
                    if (n2 != -1) {
                        object = var10_8;
                        if (++n2 < object3.a.b.size()) {
                            object = (dvy)object3.a.b.get(n2);
                        }
                        object2 = new ww((fl)object3, (dvy)object, (MenuItem)object2, fs2, 1);
                        long l2 = SystemClock.uptimeMillis();
                        object3.a.a.postAtTime((Runnable)object2, (Object)fs2, l2 + 200L);
                    }
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    public final boolean onKeyDown(int n2, KeyEvent object) {
        ListMenuItemView listMenuItemView = (ListMenuItemView)this.getSelectedView();
        if (listMenuItemView != null && n2 == this.c) {
            if (listMenuItemView.isEnabled() && listMenuItemView.a.hasSubMenu()) {
                this.performItemClick((View)listMenuItemView, this.getSelectedItemPosition(), this.getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView != null && n2 == this.d) {
            this.setSelection(-1);
            object = this.getAdapter();
            object = object instanceof HeaderViewListAdapter ? (fp)((HeaderViewListAdapter)object).getWrappedAdapter() : (fp)((Object)object);
            object.a.i(false);
            return true;
        }
        return super.onKeyDown(n2, object);
    }
}

