/*
 * Copyright (c) 2022 vitasystems GmbH and Hannover Medical School.
 *
 * This file is part of project EHRbase
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.ehrbase.jooq.pg.routines;

import java.util.UUID;
import org.ehrbase.jooq.pg.Ehr;
import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class FolderUid extends AbstractRoutine<String> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter <code>ehr.folder_uid.RETURN_VALUE</code>.
     */
    public static final Parameter<String> RETURN_VALUE =
            Internal.createParameter("RETURN_VALUE", SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>ehr.folder_uid.folder_uid</code>.
     */
    public static final Parameter<UUID> FOLDER_UID =
            Internal.createParameter("folder_uid", SQLDataType.UUID, false, false);

    /**
     * The parameter <code>ehr.folder_uid.server_id</code>.
     */
    public static final Parameter<String> SERVER_ID =
            Internal.createParameter("server_id", SQLDataType.CLOB, false, false);

    /**
     * Create a new routine call instance
     */
    public FolderUid() {
        super("folder_uid", Ehr.EHR, SQLDataType.CLOB);

        setReturnParameter(RETURN_VALUE);
        addInParameter(FOLDER_UID);
        addInParameter(SERVER_ID);
    }

    /**
     * Set the <code>folder_uid</code> parameter IN value to the routine
     */
    public void setFolderUid(UUID value) {
        setValue(FOLDER_UID, value);
    }

    /**
     * Set the <code>folder_uid</code> parameter to the function to be used with
     * a {@link org.jooq.Select} statement
     */
    public void setFolderUid(Field<UUID> field) {
        setField(FOLDER_UID, field);
    }

    /**
     * Set the <code>server_id</code> parameter IN value to the routine
     */
    public void setServerId(String value) {
        setValue(SERVER_ID, value);
    }

    /**
     * Set the <code>server_id</code> parameter to the function to be used with
     * a {@link org.jooq.Select} statement
     */
    public void setServerId(Field<String> field) {
        setField(SERVER_ID, field);
    }
}
