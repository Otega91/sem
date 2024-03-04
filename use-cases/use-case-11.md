# USE CASE: 11  Organize Cities in a District by Population

## CHARACTERISTIC INFORMATION

### Goal in Context

As a user, I want to organize all the cities in a district by their population sizes from largest to smallest


### Scope

World Database.

### Level

Primary task.

### Preconditions

1. The database contains accurate and current population data for all cities within the specified district.
2. The user specifies a valid district.
3. The user has access to the World Database.


### Success End Condition

A list of cities within the specified district, organized by their population from largest to smallest, is retrieved and available for analysis.

### Failed End Condition

No list of cities is retrieved.

### Primary Actor

User.

### Trigger

User initiates the request to retrieve a list of cities organized by population within a district.


## MAIN SUCCESS SCENARIO

1. User accesses the system to retrieve a list of cities within a district organized by population.
2. User specifies the district for which they want to retrieve the list of cities.
3. System executes a query to retrieve all cities within the specified district from the database along with their population data.
4. System organizes the retrieved data by population, arranging cities from largest to smallest.
5. System presents the organized list of cities within the specified district to the user for analysis.


## EXTENSIONS

1. **Cities not found**:
    1. System display there is no city data available.

2. **Invalid District**:
    1. User provides an invalid district name.
    2. System displays an error message indicating the invalid input and prompts the user to provide a valid district.


## SUB-VARIATIONS

None.

## SCHEDULE

**DUE DATE**: Release 1.0