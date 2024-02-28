# USE CASE: 3 Retrieve Country Population Report by Region

## CHARACTERISTIC INFORMATION

### Goal in Context

As a user I want to retrieve a report listing all countries within a specific region, organized by population from largest to smallest, so that I can analyze population distributions within regions.

### Scope

Organization's demographic data.

### Level

Primary task.

### Preconditions

1. The user has access to the demographic data.
2. The database contains accurate population data for all countries.

### Success End Condition

A report is generated showing all countries within the specified region, sorted by population from largest to smallest.

### Failed End Condition

No report is generated or the report is incomplete or inaccurate.

### Primary Actor

Researcher studying regional demographics.

### Trigger

The researcher requests a report on country populations by region.

## MAIN SUCCESS SCENARIO

1. Researcher requests a report listing countries by population within a specific region.
2. System prompts the researcher to specify the region.
3. Researcher provides the name of the region.
4. System retrieves population data for all countries within the specified region.
5. System organizes the data, sorting countries by population from largest to smallest.
6. System generates and presents the report to the researcher.

## EXTENSIONS

1. **Region not found**:
    1. System informs the researcher that the specified region does not exist or is not available in the database.

## SUB-VARIATIONS

None.

## SCHEDULE

**DUE DATE**: Release 1.0
