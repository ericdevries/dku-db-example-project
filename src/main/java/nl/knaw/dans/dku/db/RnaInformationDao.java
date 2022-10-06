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

import nl.knaw.dans.dku.api.RnaInformation;

import java.util.List;

public class RnaInformationDao {
    public List<RnaInformation> findTop(int amount) {
        //        var q = this.query("from RnaInformation");
        //        q.setMaxResults(amount);
        //        q.setFirstResult(0);
        //
        //        return this.list(q);
        // TODO after fixing the DAO, uncomment the code above
        // and remove this return statement
        return List.of();
    }

    public RnaInformation save(RnaInformation info) {
        return null;
        // TODO after fixing the DAO, uncomment this
//        return super.persist(info):
    }
}
