/*
 * Copyright (C) 2012 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.smartapps.staggeredview;

import android.annotation.TargetApi;
import android.os.Build;
import android.widget.Scroller;

/**
 * ICS API access for Scroller
 */
class ScrollerCompatIcs {
    @TargetApi(Build.VERSION_CODES.ICE_CREAM_SANDWICH)
	public static float getCurrVelocity(Scroller scroller) {
        return scroller.getCurrVelocity();
    }
} 
