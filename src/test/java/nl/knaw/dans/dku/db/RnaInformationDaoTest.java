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

package nl.knaw.dans.dku.db;

import io.dropwizard.testing.junit5.DAOTestExtension;
import io.dropwizard.testing.junit5.DropwizardExtensionsSupport;
import nl.knaw.dans.dku.api.RnaInformation;
import nl.knaw.dans.dku.db.RnaInformationDao;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(DropwizardExtensionsSupport.class)
class RnaInformationDaoTest {
    public DAOTestExtension database = DAOTestExtension.newBuilder().addEntityClass(RnaInformation.class).build();
    private RnaInformationDao rnaInformationDao;

    @BeforeEach
    void setUp() {
        rnaInformationDao = new RnaInformationDao(/*database.getSessionFactory()*/);
    }

    @Test
    void findTopQuery() {
        database.inTransaction(() -> {
            for (int i = 0; i < 10; ++i) {
                rnaInformationDao.save(new RnaInformation("id" + i, "description " + i));
            }
        });

        assertThat(rnaInformationDao.findTop(3)).extracting("id").containsOnly("id0", "id1", "id2");
    }
}