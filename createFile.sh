#!/bin/bash

# Function to create a file with sample text and replace placeholders with user input
function create_file() {
  local file_name=$1
  local file_content=$2
  
  # Create the file
  touch "$file_name"

  # Replace placeholders in main file
  sed -e "s/chapter_name/$chapter_name/g" -e "s/problem_name/$problem_name/g" <<< "$file_content" > "$file_name"
}

# main file template
main_file_text="""package org.epi.chapter_name

object problem_name {
    
}
"""

# test file template
test_file_text="""import org.scalatest.funsuite.AnyFunSuite
import org.epi.chapter_name.* 


class problem_nameTest extends AnyFunSuite {
    
}"""

chapter_name=$1
problem_name=$2

# Predefined location for the files
main_file_location="/Users/neeravk/Documents/github/epi/src/main/scala/$chapter_name/$problem_name.scala"
test_file_location="/Users/neeravk/Documents/github/epi/src/test/scala/$chapter_name/$problem_name.scala"


# Create the main file
create_file "$main_file_location" "$main_file_text" 

# Create the test file
create_file "$test_file_location" "$test_file_text" 


echo "Files created successfully"
ls $main_file_location
ls $test_file_location
