/*
 * Copyright (c) 2021. AxonIQ
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.axoniq.initializr.extension.dependency;

import io.spring.initializr.generator.project.contributor.ProjectContributor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * A {@link ProjectContributor} that creates the "db/migration" resources directory when Flyway is selected.
 *
 * @author Ivan Dugalic
 */
public class FlywayProjectContributor implements ProjectContributor {

    @Override
    public void contribute(Path projectRoot) throws IOException {
        Path migrationDirectory = projectRoot.resolve("src/main/resources/db/migration");
        Files.createDirectories(migrationDirectory);
    }
}
