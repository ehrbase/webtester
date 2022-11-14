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
package org.ehrbase.jooq.pg.tables.records;

import org.ehrbase.jooq.pg.tables.AdminDeleteEhrFull;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Row1;
import org.jooq.impl.TableRecordImpl;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class AdminDeleteEhrFullRecord extends TableRecordImpl<AdminDeleteEhrFullRecord> implements Record1<Boolean> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>ehr.admin_delete_ehr_full.deleted</code>.
     */
    public void setDeleted(Boolean value) {
        set(0, value);
    }

    /**
     * Getter for <code>ehr.admin_delete_ehr_full.deleted</code>.
     */
    public Boolean getDeleted() {
        return (Boolean) get(0);
    }

    // -------------------------------------------------------------------------
    // Record1 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row1<Boolean> fieldsRow() {
        return (Row1) super.fieldsRow();
    }

    @Override
    public Row1<Boolean> valuesRow() {
        return (Row1) super.valuesRow();
    }

    @Override
    public Field<Boolean> field1() {
        return AdminDeleteEhrFull.ADMIN_DELETE_EHR_FULL.DELETED;
    }

    @Override
    public Boolean component1() {
        return getDeleted();
    }

    @Override
    public Boolean value1() {
        return getDeleted();
    }

    @Override
    public AdminDeleteEhrFullRecord value1(Boolean value) {
        setDeleted(value);
        return this;
    }

    @Override
    public AdminDeleteEhrFullRecord values(Boolean value1) {
        value1(value1);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AdminDeleteEhrFullRecord
     */
    public AdminDeleteEhrFullRecord() {
        super(AdminDeleteEhrFull.ADMIN_DELETE_EHR_FULL);
    }

    /**
     * Create a detached, initialised AdminDeleteEhrFullRecord
     */
    public AdminDeleteEhrFullRecord(Boolean deleted) {
        super(AdminDeleteEhrFull.ADMIN_DELETE_EHR_FULL);

        setDeleted(deleted);
    }
}
