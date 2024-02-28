# USE CASE: Retrieve Country Population Report by Continent

## CHARACTERISTIC INFORMATION

### Goal in Context

As a user I want to retrieve a report listing all countries within a continent, organized by population from largest to smallest, so that I can analyze population distributions across continents.

### Scope

Organization's demographic data.

### Level

Primary task.

### Preconditions

1. The user has access to the demographic data.
2. The database contains accurate population data for all countries.

### Success End Condition

A report is generated showing all countries within the specified continent, sorted by population from largest to smallest.

### Failed End Condition

No report is generated or the report is incomplete or inaccurate.

### Primary Actor

User interested in demographic trends.

### Trigger

The user requests a report on country populations by continent.

## MAIN SUCCESS SCENARIO

1. User requests a report listing countries by population within a specific continent.
2. System prompts the user to specify the continent.
3. User provides the name of the continent.
4. System retrieves population data for all countries within the specified continent.
5. System organizes the data, sorting countries by population from largest to smallest.
6. System generates and presents the report to the user.

## EXTENSIONS

1. **Continent not found**:
    1. System informs the user that the specified continent does not exist or is not available in the database.

## SUB-VARIATIONS

None.

## SCHEDULE

**DUE DATE**: Release 1.0
