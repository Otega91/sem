# USE CASE: 22  Retrieve Top N Populated Capital Cities in a Region


## CHARACTERISTIC INFORMATION

### Goal in Context

As a user, I want to retrieve a list of the top N populated capital cities in a specified region, where N is provided by user.

### Scope

World Database.

### Level

Primary task.

### Preconditions

1. The database contains accurate and up-to-date population data for all capital cities within the specified region.
2. The user specifies a valid numerical value for N.
3. The user specifies a valid region.
4. The user has access to the World Database.


### Success End Condition

A list of the top N populated capital cities in the specified region, according to the user's specification, is retrieved and available for analysis.

### Failed End Condition

No list is retrieved, or the list does not accurately represent the top N populated capital cities within the specified region.

### Primary Actor

User.

### Trigger

The user requests to view the top N populated capital cities in a specified region.


## MAIN SUCCESS SCENARIO

1. The user specifies the region and the numerical value for N.
2. The system validates the region and the numerical value for N.
3. The system executes a query to retrieve the top N populated capital cities from the specified region based on their population data.
4. The system presents the retrieved list to the user for analysis.


## EXTENSIONS

1. **Cities Not Found**:
    1. System informs the user that the cities cannot be found.

2. **Invalid Number (N) or Region Provided**:
    1. User provides an invalid number (N), such as a negative number or zero, or an invalid Region name.
    2. System displays an error message indicating the invalid input(s) and prompts the user to provide valid inputs.


## SUB-VARIATIONS

None.

## SCHEDULE

**DUE DATE**: Release 1.0