# Groovy Each Loop Return Bug

This repository demonstrates a subtle but important difference in how `return` statements behave within Groovy's `each` loop.

## The Bug

The `return` statement inside the `each` loop in `bug.groovy` does not exit the `myMethod` function; it only exits the loop.  This can be misleading if you expect the method to terminate when a specific condition is met.

## The Solution

The `bugSolution.groovy` file presents a corrected version.  Instead of `return`, we use a `break` statement or a boolean flag to control the method's execution flow effectively.