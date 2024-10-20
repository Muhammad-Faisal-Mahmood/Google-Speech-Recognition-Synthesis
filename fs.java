/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.PackageManager
 *  android.content.pm.ResolveInfo
 *  android.content.res.Resources
 *  android.graphics.drawable.Drawable
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.util.SparseArray
 *  android.view.KeyCharacterMap$KeyData
 *  android.view.KeyEvent
 *  android.view.MenuItem
 *  android.view.SubMenu
 *  android.view.View
 *  android.view.ViewConfiguration
 */
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class fs
implements tr {
    private static final int[] k = new int[]{1, 4, 5, 3, 2, 0};
    public final Context a;
    public fq b;
    public final ArrayList c;
    public final ArrayList d;
    CharSequence e;
    Drawable f;
    View g;
    public boolean h;
    public fu i;
    public boolean j;
    private final Resources l;
    private boolean m;
    private final boolean n;
    private final ArrayList o;
    private boolean p;
    private final ArrayList q;
    private boolean r;
    private int s;
    private boolean t;
    private boolean u;
    private boolean v;
    private final ArrayList w;
    private final CopyOnWriteArrayList x;
    private boolean y;

    /*
     * Enabled aggressive block sorting
     */
    public fs(Context context) {
        boolean bl2;
        block2: {
            block4: {
                boolean bl3;
                block3: {
                    Resources resources;
                    bl3 = false;
                    this.s = 0;
                    this.h = false;
                    this.t = false;
                    this.u = false;
                    this.v = false;
                    this.w = new ArrayList();
                    this.x = new CopyOnWriteArrayList();
                    this.y = false;
                    this.a = context;
                    this.l = resources = context.getResources();
                    this.c = new ArrayList();
                    this.o = new ArrayList();
                    this.p = true;
                    this.d = new ArrayList();
                    this.q = new ArrayList();
                    this.r = true;
                    bl2 = bl3;
                    if (resources.getConfiguration().keyboard == 1) break block2;
                    resources = ViewConfiguration.get((Context)context);
                    if (Build.VERSION.SDK_INT < 28) break block3;
                    bl2 = bl3;
                    if (!fs$$ExternalSyntheticApiModelOutline0.m((ViewConfiguration)resources)) break block2;
                    break block4;
                }
                context = context.getResources();
                int n2 = vy.f((Resources)context, "config_showMenuShortcutsWhenKeyboardPresent", "bool");
                bl2 = bl3;
                if (n2 == 0) break block2;
                bl2 = bl3;
                if (!context.getBoolean(n2)) break block2;
            }
            bl2 = true;
        }
        this.n = bl2;
    }

    private final void E(int n2, boolean bl2) {
        if (n2 >= 0 && n2 < this.c.size()) {
            this.c.remove(n2);
            if (bl2) {
                this.l(true);
            }
        }
    }

    public final boolean A(MenuItem object, ge object2, int n2) {
        block12: {
            block17: {
                boolean bl2;
                block14: {
                    boolean bl3;
                    boolean bl4;
                    Object object3;
                    boolean bl5;
                    block15: {
                        block16: {
                            block13: {
                                if ((object = (fu)object) == null || !object.isEnabled()) break block12;
                                bl5 = object.n();
                                object3 = object.p;
                                bl4 = object3 != null && ((a)object3).T();
                                if (!object.m()) break block13;
                                bl2 = bl5 | object.expandActionView();
                                if (bl2) {
                                    this.i(true);
                                    return true;
                                }
                                break block14;
                            }
                            if (object.hasSubMenu() || bl4) break block15;
                            if ((n2 & 1) == 0) break block16;
                            bl2 = bl5;
                            break block14;
                        }
                        this.i(true);
                        return bl5;
                    }
                    if ((n2 & 4) == 0) {
                        this.i(false);
                    }
                    if (!object.hasSubMenu()) {
                        object.l(new gl(this.a, this, (fu)object));
                    }
                    object = object.k;
                    if (bl4) {
                        ((a)object3).S((SubMenu)object);
                    }
                    if (this.x.isEmpty()) {
                        bl3 = false;
                    } else {
                        bl2 = object2 != null ? object2.f((gl)object) : false;
                        object2 = this.x.iterator();
                        while (true) {
                            bl3 = bl2;
                            if (!object2.hasNext()) break;
                            WeakReference weakReference = (WeakReference)object2.next();
                            object3 = (ge)weakReference.get();
                            if (object3 == null) {
                                this.x.remove(weakReference);
                                continue;
                            }
                            if (bl2) continue;
                            bl2 = object3.f((gl)object);
                        }
                    }
                    bl2 = bl5 | bl3;
                    if (!bl2) break block17;
                }
                return bl2;
            }
            this.i(true);
        }
        return false;
    }

    final void B() {
        this.r = true;
        this.l(true);
    }

    final void C() {
        this.p = true;
        this.l(true);
    }

    public final void D() {
        this.s = 1;
    }

    public fs a() {
        return this;
    }

    public final MenuItem add(int n2) {
        return this.c(0, 0, 0, this.l.getString(n2));
    }

    public final MenuItem add(int n2, int n3, int n4, int n5) {
        return this.c(n2, n3, n4, this.l.getString(n5));
    }

    public final MenuItem add(int n2, int n3, int n4, CharSequence charSequence) {
        return this.c(n2, n3, n4, charSequence);
    }

    public final MenuItem add(CharSequence charSequence) {
        return this.c(0, 0, 0, charSequence);
    }

    public final int addIntentOptions(int n2, int n3, int n4, ComponentName componentName, Intent[] intentArray, Intent intent, int n5, MenuItem[] menuItemArray) {
        PackageManager packageManager = this.a.getPackageManager();
        int n6 = 0;
        List list = packageManager.queryIntentActivityOptions(componentName, intentArray, intent, 0);
        int n7 = list != null ? list.size() : 0;
        int n8 = n6;
        if ((n5 & 1) == 0) {
            this.removeGroup(n2);
            n8 = n6;
        }
        while (n8 < n7) {
            ResolveInfo resolveInfo = (ResolveInfo)list.get(n8);
            componentName = resolveInfo.specificIndex < 0 ? intent : intentArray[resolveInfo.specificIndex];
            componentName = new Intent((Intent)componentName);
            componentName.setComponent(new ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name));
            MenuItem menuItem = this.c(n2, n3, n4, resolveInfo.loadLabel(packageManager));
            menuItem.setIcon(resolveInfo.loadIcon(packageManager));
            ((fu)menuItem).e = componentName;
            if (menuItemArray != null && resolveInfo.specificIndex >= 0) {
                menuItemArray[resolveInfo.specificIndex] = menuItem;
            }
            ++n8;
        }
        return n7;
    }

    public final SubMenu addSubMenu(int n2) {
        return this.addSubMenu(0, 0, 0, this.l.getString(n2));
    }

    public final SubMenu addSubMenu(int n2, int n3, int n4, int n5) {
        return this.addSubMenu(n2, n3, n4, this.l.getString(n5));
    }

    public final SubMenu addSubMenu(int n2, int n3, int n4, CharSequence object) {
        object = (fu)this.c(n2, n3, n4, (CharSequence)object);
        gl gl2 = new gl(this.a, this, (fu)object);
        ((fu)object).l(gl2);
        return gl2;
    }

    public final SubMenu addSubMenu(CharSequence charSequence) {
        return this.addSubMenu(0, 0, 0, charSequence);
    }

    final fu b(int n2, KeyEvent object) {
        ArrayList arrayList = this.w;
        arrayList.clear();
        this.j(arrayList, n2, (KeyEvent)object);
        if (arrayList.isEmpty()) {
            return null;
        }
        int n3 = object.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        object.getKeyData(keyData);
        int n4 = arrayList.size();
        if (n4 == 1) {
            return (fu)arrayList.get(0);
        }
        boolean bl2 = this.x();
        for (int i2 = 0; i2 < n4; ++i2) {
            object = (fu)arrayList.get(i2);
            char c2 = bl2 ? object.h : object.f;
            if (!(c2 == keyData.meta[0] && (n3 & 2) == 0 || c2 == keyData.meta[2] && (n3 & 2) != 0 || bl2 && c2 == '\b' && n2 == 67)) continue;
            return object;
        }
        return null;
    }

    protected final MenuItem c(int n2, int n3, int n4, CharSequence object) {
        int n5 = n4 >> 16;
        if (n5 >= 0 && n5 < 6) {
            fu fu2;
            block2: {
                n5 = k[n5];
                char c2 = (char)n4;
                int n6 = this.s;
                n5 = n5 << 16 | c2;
                fu2 = new fu(this, n2, n3, n4, n5, (CharSequence)object, n6);
                object = this.c;
                n2 = ((ArrayList)object).size();
                while ((n3 = n2 - 1) >= 0) {
                    n2 = n3;
                    if (((fu)((ArrayList)object).get((int)n3)).c > n5) continue;
                    n2 = n3 + 1;
                    break block2;
                }
                n2 = 0;
            }
            ((ArrayList)object).add(n2, fu2);
            this.l(true);
            return fu2;
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    public final void clear() {
        fu fu2 = this.i;
        if (fu2 != null) {
            this.t(fu2);
        }
        this.c.clear();
        this.l(true);
    }

    public final void clearHeader() {
        this.f = null;
        this.e = null;
        this.g = null;
        this.l(false);
    }

    public final void close() {
        this.i(true);
    }

    protected String d() {
        return "android:menu:actionviewstates";
    }

    public final ArrayList e() {
        this.k();
        return this.q;
    }

    public final ArrayList f() {
        if (!this.p) {
            return this.o;
        }
        this.o.clear();
        int n2 = this.c.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            fu fu2 = (fu)this.c.get(i2);
            if (!fu2.isVisible()) continue;
            this.o.add(fu2);
        }
        this.p = false;
        this.r = true;
        return this.o;
    }

    public final MenuItem findItem(int n2) {
        int n3 = this.size();
        for (int i2 = 0; i2 < n3; ++i2) {
            fu fu2 = (fu)this.c.get(i2);
            if (fu2.a == n2) {
                return fu2;
            }
            if (!fu2.hasSubMenu() || (fu2 = fu2.k.findItem(n2)) == null) continue;
            return fu2;
        }
        return null;
    }

    public final void g(ge ge2) {
        this.h(ge2, this.a);
    }

    public final MenuItem getItem(int n2) {
        return (MenuItem)this.c.get(n2);
    }

    public final void h(ge ge2, Context context) {
        WeakReference<ge> weakReference = new WeakReference<ge>(ge2);
        this.x.add(weakReference);
        ge2.b(context, this);
        this.r = true;
    }

    public final boolean hasVisibleItems() {
        if (this.j) {
            return true;
        }
        int n2 = this.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            if (!((fu)this.c.get(i2)).isVisible()) continue;
            return true;
        }
        return false;
    }

    public final void i(boolean bl2) {
        if (this.v) {
            return;
        }
        this.v = true;
        for (WeakReference weakReference : this.x) {
            ge ge2 = (ge)weakReference.get();
            if (ge2 == null) {
                this.x.remove(weakReference);
                continue;
            }
            ge2.c(this, bl2);
        }
        this.v = false;
    }

    public final boolean isShortcutKey(int n2, KeyEvent keyEvent) {
        return this.b(n2, keyEvent) != null;
    }

    final void j(List list, int n2, KeyEvent keyEvent) {
        block6: {
            int n3;
            KeyCharacterMap.KeyData keyData;
            int n4;
            boolean bl2;
            block5: {
                bl2 = this.x();
                n4 = keyEvent.getModifiers();
                keyData = new KeyCharacterMap.KeyData();
                n3 = n2;
                if (keyEvent.getKeyData(keyData)) break block5;
                if (n2 != 67) break block6;
                n3 = 67;
            }
            int n5 = this.c.size();
            for (n2 = 0; n2 < n5; ++n2) {
                fu fu2 = (fu)this.c.get(n2);
                if (fu2.hasSubMenu()) {
                    fu2.k.j(list, n3, keyEvent);
                }
                char c2 = bl2 ? fu2.h : fu2.f;
                int n6 = bl2 ? fu2.i : fu2.g;
                if ((n4 & 0x1100F) != (n6 & 0x1100F) || c2 == '\u0000' || c2 != keyData.meta[0] && c2 != keyData.meta[2] && (!bl2 || c2 != '\b' || n3 != 67) || !fu2.isEnabled()) continue;
                list.add(fu2);
            }
        }
    }

    public final void k() {
        ArrayList arrayList = this.f();
        if (!this.r) {
            return;
        }
        Object object = this.x.iterator();
        int n2 = 0;
        while (object.hasNext()) {
            WeakReference weakReference = (WeakReference)object.next();
            ge ge2 = (ge)weakReference.get();
            if (ge2 == null) {
                this.x.remove(weakReference);
                continue;
            }
            n2 |= ge2.e();
        }
        if (n2 != 0) {
            this.d.clear();
            this.q.clear();
            int n3 = arrayList.size();
            for (n2 = 0; n2 < n3; ++n2) {
                object = (fu)arrayList.get(n2);
                if (((fu)object).o()) {
                    this.d.add(object);
                    continue;
                }
                this.q.add(object);
            }
        } else {
            this.d.clear();
            this.q.clear();
            this.q.addAll(this.f());
        }
        this.r = false;
    }

    public final void l(boolean bl2) {
        if (!this.h) {
            if (bl2) {
                this.p = true;
                this.r = true;
            }
            if (!this.x.isEmpty()) {
                this.s();
                for (WeakReference weakReference : this.x) {
                    ge ge2 = (ge)weakReference.get();
                    if (ge2 == null) {
                        this.x.remove(weakReference);
                        continue;
                    }
                    ge2.i();
                }
                this.r();
                return;
            }
        } else {
            this.t = true;
            if (bl2) {
                this.u = true;
            }
        }
    }

    public final void m(ge ge2) {
        for (WeakReference weakReference : this.x) {
            ge ge3 = (ge)weakReference.get();
            if (ge3 != null && ge3 != ge2) continue;
            this.x.remove(weakReference);
        }
    }

    public final void n(Bundle bundle) {
        int n2;
        SparseArray sparseArray = bundle.getSparseParcelableArray(this.d());
        int n3 = this.size();
        for (n2 = 0; n2 < n3; ++n2) {
            MenuItem menuItem = this.getItem(n2);
            View view = menuItem.getActionView();
            if (view != null && view.getId() != -1) {
                view.restoreHierarchyState(sparseArray);
            }
            if (!menuItem.hasSubMenu()) continue;
            ((gl)menuItem.getSubMenu()).n(bundle);
        }
        n2 = bundle.getInt("android:menu:expandedactionview");
        if (n2 > 0 && (bundle = this.findItem(n2)) != null) {
            bundle.expandActionView();
        }
    }

    public final void o(Bundle bundle) {
        int n2 = this.size();
        SparseArray sparseArray = null;
        for (int i2 = 0; i2 < n2; ++i2) {
            MenuItem menuItem = this.getItem(i2);
            View view = menuItem.getActionView();
            SparseArray sparseArray2 = sparseArray;
            if (view != null) {
                sparseArray2 = sparseArray;
                if (view.getId() != -1) {
                    SparseArray sparseArray3 = sparseArray;
                    if (sparseArray == null) {
                        sparseArray3 = new SparseArray();
                    }
                    view.saveHierarchyState(sparseArray3);
                    sparseArray2 = sparseArray3;
                    if (menuItem.isActionViewExpanded()) {
                        bundle.putInt("android:menu:expandedactionview", menuItem.getItemId());
                        sparseArray2 = sparseArray3;
                    }
                }
            }
            if (menuItem.hasSubMenu()) {
                ((gl)menuItem.getSubMenu()).o(bundle);
            }
            sparseArray = sparseArray2;
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(this.d(), sparseArray);
        }
    }

    public void p(fq fq2) {
        this.b = fq2;
    }

    public final boolean performIdentifierAction(int n2, int n3) {
        return this.z(this.findItem(n2), n3);
    }

    public final boolean performShortcut(int n2, KeyEvent object, int n3) {
        boolean bl2 = (object = this.b(n2, (KeyEvent)object)) != null ? this.z((MenuItem)object, n3) : false;
        if ((n3 & 2) != 0) {
            this.i(true);
        }
        return bl2;
    }

    public final void q(int n2, CharSequence charSequence, int n3, Drawable drawable, View view) {
        if (view != null) {
            this.g = view;
            this.e = null;
            this.f = null;
        } else {
            if (n2 > 0) {
                this.e = this.l.getText(n2);
            } else if (charSequence != null) {
                this.e = charSequence;
            }
            if (n3 > 0) {
                this.f = this.a.getDrawable(n3);
            } else if (drawable != null) {
                this.f = drawable;
            }
            this.g = null;
        }
        this.l(false);
    }

    public final void r() {
        this.h = false;
        if (this.t) {
            this.t = false;
            this.l(this.u);
        }
    }

    public final void removeGroup(int n2) {
        int n3;
        int n4;
        block4: {
            n4 = this.size();
            for (n3 = 0; n3 < n4; ++n3) {
                if (((fu)this.c.get((int)n3)).b != n2) {
                    continue;
                }
                break block4;
            }
            n3 = -1;
        }
        if (n3 >= 0) {
            int n5 = this.c.size();
            for (n4 = 0; n4 < n5 - n3 && ((fu)this.c.get((int)n3)).b == n2; ++n4) {
                this.E(n3, false);
            }
            this.l(true);
        }
    }

    public final void removeItem(int n2) {
        int n3;
        block2: {
            int n4 = this.size();
            for (n3 = 0; n3 < n4; ++n3) {
                if (((fu)this.c.get((int)n3)).a != n2) {
                    continue;
                }
                break block2;
            }
            n3 = -1;
        }
        this.E(n3, true);
    }

    public final void s() {
        if (!this.h) {
            this.h = true;
            this.t = false;
            this.u = false;
        }
    }

    public final void setGroupCheckable(int n2, boolean bl2, boolean bl3) {
        int n3 = this.c.size();
        for (int i2 = 0; i2 < n3; ++i2) {
            fu fu2 = (fu)this.c.get(i2);
            if (fu2.b != n2) continue;
            fu2.j(bl3);
            fu2.setCheckable(bl2);
        }
    }

    public void setGroupDividerEnabled(boolean bl2) {
        this.y = bl2;
    }

    public final void setGroupEnabled(int n2, boolean bl2) {
        int n3 = this.c.size();
        for (int i2 = 0; i2 < n3; ++i2) {
            fu fu2 = (fu)this.c.get(i2);
            if (fu2.b != n2) continue;
            fu2.setEnabled(bl2);
        }
    }

    public final void setGroupVisible(int n2, boolean bl2) {
        int n3 = this.c.size();
        boolean bl3 = false;
        for (int i2 = 0; i2 < n3; ++i2) {
            fu fu2 = (fu)this.c.get(i2);
            boolean bl4 = bl3;
            if (fu2.b == n2) {
                bl4 = bl3;
                if (fu2.s(bl2)) {
                    bl4 = true;
                }
            }
            bl3 = bl4;
        }
        if (bl3) {
            this.l(true);
        }
    }

    public void setQwertyMode(boolean bl2) {
        this.m = bl2;
        this.l(false);
    }

    public final int size() {
        return this.c.size();
    }

    public boolean t(fu fu2) {
        boolean bl2 = this.x.isEmpty();
        boolean bl3 = false;
        boolean bl4 = false;
        boolean bl5 = bl3;
        if (!bl2) {
            if (this.i != fu2) {
                bl5 = bl3;
            } else {
                this.s();
                Iterator iterator = this.x.iterator();
                bl5 = bl4;
                while (true) {
                    bl4 = bl5;
                    if (!iterator.hasNext()) break;
                    WeakReference weakReference = (WeakReference)iterator.next();
                    ge ge2 = (ge)weakReference.get();
                    if (ge2 == null) {
                        this.x.remove(weakReference);
                        continue;
                    }
                    bl5 = bl4 = ge2.g(fu2);
                    if (bl4) break;
                }
                this.r();
                bl5 = bl4;
                if (bl4) {
                    this.i = null;
                    bl5 = bl4;
                }
            }
        }
        return bl5;
    }

    public boolean u(fs fs2, MenuItem menuItem) {
        fq fq2 = this.b;
        return fq2 != null && fq2.J(fs2, menuItem);
    }

    public boolean v(fu fu2) {
        boolean bl2 = this.x.isEmpty();
        boolean bl3 = false;
        if (bl2) {
            return false;
        }
        this.s();
        Iterator iterator = this.x.iterator();
        while (true) {
            bl2 = bl3;
            if (!iterator.hasNext()) break;
            WeakReference weakReference = (WeakReference)iterator.next();
            ge ge2 = (ge)weakReference.get();
            if (ge2 == null) {
                this.x.remove(weakReference);
                continue;
            }
            bl3 = bl2 = ge2.h(fu2);
            if (bl2) break;
        }
        this.r();
        if (bl2) {
            this.i = fu2;
        }
        return bl2;
    }

    public boolean w() {
        return this.y;
    }

    public boolean x() {
        return this.m;
    }

    public boolean y() {
        return this.n;
    }

    public final boolean z(MenuItem menuItem, int n2) {
        return this.A(menuItem, null, n2);
    }
}

