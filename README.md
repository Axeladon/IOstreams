# Modul10GoIT

## Task1
The PhoneNumberValidator class is a simple utility that reads a text file **(files/file.txt)** containing a list of phone numbers, where each line represents one phone number.
The project's primary goal is to identify and display valid phone numbers following two specific formats: "**(xxx) xxx-xxxx**" or "**xxx-xxx-xxxx**."

**Example Input (files/file.txt):**
```
987-123-4567
123 456 7890
(123) 456-7890
```
**Example Output (console):**
```
987-123-4567
(123) 456-7890
```

## Task2
The JsonBuilder сlass is a simple utility that reads a text file **(files2/file.txt)**, transforms its content into a list of User objects, and then writes these objects to a new JSON file **(files2/user.json)**. 
This project is designed to help users convert structured text data into a JSON format for easier data interchange and processing.

**Example Input (files2/file.txt):**
```
name age
alice 21
ryan 30
```

**Example Output (files2/user.json):**
```
[
    {
        "name": "alice",
        "age":21
    },
    {
        "name": "ryan",
        "age":30
    }
]
```

## Task3
The WordFrequencyCounter class is a utility that reads a text file **(files/words.txt)** and calculates the frequency of each word in the file. 
This project helps users analyze and understand the distribution of words within a text document.

**Features:**
- **Read and Parse File:** The utility reads the content of the words.txt text file, where words are in lowercase, separated by spaces, and possibly containing multiple spaces or line breaks between words.
- **Word Frequency Calculation:** It calculates the frequency of each unique word in the text file.
- **Sorted Output:** The utility outputs the word frequencies in a sorted manner, starting with the most frequently occurring words.

**Input Format (files/words.txt):**
- Words are in lowercase.
- Words are separated by spaces or contain multiple spaces or line breaks between them.

**Example Input (files/words.txt):**
```
the day is sunny the the
the sunny is is
```
**Example Output (console):**
```
the 4
is 3
sunny 2
day 1
```
