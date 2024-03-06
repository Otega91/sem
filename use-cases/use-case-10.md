# USE CASE: 10  Retrieve Cities in a Country Organized by Population

## CHARACTERISTIC INFORMATION

### Goal in Context

As a user, I want to retrieve a list of all cities in a specific country organized by their population, from largest to smallest, so that I can analyze urban population distribution within that country.

### Scope

World Database.

### Level

Primary task.

### Preconditions

1. The database contains accurate population data for all cities.
2. The user specifies a valid country.
3. The user has access to the World Database.


### Success End Condition

A list of cities within the specified country, organized by their population from largest to smallest, is retrieved and available for analysis.

### Failed End Condition

No list of cities is retrieved.

### Primary Actor

User.

### Trigger

User initiates the request to retrieve a list of cities organized by population within a country.


## MAIN SUCCESS SCENARIO

1. User accesses the system to retrieve a list of cities within a country organized by population.
2. User specifies the country for which they want to retrieve the list of cities.
3. System executes a query to retrieve all cities within the specified country from the database along with their population data.
4. System organizes the retrieved data by population, arranging cities from largest to smallest.
5. System presents the organized list of cities within the specified country to the user for analysis.

## EXTENSIONS

1. **Cities not found**:
    1. System display there is no city data available.

2. **Invalid Country**:
    1. User provides an invalid country name.
    2. System displays an error message indicating the invalid input and prompts the user to provide a valid country.


## SUB-VARIATIONS

None.

## SCHEDULE

**DUE DATE**: Release 1.0