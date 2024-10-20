/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Fragment
 *  android.content.Intent
 *  android.os.Bundle
 */
import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.WeakHashMap;

public final class cee
extends Fragment
implements ced {
    public static final WeakHashMap a = new WeakHashMap();
    private final cef b = new cef();

    @Override
    public final Activity a() {
        return this.getActivity();
    }

    @Override
    public final void b(cec cec2) {
        this.b.h(cec2);
    }

    @Override
    public final cec c(Class clazz) {
        return this.b.j(clazz);
    }

    public final void dump(String string, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] stringArray) {
        super.dump(string, fileDescriptor, printWriter, stringArray);
        this.b.i();
    }

    public final void onActivityResult(int n2, int n3, Intent intent) {
        super.onActivityResult(n2, n3, intent);
        this.b.a(n2, n3, intent);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.b.b(bundle);
    }

    public final void onDestroy() {
        super.onDestroy();
        this.b.c();
    }

    public final void onResume() {
        super.onResume();
        this.b.d();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.b.e(bundle);
    }

    public final void onStart() {
        super.onStart();
        this.b.f();
    }

    public final void onStop() {
        super.onStop();
        this.b.g();
    }
}

