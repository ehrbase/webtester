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
package org.ehrbase.jooq.pg.tables;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.ehrbase.jooq.pg.Indexes;
import org.ehrbase.jooq.pg.Keys;
import org.ehrbase.jooq.pg.tables.records.CompoXrefRecord;
import org.ehrbase.jooq.pg.Ehr;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row3;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class CompoXref extends TableImpl<CompoXrefRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>ehr.compo_xref</code>
     */
    public static final CompoXref COMPO_XREF = new CompoXref();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CompoXrefRecord> getRecordType() {
        return CompoXrefRecord.class;
    }

    /**
     * The column <code>ehr.compo_xref.master_uuid</code>.
     */
    public final TableField<CompoXrefRecord, UUID> MASTER_UUID =
            createField(DSL.name("master_uuid"), SQLDataType.UUID, this, "");

    /**
     * The column <code>ehr.compo_xref.child_uuid</code>.
     */
    public final TableField<CompoXrefRecord, UUID> CHILD_UUID =
            createField(DSL.name("child_uuid"), SQLDataType.UUID, this, "");

    /**
     * The column <code>ehr.compo_xref.sys_transaction</code>.
     */
    public final TableField<CompoXrefRecord, Timestamp> SYS_TRANSACTION =
            createField(DSL.name("sys_transaction"), SQLDataType.TIMESTAMP(6).nullable(false), this, "");

    private CompoXref(Name alias, Table<CompoXrefRecord> aliased) {
        this(alias, aliased, null);
    }

    private CompoXref(Name alias, Table<CompoXrefRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>ehr.compo_xref</code> table reference
     */
    public CompoXref(String alias) {
        this(DSL.name(alias), COMPO_XREF);
    }

    /**
     * Create an aliased <code>ehr.compo_xref</code> table reference
     */
    public CompoXref(Name alias) {
        this(alias, COMPO_XREF);
    }

    /**
     * Create a <code>ehr.compo_xref</code> table reference
     */
    public CompoXref() {
        this(DSL.name("compo_xref"), null);
    }

    public <O extends Record> CompoXref(Table<O> child, ForeignKey<O, CompoXrefRecord> key) {
        super(child, key, COMPO_XREF);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Ehr.EHR;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.COMPO_XREF_CHILD_IDX, Indexes.EHR_COMPO_XREF);
    }

    @Override
    public List<ForeignKey<CompoXrefRecord, ?>> getReferences() {
        return Arrays.asList(Keys.COMPO_XREF__COMPO_XREF_MASTER_UUID_FKEY, Keys.COMPO_XREF__COMPO_XREF_CHILD_UUID_FKEY);
    }

    private transient Composition _compoXrefMasterUuidFkey;
    private transient Composition _compoXrefChildUuidFkey;

    /**
     * Get the implicit join path to the <code>ehr.composition</code> table, via
     * the <code>compo_xref_master_uuid_fkey</code> key.
     */
    public Composition compoXrefMasterUuidFkey() {
        if (_compoXrefMasterUuidFkey == null)
            _compoXrefMasterUuidFkey = new Composition(this, Keys.COMPO_XREF__COMPO_XREF_MASTER_UUID_FKEY);

        return _compoXrefMasterUuidFkey;
    }

    /**
     * Get the implicit join path to the <code>ehr.composition</code> table, via
     * the <code>compo_xref_child_uuid_fkey</code> key.
     */
    public Composition compoXrefChildUuidFkey() {
        if (_compoXrefChildUuidFkey == null)
            _compoXrefChildUuidFkey = new Composition(this, Keys.COMPO_XREF__COMPO_XREF_CHILD_UUID_FKEY);

        return _compoXrefChildUuidFkey;
    }

    @Override
    public CompoXref as(String alias) {
        return new CompoXref(DSL.name(alias), this);
    }

    @Override
    public CompoXref as(Name alias) {
        return new CompoXref(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CompoXref rename(String name) {
        return new CompoXref(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CompoXref rename(Name name) {
        return new CompoXref(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<UUID, UUID, Timestamp> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}
