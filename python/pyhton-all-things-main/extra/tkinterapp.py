import tkinter as tk

# Create a new Tkinter window
root = tk.Tk()
root.title("Simple GUI Application")

# Function to handle button click event
def handle_click():
    label.config(text="Button clicked!")

# Create a label widget
label = tk.Label(root, text="Welcome to Tkinter!")
label.pack(pady=10)

# Create a button widget
button = tk.Button(root, text="Click Me", command=handle_click)
button.pack(pady=5)

# Create an entry widget
entry = tk.Entry(root)
entry.pack(pady=5)

# Function to handle entry focus event
def handle_focus_in(event):
    entry.delete(0, tk.END)
    entry.config(fg="black")

# Function to handle entry focus out event
def handle_focus_out(event):
    if not entry.get():
        entry.insert(0, "Enter text here")
        entry.config(fg="gray")

# Bind entry widget to focus events
entry.bind("<FocusIn>", handle_focus_in)
entry.bind("<FocusOut>", handle_focus_out)
entry.insert(0, "Enter text here")
entry.config(fg="gray")

# Create a text widget
text = tk.Text(root, height=5)
text.pack(pady=5)

# Function to handle text widget insert event
def handle_text_insert():
    text_content = text.get("1.0", tk.END)
    label.config(text="Text content:\n" + text_content)

# Create a button to retrieve text widget content
text_button = tk.Button(root, text="Get Text Content", command=handle_text_insert)
text_button.pack(pady=5)

# Run the Tkinter event loop
root.mainloop()
