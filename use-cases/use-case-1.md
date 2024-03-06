# USE CASE: 1 Retrieve Countries Organized by Population

## CHARACTERISTIC INFORMATION

### Goal in Context

As a user, I want to retrieve a list of all countries in the world organized by their population, from largest to smallest, so that I can analyze population distribution globally.
### Scope

World Database.

### Level

Primary task.

### Preconditions

The database contains accurate population data for all countries.

### Success End Condition

A list of countries organized by their population, from largest to smallest, is retrieved and available for analysis.

### Failed End Condition

No list of countries is retrieved.

### Primary Actor

User.

### Trigger

User initiates the request to retrieve a list of countries organized by population.


## MAIN SUCCESS SCENARIO

1. User accesses the system to retrieve a list of countries organized by population.
2. System executes a query to retrieve all countries from the database along with their population data.
3. System organizes the retrieved data by population, arranging countries from largest to smallest.
4. System presents the organized list of countries to the user for analysis.

## EXTENSIONS

1. **No Population Data Available**:
    1. System display there is no population data available.

## SUB-VARIATIONS

None.

## SCHEDULE

**DUE DATE**: Release 1.0