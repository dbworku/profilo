// Copyright 2004-present Facebook. All Rights Reserved.

package com.facebook.loom.core;

import android.util.SparseArray;
import com.facebook.fbtrace.utils.FbTraceId;

final public class LoomConstants {

  // User configurable providers
  public static final int PROVIDER_ASYNC =           1;
  public static final int PROVIDER_LIFECYCLE =       1 << 1;
  public static final int PROVIDER_QPL =             1 << 2;
  public static final int PROVIDER_OTHER =           1 << 3;
  public static final int PROVIDER_USER_COUNTERS =   1 << 4;
  public static final int PROVIDER_SYSTEM_COUNTERS = 1 << 5;
  public static final int PROVIDER_STACK_FRAME =     1 << 6;
  public static final int PROVIDER_LIGER =           1 << 7;
  public static final int PROVIDER_MAJOR_FAULTS =    1 << 8;
  public static final int PROVIDER_THREAD_SCHEDULE = 1 << 9;
  public static final int PROVIDER_CLASS_LOAD =      1 << 10;
  public static final int PROVIDER_NATIVE_STACK_TRACE =    1 << 11;
  public static final int PROVIDER_JAVASCRIPT_STACK_TRACE =  1 << 12;
  public static final int PROVIDER_MAIN_THREAD_MESSAGES =  1 << 13;
  public static final int PROVIDER_LIGER_HTTP2 = 1 << 14;
  public static final int PROVIDER_FBSYSTRACE = 1 << 15;
  public static final int PROVIDER_HIGH_FREQ_MAIN_THREAD_COUNTERS = 1 << 16;
  public static final int PROVIDER_TRANSIENT_NETWORK_DATA = 1 << 17;
  public static final int PROVIDER_WALL_TIME_STACK_TRACE = 1 << 18;
  // Should your new provider be added to ManualTraceController#evaluateConfig ?

  // WARNING: Update PROVIDER_MAX whenever you add a provider!
  public static final int PROVIDER_MAX = PROVIDER_WALL_TIME_STACK_TRACE;
  // Bit mask of all configurable providers
  public static final int ALL_CONFIGURABLE_PROVIDERS = (PROVIDER_MAX << 1) - 1;  // 0x3F

  public static final int PROVIDER_LOOM_SYSTEM = 0xFFFFFFFF;

  public static final int TRIGGER_QPL =             1;
  public static final int TRIGGER_MANUAL =          1 << 1;
  public static final int TRIGGER_COLD_START =      1 << 2;
  public static final int TRIGGER_SEQUENCE_QPL =    1 << 3;
  public static final int TRIGGER_MULTI_PROCESS =   1 << 4;
  public static final int TRIGGER_EXTERNAL = 1 << 5;
  public static final int TRIGGER_BLACK_BOX = 1 << 6;

  public static final String PROVIDER_ASYNC_NAME = "async";
  public static final String PROVIDER_LIFECYCLE_NAME = "lifecycle";
  public static final String PROVIDER_QPL_NAME = "qpl";
  public static final String PROVIDER_OTHER_NAME = "other";
  public static final String PROVIDER_USER_COUNTERS_NAME = "user_counters";
  public static final String PROVIDER_SYSTEM_COUNTERS_NAME = "system_counters";
  public static final String PROVIDER_STACK_FRAME_NAME = "stack_trace";
  public static final String PROVIDER_LIGER_NAME = "liger";
  public static final String PROVIDER_MAJOR_FAULTS_NAME = "major_faults";
  public static final String PROVIDER_THREAD_SCHEDULE_NAME = "thread_schedule";
  public static final String PROVIDER_CLASS_LOAD_NAME = "class_load";
  public static final String PROVIDER_NATIVE_STACK_TRACE_NAME = "native_stack_trace";
  public static final String PROVIDER_JAVASCRIPT_STACK_TRACE_NAME = "javascript_stack_trace";
  public static final String PROVIDER_MAIN_THREAD_MESSAGES_NAME = "main_thread";
  public static final String PROVIDER_LIGER_HTTP2_NAME = "liger_http2";
  public static final String PROVIDER_FBSYSTRACE_NAME = "fbsystrace";
  public static final String PROVIDER_HIGH_FREQ_MAIN_THREAD_COUNTERS_NAME =
      "high_freq_main_thread_counters";
  public static final String PROVIDER_TRANSIENT_NETWORK_DATA_NAME = "transient_network_data";
  public static final String PROVIDER_WALL_TIME_STACK_TRACE_NAME = "wall_time_stack_trace";

