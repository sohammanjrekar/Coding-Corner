import requests
from bs4 import BeautifulSoup

# URL of the website you want to scrape
url = 'https://realpython.com/'

# Send a GET request to the website
response = requests.get(url)

# Check if the request was successful (status code 200)
if response.status_code == 200:
    # Parse the HTML content of the page with BeautifulSoup
    soup = BeautifulSoup(response.text, 'html.parser')
    
    # Find all the elements containing blog post titles
    # Titles are typically within <h2> tags with a class 'card-title'
    titles = soup.find_all('h2', class_='card-title')
    
    # Loop through the list of titles and print each one
    for title in titles:
        # Extract and print the text within each <h2> tag
        print(title.get_text(strip=True))
else:
    print(f"Failed to retrieve the webpage. Status code: {response.status_code}")
