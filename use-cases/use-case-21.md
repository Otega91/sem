# USE CASE: 21  Retrieve Top N Populated Capital Cities in a Continent


## CHARACTERISTIC INFORMATION

### Goal in Context

As a user, I want to retrieve a list of the top N populated capital cities in a specified continent, where N is a number provided by user.

### Scope

World Database.

### Level

Primary task.

### Preconditions

1. The database contains accurate and up-to-date population data for all capital cities within the specified continent.
2. The user specifies a valid numerical value for N.
3. The user specifies a valid continent.
4. The user has access to the World Database.


### Success End Condition

A list of the top N populated capital cities in the specified continent, according to the user's specification.


### Failed End Condition

No list is retrieved, or the list does not accurately reflect the top N populated capital cities within the specified continent.


### Primary Actor

User.

### Trigger

The user requests to view the top N populated capital cities in a specified continent.


## MAIN SUCCESS SCENARIO

1. The user specifies the continent and the numerical value for N.
2. The system validates the continent and the numerical value for N.
3. The system executes a query to retrieve the top N populated capital cities from the specified continent based on their population data.
4. The system presents the retrieved list to the user for analysis.

## EXTENSIONS

1. **Cities Not Found**:
    1. System informs the user that the cities cannot be found.

2. **Invalid Number (N) or Continent Provided**:
   1. User provides an invalid number (N), such as a negative number or zero, or an invalid Continent name.
   2. System displays an error message indicating the invalid input(s) and prompts the user to provide valid inputs.


## SUB-VARIATIONS

None.

## SCHEDULE

**DUE DATE**: Release 1.0