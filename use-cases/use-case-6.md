# USE CASE: 6  Retrieve Top N Populated Countries in a Region

## CHARACTERISTIC INFORMATION

### Goal in Context

As a user, I want to retrieve the top N populated countries in a specific region, where N is provided by the user, so that I can analyze population distribution within that region.

### Scope

World Database.

### Level

Primary task.

### Preconditions

1. The database contains accurate population data for all countries.
2. The user specifies a valid region.
3. The user provides a valid value for N.

### Success End Condition

A list of the top N populated countries within the specified region, as provided by the user, is retrieved and available for analysis.

### Failed End Condition

No list of countries is retrieved.

### Primary Actor

User.

### Trigger

User initiates the request to retrieve the top N populated countries within a region.



## MAIN SUCCESS SCENARIO

1. User accesses the system to retrieve the top N populated countries within a region.
2. User specifies the region for which they want to retrieve the top N populated countries.
3. User provides the value of N, indicating the number of countries they want to retrieve.
4. System executes a query to retrieve the top N countries with the largest populations within the specified region from the database.
5. System organizes the retrieved data by population, arranging countries from largest to smallest.
6. System presents the list of the top N populated countries within the specified region to the user for analysis.

## EXTENSIONS

1. **Invalid Region:**:
    1. User provides an invalid region name.
    2. System displays an error message indicating the invalid input and prompts the user to provide a valid region.
2. **Invalid Input for N:**:
    1. User provides an invalid value for N (e.g., non-numeric value, negative number, zero).
    2. System displays an error message indicating the invalid input and prompts the user to provide a valid value for N.


## SUB-VARIATIONS

None.

## SCHEDULE

**DUE DATE**: Release 1.0