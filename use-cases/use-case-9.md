# USE CASE: 9  Retrieve Cities in a Region Organized by Population

## CHARACTERISTIC INFORMATION

### Goal in Context

As a user, I want to retrieve a list of all cities in a specific region organized by their population, from largest to smallest, so that I can analyze urban population distribution within that region.

### Scope

World Database.

### Level

Primary task.

### Preconditions

1. The database contains accurate population data for all cities.
2. The user specifies a valid region.
3. The user has access to the World Database.

### Success End Condition

The database contains accurate population data for all cities. The user specifies a valid region. The user has access to the World Database.

### Failed End Condition

No list of cities is retrieved.

### Primary Actor

User.

### Trigger

User initiates the request to retrieve a list of cities organized by population within a region.


## MAIN SUCCESS SCENARIO

1. User accesses the system to retrieve a list of cities within a region organized by population.
2. User specifies the region for which they want to retrieve the list of cities.
3. System executes a query to retrieve all cities within the specified region from the database along with their population data.
4. System organizes the retrieved data by population, arranging cities from largest to smallest.
5. System presents the organized list of cities within the specified region to the user for analysis.

## EXTENSIONS

1. **Cities not found**:
    1. System display there is no city data available.

2. **Invalid Region**:
    1. User provides an invalid region name.
    2. System displays an error message indicating the invalid input and prompts the user to provide a valid region.
   

## SUB-VARIATIONS

None.

## SCHEDULE

**DUE DATE**: Release 1.0