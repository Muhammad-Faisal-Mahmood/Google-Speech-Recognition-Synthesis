/*
 * Decompiled with CFR 0.152.
 */
public final class grd
implements aas {
    private final aas a;

    public grd(aas aas2) {
        fxf.B(true, "Yo dawg.");
        this.a = aas2;
    }

    @Override
    public final void onCreate(abe abe2) {
        gno.h();
        try {
            this.a.onCreate(abe2);
            return;
        }
        finally {
            gno.l();
        }
    }

    @Override
    public final void onDestroy(abe abe2) {
        gno.h();
        try {
            this.a.onDestroy(abe2);
            return;
        }
        finally {
            gno.l();
        }
    }

    @Override
    public final void onPause(abe abe2) {
        gno.h();
        try {
            wc.f(abe2);
            return;
        }
        finally {
            gno.l();
        }
    }

    @Override
    public final void onResume(abe abe2) {
        gno.h();
        try {
            wc.g(abe2);
            return;
        }
        finally {
            gno.l();
        }
    }

    @Override
    public final void onStart(abe abe2) {
        gno.h();
        try {
            this.a.onStart(abe2);
            return;
        }
        finally {
            gno.l();
        }
    }

    @Override
    public final void onStop(abe abe2) {
        gno.h();
        try {
            this.a.onStop(abe2);
            return;
        }
        finally {
            gno.l();
        }
    }
}

