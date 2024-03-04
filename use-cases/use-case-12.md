# USE CASE: 12  Retrieve Top N Populated Cities in the World


## CHARACTERISTIC INFORMATION

### Goal in Context

As a user, I want to retrieve a list of the top N populated cities in the world, where N is a number provided by the user.

### Scope

World Database.

### Level

Primary task.

### Preconditions

1. The database contains accurate and current population data for all cities globally.
2. The user specifies a valid number (N) to define the size of the list.
3. The user has access to the World Database.


### Success End Condition

A list of the top N populated cities worldwide, organized from largest to smallest by population, is retrieved and available for analysis.


### Failed End Condition

No list is retrieved, or an incorrect list is provided.

### Primary Actor

User.

### Trigger

User initiates the request to retrieve the list of top N populated cities.



## MAIN SUCCESS SCENARIO

1. User accesses the system to retrieve a list of the top N populated cities in the world.
2. User specifies the number (N) for how many of the top cities they wish to see.
3. System executes a query to retrieve the top N populated cities from the database based on global population data.
4. System organizes the retrieved data by population, arranging cities from largest to smallest.
5. System presents the organized list of the top N populated cities to the user for analysis.

## EXTENSIONS

1. **Cities not found**:
    1. System display there is no city data available.

2. **Invalid Number (N) Provided**:
    1. User provides an invalid number (N), such as a negative number or zero.
    2. System displays an error message indicating the invalid input and prompts the user to provide a valid number.


## SUB-VARIATIONS

None.

## SCHEDULE

**DUE DATE**: Release 1.0