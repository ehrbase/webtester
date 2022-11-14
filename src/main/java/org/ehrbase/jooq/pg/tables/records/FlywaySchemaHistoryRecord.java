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

import java.sql.Timestamp;
import org.ehrbase.jooq.pg.tables.FlywaySchemaHistory;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class FlywaySchemaHistoryRecord extends UpdatableRecordImpl<FlywaySchemaHistoryRecord>
        implements Record10<Integer, String, String, String, String, Integer, String, Timestamp, Integer, Boolean> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>ehr.flyway_schema_history.installed_rank</code>.
     */
    public void setInstalledRank(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>ehr.flyway_schema_history.installed_rank</code>.
     */
    public Integer getInstalledRank() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>ehr.flyway_schema_history.version</code>.
     */
    public void setVersion(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>ehr.flyway_schema_history.version</code>.
     */
    public String getVersion() {
        return (String) get(1);
    }

    /**
     * Setter for <code>ehr.flyway_schema_history.description</code>.
     */
    public void setDescription(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>ehr.flyway_schema_history.description</code>.
     */
    public String getDescription() {
        return (String) get(2);
    }

    /**
     * Setter for <code>ehr.flyway_schema_history.type</code>.
     */
    public void setType(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>ehr.flyway_schema_history.type</code>.
     */
    public String getType() {
        return (String) get(3);
    }

    /**
     * Setter for <code>ehr.flyway_schema_history.script</code>.
     */
    public void setScript(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>ehr.flyway_schema_history.script</code>.
     */
    public String getScript() {
        return (String) get(4);
    }

    /**
     * Setter for <code>ehr.flyway_schema_history.checksum</code>.
     */
    public void setChecksum(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>ehr.flyway_schema_history.checksum</code>.
     */
    public Integer getChecksum() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>ehr.flyway_schema_history.installed_by</code>.
     */
    public void setInstalledBy(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>ehr.flyway_schema_history.installed_by</code>.
     */
    public String getInstalledBy() {
        return (String) get(6);
    }

    /**
     * Setter for <code>ehr.flyway_schema_history.installed_on</code>.
     */
    public void setInstalledOn(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>ehr.flyway_schema_history.installed_on</code>.
     */
    public Timestamp getInstalledOn() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>ehr.flyway_schema_history.execution_time</code>.
     */
    public void setExecutionTime(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>ehr.flyway_schema_history.execution_time</code>.
     */
    public Integer getExecutionTime() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>ehr.flyway_schema_history.success</code>.
     */
    public void setSuccess(Boolean value) {
        set(9, value);
    }

    /**
     * Getter for <code>ehr.flyway_schema_history.success</code>.
     */
    public Boolean getSuccess() {
        return (Boolean) get(9);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row10<Integer, String, String, String, String, Integer, String, Timestamp, Integer, Boolean> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    @Override
    public Row10<Integer, String, String, String, String, Integer, String, Timestamp, Integer, Boolean> valuesRow() {
        return (Row10) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.INSTALLED_RANK;
    }

    @Override
    public Field<String> field2() {
        return FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.VERSION;
    }

    @Override
    public Field<String> field3() {
        return FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.DESCRIPTION;
    }

    @Override
    public Field<String> field4() {
        return FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.TYPE;
    }

    @Override
    public Field<String> field5() {
        return FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.SCRIPT;
    }

    @Override
    public Field<Integer> field6() {
        return FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.CHECKSUM;
    }

    @Override
    public Field<String> field7() {
        return FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.INSTALLED_BY;
    }

    @Override
    public Field<Timestamp> field8() {
        return FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.INSTALLED_ON;
    }

    @Override
    public Field<Integer> field9() {
        return FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.EXECUTION_TIME;
    }

    @Override
    public Field<Boolean> field10() {
        return FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.SUCCESS;
    }

    @Override
    public Integer component1() {
        return getInstalledRank();
    }

    @Override
    public String component2() {
        return getVersion();
    }

    @Override
    public String component3() {
        return getDescription();
    }

    @Override
    public String component4() {
        return getType();
    }

    @Override
    public String component5() {
        return getScript();
    }

    @Override
    public Integer component6() {
        return getChecksum();
    }

    @Override
    public String component7() {
        return getInstalledBy();
    }

    @Override
    public Timestamp component8() {
        return getInstalledOn();
    }

    @Override
    public Integer component9() {
        return getExecutionTime();
    }

    @Override
    public Boolean component10() {
        return getSuccess();
    }

    @Override
    public Integer value1() {
        return getInstalledRank();
    }

    @Override
    public String value2() {
        return getVersion();
    }

    @Override
    public String value3() {
        return getDescription();
    }

    @Override
    public String value4() {
        return getType();
    }

    @Override
    public String value5() {
        return getScript();
    }

    @Override
    public Integer value6() {
        return getChecksum();
    }

    @Override
    public String value7() {
        return getInstalledBy();
    }

    @Override
    public Timestamp value8() {
        return getInstalledOn();
    }

    @Override
    public Integer value9() {
        return getExecutionTime();
    }

    @Override
    public Boolean value10() {
        return getSuccess();
    }

    @Override
    public FlywaySchemaHistoryRecord value1(Integer value) {
        setInstalledRank(value);
        return this;
    }

    @Override
    public FlywaySchemaHistoryRecord value2(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public FlywaySchemaHistoryRecord value3(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public FlywaySchemaHistoryRecord value4(String value) {
        setType(value);
        return this;
    }

    @Override
    public FlywaySchemaHistoryRecord value5(String value) {
        setScript(value);
        return this;
    }

    @Override
    public FlywaySchemaHistoryRecord value6(Integer value) {
        setChecksum(value);
        return this;
    }

    @Override
    public FlywaySchemaHistoryRecord value7(String value) {
        setInstalledBy(value);
        return this;
    }

    @Override
    public FlywaySchemaHistoryRecord value8(Timestamp value) {
        setInstalledOn(value);
        return this;
    }

    @Override
    public FlywaySchemaHistoryRecord value9(Integer value) {
        setExecutionTime(value);
        return this;
    }

    @Override
    public FlywaySchemaHistoryRecord value10(Boolean value) {
        setSuccess(value);
        return this;
    }

    @Override
    public FlywaySchemaHistoryRecord values(
            Integer value1,
            String value2,
            String value3,
            String value4,
            String value5,
            Integer value6,
            String value7,
            Timestamp value8,
            Integer value9,
            Boolean value10) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FlywaySchemaHistoryRecord
     */
    public FlywaySchemaHistoryRecord() {
        super(FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY);
    }

    /**
     * Create a detached, initialised FlywaySchemaHistoryRecord
     */
    public FlywaySchemaHistoryRecord(
            Integer installedRank,
            String version,
            String description,
            String type,
            String script,
            Integer checksum,
            String installedBy,
            Timestamp installedOn,
            Integer executionTime,
            Boolean success) {
        super(FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY);

        setInstalledRank(installedRank);
        setVersion(version);
        setDescription(description);
        setType(type);
        setScript(script);
        setChecksum(checksum);
        setInstalledBy(installedBy);
        setInstalledOn(installedOn);
        setExecutionTime(executionTime);
        setSuccess(success);
    }
}
