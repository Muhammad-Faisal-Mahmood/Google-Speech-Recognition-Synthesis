/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

public final class dwp
implements Callable {
    private final int a;

    public /* synthetic */ dwp(int n2) {
        this.a = n2;
    }

    public final Object call() {
        switch (this.a) {
            default: {
                return null;
            }
            case 9: {
                ((heg)((heg)glx.a.f()).j("com/google/apps/tiktok/sync/impl/workmanager/SyncWorkManagerPeriodicScheduler", "scheduleNextSyncSystemWakeup", 103, "SyncWorkManagerPeriodicScheduler.java")).r("Successfully scheduled next periodic workers");
                return null;
            }
            case 8: {
                ((heg)((heg)glv.a.f()).j("com/google/apps/tiktok/sync/impl/workmanager/SyncWorkManagerOneTimeScheduler", "scheduleNextSyncSystemWakeup", 101, "SyncWorkManagerOneTimeScheduler.java")).r("Successfully scheduled next onetime workers");
                return null;
            }
            case 7: {
                return new bbe();
            }
            case 6: {
                return new bbe();
            }
            case 4: {
                return true;
            }
            case 3: {
                ((hfk)((hfk)fbj.a.f()).j("com/google/android/libraries/speech/modeldownload/languagepacks/zipfile/ZipfileLanguagePackPopulator", "addNewFileGroups", 157, "ZipfileLanguagePackPopulator.java")).r("#addNewFileGroups complete");
                return null;
            }
            case 2: 
        }
        hei hei2 = dxm.a;
        return null;
    }
}

