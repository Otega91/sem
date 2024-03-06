# USE CASE: 7  Retrieve Cities Organized by Population

## CHARACTERISTIC INFORMATION

### Goal in Context

As a user, I want to retrieve a list of all cities in the world organized by their population, from largest to smallest, so that I can analyze urban population distribution globally.

### Scope

World Database.

### Level

Primary task.

### Preconditions

1. The database contains accurate population data for all cities.

### Success End Condition

A list of cities organized by their population, from largest to smallest, is retrieved and available for analysis.

### Failed End Condition

No list of cities is retrieved.

### Primary Actor

User.

### Trigger

User initiates the request to retrieve a list of cities organized by population.


## MAIN SUCCESS SCENARIO

1. User accesses the system to retrieve a list of cities organized by population.
2. System executes a query to retrieve all cities from the database along with their population data.
3. System organizes the retrieved data by population, arranging cities from largest to smallest.
4. System presents the organized list of cities to the user for analysis.

## EXTENSIONS

1. **Cities not found**:
   1. System display there is no city data available.


## SUB-VARIATIONS

None.

## SCHEDULE

**DUE DATE**: Release 1.0