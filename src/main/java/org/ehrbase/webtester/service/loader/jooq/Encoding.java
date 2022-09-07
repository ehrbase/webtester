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
package org.ehrbase.webtester.service.loader.jooq;

import org.ehrbase.jooq.pg.Ehr;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row2;
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
public class Encoding extends TableImpl<EncodingRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>ehr.encoding</code>
     */
    public static final Encoding ENCODING = new Encoding();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EncodingRecord> getRecordType() {
        return EncodingRecord.class;
    }

    /**
     * The column <code>ehr.encoding.path</code>.
     */
    public final TableField<EncodingRecord, String> PATH =
            createField(DSL.name("path"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>ehr.encoding.code</code>.
     */
    public final TableField<EncodingRecord, Long> CODE =
            createField(DSL.name("code"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    private Encoding(Name alias, Table<EncodingRecord> aliased) {
        this(alias, aliased, null);
    }

    private Encoding(Name alias, Table<EncodingRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>ehr.encoding</code> table reference
     */
    public Encoding(String alias) {
        this(DSL.name(alias), ENCODING);
    }

    /**
     * Create an aliased <code>ehr.encoding</code> table reference
     */
    public Encoding(Name alias) {
        this(alias, ENCODING);
    }

    /**
     * Create a <code>ehr.encoding</code> table reference
     */
    public Encoding() {
        this(DSL.name("encoding"), null);
    }

    public <O extends Record> Encoding(Table<O> child, ForeignKey<O, EncodingRecord> key) {
        super(child, key, ENCODING);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Ehr.EHR;
    }

    @Override
    public Identity<EncodingRecord, Long> getIdentity() {
        return (Identity<EncodingRecord, Long>) super.getIdentity();
    }

    @Override
    public Encoding as(String alias) {
        return new Encoding(DSL.name(alias), this);
    }

    @Override
    public Encoding as(Name alias) {
        return new Encoding(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Encoding rename(String name) {
        return new Encoding(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Encoding rename(Name name) {
        return new Encoding(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<String, Long> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}
