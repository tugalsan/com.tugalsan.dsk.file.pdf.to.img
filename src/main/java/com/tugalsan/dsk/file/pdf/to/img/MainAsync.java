package com.tugalsan.dsk.file.pdf.to.img;

import com.tugalsan.api.thread.server.async.run.TS_ThreadAsyncRun;
import .client.TGS_FuncMTUCE;
import com.tugalsan.api.function.client.maythrow.uncheckedexceptions.TGS_FuncMTUCE;
import com.tugalsan.api.function.client.maythrow.checkedexceptions.TGS_FuncMTCEUtils;
import com.tugalsan.api.thread.server.sync.TS_ThreadSyncTrigger;
import java.time.Duration;

public class MainAsync {

    final private static TS_ThreadSyncTrigger killTrigger  = TS_ThreadSyncTrigger.of(MainAsync.class.getSimpleName());
    final public static Duration RUN_SECONDS = Duration.ofSeconds(10);

    public static void run(TGS_FuncMTUCE exe) {
        run(exe, RUN_SECONDS);
    }

    public static void run(TGS_FuncMTUCE exe, Duration until) {
        TS_ThreadAsyncRun.now(killTrigger, kt -> {
//            var u = TS_ThreadAsyncAwait.runUntil(kt, until, kt2 -> {
//                MainLog.add("AWAIT.BEGIN...");
                TGS_FuncMTCEUtils.run(exe, e -> MainLog.add("ERROR: " + e.getMessage()));
//            });
//            if (u.timeout()) {
//                MainLog.add("AWAIT.ERROR: TIMEOUT");
//            } else if (u.hasError()) {
//                MainLog.add("AWAIT.ERROR: " + u.exceptionIfFailed.orElseThrow().getMessage());
//            } else {
//                MainLog.add("AWAIT.END");
//            }
        });
    }
}
