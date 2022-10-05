/*
 * Copyright (C) 2022 DANS - Data Archiving and Networked Services (info@dans.knaw.nl)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package nl.knaw.dans.dku;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import io.dropwizard.views.ViewBundle;
import nl.knaw.dans.dku.db.RnaInformationDao;
import nl.knaw.dans.dku.resource.ExampleResource;

public class DkuExampleProjectApplication extends Application<DkuExampleProjectConfiguration> {

    public static void main(final String[] args) throws Exception {
        new DkuExampleProjectApplication().run(args);
    }

    @Override
    public String getName() {
        return "Dku Example Project";
    }

    @Override
    public void initialize(final Bootstrap<DkuExampleProjectConfiguration> bootstrap) {
        bootstrap.addBundle(new ViewBundle<>());
    }

    @Override
    public void run(final DkuExampleProjectConfiguration configuration, final Environment environment) {

        // TODO we want to insert the session factory here
        var dao = new RnaInformationDao();
        // TODO add dao to constructor here
        var api = new ExampleResource();
        environment.jersey().register(api);
    }

}
