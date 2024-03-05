# USE CASE: 4  Retrieve Top N Populated Countries

## CHARACTERISTIC INFORMATION

### Goal in Context

As a user, I want to retrieve the top N populated countries in the world, where N is provided by the user, so that I can analyze population distribution based on my specified criteria.

### Scope

World Database.

### Level

Primary task.

### Preconditions

The database contains accurate population data for all countries.

### Success End Condition

A list of the top N populated countries, as specified by the user, is retrieved and available for analysis.

### Failed End Condition

No list of countries is retrieved.

### Primary Actor

User.

### Trigger

User initiates the request to retrieve the top N populated countries.



## MAIN SUCCESS SCENARIO

1. User accesses the system to retrieve the top N populated countries.
2. User provides the value of N, indicating the number of countries they want to retrieve.
3. System executes a query to retrieve the top N countries with the largest populations from the database.
4. System organizes the retrieved data by population, arranging countries from largest to smallest.
5. System presents the list of the top N populated countries to the user for analysis.


## EXTENSIONS

1. **Invalid Input for N**:
    1. User provides an invalid value for N (e.g., non-numeric value, negative number, zero).
    2. System displays an error message indicating the invalid input and prompts the user to provide a valid value for N.


## SUB-VARIATIONS

None.

## SCHEDULE

**DUE DATE**: Release 1.0