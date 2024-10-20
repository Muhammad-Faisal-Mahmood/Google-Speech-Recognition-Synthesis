/*
 * Decompiled with CFR 0.152.
 */
public final class aat
implements abc {
    private final aas a;
    private final abc b;

    public aat(aas aas2, abc abc2) {
        jse.e(aas2, "defaultLifecycleObserver");
        this.a = aas2;
        this.b = abc2;
    }

    @Override
    public final void a(abe abe2, aaz aaz2) {
        switch (aaz2.ordinal()) {
            default: {
                break;
            }
            case 6: {
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
            }
            case 5: {
                this.a.onDestroy(abe2);
                break;
            }
            case 4: {
                this.a.onStop(abe2);
                break;
            }
            case 3: {
                this.a.onPause(abe2);
                break;
            }
            case 2: {
                this.a.onResume(abe2);
                break;
            }
            case 1: {
                this.a.onStart(abe2);
                break;
            }
            case 0: {
                this.a.onCreate(abe2);
            }
        }
        abc abc2 = this.b;
        if (abc2 != null) {
            abc2.a(abe2, aaz2);
        }
    }
}

