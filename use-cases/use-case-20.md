# USE CASE: 20  Retrieve Top N Populated Capital Cities in the World


## CHARACTERISTIC INFORMATION

### Goal in Context

As a user,  I want to retrieve a list of the top N populated capital cities in the world, where N is a number provided by the user.

### Scope

World Database.

### Level

Primary task.

### Preconditions

1. The database contains accurate and up-to-date population data for all capital cities.
2. The user can specify a numerical value for N.
3. The user has access to the World Database.


### Success End Condition

A list of the top N populated capital cities in the world, according to the user's specification, is retrieved and presented for analysis.

### Failed End Condition

No list is retrieved, or the list does not accurately represent the top N populated capitals.



### Primary Actor

User.

### Trigger

A request to identify and list the top N populated capital cities in the world based on the user's input.



## MAIN SUCCESS SCENARIO

1. The user accesses the system to retrieve a list of the top N populated capital cities in the world.
2. The user specifies the numerical value for N.
3. The system executes a query to retrieve the top N populated capital cities from the database based on their population data.
4. The system presents the retrieved list to the user.

## EXTENSIONS

1. **Cities Not Found**:
    1. System informs the user that the cities cannot be found.

2. **Invalid Input**:
    1. The user specifies an invalid or non-numerical value for N.
    2. The system displays an error message indicating the invalid input and prompts the researcher to enter a valid numerical value.


## SUB-VARIATIONS

None.

## SCHEDULE

**DUE DATE**: Release 1.0