# USE CASE: 18  Organize Capital Cities in a Continent by Population


## CHARACTERISTIC INFORMATION

### Goal in Context

As a user, I want to organize all the capital cities in a specific continent by their population sizes, from largest to smallest.

### Scope

World Database.

### Level

Primary task.

### Preconditions

1. The database contains accurate and up-to-date population data for all capital cities within the specified continent.
2. The user specifies a valid continent.
3. The user has access to the World Database.


### Success End Condition

A list of capital cities within the specified continent, organized by their population from largest to smallest.

### Failed End Condition

No list of capital cities is retrieved, or the list is not correctly organized.

### Primary Actor

User.

### Trigger

A user initiates a request to retrieve an organized list of capital cities in a continent by population.


## MAIN SUCCESS SCENARIO

1. The user accesses the system to retrieve a list of capital cities in a specific continent.
2. The user specifies the continent for which they want to retrieve the list of capital cities.
3. The system executes a query to retrieve all capital cities within the specified continent from the database along with their population data.
4. The system organizes the retrieved capital cities by population, arranging them from largest to smallest.
5. The system presents the organized list of capital cities within the specified continent to the policy maker for analysis.

## EXTENSIONS

1. **Cities Not Found**:
    1. System informs the user that the cities cannot be found.
   
2. **Invalid Continent**:
   1. The user specifies an invalid continent name.
   2. The system displays an error message indicating the invalid input and prompts the user to specify a valid continent.


## SUB-VARIATIONS

None.

## SCHEDULE

**DUE DATE**: Release 1.0