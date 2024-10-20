/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources$Theme
 *  android.util.DisplayMetrics
 *  android.util.TypedValue
 *  android.view.ActionMode
 *  android.view.ActionMode$Callback
 *  android.view.KeyCharacterMap
 *  android.view.KeyEvent
 *  android.view.LayoutInflater
 *  android.view.Menu
 *  android.view.View
 *  android.view.Window$Callback
 *  android.widget.PopupWindow
 */
import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ViewStubCompat;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.widget.PopupWindow;
import java.util.List;

final class dy
extends ff {
    public boolean a;
    public boolean b;
    final eg c;
    private boolean e;

    public dy(eg eg2, Window.Callback callback) {
        this.c = eg2;
        super(callback);
    }

    public final void a(Window.Callback callback) {
        try {
            this.e = true;
            callback.onContentChanged();
            return;
        }
        finally {
            this.e = false;
        }
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.a) {
            return this.d.dispatchKeyEvent(keyEvent);
        }
        return this.c.H(keyEvent) || super.dispatchKeyEvent(keyEvent);
        {
        }
    }

    @Override
    public final boolean dispatchKeyShortcutEvent(KeyEvent object) {
        block5: {
            block8: {
                boolean bl2;
                Object object2;
                eg eg2;
                block7: {
                    block6: {
                        if (super.dispatchKeyShortcutEvent((KeyEvent)object)) break block5;
                        eg2 = this.c;
                        int n2 = object.getKeyCode();
                        object2 = eg2.b();
                        if (object2 == null || (object2 = ((eq)object2).f) == null) break block6;
                        int n3 = object != null ? object.getDeviceId() : -1;
                        bl2 = KeyCharacterMap.load((int)n3).getKeyboardType() != 1;
                        object2 = ((ep)object2).a;
                        object2.setQwertyMode(bl2);
                        if (object2.performShortcut(n2, object, 0)) break block5;
                    }
                    if ((object2 = eg2.D) == null || !eg2.O((ee)object2, object.getKeyCode(), (KeyEvent)object)) break block7;
                    object = eg2.D;
                    if (object != null) {
                        object.l = true;
                    }
                    break block5;
                }
                if (eg2.D != null) break block8;
                object2 = eg2.N(0);
                eg2.K((ee)object2, (KeyEvent)object);
                bl2 = eg2.O((ee)object2, object.getKeyCode(), (KeyEvent)object);
                ((ee)object2).k = false;
                if (bl2) break block5;
            }
            return false;
        }
        return true;
    }

    @Override
    public final void onContentChanged() {
        if (this.e) {
            this.d.onContentChanged();
        }
    }

    @Override
    public final boolean onCreatePanelMenu(int n2, Menu menu) {
        int n3 = n2;
        if (n2 == 0) {
            if (menu instanceof fs) {
                n3 = 0;
            } else {
                return false;
            }
        }
        return super.onCreatePanelMenu(n3, menu);
    }

    @Override
    public final boolean onMenuOpened(int n2, Menu object) {
        super.onMenuOpened(n2, (Menu)object);
        if (n2 == 108 && (object = this.c.b()) != null) {
            ((de)object).b(true);
        }
        return true;
    }

    @Override
    public final void onPanelClosed(int n2, Menu object) {
        if (this.b) {
            this.d.onPanelClosed(n2, object);
            return;
        }
        super.onPanelClosed(n2, (Menu)object);
        eg eg2 = this.c;
        if (n2 == 108) {
            object = eg2.b();
            if (object != null) {
                object.b(false);
                return;
            }
        } else if (n2 == 0) {
            object = eg2.N(0);
            if (object.m) {
                eg2.A((ee)object, false);
            }
        }
    }

    @Override
    public final boolean onPreparePanel(int n2, View view, Menu menu) {
        fs fs2 = menu instanceof fs ? (fs)menu : null;
        int n3 = n2;
        if (n2 == 0) {
            if (fs2 != null) {
                n3 = 0;
            } else {
                return false;
            }
        }
        if (fs2 != null) {
            fs2.j = true;
        }
        boolean bl2 = super.onPreparePanel(n3, view, menu);
        if (fs2 != null) {
            fs2.j = false;
        }
        return bl2;
    }

    @Override
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int n2) {
        fs fs2 = this.c.N((int)0).h;
        if (fs2 != null) {
            super.onProvideKeyboardShortcuts(list, fs2, n2);
            return;
        }
        super.onProvideKeyboardShortcuts(list, menu, n2);
    }

    @Override
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }

    @Override
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback object, int n2) {
        Object object2 = this.c;
        if (((eg)object2).u && n2 == 0) {
            eq eq2;
            object2 = new ey(((eg)object2).k, (ActionMode.Callback)object);
            eg eg2 = this.c;
            object = eg2.q;
            if (object != null) {
                object.f();
            }
            dx dx2 = new dx(eg2, (ev)object2);
            object = eg2.b();
            if (object != null) {
                eq2 = (eq)object;
                object = eq2.f;
                if (object != null) {
                    object.f();
                }
                eq2.b.k(false);
                eq2.d.i();
                object = new ep(eq2, eq2.d.getContext(), dx2);
                object.a.s();
                try {
                    boolean bl2 = object.b.c((ew)object, object.a);
                    if (bl2) {
                        eq2.f = object;
                        object.g();
                        eq2.d.h((ew)object);
                        eq2.i(true);
                    } else {
                        object = null;
                    }
                    eg2.q = object;
                    if (eg2.q != null && (object = eg2.m) != null) {
                        object.w();
                    }
                }
                finally {
                    object.a.r();
                }
            }
            if (eg2.q == null) {
                eg2.C();
                object = eg2.q;
                if (object != null) {
                    object.f();
                }
                if (eg2.r == null) {
                    if (eg2.B) {
                        eq2 = new TypedValue();
                        object = eg2.k.getTheme();
                        object.resolveAttribute(2130968588, (TypedValue)eq2, true);
                        if (((TypedValue)eq2).resourceId != 0) {
                            Resources.Theme theme = eg2.k.getResources().newTheme();
                            theme.setTo((Resources.Theme)object);
                            theme.applyStyle(((TypedValue)eq2).resourceId, true);
                            object = new nx(eg2.k, 0);
                            object.getTheme().setTo(theme);
                        } else {
                            object = eg2.k;
                        }
                        eg2.r = new ActionBarContextView((Context)object);
                        eg2.s = new PopupWindow((Context)object, null, 2130968605);
                        eg2.s.setWindowLayoutType(2);
                        eg2.s.setContentView((View)eg2.r);
                        eg2.s.setWidth(-1);
                        object.getTheme().resolveAttribute(2130968582, (TypedValue)eq2, true);
                        eg2.r.e = n2 = TypedValue.complexToDimensionPixelSize((int)((TypedValue)eq2).data, (DisplayMetrics)object.getResources().getDisplayMetrics());
                        eg2.s.setHeight(-2);
                        eg2.t = new ak(eg2, 12, null);
                    } else {
                        object = (ViewStubCompat)eg2.w.findViewById(2131427406);
                        if (object != null) {
                            object.a = LayoutInflater.from((Context)eg2.s());
                            eg2.r = (ActionBarContextView)object.a();
                        }
                    }
                }
                if (eg2.r != null) {
                    eg2.C();
                    eg2.r.i();
                    object = new ex(eg2.r.getContext(), eg2.r, dx2);
                    if (dx2.c((ew)object, object.a)) {
                        object.g();
                        eg2.r.h((ew)object);
                        eg2.q = object;
                        if (eg2.L()) {
                            eg2.r.setAlpha(0.0f);
                            object = wj.t((View)eg2.r);
                            object.V(1.0f);
                            eg2.M = object;
                            eg2.M.X(new dv(eg2));
                        } else {
                            eg2.r.setAlpha(1.0f);
                            eg2.r.setVisibility(0);
                            if (eg2.r.getParent() instanceof View) {
                                vy.d((View)eg2.r.getParent());
                            }
                        }
                        if (eg2.s != null) {
                            eg2.l.getDecorView().post(eg2.t);
                        }
                    } else {
                        eg2.q = null;
                    }
                }
                if (eg2.q != null && (object = eg2.m) != null) {
                    object.w();
                }
                eg2.G();
            }
            eg2.G();
            object = eg2.q;
            if (object != null) {
                return ((ey)object2).e((ew)object);
            }
            return null;
        }
        return super.onWindowStartingActionMode((ActionMode.Callback)object, n2);
    }
}

