# Importing the 'keyword' module from the Python standard library
import keyword

# Printing the list of all Python keywords
print("List of Python keywords:", keyword.kwlist)

# Checking if "as" is a keyword
print("Is 'as' a keyword?", keyword.iskeyword("as"))

# Printing the list of soft keywords (keywords that are not yet implemented but reserved for future use)
print("List of soft keywords:", keyword.softkwlist)