  public static final int NO_TRACE = 0;
  public static final String ENCODED_NO_TRACE = FbTraceId.NULL_ID;

  public static final int NO_CALLSITE = 0;
  public static final int NO_MATCH = 0;
  public static final int TRACING_DISABLED = -1;

  public static final String STRING_KEY_BLOCK_NAME = "__name";

  /* Keep in sync with AbortReason.h */
  public static final int ABORT_REASON_UNKNOWN = 1;
  public static final int ABORT_REASON_CONTROLLER_INITIATED = 2;
  public static final int ABORT_REASON_MISSED_EVENT = 3;
  public static final int ABORT_REASON_TIMEOUT = 4;
  public static final int ABORT_REASON_NEW_START = 5;

  public static final SparseArray<String> DATA_PROVIDER_TO_NAME;
  static {
    SparseArray<String> array = new SparseArray<>();
    array.put(PROVIDER_ASYNC, PROVIDER_ASYNC_NAME);
    array.put(PROVIDER_LIFECYCLE, PROVIDER_LIFECYCLE_NAME);
    array.put(PROVIDER_QPL, PROVIDER_QPL_NAME);
    array.put(PROVIDER_OTHER, PROVIDER_OTHER_NAME);
    array.put(PROVIDER_USER_COUNTERS, PROVIDER_USER_COUNTERS_NAME);
    array.put(PROVIDER_SYSTEM_COUNTERS, PROVIDER_SYSTEM_COUNTERS_NAME);
    array.put(PROVIDER_STACK_FRAME, PROVIDER_STACK_FRAME_NAME);
    array.put(PROVIDER_LIGER, PROVIDER_LIGER_NAME);
    array.put(PROVIDER_MAJOR_FAULTS, PROVIDER_MAJOR_FAULTS_NAME);
    array.put(PROVIDER_THREAD_SCHEDULE, PROVIDER_THREAD_SCHEDULE_NAME);
    array.put(PROVIDER_CLASS_LOAD, PROVIDER_CLASS_LOAD_NAME);
    array.put(PROVIDER_NATIVE_STACK_TRACE, PROVIDER_NATIVE_STACK_TRACE_NAME);
    array.put(PROVIDER_JAVASCRIPT_STACK_TRACE, PROVIDER_JAVASCRIPT_STACK_TRACE_NAME);
    array.put(PROVIDER_MAIN_THREAD_MESSAGES, PROVIDER_MAIN_THREAD_MESSAGES_NAME);
    array.put(PROVIDER_LIGER_HTTP2, PROVIDER_LIGER_HTTP2_NAME);
    array.put(PROVIDER_FBSYSTRACE, PROVIDER_FBSYSTRACE_NAME);
    array.put(
        PROVIDER_HIGH_FREQ_MAIN_THREAD_COUNTERS, PROVIDER_HIGH_FREQ_MAIN_THREAD_COUNTERS_NAME);
    array.put(PROVIDER_TRANSIENT_NETWORK_DATA, PROVIDER_TRANSIENT_NETWORK_DATA_NAME);
    array.put(PROVIDER_WALL_TIME_STACK_TRACE, PROVIDER_WALL_TIME_STACK_TRACE_NAME);
    DATA_PROVIDER_TO_NAME = array;
  }
}