/*
 * Copyright 2011 the original author or authors.
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

package org.gradle.api.internal.artifacts.configurations.conflicts;

import org.gradle.api.artifacts.ConflictResolution;
import org.gradle.api.artifacts.DependencySet;

/**
 * Strict type, allows configuring (forcing) certain dependency versions using dependency notation
 * <p>
 * by Szczepan Faber, created at: 10/5/11
 */
public class StrictConflictResolution implements ConflictResolution {

    private final DependencySet forcedVersions;

    public StrictConflictResolution(DependencySet forcedVersions) {
        this.forcedVersions = forcedVersions;
    }

    public DependencySet getForcedVersions() {
        return forcedVersions;
    }
}
