# USE CASE: 13  Retrieve Top N Populated Cities in a Continent


## CHARACTERISTIC INFORMATION

### Goal in Context

As a user, I want to retrieve a list of the top N populated cities within a specific continent, where N is a number provided by the user.
### Scope

World Database.

### Level

Primary task.

### Preconditions

1. The database contains accurate and current population data for cities within the specified continent.
2. The user specifies a valid number (N) to define the size of the list and a valid continent.
3. The user has access to the World Database.


### Success End Condition

A list of the top N populated cities within the specified continent, organized from largest to smallest by population, is retrieved and available for analysis.

### Failed End Condition

No list is retrieved, or an incorrect list is provided.

### Primary Actor

User.

### Trigger

User initiates the request to retrieve the list of top N populated cities in a specified continent.




## MAIN SUCCESS SCENARIO

1. User accesses the system to retrieve a list of the top N populated cities within a specific continent.
2. User specifies the continent and the number (N) for how many of the top cities they wish to see.
3. System executes a query to retrieve the top N populated cities from the database based on population data for the specified continent.
4. System organizes the retrieved data by population, arranging cities from largest to smallest.
5. System presents the organized list of the top N populated cities within the specified continent to the user for analysis.

## EXTENSIONS

1. **Cities not found**:
    1. System display there is no city data available.

2. **Invalid Number (N) or Continent Provided**:
    1. User provides an invalid number (N), such as a negative number or zero, or an invalid continent name.
    2. System displays an error message indicating the invalid input(s) and prompts the user to provide valid inputs.


## SUB-VARIATIONS

None.

## SCHEDULE

**DUE DATE**: Release 1.0