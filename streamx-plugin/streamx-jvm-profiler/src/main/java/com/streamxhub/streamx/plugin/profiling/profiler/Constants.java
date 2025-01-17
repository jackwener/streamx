/*
 * Copyright 2019 The StreamX Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.streamxhub.streamx.plugin.profiling.profiler;

/**
 * @author benjobs
 */
public class Constants {
    public static final long DEFAULT_METRIC_INTERVAL = 60000;

    public static final int MAX_STRING_LENGTH = 800000;

    public static final String EXECUTOR_ROLE = "executor";
    public static final String DRIVER_ROLE = "driver";
}
